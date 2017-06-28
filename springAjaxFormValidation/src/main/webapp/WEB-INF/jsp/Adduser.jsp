<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="img/style.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<%-- <script src="<%=request.getContextPath()%>/javaScript/user.js"></script> --%>

<script type="text/javascript">
</script>
<script>

$(document).ready(function()
{
	$("#name").change(function() { 
	var userName = $("#name").val();
	//var email=$("#emailId").val();
	var obj = {};
	obj.name=userName;
	//obj.email=email;
	//obj["userName"] = userName;
	console.log(userName);
	if(userName.length >= 4)
	{
		console.log("userlength is greater than 4");
	//	$("#status").html('<img src="img/loading.gif" height=20px width=20px align="absmiddle">&nbsp;Checking availability...');
		$.ajax({
			type : "POST",
			url : "checkUser",
			data : obj,
			success : function(response) {
				if(response=="no"){
					$('#status').html('<img src="img/p.jpg" height=20px width=20px align="absmiddle">&nbsp;');
				}
				
				else{
					$('#status').html('<p style="color:red">userName already exist...</p>')
				}
			}
		});
	}
	else
	{
		$('#status').html('<p style="color:red">userName must be greater than 4...</p>')
		console.log("user is less than 4")
	}
	}); 
});
/* 	function doAjaxPost() {
		var name = $('#name').val();
		var education = $('#education').val();

		console.log(name);
		console.log(education);
		var obj = {};
		obj["name"] = name;
		obj["educationn2"] = education;
		$.ajax({
			type : "POST",
			url : "addUser",
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
				  } }
		});
	} */
</script>
</head>
<body>
<div class="container">
	<form action="addUser" method="post">

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
		</table>
	</form>
	
  <h2>Modal Example</h2>
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>Some text in the modal.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>
	
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