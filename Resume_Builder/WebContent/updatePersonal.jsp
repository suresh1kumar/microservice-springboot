<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdatePersonalDetails | Resume Builder</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajax.js"></script>

<link href="./css/cs001.css" rel="stylesheet" type="text/css"/>
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
  	color:gray;
    
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
    height:auto;
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
<script>
$(document).ready(function() {
	//alert("country");
	$.ajax({
		url :'/Resume_Builder/getCountryDetails',
		success : function(data) {
			$("#country").empty();
			$("#country").append(
                    "<option selected='selected'>Select Country</option>");
			 $.each(data, function(i, val) {
	                $("#country").append(
	                        "<option value=" + i + ">" + val+ "</option>");
	            });
		}
	});
//function change2(){
	$('#country').change(function() {
		alert("st");
		$.ajax({
			url : '/Resume_Builder/getAllStateBasedOnCountry',
			data : {
				countryid : $('select#country').val()
			},
			success : function(data) {
				
				$("#state").empty();
				$("#state").append(
                        "<option selected='selected'>Select State</option>");
			
				 $.each(data, function(i, val) {
		                $("#state").append(
		                        "<option value=" + i + ">" + val+ "</option>");
		            });
			}
		});//}
	});
	
	$('#state').change(function() {
		//alert($('select#state').val());
		$.ajax({
			url : '/Resume_Builder/getAllCityBasedOnState',
			data : {
				stateid : $('select#state').val()
			},
			success : function(data) {
				
				$("#city").empty();
				$("#city").append(
                        "<option selected='selected'>Select City</option>");
			
				 $.each(data, function(i, val) {
		                $("#city").append(
		                        "<option value=" + i + ">" + val+ "</option>");
		            });
			}
		});//}
	});
	
});

</script>
</head>
<body>
	<form class="modal-content animate" action="updatePersonalDetails">
		<div class="container">
		
		<input type="hidden" name="pid" value="<%=request.getParameter("pid") %>"/>
		<label>First Name:</label>
		<input type="text" name="txtfname" placeholder="First Name" value="<%=request.getParameter("fname") %>"/>
		
		<label>Last Name:</label>
		<input type="text" name="txtlname" placeholder="Last Name" value="<%=request.getParameter("lname") %>"/>
				
		<label>Father Name:</label>
		<input type="text" name="txtfathername" placeholder="Ftaher Name" value="<%=request.getParameter("fathname") %>"/>
			
		<label>Mother Name:</label>
		<input type="text" name="txtmothername" placeholder="Mother Name" value="<%=request.getParameter("mothname") %>"/>
				
		<label>Date Of Birth:</label>
		<input type="text" name="txtdob" placeholder="DOB" id="datepicker" value="<%=request.getParameter("dob") %>"/>
	
		<label>Country:</label>
		<Select id="country" name="scountry">Select Country
			
		</Select>	
		
		<label>State:</label>
		<Select id="state" name="sstate">Select State
			
		</Select>
		
		<label>City:</label>
		<Select id="city" name="scity">Select City
			
		</Select>
		
		<label>Gender:</label>
		<input type="radio" name="gender" checked id="male" checked/>Male &nbsp;&nbsp;<input type="radio" name="gender" id="male"/>Female
			<br>
		<label>Pin Code:</label>
		<input type="text" name="txtpincode" placeholder="Pin Code"  value="<%=request.getParameter("pincode") %>"/>
	
		<label>Address:</label>
		<input type="text" name="txtaddr" placeholder="Address" value="<%=request.getParameter("addr") %>"/>
	
				
		<input type="submit" value="update Personal Detail"/><span></span>
		<input type="reset" value="Reset Personal Detail"/>
	</div>
</form>

<script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>
</body>
</html>