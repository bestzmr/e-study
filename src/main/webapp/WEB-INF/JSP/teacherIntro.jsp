<%--
  Created by IntelliJ IDEA.
  User: lulinjun243143
  Date: 2020/1/2
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>名师介绍</title>
    <style>
        .teacher-a{
            width: 100%;
            height: 1100px;
        }
        .teacher-b{
            width: 400px;
            height: 350px;
            float: left;
        }
        .teacher-c{
            margin-left: 80px;
            margin-right: 50px;
            font-weight: lighter;
            font-size: 13px;
        }
        .navigation {
            margin:auto auto 10px 10px;
            float:left;
            margin-left: 500px;
        }
        .wp-paginate {
            padding:0;
            margin:0;
        }
        .wp-paginate li {
            float:left;
            list-style:none;
            margin:10px;
            padding:0;
        }
        .wp-paginate a {
            margin:0 2px;
            line-height:20px;
            text-align:center;
            text-decoration:none;
            border-radius:3px;
            -moz-border-radius:3px;
            float:left;
            min-height:20px;
            min-width:20px;
            color:#858585;
            border:2px #e3e3e3 solid;
            border-radius:13px;
            font-size:11px;
        }
        .wp-paginate a:hover {
            border:2px #858585 solid;
            color:#858585;
        }
        .wp-paginate .title {
            color:#555;
            margin:0;
            margin-right:4px;
            font-size:14px;
        }
        .wp-paginate .gap {
            color:#999;
            margin:0;
            margin-right:4px;
        }
        .wp-paginate .current {
            margin:0 2px;
            line-height:20px;
            text-align:center;
            text-decoration:none;
            border-radius:3px;
            -moz-border-radius:3px;
            float:left;
            font-weight:700;
            min-height:20px;
            min-width:20px;
            color:#262626;
            border:2px #119eda solid;
            border-radius:13px;
            font-size:11px;
            color:#119eda;
        }
        .wp-paginate .page {
            margin:0;
            padding:0;
            size: 50px;
        }
        .wp-paginate .prev {
        }
        .wp-paginate .next {
        }
        .font-p1{
            font-family: 黑体;
            font-size: 30px;
            margin-left: 40%;
            color: #0f81c5;
            height: 40px;
        }
        .font-p2{
            font-family: 黑体;
            font-size: 18px;
            margin-left: 43%;
            color: #0f81c5;
            height: 25px;
        }

    </style>

</head>
<body>
<jsp:include page="reference.jsp"/>
<img src ="../../image/famousTercher.jpg" width=100% height=500px border =0>
<img src="../../image/teacherIntroduce.png" width="50%" height="300px" style="margin-left: 27%">
<div style="font-weight: lighter;width: 100%;height: 0px;border-top: 1px black dashed;">
</div>
<div style="width: 100%;height: 70px;">
    <p class="font-p1">e学网教师团队</p>
    <p class="font-p2">国内名师指导</p>
</div>
<div style="width: 100%;height: 20px;background: #1c94c4">
    <input id="pageNum" value="${teacherShow.pageNum}" hidden>
</div>

    <div class="teacher-a">
        <c:forEach begin="0" step="1" items="${teacherShow.list}" var="item" varStatus="teacherList">
            <div class="teacher-b">
                <img src="../../image/${item.titleImg}" style="width:250px; height:200px;margin-left: 100px;margin-top: 15px" >
                <!--从数据库读取的时候注意图片长宽的设定-->
                <div style="height: 10px ;width:400px ">
                </div>
                <p class="teacher-c" style="text-align: center">${item.author}</p>
                <p class="teacher-c" style="text-align: center">${item.title}</p>
                <p class="teacher-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.description}</p>
            </div>
        </c:forEach>
    </div>

<div class="navigation">
    <ol class="wp-paginate">
        <li><a href="/teacher/listTeacherShows?pageNo=${page.prePage}" >&lt;</a></li>
        <li><a href="/teacher/listTeacherShows?pageNo=1"><span id="1">1</span></a></li>
        <li><a href="/teacher/listTeacherShows?pageNo=2" title="2" ><span class="" id="2">2</span></a></li>
        <li><a href="/teacher/listTeacherShows?pageNo=3" title="3"><span class="" id="3">3</span></a></li>
        <li><a href="/teacher/listTeacherShows?pageNo=4" title="4"><span class="" id="4">4</span></a></li>
        <li><a href="/teacher/listTeacherShows?pageNo=5" title="5"><span class="" id="5">5</span></a></li>
        <li><span class="gap">...</span></li>
        <li><a href="/teacher/listTeacherShows?pageNo=${page.nextPage}" class="">&gt;</a></li>
    </ol>
</div>

<div style="height: 40px ;width:100%">
</div>
<jsp:include page="footer.jsp"/>
</body>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
    $("span").click(function () {
        // debugger;
        $("span.current").removeClass(); // $(this).addClass(\"page current\").siblings().removeClass(\"page current\");\n" +
        $(this).addClass("page");
        $(this).addClass("current");
    });
    window.onload=function (ev) {
        $("#${teacherShow.pageNum}").addClass("page");
        $("#${teacherShow.pageNum}").addClass("current");
    }
</script>
</html>