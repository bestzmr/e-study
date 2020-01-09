<%--
  Created by IntelliJ IDEA.
  User: 刘浩
  Date: 2020/1/6
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>中/高考资讯</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script src="../../js/main.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/util.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<jsp:include page="reference.jsp" flush="true" />
<div id="container">
    <div id="left" class="left-width">
        <ul class="nav nav-pills nav-stacked left-consty">
            <li role="presentation"><a id="a1" href="middleschool" style="text-align: center"><span class="glyphicon glyphicon-align-left"
                                                                                                        aria-hidden="true"></span>中考</a></li>
            <li role="presentation" class="active">
                <a id="a2" href="highschool" style="text-align: center">
                    <span class="glyphicon glyphicon-align-left" aria-hidden="true">高考</span>
            </a></li>
        </ul>
    </div>

    <div id="right" class="right-pos">
        <div id="highschool">
            <div id="rightNavigation1" class="">
                <ul id="myTab1" class="nav nav-tabs nav-justified">
                    <li id="checkSchoolCon" class="active">
                        <a href="#checkSchool" data-toggle="tab">
                            <span class="glyphicon glyphicon-education" aria-hidden="true"> 名校查询</span>
                        </a></li>
                    <li id="tipsCon">
                        <a href="#tips" data-toggle="tab">
                            <span class="glyphicon glyphicon-comment" aria-hidden="true">志愿指南</span>
                        </a>
                    </li>
                </ul>
            </div>


            <div id="rightContent1" class="tab-content">
                <div class="tab-pane fade in active" id="checkSchool">
                    <div class="col-xs-12 form-inline">
                        <div class="form-group form-group-xs">
                            <div style="float: right; padding-left: 5px; margin-top: 20px;" id="selectDivH">
                                <select id="province" data-live-search="true" class="form-control"
                                        style="width: 144px;">
                                </select>
                                <!-- <select id="type" data-live-search="true" class="form-control" style="width: 144px;" onchange="typeOnchange(this)">
                                    <option value ="isDoubleFirst">双一流</option>
                                    <option value ="isKey">重点</option>
                                    <option value ="noKey">普通</option>
                                    <option value ="isUndergraduate">本科</option>
                                    <option value ="noUndergraduate">专科</option>
                                    <option value ="isArt">艺术类</option>
                                </select> -->
                            </div>
                        </div>
                    </div>

                    <div style="text-align: center;">
                        <h3>所选的省份有以下名校</h3>
                        <table id="collegeContent" class="table" align="center" halign="center">
                        </table>
                    </div>


                </div>
                <div class="tab-pane fade" id="tips" style="text-align: center;">
                    <h1>功能开发中</h1>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    // 添加省份列表
    (function() {

        ajax_get("http://localhost:8080/College/listAllArea",{},function (data) {
            let pHtmlStr = '';
            let areas = JSON.parse(data);

            for (let id in areas) {
                pHtmlStr = pHtmlStr + '<option value="'+areas[id]+'">' + areas[id] + '</option>';
            }
            $("#province").html(pHtmlStr);

        });
        collegeOnchange();
        $("#type").change();
    })();
</script>
</html>

