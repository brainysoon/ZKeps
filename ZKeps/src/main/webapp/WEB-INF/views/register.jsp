<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-14
  Time: 下午7:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta name="keywords" content="ZKeps"/>
    <meta name="description" content="They Keep Us Alive !"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <!--<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed|Open+Sans:400,300,700|Yesteryear" rel="stylesheet" type="text/css" />-->
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css" media="screen"/>

    <title>注册新用户</title>
</head>
<body>
<div id="menu-wrapper">
    <div id="menu">
        <ul>
            <li class="current_page_item"><a href="#">首页</a></li>
                <li><a href="#">暖贴</a></li>
            <li><a href="#">照片</a></li>
            <li><a href="#">关于</a></li>
            <li><a href="#">登录</a></li>
            <li><a href="#">注册</a></li>
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

<div id="wrapper">
    <!-- end #header -->
    <div id="page">
        <div id="page-bgtop">
            <div id="page-bgbtm">

                <div id="content">

                    <form method="post">
                        用户名：<input type="text" name="userName"/> <br/>
                        密码：<input type="password" name="userPassword"/><br/>
                        确认密码:<input type="password" name="confirmPassword"/><br/>

                        <input type="submit" value="立即注册"/>
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
