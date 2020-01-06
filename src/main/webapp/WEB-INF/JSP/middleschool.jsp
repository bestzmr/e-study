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
<div id="container">
    <div id="left" class="left-width">
        <ul class="nav nav-pills nav-stacked left-consty">
            <li role="presentation" class="active"><a id="a1" href="middleschool.jsp" style="text-align: center"><span class="glyphicon glyphicon-align-left"
                                                                                                                       aria-hidden="true"></span>中考</a></li>
            <li role="presentation">
                <a id="a2" href="highschool.jsp" style="text-align: center">
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
                        <table id="highschoolListT" class="table table-bordered" style="height: 40px; font-size: 20px;border-collapse:separate; border-spacing:0px 10px;">
                        </table>
                    </div>
                </div>
                <div class="tab-pane fade" id="announcement">
                    <div id="titleCon" style="text-align: center;">
                        <h1 id="titleH"></h1>
                    </div>
                    <div id="contentCon" style="margin: 0 auto; margin-top: 20px; width: 70%;">
                        <p id="contentP"></p>
                    </div>
                    <div id="downLoadCon" style="margin-left: 20px; margin-top: 300px;">
                        <span class="glyphicon glyphicon-download-alt" aria-hidden="true"><a id="downLoadA"></a></span>
                    </div>

                </div>
                <div class="tab-pane fade" id="overScore">
                    <div style="text-align: center;">
                        <table id="overScoreList" class="table" align="center" halign="center">
                            <thead>
                            <tr>
                                <th style="text-align: center; width: 200px;">学校</th>
                                <th style="text-align: center;">2017分数</th>
                                <th style="text-align: center;">2018分数</th>
                                <th style="text-align: center;">2019分数</th>
                            </tr>
                            </thead>
                            <tbody id="overScoreTB"></tbody>
                        </table>
                    </div>
                </div>
                <div class="tab-pane fade" id="schoolDivide">
                    <!-- 选项下拉框 -->
                    <div class="col-xs-12 form-inline">
                        <div class="form-group form-group-xs">
                            <div style="float: right; padding-left: 5px;" id="selectDiv">
                                <select id="selectbrand" data-live-search="true" class="form-control" style="width: 144px;" onchange="selectOnchang(this)">
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
                        });
                        let listCollege = function() {
                            debugger;
                            ajax_get("http://localhost:8080/HighSchool/getDetailById",{},function (data) {
                                var highSchoolObj = JSON.parse(data);
                                // 遍历本地中学，动态添加超链接
                                debugger
                                for (var i = 0; i <= highSchoolObj.length; i++) {
                                    let fori = "school" + i;
                                    $("#highschoolListT").append('<td><a id="' + fori + '" ></a></td>'); // 添加a标签
                                    // 添加内容和href
                                    $("#" + fori).text(highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolName]);
                                    $("#" + fori).attr("href", highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolUrl]);
                                    if (i % 4 == 0 && i != 0) {
                                        $("#highschoolListT").append('</tr> <tr>');
                                    }
                                }
                                console.log("1231");
                            });
                        };

                        let admission = $.get("json/overScore.js", function(data) {
                            var highSchoolObj = JSON.parse(data);
                            //去除重复的对象；添加下拉列表项
                            $(function() {
                                for (var i = 0; i < highSchoolObj.length; i++) {
                                    for (var j = i + 1; j < highSchoolObj.length;) {
                                        if (highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolArea] == highSchoolObj[j].highSchoolInfo[middleschool_config.highschoolArea]) { //通过id属性进行匹配；
                                            highSchoolObj.splice(j, 1);
                                        } else {
                                            j++;
                                        }
                                    }
                                }
                                for (var i = 0; i < highSchoolObj.length; i++) {
                                    $("#selectbrand").append('<option value="' + highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolArea] +
                                        '">' + highSchoolObj[i].highSchoolInfo[middleschool_config.highschoolArea] + '</option>');
                                }
                            });
                            // console.log(highSchoolObjC);

                        });

                        let getNews = $.get("json/newsJson.js", function(data, status) {
                            // $("#announcement").text(data);
                            // debugger
                            var annountObj = JSON.parse(data);
                            // console.log(annountObj.title);
                            $("#titleH").text(annountObj[middleschool_config.title]);
                            $("#contentP").text(annountObj[middleschool_config.content]);
                            $("#downLoadA").text(annountObj[middleschool_config.feilName]);
                            $("#downLoadA").attr("href", annountObj[middleschool_config.url]);
                            $("#downLoadA").attr("download", annountObj[middleschool_config.feilName]);
                            // console.log(middleschool_config.title);
                        });
                    </script>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

