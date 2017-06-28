<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

 $(document).ready(function(){
    $("#register").click(function(){
        $("#div1").load("register");
    });
}); 

</script> 
</head>
<body>

<table style="margin-left: 40%; margin-top: 10%">
		<tr>
			<td colspan="2"><h1>User Login....</h1></td>
		</tr>
		<tr>
			<td>Email id :</td>
			<td><input type="text" id="emailId" name="emailId"></td>
		</tr>

		<tr>
			<td>Password :</td>
			<td><input type="password" id="password" name="password"></td>
		</tr>

		<tr>
			<td colspan="2"><input type="button" value="login"></td>
		</tr>
		
		<tr>
			<td colspan="2">Don't have u account plzz<button id="register"> register</button></a></td>
		</tr> 

	</table>

</body>
</html>