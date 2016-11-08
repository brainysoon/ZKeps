<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-14
  Time: 下午7:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta name="keywords" content="ZKeps"/>
    <meta name="description" content="They Keep Us Alive !"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <!--<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed|Open+Sans:400,300,700|Yesteryear" rel="stylesheet" type="text/css" />-->
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css" media="screen"/>

    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- 包括所有已编译的插件 -->
    <script src="/resources/js/bootstrap.min.js"></script>

    <title>注册新用户</title>
</head>
<body>
<div id="menu-wrapper">
    <div id="menu">
        <ul>
            <li class="current_page_item"><a href="/">首页</a></li>
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
            <h1><a href="#">注册</a></h1>
        </div>
    </div>
</div>
<!-- end #header -->

<div id="wrapper">
    <div id="page">
        <div id="page-bgtop">
            <div id="page-bgbtm">

                <div id="content">

                    <sf:form class="form-horizontal" role="form" method="post" commandName="keper">

                        <div class="form-group">
                            <label for="userName" class="col-sm-2 control-label">用户名&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <sf:input type="text" name="userName" class="form-control" id="userName"
                                          placeholder="用户名" path="userName"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email" class="col-sm-2 control-label">邮箱&ensp;&ensp;&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <sf:input type="text" name="email" class="form-control" id="email"
                                          placeholder="邮箱" path="email"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">密码&ensp;&ensp;&ensp;&ensp;：</label>
                            <div class="col-sm-10">
                                <sf:input type="password" name="password" class="form-control" id="password"
                                          placeholder="密码" path="password"/>
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

                        <div class="form-group">

                            <div class="col-sm-2 control-label">

                                <sf:errors path="*" element="div" cssClass="errors"/>
                            </div>
                        </div>
                    </sf:form>
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
