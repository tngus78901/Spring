<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
	<body>
		<h3>@ModelAttribute ������̼� �ǽ�</h3>
		
		
		<a href="/Ch04/index">index</a>
		
		<h3>model1 �ǽ�</h3>
		<foam action="/Ch04/annotaion/param1" method="post">
			<input type="text" name="uid"/>
			<input type="submit" name="����"/>
		</foam>
		
		<h3>model2 �ǽ�</h3>
		<foam action="/Ch04/annotaion/param2" method="post">
			<input type="text" name="uid"/>
			<input type="text" name="name"/>
			<input type="submit" name="����"/>
		</foam>
		
		<h3>model3 �ǽ�</h3>
		<foam action="/Ch04/annotaion/param2" method="post">
			<input type="text" name="uid"/>
			<input type="text" name="name"/>
			<input type="text" name="hp"/>
			<input type="number" name="age"/>
			<input type="submit" name="����"/>
		</foam>
	</body>
</html>