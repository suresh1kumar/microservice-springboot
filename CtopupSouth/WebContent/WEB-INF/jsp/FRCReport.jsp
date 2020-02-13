<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>FRC || Report</title>
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

 //===========================================
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
	var url = "getAllZoneListType";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = zoneChange;  
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
	 
	function zoneChange() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			alert("inside zone : "+xmlHttp.responseText);
			console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
			/* document.getElementById("state1").innerHTML = xmlHttp.responseText; */
			
			  var jsonzone = JSON.parse(xmlHttp.responseText);
			  $("#zone").empty();
	          var zone_id = document.getElementById('zone');
	          for (var i = 0; i < jsonzone.length; i++) {
	        	zone_id.innerHTML = zone_id.innerHTML +
	        	'<option value="' + jsonzone[i].zid + '">' + jsonzone[i].zname + '</option>';
	        }  
		}
	}
	 //=====================================
	var xmlHttp;
	function showState(str) {

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
		url += "?count=" + str;
		xmlHttp.onreadystatechange = stateChange;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
		
	}
	function stateChange() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			//alert("inside state : "+xmlHttp.responseText);
			console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
			/* document.getElementById("state1").innerHTML = xmlHttp.responseText; */
			
			var jsonstate = JSON.parse(xmlHttp.responseText);
			$("#state1").empty();
            var stateid = document.getElementById('state1');
            for (var i = 0; i < jsonstate.length; i++) {
            	stateid.innerHTML = stateid.innerHTML +
                    '<option value="' + jsonstate[i].sid + '">' + jsonstate[i].sname + '</option>';
            }
		}
	}
	function showCity(str) {
		//alert("city ::");
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
		xmlHttp.onreadystatechange = stateChange1;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
		
	}
	function stateChange1() {
		if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
			//alert("inside city : "+xmlHttp.responseText);
			console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
			// document.getElementById("city1").innerHTML = xmlHttp.responseText; 
			
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
			<h5 style="margin-bottom: 20px">FRC Report >>></h5>
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">
 	        
 	        <fieldset class="well">
	    			<legend class="well-legend" style="padding-top: 2px">By Area</legend>
					<div class="row">
					<div class="col-sm-4">
							<select id="zone" name="zone" onchange="showState(this.value);">
			                    <option value='-1'>--select zone--</option>
			                </select>
						</div>
					<div class="col-sm-4">
							<select  id='state1' name='state1'  onchange="showCity(this.value);" >
			                    <option value='-1'>--select state--</option>
			                </select>
						</div>
						<div class="col-sm-4">
							<select  id='city1' name='city1'  >
			                <option value='-1'>--select city--</option>
			                </select>
						</div>
					</div>
				</fieldset>	
				<fieldset class="well">
	    			<legend class="well-legend">By Status</legend>
					<div class="row">
						<div class="col-sm-6">
							<label class="radio-inline ">
							<INPUT TYPE="radio"  id="StatusOn" NAME="StatusOn" value="Detailed" checked="checked">Detailed
							</label>
						</div>
						<div class="col-sm-6">
						<label class="radio-inline ">
						<INPUT TYPE="radio" id="StatusOn" NAME="StatusOn" value="Consolidate" >Consolidate 
						</label>
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
				<br><br>
				<!-- <div id=summaryTableDiv style="padding-top: 15px; display: none; ">
					<table id="summaryTable" class="display" cellspacing="0" width="100%" style=" "> -->
					<div id="applications" style="padding-top: 15px; display: none; "></div>
	                <table id="employees" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					            <th>CIRCLE_NAME</th>
					            <th>FRANCHISEE_SSA</th>
					            <th>FRANCHISEE_NAME</th>
					            <th>FRANCHISEE_NUMBER</th>
					            <th>Franchisee_ID</th>
					            <th>FRANCHISEE_CATEGORY</th>
						        <th>FRC_DENOMINATION</th>
					            <th>SELLER_COMM</th>
					            <th>SUB_Comm</th>
					            <th>FRA_COMM</th>
					            <th>TDS_Value</th>
					            <th>COMMISSION_TYPE</th>
					    	</tr>
						</thead>
					</table>
					<div id="applications2" style="padding-top: 15px; display: none; "></div>
	                <table id="employees2" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					            <th>CIRCLE_NAME</th>
					            <th>FRANCHISEE_SSA</th>
					            <th>FRANCHISEE_NAME</th>
					            <th>FRANCHISEE_NUMBER</th>
					            <th>Franchisee_ID</th>
					            <th>FRANCHISEE_CATEGORY</th>
						        <th>FRC_DENOMINATION</th>
					            <th>TRANS_COUNT</th>
							    <th>SELL_COMM</th>
					            <th>SUB_FRA_COMM</th>
					            <th>FRAN_COMM</th>
					            <th>TDS_Value</th>
					            <th>TOT_TDS</th> 
						        <th>COMMISSION_TYPE</th>
					    	</tr>
						</thead>
					</table>
				</div>	
					
 	</div>
 	
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
                 "data" : "circle_NAME"
             }, {
                 "data" : "franchisee_SSA"
             }, {
                 "data" : "franchisee_name"
             }, {
                 "data" : "franchisee_NUMBER"
             }, {
                 "data" : "franchisee_ID"
             } , {
                 "data" : "franchisee_CATEGORY"
             },{
                 "data" : "frc_DENOMINATION"
             }, {
                 "data" : "seller_COMM"
             }, {
                 "data" : "sub_comm"
             }, {
                 "data" : "fra_COMM"
             } ,{
                 "data" : "tds_value"
             } , {
                 "data" : "commission_TYPE"
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
			 /* buttons : [ 'csv', 'excel', 'print' ] */
		})
	}
	    function showDetailedTable2(data) {
			$('#applications2').hide();
			var selector = $("#applications2");
			selector.html("");
			selector.append(JSON.stringify(data));
			data = $.parseJSON(selector.text());
			//console.log(data);
			table = $("#employees2").DataTable({ 
				data : data,
				scrollX : true,
				scrollCollapse : true,
				fixedColumns : true,
				
				 "columns" : [ { 
	                 "data" : "circle_NAME"
	             }, {
	                 "data" : "franchisee_SSA"
	             }, {
	                 "data" : "franchisee_NAME"
	             }, {
	                 "data" : "franchisee_NUMBER"
	             }, {
	                 "data" : "franchisee_ID"
	             } , {
	                 "data" : "franchisee_CATEGORY"
	             },{
	                 "data" : "frc_DENOMINATION"
	             }, {
	                 "data" : "trans_COUNT"
	             }, {
	                 "data" : "sell_COMM"
	             }, {
	                 "data" : "sub_FRA_COMM"
	             } ,{
	                 "data" : "fran_COMM"
	             } , {
	                 "data" : "tds_VALUE"
	             } , {
	                 "data" : "tot_TDS"
	             } , {
	                 "data" : "commission_TYPE"
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
				 /* buttons : [ 'csv', 'excel', 'print' ] */
			})
		}
	function submitForm() {
		var isValid = true;//document.forms['frcReport'].checkValidity();

		var zone = $('#zone').val();
		var region = $('#circlehidden').val();
		var city = $('#cityhidden').val();
		var StatusOn = $("input[name='StatusOn']:checked").val();
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
		 if(region == null){
			isValid = false;
			$("#region").focus();
			return false;
		} 
		/*if(city == ""){
			isValid = false;
			$("#city").focus();
			return false;
		}*/
		console.log(zone+"~"+region+"~"+city+"~"+StatusOn+"~"+fromDate+"~"+toDate);
		alert(zone+"~"+region+"~"+city+"~"+StatusOn+"~"+fromDate+"~"+toDate);
		console.log("isValid :: " + isValid);
		alert("isvalied111 ::" + isValid);
		if (isValid) {
			$.ajax({
				url : 'get-all-frcReport',
				type : 'POST',
				dataType : 'json',
				crossDomain : true,
				beforeSend : function(xhr) {
					//Set authentication headers=circlehidden,cityhidden
				},
				data : {
					"zone" 	    : zone,
					"region"    : region,
					"city"	    : city,
					"StatusOn"	: StatusOn,
					"fromDate"	: fromDate,
					"toDate"	: toDate
				},
				success : function(data, textStatus, jqXHR) {
					if (data.error) {
						alert(data.message);
					} else {
						//showDetailedTable(data);
						showDetailedTable2(data);
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
 	<!-- <script type="text/javascript">
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
 	/* function showSummaryTable(data) {
 		$('#summaryTableDiv').hide();
 		var selector = $("#summaryTableDiv");
 		selector.html("");
 		selector.append(JSON.stringify(data));
 		data = $.parseJSON(selector.text());
 		table = $("#summaryTable").DataTable({ 
 			data : data,
 			scrollX : true,
 			scrollCollapse : true,
 			fixedColumns : true,
 			"columns" : [ { */
//-------------------------------


			/* function showSummaryTable(data) {
				$('#detailedTableDiv').show();
				$('#summaryTableDiv').hide();
	            var table = $('#summaryTable').DataTable({
	                "bAutoWidth" : false,
	                "aaData" : data,
	                "columns" : [ { */
	                    "data" : "circle_NAME"
	                }, {
	                    "data" : "franchisee_SSA"
	                }, {
	                    "data" : "franchisee_name"
	                }, {
	                    "data" : "franchisee_NUMBER"
	                }, {
	                    "data" : "franchisee_ID"
	                } , {
	                    "data" : "franchisee_CATEGORY"
	                },{
	                    "data" : "frc_DENOMINATION"
	                }, {
	                    "data" : "seller_COMM"
	                }, {
	                    "data" : "sub_comm"
	                }, {
	                    "data" : "fra_COMM"
	                } , {
	                    "data" : "commission_TYPE"
	                } ],
	                "bDestroy": true,
	                dom: 'Bfrtip',
			        buttons: [
			            'copy', 'csv', 'excel', 'pdf', 'print'
			        ]
	            })
	        }
	        /* function showDetailedTable(data) {
	        	$('#summaryTableDiv').hide();
				$('#detailedTableDiv').show();
	            var table = $('#detailedTable').DataTable({
	                "bAutoWidth" : false,
	                "aaData" : data,
	                "columns" : [ {
	                    "data" : "transDate"
	                }, {
	                    "data" : "region"
	                }, {
	                    "data" : "city"
	                }, {
	                    "data" : "agentMSISDN"
	                }, {
	                    "data" : "agentCategory"
	                } , {
	                    "data" : "agentType"
	                }, {
	                    "data" : "parentMSISDN"
	                }, {
	                    "data" : "destMSISDN"
	                }, {
	                    "data" : "denomination"
	                }, {
	                    "data" : "agentCommission"
	                }, {
	                    "data" : "franchiseComm"
	                } , {
	                    "data" : "subFranchiseNumber"
	                }, {
	                    "data" : "subFranchiseComm"
	                }, {
	                    "data" : "TDSamount"
	                } ],
	                "bDestroy": true,
	                dom: 'Bfrtip',
			        buttons: [
			            'copy', 'csv', 'excel', 'pdf', 'print'
			        ]
	            })
	        } */

			function submitForm() {
				var isValid = true;//document.forms['frcReport'].checkValidity();
				
				var zone = $('#zone').val();
				var region = $('#circlehidden').val();
				var city = $('#cityhidden').val();
				var StatusOn = $("input[name='StatusOn']:checked").val();
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
				if(region == null){
					isValid = false;
					$("#region").focus();
					return false;
				}
				/*if(city == ""){
					isValid = false;
					$("#city").focus();
					return false;
				}*/
				console.log(zone+"~"+region+"~"+city+"~"+StatusOn+"~"+fromDate+"~"+toDate);
				alert(zone+"~"+region+"~"+city+"~"+StatusOn+"~"+fromDate+"~"+toDate);
				
				console.log("isValid :: "+ isValid);
				alert("isvalied111 ::"+isValid);
				if(isValid){
					$.ajax({
						url : 'get-all-frcReport',
						type : 'POST',
						data : {
							"zone" 	    : zone,
							"region"    : region,
							"city"	    : city,
							"StatusOn"	: StatusOn,
							"fromDate"	: fromDate,
							"toDate"	: toDate
						},
						success : function(data, textStatus, jqXHR) {
							if (data.error) {
								alert(data.message);
							} else {
								//showSummaryTable(data);
								showDetailedTable(data);
							}//end else
						}, 
						
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
				}
				else
					return false;
			}
		</script>
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
		</script> -->
</body>
</html>