
function doAjaxPost() {
	var contexPath ="<%=request.getContextPath()%> ";
	var name=$("#name").val();
	var education=$("#education").val();
	var obj = {};
	obj.name=userName;
	console.log(name+" "+education);
	console.log("contextpath :: "+contexPath);
	 $.ajax({  
		    type: "POST",  
		    url: contexPath + "checkUser",  
		    data: obj,  
		    success: function(response)
		    {
		    	if(response=="no"){
				console.log(response);
				//$('#status').html('<img src="img/p.jpg" height=20px width=20px align="absmiddle">&nbsp;');
			}
		}/*,
		error:function(e){
			alert("Error" + e);
		} */
	});
}