<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>메인 페이지</h1>
   
   <!-- 로그인이 안된 사람 -->
   <sec:authorize access="isAnonymous()">  <!-- isAnonymous = 로그인이 안된 사람은 밑에줄 링크타라는 뜻 -->
         <p><a href="<c:url value="/login" />">로그인</a></p>
   </sec:authorize>
   
   <!-- 로그인이 완료된 사람 -->
   <sec:authorize access="isAuthenticated()">  <!-- isAuthenticated = 인증이 된 사람은 밑에줄 링크타라는 뜻 -->
      <p><sec:authentication property="principal.username"/>님 환영합니다.</p>
      
      <sec:authorize access="hasRole('ROLE_USER')">
             <p>당신은 일반 유저 입니다.</p>
        </sec:authorize>  
      
      <sec:authorize access="hasRole('ROLE_ADMIN')">
             <p>당신은 어드민입니다.</p>
        </sec:authorize>
      
        
  	 <!--edu.ict.ex.security.UserDetailsVO@7b4cafd3 -->
      <p><sec:authentication property="principal"/></p>
      
      
     <!--  null 패스워드정보라 안알려줌-->
      <p><sec:authentication property="credentials"/></p>
      
	<!--[ROLE_USER] -->
      <p><sec:authentication property="authorities"/></p>
        
      <h1>장바구니 정보<sec:authentication property="principal.cart.product"/></h1>
      <h1>개수<sec:authentication property="principal.cart.count"/></h1>
      <h1>이메일<sec:authentication property="principal.email"/></h1>
        <p><a href="<c:url value="/loginInfo" />">로그인 정보 확인 방법3 가지</a></p>
      
   </sec:authorize>
   
      <h3>
       [<a href="<c:url value="/add/addForm" />">회원가입</a>]
       [<a href="<c:url value="/user/userHome" />">유저 홈</a>]
       [<a href="<c:url value="/admin/adminHome" />">관리자 홈</a>]
   </h3>
   
   
   
</body>
</html>