<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<%-- <script src="<%=request.getContextPath()%>/javaScript/user.js"></script> --%>

<script type="text/javascript">
	
</script>
<script>
	function doAjaxPost() {
		var contexPath = "<%=request.getContextPath()%>";

		var name = $('#name').val();
		var education = $('#education').val();

		console.log(name);
		console.log(education);
		var obj = {};
		obj["name"] = name;
		obj["educationn2"] = education;
		$.ajax({
			type : "POST",
			url : contexPath + "/AddUser.htm",
			data : obj,
			success : function(response) {
				$('#info').text(response);
				/* // we have the response 
			      if(response.status == "SUCCESS"){
			    	  userInfo = "<ol>";
			    	  for(i =0 ; i < response.result.length ; i++){
			    		  userInfo += "<br><li><b>Name</b> : " + response.result[i].name + 
			    		  ";<b> Education</b> : " + response.result[i].education;
			    	  }
			    	  userInfo += "</ol>";
			    	  $('#info').html("User has been added to the list successfully. " + userInfo);
			    	  $('#name').val('');
				      $('#education').val('');
				      $('#error').hide('slow');
				      $('#info').show('slow');
			      }else{
			    	  errorInfo = "";
			    	  for(i =0 ; i < response.result.length ; i++){
			    		  errorInfo += "<br>" + (i + 1) +". " + response.result[i].code;
			    	  }
			    	  $('#error').html("modelPlease correct following errors: " + errorInfo);
			    	  $('#info').hide('slow');
			    	  $('#error').show('slow');
			      } */	}
			      
		});
	}
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

	</table>

	<div id="info" class="success"></div>
</body>
</html>

<!-- 
	<script>
			$(document).ready(function() {
				$("p").click(function() {
					$(this).hide();
				});
			});
		</script>

			<p>If you click on me, I will disappear.</p>
			<p>Click me away!</p>
			<p>Click me too!</p> -->