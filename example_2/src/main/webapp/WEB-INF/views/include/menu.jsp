<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="path" value="${pageContext.request.contextPath}"></c:set>
    
    <h2>pageContext.request.contextPath : ${path}</h2>
<div style="text-align: center;">
	<a href="${path}/">main</a>
	<a href="${path}/board/list.do">게시판</a>
</div>