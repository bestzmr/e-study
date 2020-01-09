<%--
  Created by IntelliJ IDEA.
  User: lulinjun243143
  Date: 2020/1/6
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学校简介</title>
    <style>
        .school-a{
            width: 100%;
            height: 170px;
            /*position: absolute;*/
            text-align: center;
            padding-top: 40px;
        }
        .school-b{
            width: 100%;
            background: #ebdede;
            height: 350px;
            display: inline-block;
        }
        .school-c{
            font-size:14px;
            font-weight: lighter;
            height: 35px;
        }
        .school-d{
            margin-top: 85px;
            width: 650px;
            height: 300px;
            margin-left: 20px;
        }
        .school-e{
            width: 500px;
            height: 350px;
        }
        .school-f{
            width: 100%;
            height: 170px;
            padding-top: 40px;
            text-align: center;
        }
        .school-g{
            width: 100%;
            height: 170px;
            text-align: center;
            padding-top: 40px;
        }
        .school-h{
            margin-left: 800px;
            margin-bottom: -350px;
            width: 450px;
        }
        .school-i{
            width: 100%;
            height: 400px;
        }
        .school-j{
            width: 100%;
            height: 400px;
            display: inline-block;
            background: #f2e5d3;
        }
        .school-k{
            margin-left: 10px;
            margin-bottom: -350px;
            width: 450px;
        }
        .school-l{
            margin-left: 500px;
            margin-top: 85px;
            width: 650px;
            height: 600px;
        }
    </style>
</head>
<body>
<%--<iframe align="center" width="100%" height="127" src="reference.jsp" frameborder="no" border="0" marginwidth="0"marginheight="0" scrolling="no"></iframe>--%>
<jsp:include page="reference.jsp" flush="true" ></jsp:include>
<%--<!--<c:import url="reference.jsp"/>-->--%>
<img src ="../../image/schoolIntroduce.jpg" width=100% height=400 border =0>
<div class="school-a">
    <p style="height: 50px;width: 100%;font-size: 35px">e学网简介</p>
    <p style="color: #a0a2a3;width: 100%;height: 20px">——  Introduction  ——</p>
    <hr />
</div>

<div class="school-b">
    <div class="school-h" >
        <img  src ="../../image/school.jpg" width=450 border =0>
    </div>
    <div class="school-d" style="height: 200px">
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京e学网教育咨询有限公司是致力于教育培训的机构。专注深耕辅导模式、社群学习平台在</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;线课程平台，教育书籍出版、实体加盟培训等业务，其中涵盖了硕士研究生考试、大学英语四六级</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;四六级、游学、冬夏令营等领域，致力于为大学生提供学历素养提升及与职业规划等整体解决方案</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;。以“追求卓越，合作共赢，创新未来”为指导思想创造办学条件，以“引发兴趣 激发热情 散发思维”</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;的办学理念，为e学网学员提供教学服务。目前除线下老师面授课程外，e学网还有考研公共课，考</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;研专业课，考研辅导，大学英语四六级，考研专硕等考试项目的网络辅导课程，为广大考研学子提</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;供复习辅导课程；全日制集训营、考研网课、考研直播课等系列产品，满足考生个性化的学习备考</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;需要。近年来，北京e学网教育咨询有限公司与各大高校及部分互联网科研机构深入合作，利用大数</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;据技术，推进互联网教育平台建设，以智能化、质量化、效率化、科学化为发展的方向，实现产业</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;融合共赢。同时通过数据驱动，记录每个学生的学习轨迹与点滴。</p>
    </div>
</div>

<div class="school-f">
    <!--<p style="height: 10px;width:100%;text-align:center;font-size: 35px;align-content: center;">企业文化</p>-->
    <p style="height: 50px;width:100%;text-align:center;font-size: 35px;">企业文化</p>
    <p style="color: #a0a2a3;width:100%;text-align:center;height: 20px">——  Corporate culture  ——</p>
    <hr />
</div>
<img src ="../../image/culture.jpg" width=100% height=500 border =0>
<div class="school-g">
    <p style="height: 50px;width:100%;text-align:center;font-size: 35px;">品牌优势</p>
    <p style="color: #a0a2a3;width:100%;text-align:center;height:20px">——  Brand advantage  ——</p>
    <hr />
</div>

<div class="school-j">
    <div class="school-k" >
        <img  src ="../../image/system.jpg" width=450 border =0>
    </div>
    <div class="school-l" style="height: 400px">
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京e学网教育咨询有限公司是致力于教育培训的机构。专注深耕辅导模式、社群学习平台在</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;线课程平台，教育书籍出版、实体加盟培训等业务，其中涵盖了硕士研究生考试、大学英语四六级</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;四六级、游学、冬夏令营等领域，致力于为大学生提供学历素养提升及与职业规划等整体解决方案</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;。以“追求卓越，合作共赢，创新未来”为指导思想创造办学条件，以“引发兴趣 激发热情 散发思维”</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;的办学理念，为e学网学员提供教学服务。目前除线下老师面授课程外，e学网还有考研公共课，考</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;研专业课，考研辅导，大学英语四六级，考研专硕等考试项目的网络辅导课程，为广大考研学子提</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;供复习辅导课程；全日制集训营、考研网课、考研直播课等系列产品，满足考生个性化的学习备考</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;需要。近年来，北京e学网教育咨询有限公司与各大高校及部分互联网科研机构深入合作，利用大数</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;据技术，推进互联网教育平台建设，以智能化、质量化、效率化、科学化为发展的方向，实现产业</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;融合共赢。同时通过数据驱动，记录每个学生的学习轨迹与点滴，积极打造新时代下的教育模式生</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态圈，已实现了考研辅导行业管理团队、师资团队、辅导团队、运维团队的专业化、科学化分工。</p>
        <p class="school-c">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
    </div>
</div>
<%--<iframe align="center" width="100%" height="300px" src="footer.jsp" frameborder="no" border="0" marginwidth="0"marginheight="0" scrolling="no"></iframe>--%>
<jsp:include page="footer.jsp"></jsp:include>
<%--<c:import url="footer.jsp"/>--%>
</body>
</html>
