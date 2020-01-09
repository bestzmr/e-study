<%--
  Created by IntelliJ IDEA.
  User: 刘浩
  Date: 2020/1/6
  Time: 8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>中/高考资讯</title>
    <script
      src="https://code.jquery.com/jquery-3.4.1.min.js"
      integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
      crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="../../js/main.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script src="../../js/config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/util.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<jsp:include page="reference.jsp" flush="true" />
<div id="container">
    <div id="left" class="left-width">
        <ul class="nav nav-pills nav-stacked left-consty">
            <li role="presentation" class="active"><a id="a1" href="middleschool.jsp" style="text-align: center"><span class="glyphicon glyphicon-align-left"
                                                                                                                       aria-hidden="true"></span>中考</a></li>
            <li role="presentation">
                <a id="a2" href="highschool" style="text-align: center">
                <span class="glyphicon glyphicon-align-left" aria-hidden="true">高考</span>
                </a>
            </li>
        </ul>
    </div>

    <div id="right" class="right-pos">
        <div id="middleschool">
            <div id="rightNavigation" class="">
                <ul id="myTab" class="nav nav-tabs nav-justified">
                    <li id="locationCon" class="active">
                        <a href="#location" data-toggle="tab"><span class="glyphicon glyphicon-home" aria-hidden="true">
                            本地中学
                        </span></a></li>
                    <li id="announcementCon">
                        <a href="#announcement" data-toggle="tab"><span class="glyphicon glyphicon-file" aria-hidden="true">
                            公告文件</span></a></li>
                    <li id="overScoreCon"><a href="#overScore" data-toggle="tab"><span class="glyphicon glyphicon-time" aria-hidden="true">
                        历年分数</span></a></li>
                    <li id="schoolDivideCon"><a href="#schoolDivide" data-toggle="tab"><span class="glyphicon glyphicon-th"
                                                                                             aria-hidden="true"> 学区划分</span></a></li>
                </ul>
            </div>

            <div id="rightContent" class="tab-content">
                <div class="tab-pane fade in active" id="location">
                    <div id="highschoolList">

                    </div>
                </div>
                <div class="tab-pane fade" id="announcement">
                    <!-- 文章标题下拉列表 -->
                    <div class="col-xs-12 form-inline">
                        <div class="form-group form-group-xs">
                            <div style="float: right; padding-left: 5px;padding-top: 5px" id="titleSelectDiv">
                                <select id="titleSelect" data-live-search="true" class="form-control" style="width: 200px;" onchange="titleOnchange(this)">

                                </select>
                            </div>
                        </div>
                    </div>

                    <div id="fileContent" style="margin-top: 10px">

                    </div>

                </div>
                <div class="tab-pane fade" id="overScore">
                    <div class="col-xs-12 form-inline">
                        <div class="form-group form-group-xs">
                            <div style="float: right;padding-top: 20px; padding-left: 5px;">
                                <select id="overSelect" data-live-search="true" class="form-control" style="width: 144px; " onchange="overOnchange(this)">

                                </select>
                            </div>
                        </div>
                    </div>
                    <div style="text-align: center;">
                        <table id="overScoreList" class="table" align="center" halign="center">

                        </table>
                    </div>
                </div>
                <div class="tab-pane fade" id="schoolDivide">
                    <!-- 选项下拉框 -->
                    <div class="col-xs-12 form-inline">
                        <div class="form-group form-group-xs">
                            <div style="float: right; padding-left: 5px;" id="selectDiv">
                                <select id="selectbrand" data-live-search="true" class="form-control" style="width: 144px;" onchange="selectOnchange(this)">
                                    <option value="">
                                        --请选择学区--
                                    </option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- 选择项匹配内容 -->
                    <div style="text-align: center;">
                        <h3>当前学区有以下中学：</h3>
                        <div id="selectContent">

                        </div>
                    </div>

                    <script type="text/javascript">
                        $(function() {
                            listCollege();
                            getSchoolAreas();
                            getNews();
                            getAreas();
                            getOverScore();
                        });
                        // 历史录取添加学校列表
                        let getOverScore = function() {
                            ajax_get("http://localhost:8080/HighSchool/getAllHighSchools",{},function (data) {
                                let overObject = JSON.parse(data);
                                for (var i = 0; i < overObject.length; i++){
                                    $("#overSelect").append('<option value="'+ overObject[i].id +'">'+ overObject[i].name +'</option>');
                                }
                                $("#overSelect").change();
                            });
                        };

                        let listCollege = function() {
                            // debugger;
                            ajax_get("http://localhost:8080/HighSchool/getAllHighSchools",{},function (data) {
                                let highSchoolObj = JSON.parse(data);
                                // 遍历本地中学，动态添加超链接
                                for (var i = 0; i < highSchoolObj.length; i++) {
                                    let html = '<a href="'+ highSchoolObj[i].url +'" style="font-size: 20px;line-height: 100px" data-toggle="tooltip" data-placement="left" title="'+highSchoolObj[i].description
                                        +'"><span>' + highSchoolObj[i].name +'</span></a>';
                                    $("#highschoolList").append(html);
                                }

                            });
                        };

                        let getSchoolAreas = function() {
                            ajax_get("http://localhost:8080/HighSchool/getAllHighSchools", {}, function (data) {
                            let highSchoolObj = JSON.parse(data);
                            //去除重复的对象；添加下拉列表项
                                for (var i = 0; i < highSchoolObj.length; i++) {
                                    for (var j = i + 1; j < highSchoolObj.length;) {
                                        if (highSchoolObj[i][middleschool_config.highschoolArea] == highSchoolObj[j][middleschool_config.highschoolArea]) { //通过id属性进行匹配；
                                            highSchoolObj.splice(j, 1);
                                        } else {
                                            j++;
                                        }
                                    }
                                }
                                for (var i = 0; i < highSchoolObj.length; i++) {
                                    $("#selectbrand").append('<option value="' + highSchoolObj[i][middleschool_config.highschoolArea] +
                                        '">' + highSchoolObj[i][middleschool_config.highschoolArea] + '</option>');
                                }
                                // console.log(highSchoolObjC);

                            });
                        };
                        let getNews = function () {
                            for(var i = 0;i < 7 ; i++) {
                                ajax_get("http://localhost:8080/getSuperiorFilesById", {"id":i}, function (data) {

                                   let titleObj  = JSON.parse(data);
                                   $("#titleSelect").append('<option value="' + titleObj.id + '">'+ titleObj.title +'</option>');
                                   $("#titleSelect").change();
                                });
                            }
                        };
                        let getAreas = function () {
                            ajax_get("http://localhost:8080/HighSchool/getDetailById", {}, function (data) {
                                let overObj = JSON.parse(data);
                                for (var i = 0; i < overObj.length; i++) {

                                    $("#overScoreTB").append('<tr><td>' + overObj[i].highSchoolInfo[middleschool_config.highschoolName] + '</td><td>' + overObj[i].admissionInfos[0][middleschool_config.overScore] +
                                        '</td><td>' + overObj[i].admissionInfos[1][middleschool_config.overScore] + '</td><td>' + overObj[i].admissionInfos[2][middleschool_config.overScore] +
                                        '</td></tr>');
                                }
                            });
                        };
                    </script>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

