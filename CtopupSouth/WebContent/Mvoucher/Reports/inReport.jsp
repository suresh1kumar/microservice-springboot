<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/ajax.js"></script>

<link href="./css/cs001.css" rel="stylesheet" type="text/css" />
<!-- <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css"> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

 <link href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet">
<style>form{width: 70%;margin: 100px auto}</style>
<style>
form {
	width: 70%;
	margin: 100px auto
}
</style>
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
<script type="text/javascript">
	$(document).ready(function() {
		var minDate = new Date();
		$("#depart").datepicker({
			showAnim : 'drop',
			numberOfMonth : 1,
			minDate : minDate,
			dateFormat : 'dd/mm/yy',
			onClose : function(selectedDate) {
				$('#return').datepicker("option", "minDate", selectedDate);
			}
		});

		$("#return").datepicker({
			showAnim : 'drop',
			numberOfMonth : 1,
			minDate : minDate,
			dateFormat : 'dd/mm/yy',
			onClose : function(selectedDate) {
				$('#depart').datepicker("option", "minDate", selectedDate);
			}
		});
	});
</script>
</head>
<body>
	<form action="" method="post">
	<div class="container ">  
  <!-- <h5>Reports>>IN Reconciliation Transaction Report</h5>  --> 
  
  
  <div class="progress">  
    <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:100%">  
  Reports>>IN Reconciliation Transaction Report
    </div>  
  </div>  
  
  
  
<div class="panel panel-primary">  
  <div class="panel-heading">  
    <h3 class="panel-title"><strong>IN Report</strong></h3>  
  </div>  
  <div class="panel-body">  
   
     <div class="form-group col-md-6">
      <label for="inputState"> IN Name</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
       <div class="form-group cal-md-6">
			<div class="row">
				
				
				<div class="col-xs-6"> <label for="">  Form Date</label><input type="text" class="form-control" id="depart" name="first_name" ></div>
				 
				<div class="col-xs-6"><label for="">  To Date</label><input type="text" class="form-control" id="return" name="last_name" ></div>
			</div>        	
        </div>
    <div class="col-md-12" id="form">
								<input type="submit" class="btn btn-primary" value="Ok">
								<input type="reset" class="btn btn-danger" value="Reset">
							</div> 
  
    
    
  </div> 
  
</div>  
</div>  
		<!-- <div class=" container progress">
			<div
				class="progress-bar progress-bar-warning progress-bar-striped active"
				style="width: 100%;">Reports>>IN Reconciliation Transaction Report </div>
		</div>
		<center>
			<b class="transaction"></b>
		</center>
		<div class="container padding-top-10">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<b>Search</b>
				</div>
				<div class="panel-body">
					<form>
						<div class="form-row">
							<div class="col" id="form">
								<label>From Date :</label> <input type="date" name="dob"
									class="form-control text" id="depart" placeholder="">
							</div>
							<div class="col" id="form">
								<label>To Date :</label> <input type="date" name="dob"
									class="form-control text" id="return" placeholder="">
							</div>
							<div class="col-md-2" id="form">
								<input type="submit" class="btn btn-primary" value="Ok">
								<input type="reset" class="btn btn-danger" value="Reset">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div> -->
	</form>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>  
</body>
</html>