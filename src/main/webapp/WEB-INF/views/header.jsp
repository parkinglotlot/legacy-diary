<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diary</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">My diary</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
      <ul class="navbar-nav">
      
    <c:choose>
          <c:when test="${loginMember == null }">
							<li class="nav-item"><a class="nav-link"
								href="/member/signup">회원가입</a></li>
							<li class="nav-item"><a class="nav-link"
								href="/member/login">로그인</a></li>
						</c:when>
          <c:otherwise>
							<li class="nav-item"><a class="nav-link"
								href="/member/mypage">${loginMember.memberId }님</a></li>
								
								<li class="nav-item"><a class="nav-link"
								href="/member/logout">로그아웃</a></li>
								
							<li class="nav-item"><a class="nav-link"
								href="/diary/register">다이어리 등록</a></li>
								
							<li class="nav-item"><a class="nav-link" href="/diary/list">다이어리 목록</a></li>
						</c:otherwise>
    </c:choose>
      
       
       
        
        
         
      </ul>
    </div>
  </div>
</nav>
</body>
</html>