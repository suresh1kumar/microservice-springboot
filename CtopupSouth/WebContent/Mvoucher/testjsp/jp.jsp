<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
  <link href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet">
<style>form{width: 70%;margin: 100px auto}</style>
 <style type="text/css">
 #form {
	background-color: lightblue; <!-- #84 e184-- > min-height : 700px;
	padding: 5px 40px 40px 40px;
}
.padding-top-10{
padding-top:10px;
}
.transaction{
 margin-left: 10px;
}
.btn-primary{
padding-top:10px;
	border-radius: 0px;
	padding: 10px;
	width: 49%;
}

.btn-danger {
	border-radius: 0px;
	padding: 10px;
	width: 49%;
}
</style>
<script>
$(document).ready(function(){
	var minDate=new Date();
	$("#depart").datepicker({
	showAnim: 'drop',
	numberOfMonth: 1,
	minDate: minDate,
	dateFormat: 'dd/mm/yy',
	onClose:function(selectedDate){
	$('#return').datepicker("option","minDate",selectedDate);
	}
	});

	$("#return").datepicker({
	showAnim: 'drop',
	numberOfMonth: 1,
	minDate: minDate,
	dateFormat: 'dd/mm/yy',
	onClose:function(selectedDate){
	$('#depart').datepicker("option","minDate",selectedDate);
	}
	});	
});
</script>
</head>
<body>
<div class=" container progress">
<div class="progress-bar progress-bar-info progress-bar-striped active" 
      style="width:100%;">Reports>>IN Reconciliation Transaction Report</div>
 </div>
       <center>
		<b class="transaction"></b>
		</center> 
   <div class="container padding-top-10">
   <div class="panel panel-primary">
   <div class="panel-heading"><b>IN Report</b></div>
   <div class="panel-body">
  <form>
    <div class="row">
    <div class="col-md-12" id="form">
						<label>IN Name :</label>
						 <select class="form-control text">
							<option value="Mail">city-1</option>
							<option value="Female">city-2</option>
						</select>
					</div>
        <div class="col-md-6" id="form">
           <label>From Date :</label> 
           <input type="date" name="dob" class="form-control text" placeholder="">
        </div>
  <div class="col-md-6" id="form">
       <label>To Date :</label>
       <input type="date" name="dob" class="form-control text" placeholder="">
   </div>
   

<div class="col-md-12" id="form">
		<input type="submit" class="btn btn-primary" value="Ok">
		<input type="reset" class="btn btn-danger" value="Reset">
</div>
</div>
</form>
</div>
</div>
</div>
</body>
</html>