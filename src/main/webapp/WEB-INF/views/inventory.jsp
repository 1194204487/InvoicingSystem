<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OONE
  Date: 2018/2/18
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <div>查看库存：商品名称
        <form:form modelAttribute="product">
        <form:select id="productId" path="id" items="${productList}" itemLabel="productname" itemValue="id"></form:select>

        </form:form>
        <button id="getQuantityBtn">提交</button>
    </div>

    <div id="quantityBox">


    </div>


    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $("#getQuantityBtn").click(function () {
            $.post("${pageContext.request.contextPath}/getInventory",{id:$("#productId").val()},function (quantity) {

                $("#quantityBox").html('该商品的库存为:'+quantity);
                return false;
            })


        })

    </script>
</div>




</body>
</html>
