<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/26/2018
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="servlets.RegionServlet" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
</head>
<body>
    <%
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1 = (ArrayList<String>)session.getAttribute("marmara");
        list2 = (ArrayList<String>)session.getAttribute("karadeniz");
    %>
    <a href="index2.jsp">Back</a>
    <p>
        <%=list1%>
        <%=list2%>
    </p>
</body>
</html>
