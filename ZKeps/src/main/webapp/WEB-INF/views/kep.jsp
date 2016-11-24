<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-14
  Time: 下午6:46
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

    <title>关于</title>
</head>
<body>
<c:set var="isLogin" value="${sessionScope.keper!=null}"/>
<c:if test="${isLogin}">
    <c:set var="preUrl" value="/kepers/keperName"/>
    <c:set var="myUrl" value="${fn:replace(preUrl,'keperName',sessionScope.keper.keperName)}"/>
    <c:set var="nickName" value="${sessionScope.keper.nickName}"/>
</c:if>
<div id="menu-wrapper">
    <div id="menu">
        <ul>
            <li><a href="/">首页</a></li>
            <li class="current_page_item"><a href="/keps">发帖</a></li>
            <li><a href="/kepers">成员</a></li>
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
            <h1><a href="#">暖贴详情</a></h1>
        </div>
    </div>
</div>
<!-- end #header -->

<div id="wrapper">
    <div id="page">
        <div id="page-bgtop">
            <div id="page-bgbtm">

                <div id="content">

                    <h4 style="color:red;"><c:out value="${codeStr}"/></h4>

                    <div class="post">

                        <h2 class="title">标题：<a href="/keps/${kep.kepId}"><c:out value="${kep.kepTitle}"/></a></h2>
                        <p class="meta">
                            <span class="date">发布时间：<c:out value="${kep.kepTime}"/></span>
                            <span class="posted">作者：<a href="/kepers/${kep.keperName}"><c:out
                                    value="${kep.keperName}"/></a> </span>
                        </p>
                        <div style="clear: both;">&nbsp;</div>
                        <div class="entry">
                            <p>摘要：<c:out value="${kep.kepMsg}"/></p><br/>
                            <p>内容：<c:out value="${kep.kepContent}"/></p><br/>
                            <p>热度：<c:out value="${kep.stars}"/></p>
                        </div>
                        <h2>所有评论：</h2><br/>
                        <c:forEach items="${comments}" var="comment">

                            <strong><c:out value="${comment.nickName}"/></strong>&ensp;&ensp;评论说：&ensp;&ensp;<c:out
                                value="${comment.content}"/><br/>
                        </c:forEach>
                        <br/><br/>

                        <form class="form-horizontal" role="form" method="post">

                            <div class="form-group">
                                <label for="commentcontent">发表评论</label>
                                <textarea class="form-control" rows="3" name="content" id="commentcontent"
                                          placeholder="登录过后才可以发表评论"></textarea>
                            </div>

                            <div class="form-group">
                                <button type="submit" class="btn btn-default">&ensp;&ensp;发表评论&ensp;&ensp;</button>
                            </div>
                        </form>
                    </div>
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
