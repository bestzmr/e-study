<%--
  Created by IntelliJ IDEA.
  User: lulinjun243143
  Date: 2020/1/2
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" name="viewport"
          content="width=device-width,initial-scale=1, user-scalable=no,maximum-scale=1,minimum-scale=1.0">
    <title>e学网</title>
    <style>
        /*div{width: 70px;height: 60px}*/
        /*div img{width: 100%;display: block}*/
        .reference-learn{width: 1250px;height: 80px;overflow: hidden;}
        .reference-address{width: 70px;height:70px;float: left}
        .reference-a{float: left;width: 350px;height: 70px}
        .reference-b{float: left;width: 300px;height: 80px}
        .reference-c{
            float: right;
            height: 70px;
            line-height: 120px;
            margin-top: 40px;
        }
       *{
            margin: auto;padding: 0px;
        }
        div.reference-con{
            width: 100%;
            background: linear-gradient(to bottom,#a8d7e9,#85b2dc);
            box-shadow: 1px 3px 2px rgba(0,0,0,.3);
        }
        div.reference-menu{
            width: 900px;margin: 0 auto;overflow: hidden;height: 45px;
        }
        div.reference-menu li{
            float: left;
        }
        div.reference-menu a{
            font: 16px Arial;color: #fff;
            width: 90px;text-align: center;
            display: block;padding: 0 15px;
            line-height: 45px;margin-right: 1px;
            background: linear-gradient(to top,#a8d7e9,#85b2dc);
            border-bottom-left-radius: 45px;
            border-top-right-radius: 45px;
            transition: all 0.3s ease-in;
        }
        div.reference-menu span{
            display: inline-block;transition: all 0.5s ease-in;
        }
        div.reference-menu a:hover,div.reference-menu a:hover>span{
            transform:rotateY(180deg);
        }
        .reference-button {
            width: 90px;
            height: 34px;
            padding:5px;
            background-color: #85b2dc;
            border-color: #649bcd;
            color: #FFFFFF;
            -moz-border-radius: 5px;
            -webkit-border-radius: 5px;
            border-radius: 10px; /* future proofing */
            -khtml-border-radius: 10px; /* for old Konqueror browsers */
            text-align: center;
            vertical-align: middle;
            border: 1px solid transparent;
            font-weight: 900;
            font-size:100%
        }
        .reference-p1{
            padding:0;
            margin:0;
            height: 53px;
            font-size: 50px;
            font-family: 楷体;
            color: #2e6da4;
        }
        .reference-p2{
            height: 0px;
            font-family: 楷体;
            color: #2e6da4;
        }
    </style>
</head>
<body >
<div class="reference-learn">
    <div class="reference-address">
        <img style="width: 100%;display: block" src="../../image/1.png">
    </div>
    <div class="reference-a">
        <p class="reference-p1"><b>e学网</b></p>
        <p class="reference-p2">https://github.com/AngryMerlin/e-study</p>
    </div>
    <div class="reference-b">
        <p style="color: #8c8c8c;padding:0;margin:0;height: 43px;" >十八年专注辅导</p>
        <p style="color: #8c8c8c;padding:0;margin:0;height: 53px;">因为专注，所以出色</p>
    </div>
    <div class="reference-c">
        <a href="/web/jumpLogin">
            <button type="button" class="reference-button" >登录</button>
        </a>
    </div>
</div>
<div class="reference-con">
    <div class="reference-menu">
        <ul style="list-style: none;">
            <li><a href="/web/index" target="_parent"><span>首页</span></a></li>
            <li><a href="/web/schoolProfile" target="_parent"><span>学校简介</span></a></li>
            <li><a href="/teacher/listTeacherShows" target="_parent"><span>名师介绍</span></a></li>
            <li><a href="#A1" target="_parent"><span>课程体系</span></a></li>
            <li><a href="/web/middleschool"><span>中高考资讯</span></a></li>
            <%--<li><a href="#"><span>课程报名</span></a></li>--%>
            <li><a href="/video/listVideo"><span>网上课堂</span></a></li>
        </ul>
    </div>
</div>
</body>
</html>
