<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert 예제</title>
</head>
<body>

<!-- name값은 BoardDTO와 동일하게 -->


	<form action="/update" method="post">
	
		번호 : <input type="text" name="bno" value="${dto.bno}" readonly="readonly"><br>		
		제목 : <input type="text" name="btitle" value="${dto.btitle}"><br>
		내용 : <input type="text" name="bcontent" value="${dto.bcontent}"><br>
		작성자 : <input type="text" name="bwriter" value="${dto.bwriter}" readonly="readonly"><br>
		작성일 : <input type="text" name="bregdate" value="${dto.bregdate}" readonly="readonly"><br>

		
		<input type="submit" value="수정하기">
		
	</form>


</body>
</html>
