<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board Content</title>
</head>
<body>

<table border="1">


<!-- 가지고온 값 뿌리기 -->

	
	<tr>
		<td>제목</td>
		<td>${dto.btitle}</td>

		<td>작성자</td>
		<td>${dto.bwriter}</td>
	</tr>		
	
	<tr>
		<td colspan="4">${dto.bcontent}</td>
	</tr>		
	

</table>

	<a href="/update?bno=${dto.bno}">수정하기</a>
	<a href="/delete?bno=${dto.bno}">삭제하기</a>


</body>
</html>
