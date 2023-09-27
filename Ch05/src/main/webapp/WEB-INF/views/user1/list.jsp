<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>user1::list</title>
	</head>
	<body>
		<h3>user1 목록</h3>
	
		<a href="/Ch05/index">메인</a>
		<a href="/Ch05/user1/register">등록</a>
		
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>휴대폰</th>
				<th>나이</th>
				<th>관리</th>
			</tr>
			
			<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.uid}</td>
				<td>${user.name}</td>
				<td>${user.hp}</td>
				<td>${user.age}</td>
				<td>
					<a href="/Ch05/user1/modify?uid=${user.uid}">수정</a>
					<a href="/Ch05/user1/delete?uid=${user.uid}">삭제</a>
				</td>
			</tr>
			</c:forEach>
		
		</table>
	</body>
</html>