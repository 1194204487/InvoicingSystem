<%--
  Created by IntelliJ IDEA.
  User: OONE
  Date: 2018/2/17
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>小型进销存系统</h1>
<div>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名:<input type="text" id="username" name="username">
        密  码:<input type="text" id="password" name="password">
        <input type="submit" id="submit" value="登录">
    </form>


</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
    $("#submit").click(function () {
        if($("#username").val()==''||$("#username").val()==null){
            alert("用户名不能为空");
            return false;
        }
        if($("#password").val()==''||$("#password").val()==null){
            alert("密码不能为空");
            return false;
        }


    })

</script>

</body>
</html>
