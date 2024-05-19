<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="" method="post">
    생년월일: <input type="text" name="birthDate" placeholder="YYYYMMDD" title="생년월일" maxlength="8"> <br>
    핸드폰번호:
    <select name="phoneNum1">
        <option value="010">010</option>
        <option value="011">011</option>
        <option value="016">016</option>
        <option value="017">017</option>
        <option value="018">018</option>
        <option value="019">019</option>
    </select>
    -
    <input type="text" name="phoneNum2" title="핸드폰번호 가운데자리">
    -
    <input type="text" name="phoneNum3" title="핸드폰번호 마지막자리">

    <input type="submit" value="아이디 찾기">
</form>
</body>
</html>