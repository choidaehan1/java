<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String str = request.getParameter("mmm");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	for (int i = 1; i <= 9; i++) {
	%>
	<h1><%=str%>
		x
		<%=i%>
		=
		<%=i * 5%></h1>
	<%
	}
	%>
</body>
</html>