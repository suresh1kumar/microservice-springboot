<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--  <%@ include file="display.jsp" %> --%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KYC || Reports</title>

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
	var url = "getAllZoneListType";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = zoneChange;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function zoneChange() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("inside zone : "+xmlHttp.responseText);
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
</script>
<script language="javascript" type="text/javascript">



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
			/* document.getElementById("state1").innerHTML = xmlHttp.responseText; *//* REGIONID,R_FULLNAME */
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
			  // document.getElementById("city1").innerHTML = xmlHttp.responseText; //CITYID,C_FULLNAME
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
 <style>
#addQuestion{
    align-items: center;
}
.form-rounded {
border-radius: 1rem;
}
.btn-block{
border-radius: 1rem;
}

#blink222 {
  float: right !important;
}


/* #zone {
   
    position: relative; 
    width: 150px;
    padding: 10px;
    margin: 0 auto;
    }
    #state1 {
  
    position: relative; 
    width: 150px;
    padding: 10px;
    margin: 0 auto;
    }
    #city1 {
    
    position: relative;
    width: 150px;
    padding: 10px;
    margin: 0 auto;
    }
     #channelid {
    
    position: relative; 
    width: 150px;
    padding: 10px;
    margin: 0 auto;
    } */
    .panel-default{
    color:blue;
    }
</style>

<style type="text/css">

<style>

html {
  height: 100%;
}
html body {
  height: 100%;
  overflow: hidden;
}
html body .container-fluid.body-content {
  position: absolute;
  top: 50px;
  bottom: 30px;
  right: 0;
  left: 0;
  overflow-y: auto;
}
header {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    background-color: DeepSkyBlue;
    height: 50px;
}
footer {
    position: absolute;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: #4C4;
    height: 30px;
}
</style>
 </head>
<body>

<div class="container" style="max-width:600px;margin:60px auto;">
<header>
<p style="text-align:left">KYC Report >>></p>
</header>
<a href="MNPCommissionReports.jsp">mnp</a>
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">

			<fieldset class="well">
	          <div class="row">
	               <div class="col-sm-4 centered">
	                   <label ></label>
			                <select id="zone" name="zone" class="form-control form-control-sm form-rounded" onchange="showState(this.value);">
			                    <option value='-1'>--select zone--</option>
			                </select>
	              </div>
	              <div class="col-sm-4 centered">
	                 <label ></label>
			             <select  id='state1' name='state' class="form-control form-control-sm form-rounded" onchange="showCity(this.value);" >
			                    <option value='-1'>--select state--</option>
			                </select>
	             </div>
	             <div class="col-sm-4 centered">
	                 <label ></label>
			             <select  id='city1' name='city' class="form-control form-control-sm form-rounded" >
			                <option value='-1'>--select city--</option>
			                </select>
	             </div>
	        </div>
	   </fieldset> 
	   
	   			<fieldset class="well">
	          <div class="row">
	               <div class="col-sm-4 centered">
	                   <label ></label>
			                <input type="text" class="form-control form-control-sm form-rounded" id="msisdn" NAME="msisdn" value="input msisdn">  
	              </div>
	              <div class="col-sm-4 centered">
	                 <label ></label>
			             <label><input type="radio"  id="ReportType" NAME="ReportType"  value="Detailed">&nbsp;&nbsp;&nbsp;&nbsp; Detailed</label>
	             </div>
	             <div class="col-sm-4 centered">
	                 <label ></label>
			             <label><input type="radio" id="ReportType" NAME="ReportType"  value="Summary">&nbsp;&nbsp;&nbsp;&nbsp; Summary</label>
	             </div>
	        </div>
	   </fieldset>

				<fieldset class="well">
	             <div class="row">
	               <div class="col-sm-6 centered">
	                   <label ></label>
			               <input type="text" id="FromDate"  name="FromDate" class="from-control readonly form-rounded" placeholder="From Date" required > 
	              </div>
	              <div class="col-sm-6 centered">
	                 <label ></label>
			             <input type="text" id="ToDate"  name="ToDate" class="from-control readonly form-rounded" placeholder="To Date" required >  
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

</div>
				<br><br><br>
				
	              <div id="summaryTables" style="padding-top: 15px; display: none; "></div>
	                <table id="summaryids" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					          <td>CIRCLE_NAME</td>
			                  <td>SSA_NAME</td>
			                  <td>DENOMINATION</td>
			                  <td>TOT_CNT</td>
			                  <td>TOT_AMT</td>
					    	</tr>
						</thead>
					</table>
					</div> 
					
	                <div id="detailedTables" style="padding-top: 15px; display: none; "></div>
	                <table id="detailedids" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					           <td>TRANSACTIONID</td>
			                   <td>SOURCE_MSISDN</td>
			                   <td>DEST_MSISDN</td>
			                   <td>TRANS_DATE</td> 
			                   <td>DENOMINATION</td> 
			                   <td>FAILURE_REASON</td> 
			                   <td>SUBSCRIBER_CIRCLE</td> 
			                   <td>BAL_BEFORE</td> 
			                   <td>BAL_AFTER</td> 
			                   <td>STATUS</td> 
					    	</tr>
						</thead>
					</table> 
				</div>	 
</div>
 <script type="text/javascript">
       function showSummaryTable(data) {
		$('#detailedTables').hide();
		$('#summaryTables').show();
   		var selector = $("#summaryTables");
   		selector.html("");
   		selector.append(JSON.stringify(data));
   		data = $.parseJSON(selector.text());
   		//console.log(data);
   		table = $("#summaryids").DataTable({ 
   			data : data,
   			scrollX : true,
   			scrollCollapse : true,
   			fixedColumns : true,
   			"columns" : [ {
				data : "circle",
				visible : true
			}, {
                 "data" : "ssa"
             }, {
                 "data" : "denomination"
             }, {
                 "data" : "tot_CNT"
             }, {
                 "data" : "tot_AMT"
             } 
			],
			"bDestroy" : true,
			dom : 'Bfrtip',
			buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'kycReport'
	            },
	            {
	                extend: 'csvHtml5',
	                title: 'kycReport'
	            }
	        ]
		})
	} 
   //------------------------------------------------------------
        function showDetailedTable(data) {
	        	$('#summaryTableDiv').hide();
				$('#detailedTables').show();
   		var selector = $("#detailedTables");
   		selector.html("");
   		selector.append(JSON.stringify(data));
   		data = $.parseJSON(selector.text());
   		//console.log(data);
   		table = $("#detailedids").DataTable({ 
   			data : data,
   			scrollX : true,
   			scrollCollapse : true,
   			fixedColumns : true,
   			"columns" : [ {
   				data : "transactionid"
   			}, {
   				data : "source_msisdn"
   			}, {
   				data : "dmsisdn"
   			}, {
   				data : "transdate"
   			}, {
   				data : "failure_REASON"
   			}, {
   				data : "subscriber_circle"
   			}, {
   				data : "bal_BEFORE"
   			} ,{
   				data : "bal_AFTER"
   			} ,{
   				data : "status"
   			} ,{
   				data : "denomination"
   			} ],
   			"bDestroy" : true,
   			dom : 'Bfrtip',
   			buttons: [
   	            {
   	                extend: 'excelHtml5',
   	                title: 'kycReport'
   	            },
   	            {
   	                extend: 'csvHtml5',
   	                title: 'kycReport'
   	            }
   	        ]
   		})
   	}   
    
	function submitForm() {
		var isValid = true;//document.forms['frcReport'].checkValidity();

		var zone = $('#zone').val();
		var region = $('#circlehidden').val(); 
		var city = $('#cityhidden').val();
		var msisdn = $('#msisdn').val();
		var ReportType1 = $('#ReportType').val();
		var ReportType = $("input[name='ReportType']:checked").val();
		var fromDate = $('#FromDate').val();
		var toDate = $('#ToDate').val();
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
			$("#state1").focus();
			return false;
		} 
		/*if(city == ""){
			isValid = false;
			$("#city").focus();
			return false;
		}*/
		console.log(zone + "~" + region + "~" + city + "~" + ReportType + "~" + fromDate + "~" + toDate);
		alert(zone + "~" + region + "~" + city + "~" + ReportType + "~" + fromDate + "~" + toDate);
		console.log("isValid :: " + isValid);
		alert("isvalied111 ::" + isValid);
		if (isValid) {
			$.ajax({
				url : 'get-all-kycreport',
				type : 'POST',
				dataType : 'json',
				crossDomain : true,
				beforeSend : function(xhr) {
					//Set authentication headers=circlehidden,cityhidden
				},
				data : {
					"region" : region,
					"city" : city,
					"msisdn" : msisdn,
					"ReportType" : ReportType,
					"fromDate" : fromDate,
					"toDate" : toDate
				},
				success : function(data, textStatus, jqXHR) {
					if (data.error) {
						alert(data.message);
					} else {
						
						var ReportType = $("input[name='ReportType']:checked").val();
						
						if(ReportType== "Detailed"){
							alert("ReportType ::"+ReportType);
							showDetailedTable(data);
						
						}else if(ReportType== "Summary"){
							alert("ReportType ::"+ReportType);
							showSummaryTable(data);
						}
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
				$("#FromDate").datepicker(
				{
					dateFormat : "dd/mm/yy",
					maxDate : -1,
					changeMonth: true,
					changeYear: true,
					onClose : function(selectedDate) {
						$("#ToDate").datepicker("option", "minDate", selectedDate);
					}
				});
				$("#ToDate").datepicker(
				{
					dateFormat : "dd/mm/yy",
					minDate : 0,
					maxDate : -1,
					changeMonth: true,
					changeYear: true,
					onClose : function(selectedDate) {
						$("#FromDate").datepicker("option", "maxDate", selectedDate);
					}
				});
			});
		</script>
</body>
</html>
