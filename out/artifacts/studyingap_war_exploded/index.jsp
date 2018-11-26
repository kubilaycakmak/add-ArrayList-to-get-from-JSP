<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/26/2018
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1>
    Click it
  </h1>

  <form action="clickServlet" method="post">
    <input type="submit" name="action" value="FirstButton">
    <input type="submit" name="action" value="SecondButton">
    <input type="submit" name="action" value="Sum">
    <input type="submit" name="action" value="reset">
  </form>

  </body>
</html>
