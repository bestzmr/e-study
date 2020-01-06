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
  crossorigin="anonymous"></script><script src="../../js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../main.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/style.css" />
    <script src="json/city.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div id="container">
    <div id="left" class="left-width">
        <ul class="nav nav-pills nav-stacked left-consty">
            <li role="presentation"><a id="a1" href="middleschool.jsp" style="text-align: center"><span class="glyphicon glyphicon-align-left"
                                                                                                        aria-hidden="true"></span>中考</a></li>
            <li role="presentation" class="active">
                <a id="a2" href="highschool.jsp" style="text-align: center">
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
                                <select id="province" data-live-search="true" class="form-control" style="width: 144px;" onchange="collegeOnchange(this)">

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
                            <thead>
                            <tr>
                                <th style="text-align: center; width: 200px;">学校</th>
                                <th style="text-align: center;">类型</th>
                                <th style="text-align: center;">2017分数</th>
                                <th style="text-align: center;">2018分数</th>
                                <th style="text-align: center;">2019分数</th>
                            </tr>
                            </thead>
                            <tbody id="collegeContentT"></tbody>
                        </table>
                    </div>

                    <script>
                        // 添加省份列表
                        (function() {
                            var pHtmlStr = '';
                            for (var name in pc) {
                                pHtmlStr = pHtmlStr + '<option value="'+name+'">' + name + '</option>';
                            }
                            $("#province").html(pHtmlStr);
                            $("#province").change();
                            $("#type").change();
                        })();
                    </script>
                </div>
                <div class="tab-pane fade" id="tips" style="text-align: center;">
                    <h1>功能开发中</h1>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

