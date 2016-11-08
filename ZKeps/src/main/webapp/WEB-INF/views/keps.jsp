<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-13
  Time: 下午8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="keywords" content="ZKeps"/>
    <meta name="description" content="They Keep Us Alive !"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <!--<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed|Open+Sans:400,300,700|Yesteryear" rel="stylesheet" type="text/css" />-->
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css" media="screen"/>

    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- 包括所有已编译的插件 -->
    <script src="/resources/js/bootstrap.min.js"></script>

    <title>发帖</title>
</head>
<body>

<div id="menu-wrapper">
    <div id="menu">
        <ul>
            <li class="current_page_item"><a href="/">首页</a></li>
            <li><a href="/keps">发帖</a></li>
            <li><a href="/keper">成员</a></li>
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
            <h1><a href="#">发帖</a></h1>
        </div>
    </div>
</div>

<div id="wrapper">
    <div id="page">
        <div id="page-bgtop">
            <div id="page-bgbtm">

                <div id="content">

                    <form class="form-horizontal" role="form">

                        <div class="form-group">
                            <label for="kepTitle">标题</label>
                            <input type="text" class="form-control" placeholder="标题" name="kepTitle" id="kepTitle"/>
                        </div>

                        <div class="form-group">
                            <label for="kepMsg">摘要</label>
                            <textarea class="form-control" rows="3" name="kepMsg" id="kepMsg"
                                      placeholder="帖子摘要"></textarea>
                        </div>

                        <div class="form-group">

                            <label for="kepContent">文章内容</label>
                            <textarea class="form-control" rows="10" name="kepContent" id="kepContent"
                                      placeholder="帖子内容"></textarea>
                        </div>

                        <div class="form-group">
                            <button type="submit" class="btn btn-default">&ensp;&ensp;登录&ensp;&ensp;</button>
                        </div>
                    </form>

                    <ul class="spittleList">
                        <c:forEach items="${keps}" var="kep">
                            <li id="kep_<c:out value="kep.kepId"/>">
                                <div class="kepMsg"><c:out value="${kep.kepMsg}"/></div>
                                <div>
                                    <span class="kepTime"><c:out value="${kep.kepTime}"/></span>
                                    <span class="userName">(<c:out value="${kep.userName}"/>)</span>
                                </div>
                            </li>
                        </c:forEach>
                    </ul>
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
</body>
</html>
