<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href=<%=request.getContextPath()%>/css/cs001.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<style>
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
input[type=submit] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    color: white;
    background-color: #4CAF50;
    float:left;
}
input[type=reset] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    color: white;
    background-color: #BA3F3C;
    
}
#country,#state,#city{
	
	width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    color: white;
    
}
#male{
	width: 5%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    color: white;
	
}
/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
    padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: red;
    cursor: pointer;
}

/* Add Zoom Animation */
.animate {
    -webkit-animation: animatezoom 0.6s;
    animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)} 
    to {-webkit-transform: scale(1)}
}
    
@keyframes animatezoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}


/* /* input#usericon {
    background-image:url(../images/usericon.png);
background-repeat:no-repeat;
 
 
}
input#passicon {
    background-image:url(../images/passicon.png) left no-repeat;
   
} */ */
</style>
<title>UpdateProfessionDetails | Resume Builder</title>
</head>
<body>
	<form class="modal-content animate" action="updateProfessionDetails">
			<div class="container">
				<input type="hidden" name="txtproid" value="<%=request.getParameter("proid") %>"/>
				<label>Employer Name:</label>
				<input type="text" name="txtempname" placeholder="Employer Name" value="<%=request.getParameter("ename") %>"/>
			
				<label>From:</label>
				<input type="text" name="txtfrom" placeholder="Form" id="from" value="<%=request.getParameter("fromdate") %>"/>
		
				<label>To:</label>
				<input type="text" name="txtto" placeholder="To" id="to" value="<%=request.getParameter("todate") %>"/>
			
				<label>Job Title:</label>
				<input type="text" name="txtjobtitle" placeholder="Job Title" value="<%=request.getParameter("jtitle") %>"/>
		
				
				<label>Duties:</label>
				<input type="text" name="txtduties" placeholder="Duties" value="<%=request.getParameter("duties") %>"/>
			
				<input type="submit" value="Update Profession Details"/>
				<input type="reset" value="Reset Profession Details"/>
			</div><!-- end of container -->
	</form>
	
	<script>
  $(document).ready(function() {
    $("#from").datepicker();
    $("#to").datepicker();
  });
  
  
  </script>
</body>
</html>