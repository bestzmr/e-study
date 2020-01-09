<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ywl
  Date: 2019/12/31
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel = "stylesheet" href="../../bootstrap/css/bootstrap.min.css">
    <script src="../../bootstrap/js/jquery-3.4.1.js"></script>
    <script src="../../bootstrap/js/bootstrap.min.js"></script>
    <title>e学网课</title>
    <style>
        .y{
            width: 1250px;
            height: 350px;
        }
        .i{
            width: 18%;
            height: 300px;
            float: left;
        }
        .n{
            margin-left: 80px;
            margin-right: 50px;
            font-weight: lighter;
            font-size: 13px;
        }
    </style>

</head>
<body style="background-image:url('../../image/bg-01.jpg');background-size: cover ">

 <div class="container">
     <div class="success" style="text-align: center"><h1>E学网课</h1></div>
 </div>
 <center>
 <div class="panel panel-default" style="width: 65%;box-shadow: 2px 4px 6px #000;background: #f6f6f6">
     <div class="panel-body" style="text-align: center;">
<%--       动态生成表格--%>
         <div style="width: max-content ">
             <div class="y" style="float: left">
                 <c:forEach begin="0" step="1" items="${videoList}" var="item" varStatus="videoList">
                   <a href="/video/videoPlay?url=${item.url}">
                       <div class="i">
                         <img src="../../video7.5.5/netCourse.jpg" style="width: 30%; height:95px;margin-left: 50px;margin-top: 15px" >
                         <!--从数据库读取的时候注意图片长宽的设定-->
                         <div style="height: 10px ;width:400px ">
                         </div>
                         <p class="n">${item.name}</p>
                         <p class="n">${item.description}</p>
                     </div>
                   </a>
                 </c:forEach>
            </div>
       </div>
     </div>
 </div>
 </center>
 <center>
<a href="/video/jumpUploadVideo"><button type="button" class="btn btn-primary">上传视频</button></a>
 </center>
</body>
</html>
