<%--
  Created by IntelliJ IDEA.
  User: lulinjun243143
  Date: 2020/1/2
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <style>
        .homepage-b{
            width: 750px;
            height: 200px;
            /*背景色*/
            background: #eeeeee;
            position: absolute;
            right: 250px;
            text-align:left;
        }
        .homepage-a{
            width: 100%;
            height: 40px;
            padding-top: 0px;
            size: 10px;
            font-family: sans-serif;
            font-weight: lighter;
        }
        .homepage-c{
            width: 100%;
            height: 0px;
            /*position: absolute;*/
            text-align: center;
            padding-top: 300px;
        }
        .homepage-d{
            width: 200px;
            height: 300px;
            /*背景色*/
            /*background: #eeeeee;*/
            position: absolute;
            left:100px;
            text-align:left;
            padding-top: 100px;
        }
        .homepage-e{
            width: 200px;
            height: 300px;
            /*背景色*/
            /*background: #eeeeee;*/
            position: absolute;
            left:400px;
            text-align:left;
            padding-top: 100px;
        }
        .homepage-f{
            width: 200px;
            height: 300px;
            /*背景色*/
            /*background: #eeeeee;*/
            position: absolute;
            left:700px;
            text-align:left;
            padding-top: 100px;
        }
        .homepage-g{
            width: 200px;
            height: 300px;
            /*背景色*/
            /*background: #eeeeee;*/
            position: absolute;
            left:1000px;
            text-align:left;
            padding-top:100px;
        }
        .homepage-h{
            width: 100%;
            height: 20px;

            padding-top: 0px;
            font-size: 15px;
            font-family: sans-serif;
            font-weight: lighter;
        }
        .homepage-i{
            width: 100%;
            height: 100px;
            /*position: absolute;*/
            text-align: center;
            padding-top: 500px;
        }
        body{
            /*background:url(images/bg_tile.jpg);*/
            margin:0;
            padding:0;
        }


        .homepage-container{
            /*background:url(images/bg_tile.jpg);*/
            width:800px;
            height:534px;
            margin:50px auto 0;
        }

        .homepage-menu{
            width:800px;
            height:34px;
        }

        /*homepage-ul{*/
            /*list-style:none;*/
            /*width:720px;*/
            /*height:34px;*/
            /*margin:0 auto;*/
        /*}*/

        .homepage-menu li{
            background:url(../../image/header_tabs.png) repeat-x;
            background-position:214px 0;
            display:block;
            float:left;
            width:215px;
            height:34px;
            cursor:pointer;
        }

        .homepage-menu li.current{
            background-position:0 0;
        }

        .homepage-menu span{
            font:bold 22px Verdana, Geneva, sans-serif;
            color:#FFE;
            display:block;
            line-height:34px;
            text-align:center;
            text-shadow:2px 2px 2px #666;
            letter-spacing:4px;
        }

        .homepage-current span{
            color:#666;
            text-shadow:2px 2px 2px #FFF;
        }


        .homepage-content{
            background:#F9F9F9;
            width:800px;
            height:500px;
            border-radius:12px;
            box-shadow:6px 6px 6px rgba(0,0,0,0.6);
        }

        .homepage-content ul{
            width:760px;
            height:500px;
            list-style:none;
        }

        .homepage-content li{
            float:left;
            width:800px;
            height:500px;
            margin-left:-40px;
            display:block;
        }

        .homepage-content img{
            float:left;
            width:400px;
            margin:20px 30px;
        }

        .homepage-info{
            float:left;
            width:300px;
            margin:20px 0;
            height:auto;
        }

        .homepage-info p{
            font:bold 24px Verdana, Geneva, sans-serif;
            color:#999;
            display:block;
            line-height:34px;
            text-align:center;
        }
        .homepage-j{
            width: 800px;
            height: 500px;
        }
        .homepage-k{
            width: 360px;
            height: 300px;
            margin-top: 65px;
        }
        .homepage-l{
            width: 400px;
            height: 500px;
        }
        .clear{
            clear:both;
        }

        .info{
            float:left;
            width:300px;
            margin:20px 0;
            height:auto;
        }

        .info p{
            font:bold 24px Verdana, Geneva, sans-serif;
            color:#999;
            display:block;
            line-height:34px;
            text-align:center;
        }

    </style>
    <script src="../../js/jquery-1.7.min.js"></script>
    <script>
        $(function(){


            $(".homepage-info p").each(function(){
                var txt = $(this).parent().siblings().attr("src");
                $(this).html(txt);
            })

            $(".homepage-menu li").click(function(){
                var index = $(this).index();
                $(this).addClass("current").siblings().removeClass("current");
                $(".homepage-content li").eq(index).show().siblings().hide();
            })

        })
    </script>
</head>
<body>
<jsp:include page="reference.jsp" flush="true" />
<script language =javascript >
    var curIndex=0;
    var timeInterval=5000;
    var arr=new Array();
    arr[0]="../../image/1.jpg";
    arr[1]="../../image/2.jpg";
    arr[2]="../../image/3.jpg";
    arr[3]="../../image/4.jpg";
    arr[4]="../../image/5.jpg";
    setInterval(changeImg,timeInterval);
    function changeImg()
    {
        var obj=document.getElementById("obj");
        if (curIndex==arr.length-1)
        {
            curIndex=0;
        }
        else
        {
            curIndex+=1;
        }
        obj.src=arr[curIndex];
    }
</script>
<img id=obj src ="../../image/1.jpg" width=100% height=400 border =0>
<div style="height: 70px;width: 100%">

</div>
<table width="100%" style="height: 60px" cellpadding="0" cellspacing="0">
    <tr>
        <td valign="middle" align="center">
            <p style="height: 30px;font-size: 20px">学校简介</p>
            <p style="color: #28a4c9">--school profile--</p>
        </td>
    </tr>
</table>
<div class="homepage-b">
    <p class="homepage-a">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e学网成于1998年成立，是经上海市人力资源和社会保障局认可、在天赐大楼有独立办公场地180平方</p>
    <p class="homepage-a">米，教学场地854平方米,具备多媒体教学设施等现代化教学条件，专业实验实训设备达到国内一流、国际</p>
    <p class="homepage-a">先进水平。先拥有专业和兼职教师60余人，办学人员17人。坚持“以服务为宗旨、以就业为导向、以提高</p>
    <p class="homepage-a">质量为重点”，提升内涵，聚焦教育教学改革，调整优化办学结构和办学模式，做精、做优、做特学历教</p>
    <p class="homepage-a">育，做大、做强、做实教育......<a href="/web/schoolProfile">更多</a></p>
</div>
<div class="homepage-c">
    <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
            <p style="height: 30px;width: 1250px;font-size: 20px">名师风采</p>
            <p style="color: #28a4c9;width: 1250px;height: 60px">--tercher style--</p>
        </tr>
    </table>
</div>

<c:forEach  begin="0" end="0" step="1" items="${page.list}" var="item" varStatus="teacherList">
    <div class="homepage-d">
        <div style="width: 100%;border: #eeeeee;height: 200px">
            <img width=200 height=200 border =0 src="../../image/${item.titleImg}">
        </div>

        <p class="homepage-h" style="text-align: center">${item.author}</p>
        <p class="homepage-h">${item.description}</p>
    </div>
</c:forEach>
<c:forEach  begin="1" end="1" step="1" items="${page.list}" var="item" varStatus="teacherList">
    <div class="homepage-e">
        <div style="width: 100%;border: #eeeeee;height: 200px">
            <img width=200 height=200 border =0 src="../../image/${item.titleImg}">
        </div>

        <p class="homepage-h" style="text-align: center">${item.author}</p>
        <p class="homepage-h">${item.description}</p>
    </div>
</c:forEach>
<c:forEach  begin="2" end="2" step="1" items="${page.list}" var="item" varStatus="teacherList">
    <div class="homepage-f">
        <div style="width: 100%;border: #eeeeee;height: 200px">
            <img width=200 height=200 border =0 src="../../image/${item.titleImg}">
        </div>

        <p class="homepage-h" style="text-align: center">${item.author}</p>
        <p class="homepage-h" >${item.description}</p>
    </div>
</c:forEach>
<c:forEach  begin="3" end="3" step="1" items="${page.list}" var="item" varStatus="teacherList">
    <div class="homepage-g">
        <div style="width: 100%;border: #eeeeee;height: 200px">
            <img width=200 height=200 border =0 src="../../image/${item.titleImg}">
        </div>

        <p class="homepage-h" style="text-align: center">${item.author}</p>
        <p class="homepage-h">${item.description}</p>
    </div>
</c:forEach>
<div class="homepage-i">
    <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
            <p style="height: 30px;width: 1250px;font-size: 20px"><a name="A1">课程体系</a></p>
            <p style="color: #28a4c9;width: 1250px">--curriculum system--</p>
        </tr>
    </table>
</div>

<div class="homepage-container">
    <div class="homepage-menu">
        <ul>
            <c:forEach begin="0" end="5" step="1" items="${courseList}" var="item" varStatus="tabList">
                <li ><span>${item.name}</span></li>
            </c:forEach>
        </ul>
    </div>

    <div class="homepage-content">
        <ul>
            <c:forEach begin="0" end="5" step="1" items="${courseList}" var="item" varStatus="tabList">
                <%--<li>--%>
                    <%--<div class="homepage-j">--%>
                        <%--<div class="homepage-k">--%>
                            <%--<img src="../../image/${item.courseImg}" width="350px" height="250px">--%>
                        <%--</div>--%>
                        <%--<div class="homepage-l">--%>
                            <%--&lt;%&ndash;获取相应的文字描述&ndash;%&gt;--%>
                            <%--<p>${item.name}</p>--%>
                            <%--<p>${item.schoolHour}</p>--%>
                            <%--<p>${item.totalPeople}</p>--%>
                                <%--<p><a href="courseSystem.jsp?name=${item.name}&description=${item.description}&schoolHour=${item.schoolHour}&totalPeople=${item.totalPeople}&courseImg=${item.courseImg}">${item.description}</a></p>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</li>--%>
                <c:if test="${tabList.index == 0}">
                    <li>
                </c:if>
                <c:if test="${tabList.index != 0}">
                    <li style="display: none">
                </c:if>

                    <img src="../../image/${item.courseImg}" width="50%" height="65%">
                    <div class="info">
                        <p >体系名称：${item.name}</p><br>
                        <p>课时：${item.schoolHour}</p><br>
                        <p style="font-size: 10px;float: left"><a href="/course/getCourse?name=${item.name}&description=${item.description}&schoolHour=${item.schoolHour}&totalPeople=${item.totalPeople}&courseImg=${item.courseImg}">课程描述：${item.description}</a></p>
                        <%--<p><a javascript:location.href=encodeURI('courseSystem.jsp?name=${item.name}&description=${item.description}&schoolHour=${item.schoolHour}&totalPeople=${item.totalPeople}&courseImg=${item.courseImg}')>课程描述：${item.description}</a></p>--%>
                    </div>

                </li>
            </c:forEach>
        </ul>
    </div>
</div>
<c:import url="footer.jsp"/>
</body>
</html>
