<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script src="${pageContext.request.contextPath}/js/board.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		
		let board = boardService();

		//board.list();
		
		//board.get(4000);
		
		let hey ={
				bname : "히히",
				bcontent : "히히하오",
				btitle : "헤이~"
		}
		//board.add(hey);
		//board.del(4066);
		
		let upd ={
				bid :"3064", 
				bname : "첫번째",
				bcontent : "컨텐츠",
				btitle : "두둥!"
		}
		
		
		board.update(upd);
		
	});
</script>


</head>
<body>
	<h1>Restful 게시판 연습</h1>

</body>
</html>