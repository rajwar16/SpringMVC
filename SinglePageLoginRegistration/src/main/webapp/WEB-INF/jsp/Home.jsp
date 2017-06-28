<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
    /* $("button").click(function(){
    	console.log("hiii"); */
        $("#div1").load("login");
    	
    	     $("button").click(function(){
    	    	console.log("hiii"); 
    	        $("#div1").load("login");
    	});
});
</script> 
</head>
<body>
<div id="div1"></div>

</body>
</html>