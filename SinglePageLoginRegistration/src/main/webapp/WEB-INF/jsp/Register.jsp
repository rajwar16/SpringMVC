<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

$(document).ready(function(){
    $("#login").click(function(){
    	console.log("hiii"); 
        $("#div1").load("login");
    });
}); 

</script> 
</head>
<body>

		<table style="margin-left: 40%; margin-top: 10%; height:">
			<tr>
				<td colspan="2"><h1>User register</h1></td>
			</tr>
			<tr>
				<td>User Name :</td>
				<td><input type="text" id="name" name="name"></td>
				<td align="left" id="status"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" id="emailId" name="emailId"></td>
			</tr>

			<tr>
				<td>Password :</td>
				<td><input type="password" id="password" name="password"></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Register"></td>
			</tr>

			<tr>
				<td colspan="2">Already have u an account plzz
					<button id="login">login</button>
				</td>
			</tr>
		</table>
</body>
</html>