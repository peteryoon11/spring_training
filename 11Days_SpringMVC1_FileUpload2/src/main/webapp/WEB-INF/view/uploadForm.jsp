<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	uploadForm
	<br>
	<form action="upload" method="post" enctype="multipart/form-data">

		문자열 <input type="text" name="theText"> 
		파일<input type="file"	name="theFile">
		 <input type="submit" value="업로드">
	</form>
	<div></div>
</body>
</html>