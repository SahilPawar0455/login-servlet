<%--
  Created by IntelliJ IDEA.
  User: Sahil
  Date: 04-11-2022
  Time: 10:45 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success Page</title>
</head>
<body>
<h3>Hi <%= request.getAttribute("user")%>, login successful</h3>
<a href="LoginServlet.html"></a>
</body>
</html>
