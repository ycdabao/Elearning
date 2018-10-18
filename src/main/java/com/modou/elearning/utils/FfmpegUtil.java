package com.modou.elearning.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FfmpegUtil {

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
        ProcessBuilder processBuilder = new ProcessBuilder("C:\\Program Files (x86)\\ffmpeg-20180930-d702769-win64-static\\bin\\ffmpeg.exe", "-y",
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




}
