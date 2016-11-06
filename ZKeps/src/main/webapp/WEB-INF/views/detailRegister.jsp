<%--
  Created by IntelliJ IDEA.
  User: brainy
  Date: 16-11-5
  Time: 下午8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" enctype="multipart/form-data">

    头像：<input name="avator" type="file"/><br/>
    昵称：<input name="nickName" type="text"/><br/>
    座右铭：<textarea name="motto">座右铭</textarea><br/>
    <input type="submit" value="提交信息"/>
</form>
</body>
</html>
