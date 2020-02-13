<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vanity || SalesReport</title>
		<meta charset="utf-8">
	  	<meta name="viewport" content="width=device-width, initial-scale=1">
	  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	  	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<!-- dataTable - start -->
		<link href='https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css' rel='stylesheet'>
	  	<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
		
		<!-- dataTable - end -->
		<!-- Export Buttons - start -->
		<link href='https://cdn.datatables.net/buttons/1.5.1/css/buttons.dataTables.min.css' rel='stylesheet'>
		<script src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
		<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.flash.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js"></script>
		<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.html5.min.js"></script>
		<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.print.min.js"></script>
		<style type="text/css">
	  		@import url('https://fonts.googleapis.com/css?family=Roboto');
	  		html{
				margin: 0;
				padding: 0;
				width: 100%;
				/*height: 100%;*/
			}
			body{
				padding: 0;
				margin: 0;
				color: #483D8B;
				/*width: 100%;
				min-height:800px;*/
				min-height:1000px; max-height:2000px;
				/*height: 70% !important;*/
			    font-family: 'Roboto' !important;
			    font-size : 20px;
			}
			fieldset {
			  min-width: 0;
			  padding: 0;
			  margin: 0;
			  border: 0;
			}
			.well {
			  min-height: 20px;
			  padding: 10px;
			  margin-bottom: 20px;
			  background-color: #f5f5f5;
			  border: 1px solid #e3e3e3;
			  border-radius: 4px;
			  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);
			  box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);
			}
			.well-legend {
			  display: block;
			  width: auto;
			  padding: 2px 7px 2px 5px;
			  line-height: inherit;
			  color: #333;
			  background: #fbf0cf;
			  border: 1px solid #e3e3e3;
			  border-radius: 4px;
			  box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);
			  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);
			}
			.container{
			  margin: 40px auto;
			  width: 100%;
			}
			
			button, select {
			    text-transform: none;
			    border-radius: 5px;
			}
			table.dataTable.display tbody tr.odd {
			    color: black;
			}    
			/*#loader	{
			    background: #e9e9e9;  <- I left your 'gray' background
			    display: none;        <- Not displayed by default
			    position: absolute;   <- This and the following properties will
			    top: 0;                  make the overlay, the element will expand
			    right: 0;                so as to cover the whole body of the page
			    bottom: 0;
			    left: 0;
			    opacity: 0.5; 
			}*/

		</style> 
		
		<script language="javascript" type="text/javascript">

$( document ).ready(function() {
    console.log( "ready!" );
    if (typeof XMLHttpRequest !== "undefined") {
		xmlHttp = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
	}
	if (xmlHttp == null) {
		alert("browser does not supported XMLHTTP request")
		return;
	}
	var url = "getAllStateSingle";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = stateChange;  
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function stateChange() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("channel--------------------");
		//alert("inside channel : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		// document.getElementById("channelid").innerHTML = xmlHttp.responseText; 
		
		  var jsonstate = JSON.parse(xmlHttp.responseText);
		$("#region").empty();
        var stateid = document.getElementById('region');
        for (var i = 0; i < jsonstate.length; i++) {
        	stateid.innerHTML = stateid.innerHTML +
                '<option value="' + jsonstate[i].sid + '">' + jsonstate[i].sname + '</option>';
        }
	}
}  
var xmlHttp;
function showCity(str) {

	if (typeof XMLHttpRequest !== "undefined") {
		xmlHttp = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
	}
	if (xmlHttp == null) {
		alert("browser does not supported XMLHTTP request")
		return;
	}
	var url = "getAllCity";
	url += "?count=" + str;
	xmlHttp.onreadystatechange = changeCity;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
	
}
function changeCity() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("inside state : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		/* document.getElementById("state1").innerHTML = xmlHttp.responseText; */
		
		var jsoncity = JSON.parse(xmlHttp.responseText);
		 $("#city").empty();
       var city_id = document.getElementById('city');
       for (var i = 0; i < jsoncity.length; i++) {
       	city_id.innerHTML = city_id.innerHTML +
       	'<option value="' + jsoncity[i].cid + '">' + jsoncity[i].cname + '</option>';
       } 
	}
}
</script>
<script type='text/javascript'>
$(function() {
    $('#region').change(function() {
        var circlehid=$('#region :selected').text();
    	console.log("circlehid :: "+circlehid);
    	$("#circlehidden").val(circlehid);
    });
});

$(function() {
    $('#city').change(function() {
        var cityhid=$('#city :selected').text();
    	console.log("cityhid :: "+cityhid);
    	$("#cityhidden").val(cityhid);
    });
});
</script>
	            	
</head>
<body>
<div class="container " >
			<h2 style="margin-bottom: 20px">Vanity Number Sales Report</h2>
				<!-- <input type="hidden" id="zoneId" name="zoneId">
				<input type="hidden" id="regionId" name="regionId">
				<input type="hidden" id="cityId" name="cityId"> -->
				
				
				<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">
				
				<fieldset class="well">
	    			<legend class="well-legend" style="padding-top: 2px">By Area</legend>
					<div class="row">
						<!-- <div class="col-sm-4" style="display: none;">
							<select id="zone" name="zone">  
			                    <option value="" disabled selected>- Zone -</option>
			                </select>
						</div> -->
						<div class="col-sm-6">
							<select id="region" name="region" onchange="showCity(this.value);">  
			                    <option value="" disabled selected>- State -</option>
			                </select>
						</div>
						<div class="col-sm-6">
							<select id="city" name="city">  
			                    <option value="" disabled selected>- City -</option>
			                </select>
						</div>
					</div>
				</fieldset>	
				<input class="form-control input-sm" id="mobile" name="mobile" type="number" style="margin-bottom: 4px" placeholder="Mobile Number[Optional]">
				
				<fieldset class="well">
	    			<legend class="well-legend">Transaction Period</legend>
					<div class="row">
						<div class="col-sm-6">
							<input type="text" id="fromDate"  name="fromDate" class="from-control readonly" placeholder="From Date" required > 
						</div>
						<div class="col-sm-6">
						<input type="text" id="toDate"  name="toDate" class="from-control readonly" placeholder="To Date" required > 
						</div>
					</div>
				</fieldset>
				
				<div class="row">
					<div class="col-sm-6 ">
						<button type="button" class="btn btn-info btn-block" onclick="submitForm()">Search</button>
					</div>
					<div class="col-sm-6 ">
						<button type="reset" class="btn btn-warning btn-block">Reset</button>
					</div>
				</div>
				
			<!-- 	<div id=summaryTableDiv style="padding-top: 15px; display: none; ">
					<table id="example" class="display" cellspacing="0" width="100%" style=" "> -->
					<div id=detailedTableDiv style="padding-top: 15px; display: none;">
					<table id="detailedTable" class="display" cellspacing="0" width="100%" style="  ">
						<thead>
					    	<tr>
					            <th>SANCHAR_ID</th>
					            <th>DEALER_ID</th>
					            <th>TRANS_DATE</th>
					            <th>SOURCE_MSISDN</th>
					            <th>DEST_MSISDN</th>
					            <th>AMOUNT</th>
					            <th>SOURCE_BALANCE_BEFORE</th>
					            <th>SOURCE_BALANCE_AFTER</th>
					            <th>DEST_CIRCLE_ID</th>
					            <th>SOURCE_CIRCLE_ID</th>
					    	</tr>
						</thead>
					</table>
				</div>	
			
</div>
<script type="text/javascript">

                    function showDetailedTable(data) {
	                    $('#detailedTableDiv').show();
                           var table = $('#detailedTable').DataTable({
                           "bAutoWidth" : false,
                           "aaData" : data,
                           "columns" :  [
	                             { "mData": "sancharid" },
	                              { "mData": "franchisename" },
	                              { "mData": "timestamp" },
	                              { "mData": "ctopupnumber" },
	                              { "mData": "fancynumber" },
	                              { "mData": "amount" },
	                              { "mData": "stockbefore" },
	                              { "mData": "stockafter" },
	                              { "mData": "desccircle" },
	                              { "mData": "franchicircle" }
	                  	        ], 
	                "bDestroy": true,
	                dom: 'Bfrtip',
			        buttons: [
			            'copy', 'csv', 'excel', 'pdf', 'print'
			        ]
	            })
	         } 

			function submitForm() {
				var isValid = true;//document.forms['frcReport'].checkValidity();
				
				var region = $('#region').val();
				var city = $('#cityhidden').val();
				var mobile = $('#mobile').val();
				var fromDate = $('#fromDate').val();
				var toDate = $('#toDate').val();
				if(fromDate == ""){
					isValid = false;
					$("#fromDate").focus();
					return false;
				}
				if(toDate == ""){
					isValid = false;
					$("#toDate").focus();
					return false;
				}
				/* if(region == null){
					isValid = false;
					$("#region").focus();
					return false;
				} */
				/*if(city == ""){
					isValid = false;
					$("#city").focus();
					return false;
				}*/
				console.log(region +"~"+city+"~"+mobile+"~"+fromDate+"~"+toDate);
				alert(region +"~"+city+"~"+mobile+"~"+fromDate+"~"+toDate);
				console.log("isValid :: "+ isValid);
				alert("isvalied111 ::"+isValid);
				if(isValid){
					$.ajax({
						url : 'get-all-vanityNumberSalesReport',
						type : 'POST',
						data : {
							"region": region,
							"city"	: city,
							"mobile"	: mobile,
							"fromDate"	: fromDate,
							"toDate"	: toDate
						},
						success : function(response){
							//var resp = JSON.parse(response);
							//console.log("Summary ::"+response.name);
							alert("success block")
							alert("data ::"+response);
							alert("data ::"+records.city);
							showDetailedTable(response.records);
						},
						error : function(response){
							//var resp = JSON.parse(response);
							alert("There was some error" + response);
							console.log(response);
						}
					});
				}
				else
					return false;
			}
		</script>

<!-- =========================================== -->

		
		 <script type="text/javascript">
			$(function() {
				$("#fromDate").datepicker(
				{
					dateFormat : "dd-mm-yy",
					maxDate : -1,
					changeMonth: true,
					changeYear: true,
					onClose : function(selectedDate) {
						$("#toDate").datepicker("option", "minDate", selectedDate);
					}
				});
				$("#toDate").datepicker(
				{
					dateFormat : "dd-mm-yy",
					minDate : 0,
					maxDate : -1,
					changeMonth: true,
					changeYear: true,
					onClose : function(selectedDate) {
						$("#fromDate").datepicker("option", "maxDate", selectedDate);
					}
				});
			});
		</script> 
</body>
</html>