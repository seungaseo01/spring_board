<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert 예제</title>
</head>
<body>

<!-- name값은 BoardDTO와 동일하게 -->
	<form action="/memberInsert" method="post">
	
		이름 : <input type="text" name="mname"><br>
		연락처 : <input type="text" name="mtel"><br>
		주소 : <input type="text" name="maddr"><br>
		나이 : <input type="text" name="mage"><br>
		성별 :  여자<input type="radio" name="mgender" value="여성">
			   남자<input type="radio" name="mgender" value="남성">
		
		<br>
				
		<input type="submit" value="가입하기">
		
	</form>


</body>
</html>
