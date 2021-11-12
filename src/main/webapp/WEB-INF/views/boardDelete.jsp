<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert 예제</title>
</head>
<body>

<!-- name값은 BoardDTO와 동일하게 -->
	<form action="/delete" method="post">
	
		삭제할 게시물 번호 : <input type="number" name="bno"><br>
		
		<input type="submit" value="삭제하기">
		
	</form>


</body>
</html>
