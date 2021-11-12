<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert 예제</title>
</head>
<body>

<!-- name값은 BoardDTO와 동일하게 -->
	<form action="/register" method="post">
	
		제목 : <input type="text" name="btitle"><br>
		내용 : <input type="text" name="bcontent"><br>
		작성자 : <input type="text" name="bwriter"><br>
		
		<input type="submit" value="저장하기">
		
	</form>


</body>
</html>
