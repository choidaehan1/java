<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form method="post" action="/member/login" id="form">
    아이디: <input type="text" name="id"> <br>
    비밀번호: <input type="password" name="password"><br>
    <input type="submit" value="로그인">

    <a href="/member/findID">아이디 찾기</a>  <!-- 경로 수정 -->
    <a href="/member/findPassword">비밀번호 찾기</a>  <!-- 경로 수정 -->
</form>

<script type="text/javascript">


</script>


</body>
</html>