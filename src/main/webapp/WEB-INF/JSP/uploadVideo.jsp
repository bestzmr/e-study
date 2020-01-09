<%--
  Created by IntelliJ IDEA.
  User: ywl
  Date: 2019/12/31
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/css/fileinput.min.css" media="all" rel="stylesheet" type="text/css" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/js/plugins/piexif.min.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/js/plugins/sortable.min.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/js/plugins/purify.min.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/js/fileinput.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/themes/fa/theme.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/5.0.8/js/locales/zh.js"></script>
    <script src="../../js/upload.js"></script>
<%--    <script src="videojs/fileinput.min.js"></script>--%>
<%--    <script src="videocss/fileinput.css"></script>--%>
    <title>上传讲课视频</title>
<style>

    .container {
        margin-top: 5%;
        width: 35%;
    }

    .btn-primary {
        background-color: #337ab7;
        border-color: #337ab7;
    }

    .form-control {
        margin-bottom: 4px;
    }
</style>
</head>
<body style="background-image:url('../../image/bg-01.jpg');background-size: cover ">
<center>
<div class="panel panel-default" style="width: 55%;box-shadow: 2px 4px 6px #000;background: #f6f6f6">
    <div class="panel-body" style="text-align: center;">
<div class="container">
<form>
    <label class="control-label">视频名称：</label>
    <input type="text" class="form-control" id="videoname" name="name" placeholder="视频名称">
    <label class="control-label">视频描述：</label>
    <textarea class="form-control" rows="3" id="videoDestiption" name="description" placeholder="视频描述"></textarea>
    <label class="control-label">上传视频：</label><br>
    <input type="file" name="file" id="file" multiple/>
    <button onclick="loadFile()" type="button">上传</button>
<%--<button type="submit" class="btn btn-primary">确认上传</button>--%>
</form>
</div>
    </div>
</div>
</center>
</body>
<script>
    /*$("#").fileinput({
        language:'zh',
        uploadUrl:'#',
        showUpload:true,
        showCaption:false,
        showPreview:true,
        browsetClass:"btn btn-primary",
        alloweFileExtensions:['mp4'],
        enctype: 'multipart/form-data',
        validateInitialCount:true,
        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！"
    });*/
    function loadFile() {

        // 显示文件名
        var fileName = $("#videoname").val();
        var description = $("#videoDestiption").val();
        var uploadFile = $("#file")[0].files[0];
        if (uploadFile == null){
            alert("文件为空");
        }
        var formData = new FormData();
        formData.append("name",fileName);
        formData.append("description",description);
        formData.append("file",uploadFile);

        $.ajax({
            type : "post",
            url : "/video/uploadVideo",
            async : true,
            data :formData,
            contentType : false,
            processData : false,
            dataType : "json",
            success : function(data) {
                alert("上传成功！");
            },
            error : function(res) {

            }
        });
    }

</script>
</html>
