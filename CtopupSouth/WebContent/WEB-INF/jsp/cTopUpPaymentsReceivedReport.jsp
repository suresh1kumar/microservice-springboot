<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payments || Report</title>
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
		<style>
.container {
	width: 1200px;
}

tr.odd {
	background: #EDE4D4 !important;
}

tr.odd td.sorting_1 {
	background: #EDE4D4 !important;
}

tr.even td.sorting_1 {
	background: #fff !important;
}
</style>
<style type="text/css">
 table.dataTable thead tr {
  background-color: green;
} 
div.dataTables_length {
    float: left;
    background-color: red;
}
 
div.dataTables_filter {
    float: right;
    background-color: green;
}
 
div.dataTables_info {
    float: left;
    background-color: lightblue;
}
 
div.dataTables_paginate {
    float: right;
    background-color: lightblue;
}
 
div.dataTables_length,
div.dataTables_filter,
div.dataTables_paginate,
div.dataTables_info {
    padding: 6px;
}
</style>
<script language="javascript" type="text/javascript">

$( document ).ready(function() {
    console.log( "readywallet!" );
    if (typeof XMLHttpRequest !== "undefined") {
		xmlHttp = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
	}
	if (xmlHttp == null) {
		alert("browser does not supported XMLHTTP request")
		return;
	}
	var url = "getAllWallet";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = walletChange1;  
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function walletChange1() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		alert("wallet--------------------");
		alert("inside wallet : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		// document.getElementById("channelid").innerHTML = xmlHttp.responseText;    WA_ID,WALLET_NAME
		
		  var jsonwallet = JSON.parse(xmlHttp.responseText);
		  console.log("length :: "+jsonwallet.length);
		  //console.log("one val :: "+jsonchannel[1].WA_ID);
		 $("#wallet1").empty();
        var wallet_id = document.getElementById('wallet1');
        for (var i = 0; i < jsonwallet.length; i++) {
        	wallet_id.innerHTML = wallet_id.innerHTML +
        	'<option value="' + jsonwallet[i].wa_ID + '">' + jsonwallet[i].wallet_NAME + '</option>';
        }  
	}
}  
</script>

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
		alert("state--------------------");
		//alert("inside channel : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		// document.getElementById("channelid").innerHTML = xmlHttp.responseText; 
		
		  var jsonstate = JSON.parse(xmlHttp.responseText);
		$("#state1").empty();
        var stateid = document.getElementById('state1');
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
		 $("#city1").empty();
       var city_id = document.getElementById('city1');
       for (var i = 0; i < jsoncity.length; i++) {
       	city_id.innerHTML = city_id.innerHTML +
       	'<option value="' + jsoncity[i].cid + '">' + jsoncity[i].cname + '</option>';
       } 
	}
}
</script> 
<style>form{width: 70%;margin: 100px auto}</style>
<script type="text/javascript">
     function disableStatus2(){
	    alert("hide--------")
        $("#dateblock").hide();
     return true;
     }
     function disableStatus1(){
    $("#dateblock").show();
     return true;
   }
    function window_onload()
     {
	 $("#dateblock").hide();
    }

/* function disableStatus2()
{
	document.getElementById("dateblock").style.display="none";
	return true;
}

function disableStatus1()
{
	document.getElementById("dateblock").style.display="block";
	return true;
} */
</script>
<script type='text/javascript'>
$(function() {
    $('#state1').change(function() {
        var circlehid=$('#state1 :selected').text();
    	console.log("circlehid :: "+circlehid);
    	$("#circlehidden").val(circlehid);
    });
});

$(function() {
    $('#city1').change(function() {
        var cityhid=$('#city1 :selected').text();
    	console.log("cityhid :: "+cityhid);
    	$("#cityhidden").val(cityhid);
    });
});
</script>
</head>
<body>
<div class="container " >
			<h5 style="margin-bottom: 20px">CTopUp Payments Received Report >>></h5>
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">
 	        
 	        
 	        <fieldset class="well">
	    			<legend class="well-legend" style="padding-top: 2px">By Area</legend>
					<div class="row">
					<div class="col-sm-4">
							<select id="wallet1" name="wallet">
			                     <option value='-1'>--select wallet--</option>
			                </select>
						</div>
					<div class="col-sm-4">
							<select  id='state1' name='state'  onchange="showCity(this.value);" >
			                    <option value='-1'>--select state--</option>
			                </select>
						</div>
						<div class="col-sm-4">
							<select  id='city1' name='city'  >
			                <option value='-1'>--select city--</option>
			                </select>
						</div>
					</div>
				</fieldset>	
				<input class="form-control input-sm" id="msisdn" name="msisdn" type="number" style="margin-bottom: 4px" placeholder="Mobile Number[Optional]">
				<fieldset class="well">
	    			<legend class="well-legend">Current Old Data</legend><!-- checked="checked" -->
					<div class="row">
						<div class="col-sm-6">
							<label class="radio-inline ">
								<!-- <input type="radio" name="searchType1" value="CurrentDay"  id="searchType1"  onClick="disableStatus2();">Current -->
								<input TYPE="radio" NAME="searchType" value="CurrentDay"  id="searchType" checked="checked" onClick="disableStatus2();" >Current
							</label>
						</div>
						<div class="col-sm-6">
						<label class="radio-inline ">
							<!-- <input type="radio" name="searchType1" value="N"  id="searchType1" onClick="disableStatus1();">Old Date -->
							<input TYPE="radio" NAME="searchType" value="N"  id="searchType" onClick="disableStatus1();" >Old Date
						</label>
						</div>
					</div>
				</fieldset>
				<fieldset class="well">
	    			<legend class="well-legend">Transaction Period</legend>
					<div class="row" id="dateblock" style="display: none;">
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
				<div id=detailedTableDiv style="padding-top: 15px; display: none;">
					<table id="detailedTable" class="display" cellspacing="0" width="100%" style="  ">
						<thead>
					    	<tr>
					    	<!-- SSA Name,Date,Dealer Type,Franchise Code,MSISDN,Amount Recd In Rs.,Receipt No, 	
Payment Mode,DD/Cheque No.,Value Added In Rs.,Service Tax In Rs.,
Discount In Rs.,TDS In Rs.,Surcharge In Rs.,CESS In Rs.,Face Value In Rs. -->
					            <th>SSA_Name</th>
					            <th>Date</th>
					            <th>Dealer_Type</th>
					            <th>Franchise_Code</th>
					            <th>MSISDN</th>
					            <th>Amount_Recd_In_Rs.</th>
					            <th>Receipt_No</th>
					            <th>Payment_Mode</th>
					            <th>DD/Cheque_No.</th>
					            <th>Value_Added_In_Rs.</th>
					            <th>Service_Tax_In_Rs.</th>
					            <th>Discount_In_Rs.</th>
					            <th>TDS_In_Rs.</th>
					            <th>Surcharge_In_Rs.</th>
					            <th>CESS_In_Rs.</th>
					            <th>Face_Value_In_Rs.</th>
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
	                              { "mData": "desccircle" },
	                              { "mData": "desccircle" },
	                              { "mData": "desccircle" },
	                              { "mData": "desccircle" },
	                              { "mData": "desccircle" },
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
				var wallet = $('#wallet').val();
				var region = $('#circlehidden').val();
				var zone = $('#zone').val();
				var city = $('#cityhidden').val();
				var msisdn = $('#msisdn').val();
				var searchType = $("input[name='searchType']:checked").val();
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
				}*/wallet,region,city,searchType,msisdn
				console.log(zone +"~"+ wallet +"~"+ region +"~"+ city +"~"+ searchType +"~"+ msisdn +"~"+ fromDate +"~"+ toDate);
				alert(zone +"~"+ wallet +"~"+ region +"~"+ city +"~"+ searchType +"~"+ msisdn +"~"+ fromDate +"~"+ toDate);
				console.log("isValid :: "+ isValid);
				alert("isvalied111 ::"+isValid);
				if(isValid){
					$.ajax({
						url : 'get-all-CTopUpPaymentsReceivedReport',
						type : 'POST',
						data : {
							"wallet" : wallet,
							"zone" : zone,
							"region" : region,
							"city" : city,
							"searchType" : searchType,
							"msisdn"	: msisdn,
							"fromDate"	: fromDate,
							"toDate"	: toDate
						},
						success : function(response){
							//var resp = JSON.parse(response);
							//console.log("Summary ::"+response.name);
							alert("success block")
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