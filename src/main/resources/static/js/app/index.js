function addCookie(objName,objValue,objHours){
    var str = objName + "=" + escape(objValue);
    if(objHours > 0){
        var date = new Date();
        var ms = objHours;
        date.setTime(date.getTime() + ms);
        str += "; expires=" + date.toGMTString();
    }
    document.cookie = str;
}
function getCookie(name)
{
    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
    if(arr=document.cookie.match(reg))
        return unescape(arr[2]);
    else
        return null;
}
function delCookie(name){
    var date = new Date();
    date.setTime(date.getTime() - 10000);
    document.cookie = name + "=a  ; expires=" + date.toGMTString();
}

//广告banner
$("#sclose").click(function(event){
    event.stopPropagation();
    $(this).parent().fadeOut("slow");
    $(".adzhe").hide();
})
var $zhe2=$(".adzhe");
var $zhe2h = $(document).height();
$zhe2.css("height",$zhe2h +"px");

var istan = getCookie("adtan");
if(!istan){
    $(".adzhe").show();
    $(".onban").show();
    addCookie("adtan","1","1800");
}
//首页特效
//banner特效
var jiange = 4000; //间隔时间
var nowimg = 0;
var mytimer = null;

//设置定时器的
mytimer = window.setInterval(dongdong,jiange);
$("#czrightbut").click(dongdong);

//设置鼠标进入离开定时器开关的
$(".ban").mouseenter(function(){window.clearInterval(mytimer);});
$(".ban").mouseleave(function(){mytimer = window.setInterval(dongdong,jiange);});

function dongdong(){
    if(nowimg < $(".ban_in ul li").length - 1){
        nowimg = nowimg + 1;
    }else{
        nowimg = 0;
    }
    $(".ban_in ul li").eq(nowimg - 1).fadeOut("fast");
    $(".ban_in ul li").eq(nowimg)    .fadeIn("fast");
    $(".czxinxi ul li").eq(nowimg).addClass("cur").siblings().removeClass("cur");
}
$(".czxinxi ul li").mouseenter(function(){
    $(".ban_in ul li").stop().eq(nowimg).hide();
    nowimg = $(this).index();
    $(".ban_in ul li").eq(nowimg).show();
    $(".czxinxi ul li").eq(nowimg).addClass("cur").siblings().removeClass("cur");
});

//获取公开课
$(".hd1 ul li a").click(function () {
    $(this).css({"color":"#ee000b"}).parent().siblings().children().css({"color":"#323846","font-weight":"100"});
    $(".hd1 ul li:eq(0) a").css("color","#ee000b");
    $subject = $(this).attr("subject"),
        $courseShow = $("#openShow");
    if ($subject){
        $.ajax({
            type: "GET",
            url: "index/getSubOpen",
            data: "subject="+$subject,
            dataType: "json",
            beforeSend: function(){

                $courseShow.html( "<p style='padding:200px; text-align:center'><img src='./Home/images/loading.gif' /></p>" );
            },
            success: function(data){
                if(data){
                    var html = "";
                    $.each(data, function(index, course){
                        console.log(course.videodown);
                        if( course.videodown!="" ){
                            sta = '<span class="star video_s"></span>';
                            ren = '<p><a href="./open/'+course.id+'.html" class="afont" style="width:auto;">资料下载</a></p>';
                            bao = '<strong>'+course.countdown+'</strong>人下载';
                        }else{
                            sta = '<span class="bm_btn video_s">立即</br>报名</span>';
                            ren = '<strong>'+course.starttime+'</strong>开课';
                            bao = '<strong>'+course.downcount+'</strong>人报名';
                        }
                        html += '<li><a href="./open/'+course.id+'.html" target="_blank"><img src="./Upload/'+course.mainpicture+'" alt="'+course.title+'" width="283" height="186"><div class="zhe agd"></div>'+sta+'<p class="xkfl">'+course.catename+'</p></a><div class="bdtxt"><h3><a href="./open/'+course.id+'.html" class="afont">'+course.title+'</a></h3><div class="mydate"><p>'+ren+'</p><p class="mydate_r">'+bao+'</p></div></div></li>';
                    });
                    $courseShow.html( html ).show();
                }
            },
        });
    }
});
//获取视频教程
$(".hd2 ul li a").click(function () {
    $(this).css({"color":"#ee000b"}).parent().siblings().children().css({"color":"#323846","font-weight":"100"});
    $(".hd2 ul li:eq(0) a").css("color","#ee000b");
    $subject = $(this).attr("subject"),
        $courseShow = $("#courseShow");
    if ($subject){
        $.ajax({
            type: "GET",
            url: "index/getSubCourse",
            data: "subject="+$subject,
            dataType: "json",
            beforeSend: function(){

                $courseShow.html( "<p style='padding:200px; text-align:center'><img src='./Home/images/loading.gif' /></p>" );
            },
            success: function(data){
                if(data){
                    var html = "";
                    $.each(data, function(index, course){
                        html += "<li><a href='./course/"+course.id+".html' target='_blank'><img src='./Upload/"+course.mainpicture+"' alt='"+course.title+"' width='283' height='186'><div class='zhe agd'></div><span class='star video_s'></span></a><div class='bdtxt'><h3><a href='./course/"+course.id+".html' class='afont'>"+course.title+"</a></h3><p>已经有<strong>"+course.lookcount+"</strong>人学习</p></div></li>";

                    });
                    $courseShow.html( html ).show();
                }
            },
        });
    }
});
$(".hd1 ul li").click(function (){
    $(this).parent().parent().siblings(".course").children().eq($(this).index()).slideDown().siblings().slideUp();
});
$(".hd2 ul li").click(function (){
    $(this).parent().parent().siblings(".course").children().eq($(this).index()).slideDown().siblings().slideUp();
});
$(".box1 .course ul li:eq(2)").css("margin-right","22px");
$(".box1 .course ul li:eq(6)").css("margin-right","22px");
$(".box2 .pathbox li:eq(4)").css({"margin-right":"0","width":"223px"});
$(".box2 .pathbox li:eq(9)").css({"margin-right":"0","width":"223px"});