<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/30
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
hello,world
<form action="/video/uploadVideo" method="post" enctype="multipart/form-data">
    <input type="file" id="file" name="file" multiple>
    <input type="submit" id="submitForm">
</form>
<a href="/video/videoPlay?url=A.M.V.mp4">播放视频</a>
</body>
</html>
