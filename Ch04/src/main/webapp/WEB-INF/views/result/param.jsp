<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>result::param</title>
	</head>
<body>
	<h3>@RequestParam 어노테이션 결과</h3>

	<a href="Ch04/index">index</a>
	
	<h4>param1 결과</h4>
	<p>
			uid : ${uid}
	</p>
	
	<h4>param2 결과</h4>
	<p>
			uid : ${uid}
			name : ${name}
	</p>
	
	<h4>param3 결과</h4>
	<p>
			uid : ${modelDTO.uid}
			name: ${modelDTO.name}
			hp : ${modelDTO.hp}
			age : ${modelDTO.age}
	</p>
</body>
</html>