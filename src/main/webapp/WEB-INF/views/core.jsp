<%--
  Created by IntelliJ IDEA.
  User: OONE
  Date: 2018/2/17
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div >欢迎：${sessionScope.user.username},<a href="${pageContext.request.contextPath}/logout">退出登录</a></div>

<div>
    <ul>
        <li><a href="${pageContext.request.contextPath}/toAddSale">销售</a> </li>
        <li><a href="${pageContext.request.contextPath}/findSalePage">销售信息查询</a> </li>
        <li><a href="${pageContext.request.contextPath}/toInventory">查看库存</a> </li>
    </ul>
</div>

<div>
    <iframe width="800px" height="500px" src="${pageContext.request.contextPath}/"></iframe>
</div>
</body>
</html>
