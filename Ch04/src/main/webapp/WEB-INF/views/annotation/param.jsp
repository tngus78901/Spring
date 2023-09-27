<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
	<body>
		<h3>@ModelAttribute 어노테이션 실습</h3>
		
		
		<a href="/Ch04/index">index</a>
		
		<h3>model1 실습</h3>
		<foam action="/Ch04/annotaion/param1" method="post">
			<input type="text" name="uid"/>
			<input type="submit" name="전송"/>
		</foam>
		
		<h3>model2 실습</h3>
		<foam action="/Ch04/annotaion/param2" method="post">
			<input type="text" name="uid"/>
			<input type="text" name="name"/>
			<input type="submit" name="전송"/>
		</foam>
		
		<h3>model3 실습</h3>
		<foam action="/Ch04/annotaion/param2" method="post">
			<input type="text" name="uid"/>
			<input type="text" name="name"/>
			<input type="text" name="hp"/>
			<input type="number" name="age"/>
			<input type="submit" name="전송"/>
		</foam>
	</body>
</html>