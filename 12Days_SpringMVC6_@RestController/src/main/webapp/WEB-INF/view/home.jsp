<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<script type="text/javascript">

	function a() {
		$.ajax({
			url:"aaa", 
			type:"get", 					/* 요청방식 */
			dataTyep:"json",	 			/* 응답받을 데이터 타입 */
			success:function(responseData, status, xhr) {
				console.log(responseData);  /* LoginDTO클래스를 받음 ==> Object {userid: "test", userpw: "1234", email: null} */
				console.log(responseData.userpw); /* 1234 */
			},
			error:function(e) {
				console.log(e);
			}
		});
	}
	
	function b() {
		$.ajax({
			url:"bbb", 
			type:"get", 					
			dataTyep:"json",	 			
			
			success:function(responseData, status, xhr) {
				console.log(responseData);  
				console.log(responseData[0].userid);  /* 김 */
				
				/* 배열을, jQuery 함수 중 each를 사용하여 뽑아내기 */
				$.each(responseData, function (idx, dto) {
					console.log(idx + " ==> " + dto.userid + ' : ' + dto.userpw);
				})
				
				/* 자바스크립트객체이기때문에, jQuery객체용 배열로 만들어주기 위해 $()으로 묶어줌 */
				$(responseData).each(function (idx, dto) {
					console.log(idx + " ==> " + dto.userid + ' : ' + dto.userpw);
				})
			},
			error:function(e) {
				console.log(e);
			}
		});
	}

</script>
<body>

	<button onclick="a()">a</button>
	<button onclick="b()">b</button>

</body>
</html>