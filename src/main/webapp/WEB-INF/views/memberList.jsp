<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>memberList</title>
</head>
<body>

<table border="1">

	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>등록일</td>

	</tr>

<!-- 가지고온 값 뿌리기 -->
 	<c:forEach var="memberList" items="${memberList}">
	
	<tr>
	
		<td>${memberList.mno}</td>
		<td><a href="/memberSelect?mno=${memberList.mno}">${memberList.mname}</a></td>
		<td>${memberList.mregdate}</td>

	</tr>	
	
	</c:forEach> 



</table>





</body>
</html>
