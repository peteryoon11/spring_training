<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
파일크기:${size}<br>
파일명:<a href="down?fileName=${fileName}">${fileName}</a><br>
파일타입:${contentType}<br>
텍스트:${theText}<br>
</body>
</html>