<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formex.html</title>
</head>
<style>
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

span {
	display: inline-block;
	width: 120px;
	text-align: right;
	padding-right: 15px;
}

textarea {
	margin-top: 5px;
}
</style>
<body>
	<h1>form data submit</h1>
	<hr>
	<form action="formex.jsp" method="POST">
		<span>Name : </span><input type="text" name="name" size="10"><br>
		<span>ID : </span><input type="text" name="id" size="10"><br>
		<span>Password : </span><input type="text" name="password" size="10"><br>
		<span>Hobby : </span><input type="checkbox" name="hobby" value="cook">요리
		<input type="checkbox" name="hobby" value="read">독서 <input
			type="checkbox" name="hobby" value="run">조깅 <input
			type="checkbox" name="hobby" value="swim">수영 <input
			type="checkbox" name="hobby" value="sleep">취침<br> <span>Major
			: </span> <input type="radio" name="major" value="kor">국어 <input
			type="radio" name="major" value="eng">영어 <input type="radio"
			name="major" value="math">수학 <input type="radio" name="major"
			value="des">디자인<br> <span>Protocol : </span> <select
			name="protocol">
			<option value="http">HTTP</option>
			<option value="ftp">FTP</option>
			<option value="smtp">SMTP</option>
			<option value="pop">POP</option>
		</select><br> <span>하고싶은 말 : </span>
		<textarea rows="" cols="" name="speak"></textarea>
		<br> <span> <input type="submit" value="전송"> <input
			type="reset" value="초기화">
		</span>
	</form>
</body>
</html>