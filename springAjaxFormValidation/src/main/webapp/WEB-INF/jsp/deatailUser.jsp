<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add User</title>
<script type="text/javascript" src="js/user.js"></script>
<script type="text/javascript">
	var contexPath = "<%=request.getContextPath() %>";
</script>
<script src="//code.jquery.com/jquery.min.js"></script>
</head>
<body>
	<h1>Add user using Ajax....</h1>
	<table>
		<tr>
			<td colspan="2"><div id="error" class="error"></div></td>
		</tr>
		
		<tr>
			<td>Enter Your Name :: </td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		
		<tr>
			<td>Education :: </td>
			<td><input type="text" id="education"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="button" value="AddUser" onclick="doAjaxPost()"> </td>
		</tr>
		
		<tr>
			<td colspan="2"><div id="info" class="success"></div> </td>
		</tr>
	</table>
</body>
</html>