<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원정보 리스트</h3>

<table border="1">
	<tr>
		<td>이름</td>
		<td>나이</td>
		<td>몸무게</td>
		<td>키</td>
		<td>전화번호</td>
		<td>기장</td>
		<td>허리</td>
		<td>상의</td>
		<td>평균사이즈</td>
		<td>날짜</td>
	</tr>
	<c:forEach var="re_list" items="${list }">
		<tr>
			<td>${re_list.dress_name }</td>
			<td>${re_list.dress_age }</td>
			<td>${re_list.dress_weight }</td>
			<td>${re_list.dress_height }</td>
			<td>${re_list.dress_number }</td>
			<td>${re_list.dress_bottom }</td>
			<td>${re_list.dress_waist }</td>
			<td>${re_list.dress_top }</td>
			<td>${re_list.dress_size }</td>
			<td>${re_list.dress_day }</td>
		</tr>
		
	</c:forEach>
	
	<tr>
		<td>
			<input type="button" onclick="location.href='index'" value="목록으로">
		</td>
	</tr>
	
	
</table>


</body>
</html>