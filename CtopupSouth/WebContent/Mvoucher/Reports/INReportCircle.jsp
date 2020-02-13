<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reconciliation Transaction Report</title>
<link href="ExternalCSS/css/style.css" rel='stylesheet' type='text/css' />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</script>
<script src="ExternalCSS/js/jquery-1.11.1.min.js"></script>
</head>
<body>
<h3 style="color:white;"> Wrong Moved Stock cancellation </h3>
						
						<div class="main">
									<div class="facts">
										<div class="booking-form">
											<div class="online_reservation">
													<div class="b_room">
														<div class="booking_room">
														
														
															<div class="reservation">
																<ul>	
																	 <li  class="span1_of_1">
																		 <h5>Wallet Type </h5>
																		 <div class="section_dest">
																			  <select>
																					<option value="0">Wallet Type</option>
																					<option value="1">CBP</option>
																					<option value="2">CTOPUP</option>
																					
																				</select>
																		 </div>		
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>Select Mobile No/Id </h5>
																		 <div class="section_dest">
																			  <select>
																					<option value="0">Destination City</option>
																					<option value="1">Delear Id</option>
																					<option value="2">Source Mobile No</option>
																					
																				</select>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul>
																	 
																	 <div class="reservation">
																<ul>	
																	 <li  class="span1_of_1">
																		 <h5>Source Mobile No/Id </h5>
																		 <div class="section_dest">
																		 
																			  <input type="text" name="name" id=""/>
																		 </div>		
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>Destination Mobile Number </h5>
																		 <div class="section_dest">
																			  <input type="text" name="name" id=""/>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul>
																	 
																	 <div class="reservation">
																<ul>	
																	 <li  class="span1_of_1">
																		 <h5>Form Date</h5>
																		 <div class="book_date">
																			 <form>
																				<input class="date" id="datepicker" type="text" value="19/10/2015" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '19/10/2015';}" required="">
																			 </form>
																		</div>	
	
																	 </li>
																	 <li  class="span1_of_1 left">
																		 <h5>To Date </h5>
																		 <div class="book_date">
																			<form>
																				<input class="date" id="datepicker" type="text" value="19/10/2015" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '19/10/2015';}" required="">
																			 </form>
																		 </div>					
																	 </li>
																	  <div class="clear"></div>
																	 </ul>
																	 </div>
																	
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
																					<input type="submit" value="Ok">
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
				<p>&copy; 2018 Wrong Moved Stock cancellation | By Pyro</p>
		</div>
	</div>
	<!--//end-copyright-->
</body>
</html>