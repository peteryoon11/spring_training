<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" 
uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" 
uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
   <tr>
    <td>부서번호</td>
    <td>부서명</td>
    <td>부서위치</td>
   </tr>
<c:forEach var="aaa" items="${xxx}" varStatus="status">   
   <tr>
    <td>${aaa.deptno}</td>
    <td>${aaa.dname}</td>
    <td>${aaa.loc}</td>
   </tr>
</c:forEach>
</table>
<a href="writeUI">글쓰기</a>
</body>
</html>










