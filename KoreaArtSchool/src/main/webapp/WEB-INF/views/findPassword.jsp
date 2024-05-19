<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="/member/login" method="post">
    생년원일: <input type="text" name="admin_id"> <br>
    핸드폰번호: <input type = "password" name="pswd"><br>
    <input type="submit" value="로그인">
</form>
</body>
</html>