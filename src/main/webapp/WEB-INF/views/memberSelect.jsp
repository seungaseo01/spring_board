<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board Content</title>
</head>
<body>


	<p>회원번호 : ${dto.mno}</p>
	<p>이름 : ${dto.mname}</p>
	<p>연락처 : ${dto.mtel}</p>
	<p>주소 : ${dto.maddr}</p>
	<p>나이 : ${dto.mage}</p>
	<p>성별 : ${dto.mgender}</p>
	<p>등록일 : ${dto.mregdate}</p>

	<a href="/memberUpdate?mno=${dto.mno}">수정하기</a>
	<a href="/memberDelete?mno=${dto.mno}">삭제하기</a>
	<a href="/">홈으로 가기</a>


</body>
</html>
