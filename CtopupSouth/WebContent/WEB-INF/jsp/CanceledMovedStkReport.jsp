<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Canceled || MovedStkReport</title>

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
	var url = "getAllWallet";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = cityChange1;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function cityChange1() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("channel--------------------");
		alert("inside channel : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		// document.getElementById("channelid").innerHTML = xmlHttp.responseText;    WA_ID,WALLET_NAME
		
		  var jsonchannel = JSON.parse(xmlHttp.responseText);
		  console.log("length :: "+jsonchannel.length);
		  //console.log("one val :: "+jsonchannel[1].WA_ID);
		 $("#channelid").empty();
        var channel_id = document.getElementById('wallet');
        for (var i = 0; i < jsonchannel.length; i++) {
        	channel_id.innerHTML = channel_id.innerHTML +
        	'<option value="' + jsonchannel[i].wa_ID + '">' + jsonchannel[i].wallet_NAME + '</option>';
        }  
	}
}  
</script><!-- "wa_ID":3,"wallet_NAME":"CBP"},{"wa_ID":1,"wallet_NAME":"CTOPUP"}] -->
</head>
<body>
<div class="container " >
			<h5 style="margin-bottom: 20px">Canceled Moved StkReport >>></h5>
			<fieldset class="well">
	    			<legend class="well-legend" style="padding-top: 2px">By Area</legend>
					<div class="row">
					<div class="col-sm-6">
							<select id="wallet" name="wallet">
			                     <option value='-1'>--select wallet--</option>
			                </select>
						</div>
						<div class="col-sm-6">
							<select id="srcNumbOrIdOptn" name="srcNumbOrIdOptn" >
			                    <option value='-1'>--select --</option>
			                     <option value='1'>Dealer ID</option>
			                      <option value='2'>Source Mobile Numbe</option>
			                </select>
						</div>
					</div>
				</fieldset>	
				<fieldset class="well">
	    			<legend class="well-legend">Success Cancle Data</legend>
					<div class="row">
					
					<div class="col-sm-6">
							<!-- <label for="ex2">Msisdn</label> -->
                            <input type="text" class="form-control" id="srcNumberOrId" NAME="srcNumberOrId" value="" placeholder="input dealerid & mobile">  
						</div>
						<div class="col-sm-6">
							<!-- <label for="ex2">Destination Mobile Number</label> -->
                            <input type="text" class="form-control" id="destMobileNumber" NAME="destMobileNumber" value="" placeholder="input Destination Mobile Number">  
						</div>
					</div>
				</fieldset>	
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
						<button type="button" class="btn btn-info btn-block" onclick="submitForm()">OK</button>
					</div>
					<div class="col-sm-6 ">
						<button type="reset" class="btn btn-warning btn-block">Reset</button>
					</div>
				</div>	
				<br><br><br>

				<div id="applications" style="padding-top: 15px; display: none; "></div>
	                <table id="employees" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					            <td>Record_Id.</td>
			                    <td>SM_Trans_Id</td>
			                    <td>Move_Date </td>
			                    <td>Franchise_Code</td>
			                    <td>Amount_In_Rs.</td>
			                    <td>Balance_Before </td>
			                    <td>Balance_After </td>
			                    <td>Current_Balance_before_Move</td>
			                    <td>Current_Balance_after_Move </td>
			                    <td>Cancel_Date</td>
					    	</tr>
						</thead>
					</table>
			
</div>
<!-- {
"dealer_code":"SZ~AP~CDP/0279379",
"timestamp":null,
"record_ID":1.0,
"sm_TRANSACTION_ID":1.0,
"amount":100.0,
"balance_BEFORE":1000.0,
"balance_AFTER":900.0,
"balance_BEFORE_CANCEL":1000.0,
"balance_AFTER_CANCEL":900.0,
"cancel_DATE":null
},-->
<script type="text/javascript">
	    function showDetailedTable(data) {
		$('#applications').hide();
		var selector = $("#applications");
		selector.html("");
		selector.append(JSON.stringify(data));
		data = $.parseJSON(selector.text());
		//console.log(data);
		table = $("#employees").DataTable({ 
			data : data,
			scrollX : true,
			scrollCollapse : true,
			fixedColumns : true,
			"columns" : [ {
				data : "record_ID",
				visible : true
			}, {
				data : "sm_TRANSACTION_ID"
			}, {
				data : "timestamp"
			}, {
				data : "dealer_code"
			}, {
				data : "amount"
			}, {
				data : "balance_BEFORE"
			}, {
				data : "balance_AFTER"
			} ,{
				data : "balance_BEFORE_CANCEL"
			} ,{
				data : "balance_AFTER_CANCEL"
			} ,{
				data : "cancel_DATE"
			} 
			],
			"bDestroy" : true,
			dom : 'Bfrtip',
			buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'employeerecord'
	            },
	            {
	                extend: 'csvHtml5',
	                title: 'employeerecord'
	            }
	        ]
		})   
	}
	function submitForm() {
		var isValid = true;//document.forms['frcReport'].checkValidity();
		var wallet = $('#wallet').val();
		var srcNumbOrIdOptn = $('#srcNumbOrIdOptn').val();
		var srcNumberOrId = $('#srcNumberOrId').val();
		var destMobileNumber = $('#destMobileNumber').val();
		var fromDate = $('#fromDate').val();
		var toDate = $('#toDate').val();
		if (fromDate == "") {
			isValid = false;
			$("#fromDate").focus();
			return false;
		}
		if (toDate == "") {
			isValid = false;
			$("#toDate").focus();
			return false;
		}
		
		console.log(wallet + "~" + srcNumbOrIdOptn + "~" + srcNumberOrId + "~" + destMobileNumber + "~" + fromDate + "~" + toDate);
		alert(wallet + "~" + srcNumbOrIdOptn + "~" + srcNumberOrId + "~" + destMobileNumber + "~" + fromDate + "~" + toDate);
		console.log("isValid :: " + isValid);
		alert("isvalied111 ::" + isValid);
		if (isValid) {
			$.ajax({
				url : 'get-all-CanceledMovedStkReport',
				type : 'POST',
				dataType : 'json',
				crossDomain : true,
				beforeSend : function(xhr) {
					//Set authentication headers=circlehidden,cityhidden
				},
				data : {
					"wallet" : wallet,
					"srcNumbOrIdOptn" : srcNumbOrIdOptn,
					"srcNumberOrId" : srcNumberOrId,
					"destMobileNumber" : destMobileNumber,
					"fromDate" : fromDate,
					"toDate" : toDate
				},
				success : function(data, textStatus, jqXHR) {
					if (data.error) {
						alert(data.message);
					} else {
						showDetailedTable(data);
					}//end else
				}, //end success
				error : function(xhr) { // if error occured
					alert('No se pudo procesar la solicitud.');
					console.log(xhr);
				},
				complete : function() {
				},
				xhrFields : {
					withCredentials : true
				}
			});
		} else
			return false;
	}
</script>
<script type="text/javascript">
	$(function() {
		$("#fromDate").datepicker({
			dateFormat : "dd-mm-yy",
			maxDate : -1,
			changeMonth : true,
			changeYear : true,
			onClose : function(selectedDate) {
				$("#toDate").datepicker("option", "minDate", selectedDate);
			}
		});
		$("#toDate").datepicker({
			dateFormat : "dd-mm-yy",
			minDate : 0,
			maxDate : -1,
			changeMonth : true,
			changeYear : true,
			onClose : function(selectedDate) {
				$("#fromDate").datepicker("option", "maxDate", selectedDate);
			}
		});
	});
</script>
</body>
</html>