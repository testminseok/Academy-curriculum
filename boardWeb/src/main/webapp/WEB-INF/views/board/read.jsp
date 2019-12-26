<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>board read 페이지입니다</h2>
	<a href="<c:url value="/board/write"/>">글쓰기</a>
	<a href="<c:url value="/board/list"/>">목록</a>
	<table border="1">
		<tr>
			<th>정보</th>
			<th>데이터</th>
		</tr>
		<tr>
			<td>작성일자</td>
			<td><fmt:formatDate value="${boardVO.regDate }" pattern="yyyy-mm-dd hh:mm:ss"></fmt:formatDate></td>
		</tr>
		<tr>
			<td>글번호</td>
			<td>${boardVO.seq }</td>
		</tr>
		<tr>
			<td>글제목</td>
			<td>${boardVO.title }</td>
		</tr>
		<tr>
			<td>글내용</td>
			<td>${boardVO.content }</td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${boardVO.writer } 
		</tr>
		<tr>
			<td>조회수</td>
			<td>${boardVO.cnt }</td>
		</tr>
	</table>
	<a href="<c:url value="/board/update/${boardVO.seq }"/>">수정</a>
	<a href="<c:url value="/board/delete/${boardVO.seq }"/>">삭제</a>


</body>
</html>