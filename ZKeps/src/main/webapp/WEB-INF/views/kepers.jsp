<%--
  Created by IntelliJ IDEA.
  User: brainy
  Date: 16-11-8
  Time: 下午7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta name="keywords" content="ZKeps"/>
    <meta name="description" content="They Keep Us Alive !"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <!--<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed|Open+Sans:400,300,700|Yesteryear" rel="stylesheet" type="text/css" />-->
    <link href="/resources/css/default.css" rel="stylesheet" type="text/css" media="screen"/>

    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- 包括所有已编译的插件 -->
    <script src="/resources/js/bootstrap.min.js"></script>

    <title>成员</title>
</head>
<body>
<c:set var="isLogin" value="${sessionScope.keper!=null}"/>
<c:if test="${isLogin}">
    <c:set var="preUrl" value="/keper/keperName"/>
    <c:set var="myUrl" value="${fn:replace(preUrl,'keperName',sessionScope.keper.keperName)}"/>
    <c:set var="nickName" value="${sessionScope.keper.nickName}"/>
</c:if>
<div id="menu-wrapper">
    <div id="menu">
        <ul>
            <li><a href="/">首页</a></li>
            <li><a href="/keps">发帖</a></li>
            <li class="current_page_item"><a href="/kepers">成员</a></li>
            <li><a href="${isLogin?myUrl:'/login'}">
                <c:out value="${isLogin?nickName:'登录'}"/></a></li>
            <li><a href="${isLogin?'/logout':'/register'}">
                <c:out value="${isLogin?'注销':'注册'}"/> </a></li>
            <li><a href="/about">关于</a></li>
        </ul>
    </div>
    <!-- end #menu -->
</div>

<div id="header-wrapper">
    <div id="header">
        <div id="logo">
            <h1><a href="#">成员</a></h1>
        </div>
    </div>
</div>
<!-- end #header -->

<div id="wrapper">
    <div id="page">
        <div id="page-bgtop">
            <div id="page-bgbtm">

                <div id="content">


                </div>
                <!-- end #content -->
                <div style="clear: both;">&nbsp;</div>
            </div>
        </div>
    </div>
    <!-- end #page -->
</div>
<div id="footer">
    <p>&copy; 2016 ZKeps. | Design by <a href="http://www.fat246.com/" rel="nofollow">BrainySoon</a>.
    </p>
</div>
<!-- end #footer -->
</body>
</html>