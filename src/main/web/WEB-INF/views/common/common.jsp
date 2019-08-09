<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<c:set var="basePath" value="<%=basePath%>"/>

<script type="text/javascript" src="${basePath}static/js/jquery-3.3.1.min.js"></script>

<script type="text/javascript" src="${basePath}static/plugins/layui/layui.js"></script>
<link rel="stylesheet" href="${basePath}static/plugins/layui/css/layui.css">
