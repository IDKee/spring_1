<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <%@ include file="common/common.jsp"%>
    <link rel="stylesheet" href="${basePath}static/css/index.css"/>
</head>
<body>
<p class="red">my name is panjie;</p>
<br/>
<c:forEach var="list" items="${list}">
    <div>id:<span class="red">${list.id}</span></div>
    <div>name:<span class="red">${list.name}</span></div>
</c:forEach>
</body>
</html>
