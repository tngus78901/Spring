<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>user1 ���</h3>
		
		<a href="/Ch05/index">����</a>
		<a href="/Ch05/user1/list">���</a>
		
		<foam action="/Ch05/user1/register" method="post">
			<table border="1">
				<tr>
					<td>���̵�</td>
					<td><input type="text" name="uid"/></td>
				</tr>
				<tr>
					<td>�̸�</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>�޴���</td>
					<td><input type="text" name="hp"/></td>
				</tr>
				<tr>
					<td>����</td>
					<td><input type="text" name="age"/></td>
				</tr>
				<tr>
					<td colsapn="2" align="right"><input type="submit" value="����ϱ�"/></td>
					
				</tr>
			</table>
	</body>
</html>