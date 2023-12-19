<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Language" content="ko">
<title>안나왕등록</title>
<script src="https://code.jquery.com/jquery-Latest.min.js"></script>
</head>
<body>
<c:choose>
	<c:when test="${not empty result.testId}">
		<c:set var="actionUrl" value="/test/update.do"/>
	</c:when>
	<c:otherwise>
		<c:set var="actionUrl" value="/test/insert.do"/>
	</c:otherwise>
</c:choose>
	
 * 등록폼
	<%-- <form action="/test/insert.do" method="post" name="testVO"> --%>
	<form action="${actionUrl}" method="post" name="testVO">
		 <input type="hidden" name="testId" value="${result.testId}"/>
		 <label for="sj">제목</label>
		 <input type="text" id="sj" name="sj" value="${result.sj}" placeholder="제목을 입력하세요."/>
		 <br/>
		 <label for="userNm">작성자</label>
		 <input type="text" id="userNm" name="userNm" value="${result.userNm}" placeholder="작성자를 입력하세요."/>
		 <br/>
		 <label for="cn">내용</label>
		 <textarea id="cn" name="cn" placeholder="내용을 입력하세요."><c:out value="${result.cn}"/></textarea>
		 <br/>
		<c:choose>
			<c:when test="${not empty result.testId}">
				<button type="submit">수정</button>
			</c:when>
			<c:otherwise>
				<button type="submit">등록</button>
			</c:otherwise>
		</c:choose>
		<a href="/test/selectList.do">목록</a>
	</form>
</body>
</html>