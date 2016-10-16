<%--
  Created by IntelliJ IDEA.
  User: ken
  Date: 16-10-14
  Time: 下午6:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>帖子</title>
</head>
<body>
<div class="kepView">
    <div class="kepMsg"><c:out value="${kep.kepMsg}"/></div>
    <div>
        <span class="kepTime"><c:out value="${kep.kepTime}"/></span>
    </div>
</div>
</body>
</html>
