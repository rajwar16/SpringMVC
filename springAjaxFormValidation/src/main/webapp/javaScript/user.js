function doAjaxPost() { 
	var name=$('#name').val;
	var education=$('#education').val;
	console.log(name,education);
	$.ajax({  
	    type: "POST",  
	    url: contexPath + "/AddUser.htm",  
	    data: "name=" + name + "&education=" + education,  
	    success: function(response){
	    	 $('#info').html("User has been added to the list successfully. ");
	    }
	});
}