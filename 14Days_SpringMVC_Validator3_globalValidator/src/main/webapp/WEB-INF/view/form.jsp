<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.xxx
{
color: red;
}

</style>
</head>

<body>
	form.jsp
	<form:form action="login" modelAttribute="xxx1">
			아이디 <form:input path="userid"/><br>
			 <form:errors path="userid" cssClass="xxx"/>
		<br>
			비번 <form:input path="passwd"/>
				 <form:errors path="passwd" />
		
			<br>
		<input type="submit" value="로그인">
	</form:form>
</body>
</html>