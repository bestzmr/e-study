<%--
  Created by IntelliJ IDEA.
  User: lulinjun243143
  Date: 2020/1/3
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>footer</title>
    <style>
        #footer{
            width: 100%;
            height: 250px;
            padding: 30px 0;
            background: #333;
            border-top: 3px solid #efefef;
            /*margin: 0;*/
        }
        #footer ul{
            float: left;
            width: 200px;
            margin: 0 0 0 20px;
            padding: 0;
            color: #fff;
        }
        #footer ul li{
            padding: 10px 0;
            list-style: none;
            color: #fff;
        }
        #footer ul li a{
            text-decoration: none;
            color: #fff;
        }
        #footer-img{
            float: right;
            margin-right: 20px;
            margin-bottom: 70px;

        }
        #footer-img img{
            width: 250px;
            height: 250px;
        }
        #footer intro{
            width: 200px;
            height: 250px;
            float: left;
            margin-left: 900px;
        }

    </style>
</head>
<body>
<div id="footer">
    <div id="footer-img">
        <img src="../../image/code.jpg" alt="">
    </div>
    <div style="margin-left: 10px">
        <ul>
            <li><a href="/web/index">首页</a></li>
            <li><a href="/web/schoolProfile">学校简介</a></li>
            <li><a href="/teacher/listTeacherShows">名师介绍</a></li>
        </ul>
    </div>

    <div style="margin-left: 300px">
        <ul>
            <li><a href="">课程体系</a></li>
            <li><a href="/web/middleschool">中高考咨询</a></li>
            <li><a href="">课程报名</a></li>
            <li><a href="/video/listVideo">网上课堂</a></li>
        </ul>
    </div>
    <div class="intro" style="margin-left: 700px">
        <ul>
            <li>e学网分校</li>
            <li>北京</li>
            <li>杭州</li>
            <li>天津</li>
            <li>烟台</li>
        </ul>
    </div>
</div>

</body>
</html>
