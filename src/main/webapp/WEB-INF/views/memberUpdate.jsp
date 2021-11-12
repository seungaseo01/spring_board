<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert 예제</title>
</head>
<body>

<!-- name값은 BoardDTO와 동일하게 -->


	<form action="/memberUpdate" method="post">
	
	
		번호 : <input type="text" name="mno" readonly="readonly" value="${dto.mno}"><br>
		이름 : <input type="text" name="mname" value="${dto.mname}"><br>
		연락처 : <input type="text" name="mtel" value="${dto.mtel}"><br>
		주소 : <input type="text" name="maddr" value="${dto.maddr}"><br>
		나이 : <input type="text" name="mage" value="${dto.mage}"><br>
		
		<c:if test="${dto.mgender == '남성'}">
			성별 : 
				여자<input type="radio" name="mgender" value="여성">
			    남자<input type="radio" name="mgender" value="남성" checked="checked">
			<br>	
		
		</c:if>
		
		<c:if test="${dto.mgender == '여성'}">
			성별 :
				여자<input type="radio" name="mgender" value="여성"  checked="checked">
				남자<input type="radio" name="mgender" value="남성" >
			<br>	
		
		</c:if>
		
		등록일 : <input type="text" name="mregdate" value="${dto.mregdate}" readonly="readonly"><br>
				
		<input type="submit" value="수정하기">
		
	</form>


</body>
</html>
