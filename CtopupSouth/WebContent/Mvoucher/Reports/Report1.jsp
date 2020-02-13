<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<script type="text/javascript" src="ExternalCSS/js/jquery-1.11.1.minrep.js"></script>
<link href="ExternalCSS/css/style1.css" rel="stylesheet" type="text/css" media="all" />
<link href="//fonts.googleapis.com/css?family=Amaranth:400,400i,700,700i" rel="stylesheet">
</head>
<body class="bg agileinfo">
   <h1 class="agile-head text-center">Payments Received Report </h1>
	<div class="container">
		<div class="form_w3layouts">
			<form action="#" method="post" class="agile_form">
				
			
				<div class="agileits-location agileinfo-bottom wthree-rating">
					<label>Wallet Type</label>
				    <select required>
						<option value="">select Wallet</option>
						<option value="1">4-5 star</option>
						<option value="2">3-4 star</option>
						<option value="3">2-3 star</option>
						<option value="4">1-2 star</option>
					</select>
				</div>
				<div class="agileits-location agileinfo-bottom wthree-budget">
					<label>Circle Name</label>
				    <select required>
						<option value="">select Circle</option>
						<option value="1">150-250$</option>
						<option value="2">250-350$</option>
						<option value="3">300-350$</option>
						<option value="4">350-400$</option>
					</select>
				</div>
			
				<div class="clear"></div>
				<div class="agileits-location">
					<label>SSA Name</label>
				    <select required>
						<option value="">select SSA Name</option>
						<option value="1">Business Class</option>
						<option value="2">Premium Economy</option>
						<option value="3">Cultural Travel</option>
					</select>
				</div>
				
				
				<div class="clear"></div>
				<div class="agileits-location">
					<label>delear</label>
					  <input type="text" name="text" id="" />
				   <!--  <select required>
				  
						<option value="">select SSA Name</option>
						<option value="1">Business Class</option>
						<option value="2">Premium Economy</option>
						<option value="3">Cultural Travel</option>
					</select> -->
				</div>
				<!-- 
				<div class="section_class_agileits">
					<div class="section_agileits">
						<select required>
							<option value="">No. of Rooms</option>
							<option value="2">1</option>
							<option value="3">2</option>
							<option value="4">3</option>
							<option value="5">4 or 4+</option>
						</select>
					</div>
					<div class="section_agileits w3ls-sel2">
						<select required>
							<option value="">Adults</option>
							<option value="2">1</option>
							<option value="3">2</option>
							<option value="4">3</option>
							<option value="5">4 or4+</option>
						</select>
					</div>  -->
					
					<div class="checkin agileits-left">
					<label>From Date</label>
				    <input placeholder="dd/mm/yyyy" class="date" id="datepicker" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" required=""/>
				</div>
				<div class="checkin agileits-right">
					<label>To Date</label>
					<input placeholder="dd/mm/yyyy" class="date" id="datepicker1" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" required=""/>
		        </div>
					<div class="clear"></div>
				</div>
				<div class="form-group w3ls-opt">
					<label for="Phone" class="control-label">Data</label>

					<label class="w3layouts">
						<input type="radio" name="work" id="hire" value="male" checked>Current Day
					</label>
					<label class="w3layouts label2">
						<input type="radio" name="work" id="work" value="female">Old Day
					</label>
				</div>
				<!-- <div class="agileits-location agileinfo-bottom wthree-rating">
					<label>Ideal Star Rating</label>
				    <select required>
						<option value="">select rating</option>
						<option value="1">4-5 star</option>
						<option value="2">3-4 star</option>
						<option value="3">2-3 star</option>
						<option value="4">1-2 star</option>
					</select>
				</div>
				<div class="agileits-location agileinfo-bottom wthree-budget">
					<label>Ideal Budget</label>
				    <select required>
						<option value="">select Budget</option>
						<option value="1">150-250$</option>
						<option value="2">250-350$</option>
						<option value="3">300-350$</option>
						<option value="4">350-400$</option>
					</select>
				</div>	 -->			
				<div class="clear"></div> 
				<!-- <div class="section_agileits w3ls-sel2"> -->
				<div class="submit">
					<input type="submit" value="Search">
					<input type="submit" value="Reset">
				</div> 
				
			</form>
		</div>			
	</div>
	<div class="agileits-w3layouts-copyright text-center">
		<h2>© 2018 Payments Received Report |  By  Pyro</h2>
	</div>	
	<!--start-date-piker-->
		<link rel="stylesheet" href="ExternalCSS/css/jquery1-ui.css" />
		<script src="ExternalCSS/js/jquery-uirep.js"></script>
			<script>
				$(function() {
				$( "#datepicker,#datepicker1" ).datepicker();
				});
			</script>
<!-- /End-date-piker -->

</body>
</html>