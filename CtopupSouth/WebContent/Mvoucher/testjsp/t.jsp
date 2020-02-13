<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>


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
<div class="container">  
  <h1>Panel Example</h1>  
  
<div class="panel panel-primary">  
  <div class="panel-heading">  
    <h3 class="panel-title"><strong>Panel title</strong></h3>  
  </div>  
  <div class="panel-body">  
    Panel content  
     <form action="" method="post">
       
       <input type="text" id="depart" >
       <input type="text" id="return" >
       <select id="seat">
          <option>seats</option>
          <option values="1">seat 1</option>
          <option values="2">seat 2</option>
          <option values="3">seat 3</option>
       </select>
      <input type="submit" value="search">
   </form>
  </div>  
</div>  
</div>  

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
</body>
</html>