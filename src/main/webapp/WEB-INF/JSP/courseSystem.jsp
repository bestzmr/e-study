<%--
  Created by IntelliJ IDEA.
  User: lulinjun243143
  Date: 2020/1/3
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>课程体系</title>
    <style>
        .course-a{
            width: 100%;
            height: 400px;
        }
        .course-b{
            width: 100%;
            height: 15px;
            background: #0f81c5;
        }
        .course-c{
            width: 100%;
            height: 500px;
            background: #e1e9fb;
        }
        .course-d{
            width: 100%;
            height: 240px;
        }
        .course-e{
            width: 100%;
            height: 250px;
        }
        .course-f{
            width: 300px;
            height: 250px;
            float: left;
        }
        .course-p{
            /*margin-left: 44%;*/
            text-align: center;
        }
        .course-g{
            width: 500px;
            margin-left: 30%;
        }
    </style>
</head>
<body>
<div class="course-a">
    <%--放传过来的图片--%>
    <img src="../../image/${courseImg}" width="100% " height="100%"/>
</div>
<div class="course-b">

</div>
<div class="course-c">
    <div class="course-d">
        <p class="course-p">---${name}---</p>
        <div class="course-g">

            <p style="font-size: 15px;text-align: center">学时：${schoolHour}</p>
            <p style="font-size: 15px;text-align: center">选课人数：${totalPeople}</p>
            <p style="font-size: 15px">描述：${description}</p>
        </div>
    </div>
    <div class="course-e">
        <div class="course-f">
            <img src="../../image/courseSystem1.png"  style="width:240px; height:200px;margin-left: 60px;margin-top: 15px" >
        </div>
        <div class="course-f">
            <img src="../../image/courseSystem2.png"  style="width:240px; height:200px;margin-left: 60px;margin-top: 15px" >
        </div>
        <div class="course-f">
            <img src="../../image/courseSystem3.png"  style="width:240px; height:200px;margin-left: 60px;margin-top: 15px" >
        </div>
        <div class="course-f">
            <img src="../../image/courseSystem4.png"  style="width:240px; height:200px;margin-left: 60px;margin-top: 15px" >
        </div>
    </div>
</div>
<div style="width: 80%; margin-left: 10%;height: 600px" >
    <img src="../../image/quanmianfuwu.gif" width="100%">
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
