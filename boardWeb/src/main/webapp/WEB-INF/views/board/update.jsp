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
	<h2>update페이지 입니다</h2>
	<a href="<c:url value="/board/write"/>">글쓰기</a>
	<form name="updateform" method="post" action="<c:url value="/board/updatecomplate.do"/>">
		<div>글번호</div>
		<div>
			<input name="seq" value="${data.seq }" type="hidden" readonly="readonly" />
			<span>${data.seq }</span>
		</div>
		<div>작성자</div>
		<div>
			<input name="writer" value="${data.writer }" type="hidden" readonly="readonly" />
			<span>${data.writer}</span>
		</div>
		<div>게시글 제목 : </div>
		<div>
			<input name="title" value="${data.title }" type="text"/>
		</div>
		<div>게시글 내용 : </div>
		<div>
			<textarea name="content" rows="5" cols="50">${data.content }</textarea>
		</div>
		<div>조회수</div>
		<div>
			<input type="hidden" value="${data.cnt }" name="viewcnt" readonly="readonly"/>
			<span>${data.cnt }</span>
		</div>
		<div>작성일자</div>
		<div>
			<input type="submit" value="글수정" />
			<input type="reset" value="리셋" />
			<a href=<c:url value="/board/list" />>글목록</a>
		</div>
	</form>
</body>
</html>