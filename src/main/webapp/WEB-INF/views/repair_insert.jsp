<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원정보 입력하기</h2>
<form action="insert" method="post">
<table >
	<tr>
		<td>이름</td>
		<td><input type="text" name="dress_name"></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="text" name="dress_age"></td>
	</tr>
	<tr>
		<td>몸무게</td>
		<td><input type="text" name="dress_weight"></td>
	</tr>
	<tr>
		<td>키</td>
		<td><input type="text" name="dress_height"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="dress_number"></td>
	</tr>
	<tr>
		<td>기장</td>
		<td><input type="text" name="dress_bottom"></td>
	</tr>
	<tr>
		<td>상의</td>
		<td><input type="text" name="dress_top"></td>
	</tr>
	<tr>
		<td>평균사이즈</td>
		<td><input type="text" name="dress_size"></td>
	</tr>
	<tr>
		<td><input type="submit" value="등록"></td>
		<td><input type="reset" value="취소"></td>
	</tr>
	
</table>

</form>
</body>
</html>