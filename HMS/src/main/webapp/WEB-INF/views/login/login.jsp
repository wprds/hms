<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<c:url value="/webjars/jquery/2.1.4/jquery.min.js"/>"></script>
<title>Login Page</title>

<script type="text/javascript">
	function checkLogin(mform){
		if($.trim($("#id").val()) == ""){
			alert("아이디를 입력해 주세요.");
			$("#id").focus();
			return;
		}
		if($.trim($("#password").val()) == ""){
			alert("비밀번호를 입력해 주세요.");
			$("#password").focus();
			return;
		}
		
		document.getElementById('frmLogin').submit();
	}
</script>

</head>
<body>
	<form id="frmLogin" action="/login" method="post">
	<table>
		<tr>
			<td>
				<input type="text" id="id" name="id" value="" /><br>
				<input type="password" id="password" name="password" value=""/>
			</td>
		</tr>
		<tr>
			<td align="right">
				<input type="button" id="btnLogin" name="btnLogin" onclick="javascript:checkLogin();" value="로그인" />	
			</td>
		</tr>
	</table>
	</form>
</body>
</html>