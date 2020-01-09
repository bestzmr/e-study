<%--
  Created by IntelliJ IDEA.
  User: ywl
  Date: 2020/1/6
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <script src="../../js/main.js"></script>
    <link rel = "stylesheet" href=" ../../bootstrap/css/bootstrap.min.css">
    <script src="../../js/jquery-3.4.1.js"></script>
    <link rel="stylesheet" type="text/css" href="../../fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../../fonts/iconic/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" type="text/css" href="../../css/util.css">
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
</head>
<body>
<div class="limiter">
    <div class="container-login100" style="background-image: url('../../image/bg-01.jpg');">
        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <form class="login100-form validate-form" action="/user/login" method="get">
                <span class="login100-form-title p-b-49">登录</span>

                <div class="wrap-input100 validate-input m-b-23" data-validate="请输入手机号">
                    <span class="label-input100">用户名</span>
                    <input class="input100" type="tel" name="tel" placeholder="请输入手机号" autocomplete="off">
                    <span class="focus-input100" data-symbol="&#xf206;"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate="请输入密码">
                    <span class="label-input100">密码</span>
                    <input class="input100" type="password" name="password" placeholder="请输入密码">
                    <span class="focus-input100" data-symbol="&#xf190;"></span>
                </div>

                <div class="text-right p-t-8 p-b-31">
                    <a href="javascript:">忘记密码？</a>
                </div>

                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button class="login100-form-btn" type="submit">登 录</button>
                    </div>
                </div>
                <div class="flex-col-c p-t-25">
                    <a href="/web/jumpRegister" class="txt2">立即注册</a>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
