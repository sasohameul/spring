<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 이 부분에 타일즈를 사용할 namespace가 선언되어야한다. -->
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <!-- 현재 프로젝트의 컨텍스트패스가 나옴 -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/swiper.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/common.css">
<script src="${pageContext.request.contextPath }/resources/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/rollmain.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/jquery.easing.js"></script>	
<script src="${pageContext.request.contextPath }/resources/js/common.js"></script>  
<script src="${pageContext.request.contextPath }/resources/js/jquery.smooth-scroll.min.js"></script> 


</head>
<body>


	<!-- 타일즈의 템플릿 - 템플릿으로 사용할 모형을 선언 (header/body/footer)-->
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer"/>
	
</body>
</html>