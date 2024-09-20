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
	<h1>emp 리스트7</h1>
	<table width="50%" border="1">
		<tr> <!-- 테이블의 상단에 들어갈 컬럼명들 -->
	
			<td>사원이름</td>
			<td>월급</td>
			<td>부서번호</td>
			<td>부서위치</td>
		</tr>

		<c:forEach var="a" items="${empDeptSalList}">
			<tr>

				
				<td>${a.emp.ename}</td>
				<td>${a.emp.sal}</td>
				<td>${a.emp.deptno}</td>
				<td>${a.dept.loc}</td>
			

			
			</tr>
		</c:forEach>

	</table>
</body>
</html>