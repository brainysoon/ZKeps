<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-12
  Time: 下午6:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="keywords" content="ZKeps"/>
    <meta name="description" content="They Keep Us Alive !"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>ZKeps</title>
    <link href="/resources/css/default.css" rel="stylesheet" type="text/css" media="screen"/>

</head>
<body>
<div id="menu-wrapper">
    <div id="menu">
        <ul>
            <li class="current_index_item"><a href="/">首页</a></li>
            <li><a href="/keps">发帖</a></li>
            <li><a href="/kepers">成员</a></li>
            <li><a href="/login">登录</a></li>
            <li><a href="/register">注册</a></li>
            <li><a href="/about">关于</a></li>
        </ul>
    </div>
    <!-- end #menu -->
</div>
<div id="header-wrapper">
    <div id="header">
        <div id="logo">
            <h1><a href="#">Keps</a></h1>
        </div>
    </div>
</div>
<div id="wrapper">
    <!-- end #header -->
    <div id="page">

        <div id="content">

            <c:forEach items="${popKeps}" var="popKeps">
                <div class="post">

                    <h2 class="title">主题：<a href="#"><c:out value="${popKeps.kepTitle}"/></a></h2>
                    <p class="meta">
                        <span class="date">发布时间：<c:out value="${popKeps.kepTime}"/></span>
                        <span class="posted">作者：<a href="#"><c:out value="${popKeps.keperName}"/></a> </span>
                    </p>
                    <div style="clear: both;">&nbsp;</div>
                    <div class="entry">
                        <p>摘要：<c:out value="${popKeps.kepMsg}"/></p>
                        <p>热度：<c:out value="${popKeps.stars}"/></p>
                        <p class="links"><a href="#" class="button">阅读更多</a></p>
                    </div>
                </div>
            </c:forEach>
        </div>
        <!-- end #content -->
    </div>
    <!-- end #page -->
</div>

<div id="index-wrapper">
    <div id="index">

        <ul>
            <li><a href="/?pageIndex=${0}">首页</a></li>
            <li><a href="/?pageIndex=${preIndex}">上一页</a></li>
            <c:forEach var="i" begin="0" end="${pageMax}">
                <li><a href="/?pageIndex=${i}" class="${i==pageIndex?'current_index_item':'normal'}"><c:out
                        value="${i+1}"/></a></li>
            </c:forEach>
            <li><a href="/?pageIndex=${subIndex}">下一页</a></li>
            <li><a href="/?pageIndex=${pageMax}">尾页</a></li>
        </ul>
    </div>
    <!--End Index-->
</div>

<div id="footer">
    <p>&copy; 2016 ZKeps. | Design by <a href="http://www.fat246.com/" rel="nofollow">BrainySoon</a>.
    </p>
</div>
<!-- end #footer -->
</body>
</html>
