<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ywl
  Date: 2020/1/6
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>E学注册</title>
    <meta name="description" content="" />
    <link href="https://fonts.googleapis.com/css?family=K2D:300,400,500,700,800" rel="stylesheet">
    <link rel="stylesheet" href="http://cdn.bootstrapmb.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="../../js/jquery-3.4.1.js" rel="script" charset="UTF-8"></script>
    <link rel="stylesheet" type="text/css" href="../../css/util.css">
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
</head>
<body style="background-image:url('../../image/bg-01.jpg');background-size: cover ">
<section class="bh-white py-3">
    <div class="container-fluid">
        <div class="row">
            <div class="col-12 text-center">
            </div>
        </div>
    </div>
</section>

<section class="py-5">
    <div class="container">
        <div class="row" style="">
            <div class="col-md-7 my-md-auto" >
                <h1 class="text-center text-md-left">
                    E学网课，自由学习。

                </h1>
                <div class="row feature-grid">
                    <div class="col-sm-6">
                        <div class="media">
                            <div class="icon-box">
                                <div class="icon-box-inner">
                                    <span data-feather="unlock" width="28" height="28"></span>
                                </div>
                            </div>
                            <div class="media-body">
                                获得知识的力量

                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="media">
                            <div class="icon-box">
                                <div class="icon-box-inner">
                                    <span data-feather="briefcase" width="28" height="28"></span>
                                </div>
                            </div>
                            <div class="media-body">
                                专业老师，时时咨询

                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="media">
                            <div class="icon-box">
                                <div class="icon-box-inner">
                                    <span data-feather="gift" width="28" height="28"></span>
                                </div>
                            </div>
                            <div class="media-body">
                                专属课堂

                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="media">
                            <div class="icon-box">
                                <div class="icon-box-inner">
                                    <span data-feather="users" width="28" height="28"></span>
                                </div>
                            </div>
                            <div class="media-body">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-5 pl-md-5">
                <div class="card">
                    <div class="card-body py-md-4">
                        <h2>注册E学堂
                        </h2>

                        <form action="/user/register" method="post" id="registerForm">
                            <div class="form-group">
                                <input type="text" class="form-control" id="username" placeholder="姓名" name="username">
                            </div>
                            <div class="form-group">
                                <input type="radio" class="control-label" id="man" value="0" name="gender" checked/>男
                                <input type="radio" class="control-label" id="woman" value="1" name="gender" />女
                            </div>
                            <input id="sex" name="sex" hidden type="text"/>
                            <div class="form-group">
                                <input type="tel" class="form-control" id="userphone" placeholder="手机号" name="tel">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" id="userpassword" placeholder="密码" name="password">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="userage" placeholder="年龄" name="age">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="schoolName" placeholder="学校" name="school">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="userparents" placeholder="家长姓名" name="parentsName">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="parentsphone" placeholder="家长手机号" name="parentsTel">
                            </div>
                            <div class="form-group">
                                <label>
                                    <select id="selectcourse">
                                        <c:forEach begin="0" step="1" items="${courseList}" var="item" varStatus="courseList">
                                                <option value="${item.name},${item.teacher},${item.schoolHour}">课程:${item.name} 教师:${item.teacher} 课时:${item.schoolHour}</option>
                                        </c:forEach>
                                    </select>
                                </label>
                                <input id="courseName" hidden name="courseName"/>
                                <input id="courseTeacher" hidden name="teacher"/>
                                <input id="courseSchoolHour" hidden name="schoolHour"/>
                            </div>
                            <div class="container-login100-form-btn">
                                <div class="wrap-login100-form-btn">
                                    <div class="login100-form-bgbtn"></div>
                                    <button class="login100-form-btn" onclick="submitForm()">报名E学网</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

</body>
<script>
    function submitForm() {
        var myselect = document.getElementById("selectcourse");
        var index = myselect.selectedIndex;
        // alert((myselect.options[index].value).toString().split(",")[0]);
        var course = (myselect.options[index].value).toString().split(",");
        $("#courseName").val(course[0]);
        $("#courseTeacher").val(course[1]);
        $("#courseSchoolHour").val(course[2]);
        var els = document.getElementsByName("gender");
        for (var i=0; i<els.length;i++){
            if (els[i].checked){
                // alert(77);
                var elval = els.item(i).getAttribute("value");
                // alert(elval);
                $("#sex").val(elval);
                break;
            }
        }
        $("#registerForm").submit();
    }
</script>
</html>
