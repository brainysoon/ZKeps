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
    <title>Keps</title>
</head>
<body>
<h1>最近的帖子</h1>
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
</body>
</html>
