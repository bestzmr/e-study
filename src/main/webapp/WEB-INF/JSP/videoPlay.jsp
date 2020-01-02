<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/31
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>视频教程列表</title>
    <meta charSet="utf-8" />
    <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
    <meta httpEquiv="Cache-Control" content="no-siteapp" />
    <meta name="renderer" content="webkit" />
    <meta name="keywords" content="demo" />
    <meta name="description" content="demo" />
</head>

<body>
<div style="text-align:center;">
    <div class="video" style="width: 100%;height: 100%;"></div>
</div>
<script type="text/javascript" src="${ctx}/res/dist/js/ckplayer/ckplayer/ckplayer.js"></script>
<script type="text/javascript">
    var videoObject = {
        container: '.video',//“#”代表容器的ID，“.”或“”代表容器的class
        variable: 'player',//该属性必需设置，值等于下面的new chplayer()的对象
        loaded:'loadedHandler',//监听播放器加载成功
        autoplay:true,//自动播放
        //video:'http://118.180.24.208:8090//file-rest/uploads/001/003/2017-12-20/ff808081604959760160735aa78e0125.mp4'//视频地址
        video:'${url}'
    };
    var player=new ckplayer(videoObject);
    function loadedHandler(){//播放器加载后会调用该函数
        player.addListener('time', timeHandler); //监听播放时间,addListener是监听函数，需要传递二个参数，'time'是监听属性，这里是监听时间，timeHandler是监听接受的函数
    }
    function timeHandler(t){
        console.log('当前播放的时间：'+t);
    }
</script>
</body>
</html>
