<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-14
  Time: 下午7:04
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

    <title>注册新用户</title>
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
            <li><a href="/keps">发帖</a></li>
            <li><a href="/kepers">成员</a></li>
            <li><a href="${isLogin?myUrl:'/login'}">
                <c:out value="${isLogin?nickName:'登录'}"/></a></li>
            <li class="current_index_item"><a href="${isLogin?'/logout':'/register'}">
                <c:out value="${isLogin?'注销':'注册'}"/> </a></li>
            <li><a href="/about">关于</a></li>
        </ul>
    </div>
    <!-- end #menu -->
</div>

<div id="header-wrapper">
    <div id="header">
        <div id="logo">
            <h1><a href="#">注册</a></h1>
        </div>
    </div>
</div>
<!-- end #header -->

<div id="wrapper">
    <div id="page">
        <div id="page-bgtop">
            <div id="page-bgbtm">

                <h4 class="error" style="color:red;"><c:out value="${codeStr}"/></h4>
                <div id="content">

                    <form class="form-horizontal" role="form" method="post" commandName="keper">

                        <div class="form-group">
                            <label for="keperName" class="col-sm-2 control-label">用户名&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <input type="text" name="keperName" class="form-control" id="keperName"
                                       placeholder="英文/数字/下划线" path="keperName"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="nickName" class="col-sm-2 control-label">昵称&ensp;&ensp;&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <input type="text" name="nickName" class="form-control" id="nickName"
                                       placeholder="中英文以及下划线" path="nickName"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email" class="col-sm-2 control-label">邮箱&ensp;&ensp;&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <input type="text" name="email" class="form-control" id="email"
                                       placeholder="邮箱" path="email"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="motto" class="col-sm-2 control-label">个性签名：</label>
                            <div class="col-sm-10">
                                <textarea class="form-control" rows="3" name="motto" id="motto"
                                          placeholder="个性签名"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">密码&ensp;&ensp;&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <input type="password" name="password" class="form-control" id="password"
                                       placeholder="英文/数字/符号" path="password"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="confirmPassword" class="col-sm-2 control-label">确认密码：</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="confirmPassword"
                                       placeholder="确认密码"/>
                            </div>
                        </div>

                        <div class="form-group">

                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">立即注册</button>
                            </div>
                        </div>
                    </form>
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
