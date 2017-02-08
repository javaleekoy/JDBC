<%--
  Created by IntelliJ IDEA.
  User: Peramdy
  Date: 2017/1/23
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
   <form action="/login" method="post">
      <label>用户名：</label><input name="userName" type="text"><br/>
      <label>密码：</label><input name="passWord" type="password"><br/>
       <input type="submit" value="登录"/>
   </form>
</body>
</html>
