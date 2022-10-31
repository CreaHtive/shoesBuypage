<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<title>결과</title>
	</head>
	<body>
	
		<h3>결과</h3>
		 정보를 삭제 하셨습니다.   <%=session.getAttribute ("bId") %> 
		<br>  
	<% session.invalidate(); %>
	
	<br>
	
	<a href="list.do">돌아가기</a>

</body>
</html>