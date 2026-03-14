<%@page import="jakarta.servlet.RequestDispatcher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="bootStrapCss.jsp" %>
</head>
<body>
	<h1 class="text-danger">Error!! Please Login again</h1>
	
	<% 
// 		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
// 		rd.forward(request,response);
		response.sendRedirect("login.jsp");
	%>
	
<%@ include file="bootStrapScript.jsp" %>
</body>
</html>