<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<form action="joinOk.jsp" method="POST" name="reg_frm">
<table>
<tr><td>ID : </td><td colspan=2><input type="text" name="id" size="20"></td></tr>
<tr><td>PW : </td><td colspan=2><input type="password" name="pw" size="20"></td></tr>
<tr><td>Re-PW : </td><td colspan=2><input type="password" name="repw" size="20"></td></tr>
<tr><td>Name : </td><td colspan=2><input type="text" name="name" size="20"></td></tr>
<tr><td>Mail : </td><td colspan=2><input type="text" name="email" size="20"></td></tr>
<tr><td>Address : </td><td colspan=2><input type="text" name="address" size="20"></td></tr>
<tr><td><input type="button" value="회원가입" onclick="infoConfirm()"></td><td><input type="reset" value="재입력"></td></tr>
</table>
</form>
<script>
function infoConfirm(){ 
	var form = document.reg_frm;
	if(form.id.value.length === 0){ 
		alert("id를 넣어주세요");
		form.id.focus();
		return;
	}
	if(form.pw.value.length === 0){ 
		alert("비밀번호를 넣어주세요");
		form.pw.focus();
		return;
	}
	if(form.repw.value != form.pw.value){ 
		alert("비밀번호와 확인값이 다릅니다.");
		form.repw.focus();
		return;
	}
	if(form.name.value.length === 0){ 
		alert("이름을 넣어주세요");
		form.name.focus();
		return;
	}
	if(form.email.value.length === 0){ 
		alert("이메일을 넣어주세요");
		form.email.focus();
		return;
	}
	if(form.address.value.length === 0){ 
		alert("주소를 넣어주세요");
		form.address.focus();
		return;
	}
	form.submit();
}
</script>
</body>
</html>