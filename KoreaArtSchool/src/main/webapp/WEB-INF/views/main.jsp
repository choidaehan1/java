<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
1. session 값 확인 : <p th:text="${session.admin_id}">
    2.  session 값 확인 : <p th:text="${session.admin_name}">
    <script type="text/javascript">
        alert("${msg}");

    </script>
</body>
</body>
</html>