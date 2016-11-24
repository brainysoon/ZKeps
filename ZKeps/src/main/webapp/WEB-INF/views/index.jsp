<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-12
  Time: 下午6:58
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
    <title>ZKeps</title>
    <link href="/resources/css/default.css" rel="stylesheet" type="text/css" media="screen"/>

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
            <li class="current_index_item"><a href="/">首页</a></li>
            <li><a href="/keps">发帖</a></li>
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
            <h1><a href="#">Keps</a></h1>
        </div>
    </div>
</div>
<div id="wrapper">
    <!-- end #header -->
    <div id="page">

        <div id="content">

            <c:forEach items="${popKeps}" var="kep">
                <div class="post">

                    <h2 class="title">标题：<a href="/keps/${kep.kepId}"><c:out value="${kep.kepTitle}"/></a></h2>
                    <p class="meta">
                        <span class="date">发布时间：<c:out value="${kep.kepTime}"/></span>
                        <span class="posted">作者：<a href="/kepers/${kep.keperName}"><c:out
                                value="${kep.keperName}"/></a> </span>
                    </p>
                    <div style="clear: both;">&nbsp;</div>
                    <div class="entry">
                        <p>摘要：<c:out value="${kep.kepMsg}"/></p>
                        <p>热度：<c:out value="${kep.stars}"/></p>
                        <span class="links"><a href="/keps/${kep.kepId}" class="button">阅读更多</a></span>
                        &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                        <span class="links"><a href="/keps/${kep.kepId}" class="button">查看评论</a></span>
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
