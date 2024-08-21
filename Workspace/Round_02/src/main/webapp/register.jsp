<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("EUC-KR");

	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//biz logic process....데이터베이스 체크 등등.
%>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결과!</title>
	</head>
	<body>
		<%= name %>님! <br/>
		당신이 요청한 데이터는 ID : <%= id %>, PW : <%= pw %> 입니다.<br/>
		처리 완료되었습니다.
	</body>
</html>