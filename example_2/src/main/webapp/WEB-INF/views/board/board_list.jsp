<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>board_list 페이지 입니다.</h2>

<a href="${path }/board/writer_page">글쓰기</a>

<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>작성일자</th> 
		<th>조회수</th>
	</tr>
	<c:forEach var="row" items="${list}">
    <tr>
    	<td>${row.bno }</td>
    	<%-- 게시물 조회를 위해서 get 방식으로 게시물 번호 값을 넘겨주자 , 확인을 원하는 번호값 가져가 해당 게시물 확인 --%>
    	<td><a href="${path}/board/read.do?bno=${row.bno}">${row.title }</a></td>
    	
    	<td>${row.writer }</td>
    	<td>
    		<fmt:formatDate value="${row.regdate }" pattern="yyyy-mm-dd hh:mm:ss"/>
    	</td>
    	<td>${row.viewcnt }</td>
    </tr>	
	</c:forEach>
</table>
</body>
</html>