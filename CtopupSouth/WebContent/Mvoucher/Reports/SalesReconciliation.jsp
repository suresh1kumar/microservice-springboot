<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="ExternalCSS/css/style.css" rel='stylesheet' type='text/css' />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</script>
<script src="ExternalCSS/js/jquery-1.11.1.min.js"></script>
<script src="ExternalCSS/js/formdateTo_Todate.js"></script>
<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Oleo+Script:400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=ABeeZee' rel='stylesheet' type='text/css'>
</head>
<body>
	<h1>Reports>>Sales Reconciliation </h1>
						<div class="main">
									<div class="facts">
										<div class="booking-form">
											<div class="online_reservation">
													<div class="b_room">
														<div class="booking_room">
														<div class="reservation">
															       <ul>	
																	 <li  class="span1_of_1">
																		 <h5>Zone </h5>
																		 <div class="section_dest">
																			  <select class="custom-select" id="select-4">
																								<option selected="selected">Zone</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																								<option>4</option>
																							</select>
																		 </div>		
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>Circle </h5>
																		 <div class="section_dest">
																			<select class="custom-select" id="select-4">
																								<option selected="selected">Circle</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																								<option>4</option>
																							</select>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul></div>
																	 
																	 <div class="reservation">
															       <ul>	
																	 <li  class="span1_of_1">
																		 <h5>SSA</h5>
																		 <div class="section_dest">
																			  <select class="custom-select" id="select-4">
																								<option selected="selected">SSA</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																								<option>4</option>
																							</select>
																		 </div>		
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>Wallet Type </h5>
																		 <div class="section_dest">
																			<select class="custom-select" id="select-4">
																								<option selected="selected">Wallet Type</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																								<option>4</option>
																							</select>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul></div>
		                                                       <!--   <div class="groups">
							                                                 <div class="grid_4 columns">
																						<h5> Circle</h5>
																							<select class="custom-select" id="select-4">
																								<option selected="selected">1</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																								<option>4</option>
																							</select>
																						</div>		
																						<div class="grid_5 columns">
																							<h5> IN Name</h5>
																							<select class="custom-select" id="select-5">
																								<option selected="selected">0</option>
																								<option>0</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																							</select>
																						</div>	
																						<div class="grid_6 columns">
																							<h5> Transaction Status</h5>
																							<select class="custom-select" id="select-6">
																								<option selected="selected">0</option>
																								<option>0</option>
																								<option>1</option>
																								<option>2</option>
																								<option>3</option>
																							</select>
																						</div>	
																						<div class="clear"></div>
															            	</div> -->
	
		                                                     <!-- <div class="reservation">
															       <ul>	
																	 <li  class="span1_of_1">
																		 <h5>Source Mobile No </h5>
																		 <div class="section_dest">
																			   <input type="text" name="name" id="section_dest" class="section_dest"/>
																		 </div>		
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>Destination Mobile No </h5>
																		 <div class="section_dest">
																			 <input type="text" name="name" id="section_dest" class="section_dest"/>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul></div> -->
				                                         
															<div class="reservation" id="dateblock">
																<ul>	
																	 <li  class="span1_of_1">
																		 <h5>From Date </h5>
																		 <div class="book_date">
																			 <form>
																				<input class="date" id="strFormBate" type="text" value="DD/MM/YYYY" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '19/10/2015';}" required="">
																			 </form>
																		</div>	
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>To Date </h5>
																		 <div class="book_date">
																			<form>
																				<input class="date" id="strToDate" type="text" value="DD/MM/YYYY" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '19/10/2015';}" required="">
																			 </form>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul></div>
																	<div class="reservation" >
																	  <div class="clear"></div>
																
																	<!---strat-date-piker---->
																		<link rel="stylesheet" href="ExternalCSS/css/jquery-ui.css" />
																		<script src="ExternalCSS/js/jquery-ui.js"></script>
																		  <script>
																				  $(function() {
																					$( "#datepicker,#datepicker1" ).datepicker();
																				  });
																		  </script>
																	<!---/End-date-piker---->
															</div>
																
																			<div class="date_btn">
																				<form>
																					<input type="submit" value="Search">
																					<input type="submit" value="Reset">
																				</form>
																			</div>
														</div>
														<div class="clear"></div>
													</div>
											</div>
											<!---->
										</div>	
									</div>
								
								</div>
			<!--start-copyright-->
   		<div class="copy-right">
   			<div class="wrap">
				<p>&copy; 2018 Reports>>Sales Reconciliation  | By Pyro </p>
		</div>
	</div>
	<!--//end-copyright-->
</body>
</html>