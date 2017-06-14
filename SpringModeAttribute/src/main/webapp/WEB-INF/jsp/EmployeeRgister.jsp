<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="register">
Employee Name: <input type="text" value="Employee Name" name="EmpName"><br><br>
Employee Email-Id : <input type="text" value="email@xyz.com" name="EmailId"><br><br>
Mobile no: <input type="number" name="MobileNo"><br><br>
Date Of Birth : <input type="date" name="DObirth"><br><br>
Employee Skill set : <!-- <input type="checkbox" name="java">JAVA<br>
					<input type="checkbox" name="sql">SQL<br>
					<input type="checkbox" name="spring">Spring MVC<br>
					<input type="checkbox" name="hibernate"> Hibernate<br> -->
					
					<select name="EmployeeSkill" multiple>
						<option value="javacore">Core Java</option>
						<option value="springcore">Spring core</option>
						<option value="springmvc">Spring MVC</option>
						<option value="hibernate">Hibernate</option>
					</select> 
Employee Address : <br><br>
country : <input type="text" name="country">
State : <input type="text" name="state">
City : <input type="text" name="city">
Street : <input type="text" name="street">
pin code : <input type="text" name="pinCode"> <br>
<br>
<input type="submit" value="Submit"><br><br>
<input type="reset" value="Reset">
					
</form>

</body>
</html>