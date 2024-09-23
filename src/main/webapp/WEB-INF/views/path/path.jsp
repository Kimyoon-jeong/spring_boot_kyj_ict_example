<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>절대경로 상대경로 테스트</h1>
	<!-- 	static은 디폴트라 안써도된다 -->
	<img src="images/404/404.png"><br><!--  <img src="images/404/404.png"><br> -->
	
	<img src="${pageContext.request.contextPath}/images/404/404.png">
	
</body>
</html>