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
		<h3>user1 ���</h3>
	
		<a href="/Ch05/index">����</a>
		<a href="/Ch05/user1/register">���</a>
		
		<table>
			<tr>
				<th>���̵�</th>
				<th>�̸�</th>
				<th>�޴���</th>
				<th>����</th>
				<th>����</th>
			</tr>
			
			<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.uid}</td>
				<td>${user.name}</td>
				<td>${user.hp}</td>
				<td>${user.age}</td>
				<td>
					<a href="/Ch05/user1/modify?uid=${user.uid}">����</a>
					<a href="/Ch05/user1/delete?uid=${user.uid}">����</a>
				</td>
			</tr>
			</c:forEach>
		
		</table>
	</body>
</html>