<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>user1 등록</h3>
		
		<a href="/Ch05/index">메인</a>
		<a href="/Ch05/user1/list">목록</a>
		
		<foam action="/Ch05/user1/modify" method="post">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid" value="${user1DTO.uid}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${user1DTO.name}"/></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="hp" value="${user1DTO.hp}"/></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="text" name="age" value="${user1DTO.age}"/></td>
				</tr>
				<tr>
					<td colsapn="2" align="right"><input type="submit" value="등록하기"/></td>
					
				</tr>
			</table>
	</body>
</html>