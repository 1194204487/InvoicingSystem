<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OONE
  Date: 2018/2/17
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<div style="width: 400px">
    <h1>添加销售</h1>
    <form:form modelAttribute="sale" method="post" action="${pageContext.request.contextPath}/addSale">
    <table>
        <tr>
            <td>商品名称:</td>
            <td><form:select path="productid" items="${productList}" itemLabel="productname" itemValue="id"></form:select> </td>
        </tr>

        <tr>
            <td>销售单价:</td>
            <td><form:input path="price"></form:input></td>
        </tr>

        <tr>
            <td>销售数量:</td>
            <td><form:input path="quantity"></form:input></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交"> </td>
        </tr>
    </table>
    </form:form>
</div>
</body>
</html>
