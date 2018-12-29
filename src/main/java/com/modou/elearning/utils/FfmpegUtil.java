package com.modou.elearning.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FfmpegUtil {

    //分割视频的大小，装包动作为了避免越界。long应该够使了。。。
//    private long blockSize = 1 * new Long(1024) * 1024 * 1024;
    private long blockSize = 4 * 1024 * 1024;
    private loadingListener mListener;
    private boolean ffmpegWorkingFlag = false;


    protected String ffmpegApp;

    public FfmpegUtil(String ffmpegApp)
    {
        this.ffmpegApp = ffmpegApp;
    }

    @SuppressWarnings("unused")
    /****
     * 获取指定时间内的图片
     * @param videoFilename:视频路径
     * @param thumbFilename:图片保存路径
     * @param width:图片长
     * @param height:图片宽
     * @param hour:指定时
     * @param min:指定分
     * @param sec:指定秒
     * @throws IOException
     * @throws InterruptedException
     */
    public static  void getThumb(String videoFilename, String thumbFilename, int width,
                         int height, int hour, int min, float sec) throws IOException,
            InterruptedException
    {
        ProcessBuilder processBuilder = new ProcessBuilder("C:\\ffmpeg-20181027-59a35fe-win64-static\\bin\\ffmpeg.exe", "-y",
                "-i", videoFilename, "-vframes", "1", "-ss", hour + ":" + min
                + ":" + sec, "-f", "mjpeg", "-s", width + "*" + height,
                "-an", thumbFilename);

        Process process = processBuilder.start();

        InputStream stderr = process.getErrorStream();
        InputStreamReader isr = new InputStreamReader(stderr);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null)
            ;
        process.waitFor();

        if(br != null)
            br.close();
        if(isr != null)
            isr.close();
        if(stderr != null)
            stderr.close();
    }

    /***
     *
     * 得到第一秒（也是第一帧）图片
     */
    public static void getThumb(String videoFilename, String thumbFilename, int width,
                         int height) throws IOException, InterruptedException
    {
        getThumb(videoFilename, thumbFilename, width, height, 0, 0, 1);
    }


    /**
     * 获取视频文件时长
     *
     * @param file 文件
     * @return 时长 格式hh:MM:ss
     * @throws FileNotFoundException 视频不存在抛出此异常
     */
    private Integer getVideoTime(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + "不存在");
        }
        List<String> commands = new ArrayList<String>();
        commands.add("ffmpeg");
        commands.add("-i");
        commands.add(file.getAbsolutePath());
        CmdResult result = runCommand(commands);
        String msg = result.getMsg();
        if (result.isSuccess()) {
            //\d{2}:\d{2}:\d{2}
            Pattern pattern = Pattern.compile("Duration: (.*?), start: (.*?), bitrate: (\\d*) kb\\/s");
            Matcher matcher = pattern.matcher(msg);
            Integer time = null;
            while (matcher.find()) {
                 time = getTimelen(matcher.group(1));
            }
            return time;
        } else {
            return null;
        }
    }



    private static int getTimelen(String timelen) {
        int min = 0;
        String strs[] = timelen.split(":");
        if (strs[0].compareTo("0") > 0) {
            min += Integer.valueOf(strs[0]) * 60 * 60;//秒
        }
        if (strs[1].compareTo("0") > 0) {
            min += Integer.valueOf(strs[1]) * 60;
        }
        if (strs[2].compareTo("0") > 0) {
            min += Math.round(Float.valueOf(strs[2]));
        }
        return min;
    }



    /**
     * 获取文件大小
     *
     * @param file 去的文件长度，单位为字节b
     * @return 文件长度的字节数
     * @throws FileNotFoundException 文件未找到异常
     */
    private long getVideoFileLength(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + "不存在");
        }
        return file.length();
    }


    /**
     * @param filePath 要处理的文件路径
     * @return 分割后的文件路径
     * @throws Exception 文件
     */
 public  List<String> cutVideo(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath + "文件不存在");
        }
        if (!filePath.endsWith(".mp4")) {
            throw new Exception("文件格式错误");
        }

      List<String> commands = new ArrayList<String>();
        commands.add("ffmpeg");
      commands.add("-y");
        commands.add("-i");
        commands.add(filePath);
        commands.add("-vcodec");
        commands.add("copy");
      commands.add("-acodec");
      commands.add("copy");
      commands.add("-vbsf");
      commands.add("h264_mp4toannexb");

      commands.add(filePath.substring(0,filePath.lastIndexOf("\\")+1)+IDUtil.getFileName(filePath)+".ts");
      runCommand(commands);

      commands.clear();
      commands.add("ffmpeg");
      commands.add("-i");
      commands.add(filePath.substring(0,filePath.lastIndexOf("\\")+1)+IDUtil.getFileName(filePath)+".ts");
      commands.add("-c");
      commands.add("copy");
      commands.add("-map");
      commands.add("0");
      commands.add("-f");
      commands.add("segment");
      commands.add("-segment_list");
      commands.add("playlist.m3u8");
      commands.add("-segment_time");
      commands.add("60");

      commands.add(filePath.substring(0,filePath.lastIndexOf("\\")+1)+IDUtil.getFileName(filePath)+"%03d"+".mp4");
      CmdResult result  =runCommand(commands);

     //从ffmpeg获得的时间长度
     Integer videoSecond = getVideoTime(file);

     List<String> r = new ArrayList<String>();
     int loop = videoSecond%60!=0?videoSecond/60+1:videoSecond/60;
     for(int i=0;i<loop; i++){
         if(i<=9) {
             r.add("/" + IDUtil.getFileName(filePath) + "00" + i + ".mp4");
         }else if(i<=99){
             r.add("/" + IDUtil.getFileName(filePath) + "0" + i + ".mp4");
         }else{
             r.add("/" + IDUtil.getFileName(filePath) +  i + ".mp4");
         }
     }
     return r;
    }


    /**
     * @param filePath 要处理的文件路径
     * @return 分割后的文件路径
     * @throws Exception 文件
     */
  /*  public List<String> cutVideo(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath + "文件不存在");
        }
        if (!filePath.endsWith(".mp4")) {
            throw new Exception("文件格式错误");
        }
        //从ffmpeg获得的时间长度00:00:00格式
        String videoTimeString = getVideoTime(file);
        //将时长转换为秒数
        int videoSecond = parseTimeToSecond(videoTimeString);
        //视频文件的大小
        long fileLength = getVideoFileLength(file);
        List<String> cutedVideoPaths = new ArrayList<String>();
        if (fileLength <= blockSize) {//如果视频文件大小不大于预设值，则直接返回原视频文件
            cutedVideoPaths.add(filePath);
        } else {//如果超过预设大小，则需要切割
            int partNum = (int) (fileLength / blockSize);//文件大小除以分块大小的商
            long remainSize = fileLength % blockSize;//余数
            int cutNum;
            if (remainSize > 0) {
                cutNum = partNum + 1;
            } else {
                cutNum = partNum;
            }
            int eachPartTime = videoSecond / cutNum;
            List<String> commands = new ArrayList<String>();
            String fileFolder = file.getParentFile().getAbsolutePath();
            String fileName[] = file.getName().split("\\.");
            commands.add("ffmpeg");
            for (int i = 0; i < cutNum; i++) {
                commands.add("-i");
                commands.add(filePath);
                commands.add("-ss");
                commands.add(parseTimeToString(eachPartTime * i));
                if (i != cutNum - 1) {
                    commands.add("-t");
                    commands.add(parseTimeToString(eachPartTime));
                }
                commands.add("-acodec");
                commands.add("copy");
                commands.add("-vcodec");
                commands.add("copy");
                commands.add(fileFolder + File.separator + fileName[0] + "_part" + i + "." + fileName[1]);
                commands.add("-y");
                cutedVideoPaths.add(File.separator + fileName[0] + "_part" + i + "." + fileName[1]);
            }
            runCommand(commands);
        }
        return cutedVideoPaths;
    }*/



    /**
     * 执行Cmd命令方法
     *
     * @param command 相关命令
     * @return 执行结果
     */
    private synchronized CmdResult runCommand(List<String> command) {

        CmdResult cmdResult = new CmdResult(false, "");
        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true);
        try {
            Process process = builder.start();
            final StringBuilder stringBuilder = new StringBuilder();
            final InputStream inputStream = process.getInputStream();
            new Thread(new Runnable() {//启动新线程为异步读取缓冲器，防止线程阻塞

                @Override
                public void run() {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String line;
                    try {
                        while ((line = reader.readLine()) != null) {
                            stringBuilder.append(line);
//                          mListener.isLoading(true);
                        }
//                        mListener.isLoading(false);
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                }
            }).start();
            process.waitFor();
            cmdResult.setSuccess(true);
            cmdResult.setMsg(stringBuilder.toString());
        } catch (Exception e) {
            throw new RuntimeException("ffmpeg执行异常" + e.getMessage());
        }
        return cmdResult;
    }

    /**
     * 将字符串时间格式转换为整型，以秒为单位
     *
     * @param timeString 字符串时间时长
     * @return 时间所对应的秒数
     */
    private int parseTimeToSecond(String timeString) {
        Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(timeString);
        if (!matcher.matches()) {
            try {
                throw new Exception("时间格式不正确");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String[] time = timeString.split(":");
        return Integer.parseInt(time[0]) * 3600 + Integer.parseInt(time[1]) * 60 + Integer.parseInt(time[2]);
    }

    /**
     * 将秒表示时长转为00:00:00格式
     *
     * @param second 秒数时长
     * @return 字符串格式时长
     */
    private String parseTimeToString(int second) {
        int end = second % 60;
        int mid = second / 60;
        if (mid < 60) {
            return mid + ":" + end;
        } else if (mid == 60) {
            return "1:00:" + end;
        } else {
            int first = mid / 60;
            mid = mid % 60;
            return first + ":" + mid + ":" + end;
        }

    }
    interface loadingListener {
        void isLoading(boolean loading);
    }


}


class CmdResult {
    private boolean success;
    private String msg;

    public CmdResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public CmdResult() {

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
