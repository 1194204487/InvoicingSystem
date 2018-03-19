<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1>销售信息查询</h1>
    <form action="/findSalePage" method="post">
        <div >
            <select name="label">
                <option value="saledate">销售日期</option>
                <option value="totalprice">单笔总价</option>
            </select>
            <input type="submit" value="提交">
        </div>

    </form>
        <div>
            <c:choose>
            <c:when test="${page.list.size() !=0}">
            <table border="1" >
                <tr style="font-weight: bolder">
                    <td>ID</td>
                    <td>商品</td>
                    <td>单价</td>
                    <td>数量</td>
                    <td>总价</td>
                    <td>销售日期</td>
                    <td>销售员</td>
                </tr>
                <c:forEach items="${page.list}" var="sale">
                <tr>
                    <td>${sale.id}</td>
                    <td>${sale.product.productname}</td>
                    <td>${sale.price}</td>
                    <td>${sale.quantity}</td>
                    <td>${sale.totalprice}</td>
                    <td>${sale.saledate}</td>
                    <td>${sale.user.realname}</td>
                </tr>
                </c:forEach>

            </table>
            </c:when>

                <c:otherwise>
                    暂无销售记录
                </c:otherwise>

            </c:choose>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/findSalePage?pageNum=${page.firstPage}">首页</a>
            <a href="${pageContext.request.contextPath}/findSalePage?pageNum=${page.prePage}">上一页</a>
            <a href="${pageContext.request.contextPath}/findSalePage?pageNum=${page.nextPage}">下一页</a>
            <a href="${pageContext.request.contextPath}/findSalePage?pageNum=${page.lastPage}">末页</a>
          第${page.pageNum}页/共${page.pages}页(=${page.total}条记录)

        </div>

</div>

</body>
</html>
