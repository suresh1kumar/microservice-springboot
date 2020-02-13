<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	
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
	<div class="container" id="addQuestion">
    <div id="blink222"><br>
          <a href="#" class="btn btn-info form-rounded" >MNPCommissionReports</a>
    </div>
   <div class="row">
        <div class="cpl-md-6"><br>
           <h3 style="color:green">MNPCommissionReports >>></h3> 
        </div>
        <div class="col-md-6">
        </div>
  </div>
  	 
  	 <div class="panel panel-default" style="max-width:500px;margin-left:auto;margin-right:auto;">
            <div class="panel-heading">
                <!-- <h3 class="panel-title text-center">New Plan Add>></h3> -->
            </div>
            <div class="panel-body">
<form action="" method="POST">
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">
 	       <br><br><br>
 	        
 	      <!--   <input class="form-control form-control-sm form-rounded" id="mobile" name="mobile" type="number" style="margin-bottom: 4px" placeholder="Dealer Mobile Number[Optional]"> -->
			<fieldset class="well">
	           <legend class="well-legend"></legend>
		         <div class="row">
		             <div class="col-sm-4 centered" >
		                <label ></label>
			                <select id="zone" name="zone" class="form-control form-control-sm form-rounded" onchange="showState(this.value);">
			                    <option value='-1'>--select zone--</option>
			                </select>
		             </div>
		             
		           <div class="col-sm-4 centered">
	                 <label ></label>
			             <select  id='state1' name='state' class="form-control form-control-sm form-rounded" onchange="showCity(this.value);" >
			                    <option value=''>--select state--</option>
			             </select>
	             </div>
	             <div class="col-sm-4 centered">
	                 <label ></label>
			             <select  id='city1' name='city' class="form-control form-control-sm form-rounded" >
			                <option value=''>--select city--</option>
			             </select>
	              </div>
		        </div>
	        </fieldset><br>
	         <input class="form-control form-control-sm form-rounded" id="mobile" name="mobile" type="number" style="margin-bottom: 4px" placeholder="Dealer Mobile Number[Optional]">
			
	        
	        <fieldset class="well">
	           <legend class="well-legend"></legend>
		         <div class="row">
		             <div class="col-sm-4 centered" >
		                <label ></label>
			                <select name="searchType" id="searchType" class="form-control form-control-sm form-rounded" >
			                    <!-- <option value='-1'>--Report Type--</option> -->
			                      <option value="summary">Summary</option>
			                      <option value="detailed">Detailed</option>
			                      <option value="error">Error Report</option>
			                </select>
		             </div>
		             
		           <div class="col-sm-4 centered">
	                 <label ></label>
			             <select  name="status" id="status" class="form-control form-control-sm form-rounded"  >
			                    <!-- <option value='-1'>--Status--</option> -->
			                    <option value="2">Approved</option>
			             </select>
	             </div>
	             <div class="col-sm-4 centered">
	                 <label ></label>
			             <select  name="searchBy" id="searchBy" class="form-control form-control-sm form-rounded" >
			                <!-- <option value='-1'>--Search By--</option> -->
			                <option value="INSERTION_DATE">Insertion Date</option>
                      		<option value="APPROVED_DATE">Approved Date</option>
			             </select>
	              </div>
		        </div>
	        </fieldset><br>
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
	   </fieldset><br>
	   
	   			<div class="row">
					<div class="col-sm-6 ">
						<button type="button" class="btn btn-info btn-block" onclick="submitForm()">Search</button>
					</div>
					<div class="col-sm-6 ">
						<button type="reset" class="btn btn-warning btn-block">Reset</button>
					</div>
				</div>	
</form>
</div>

</div>
<hr>
				<br><br><br>
				
				<div id=summaryHeader style="padding-top: 15px; display: none;">
					<table id="summaryHeaderid" class="display" cellspacing="0" width="100%" style="  ">
						<thead>
					    	<tr>
					            <td>Circle</td>
								<td>City</td>
								<td>Count</td>
								<td>Status</td>
								<td>Stock Allocated</td>
								<td>Cash Received</td>
								<td>Face Value</td>
								<td>Service Tax</td>
								<td>Commission</td>
								<td>Ctopup_TDS</td>
								<td>TDS_San_Soft</td>
					    	</tr>
						</thead>
					</table>
				</div>	 
				
				
				<div id=detailedHeader style="padding-top: 15px; display: none;">
					<table id="detailedHeaderid" class="display" cellspacing="0" width="100%" style="  ">
						<thead>
					    	<tr>
					             <td>Dealer Mobile</td>
								<td>Dealer Code</td>
								<td>Circle</td>
								<td>City</td>
								<td>Approved Date</td>
								<td>Stock Allocated</td>
								<td>Cash Received</td>
								<td>Face Value</td>
								<td>Service Tax</td>
								<td>Commission</td>
								<td>Ctopup_TDS</td>
								<td>TDS_San_Soft</td>
								<td>Inserted Date</td>
					    	</tr>
						</thead>
					</table>
				</div>	 
					
				<div id=errorHeader style="padding-top: 15px; display: none;">
					<table id="errorHeaderid" class="display" cellspacing="0" width="100%" style="  ">
						<thead>
					    	<tr>
					           <td>Seq Id</td>
								<td>Dealer Id</td>
								<td>Dealer Mobile</td>
								<td>Amount</td>
								<td>Description</td>
								<td>Circle</td>
								<td>City</td>
								<td>City</td>
								<td>Insertion Date</td>
								<td>Status</td>
								<td>Service Tax</td>
								<td>Face Value</td>
								<td>Commission Amount</td>
								<td>Cash Received</td>
								<td>Approved Date</td>
					    	</tr>
						</thead>
					</table>
				</div>	 
			
			</div>

<script type="text/javascript">
function showsummaryHeader(data) {
	$('#detailedHeader').show();
	$('#errorHeader').show();
	$('#summaryHeader').hide();
		var selector = $("#summaryHeader");
		selector.html("");
		selector.append(JSON.stringify(data));
		data = $.parseJSON(selector.text());
		//console.log(data);
		table = $("#summaryHeaderid").DataTable({ 
			data : data,
			scrollX : true,
			scrollCollapse : true,
			fixedColumns : true,
			"columns" : [ {
			data : "circle",
			visible : true
		}, {
             "data" : "ssa"
         },{
             "data" : "fab_SEQ"
         },{
             "data" : "status"
         },{
             "data" : "amount"
         },{
             "data" : "cash_RECEIVED"
         },{
             "data" : "face_VALUE"
         },{
             "data" : "service_TAX"
         },{
             "data" : "commission_AMOUNT"
         },{
             "data" : "tds_CTOPUP"
         }, {
             "data" : "tds_SS"
         }
		],
		"bDestroy" : true,
		dom : 'Bfrtip',
		buttons: [
            {
                extend: 'excelHtml5',
                title: 'MNPCommissionReportsSummary'
            },
            {
                extend: 'csvHtml5',
                title: 'MNPCommissionReportsSummary'
            }
        ]
	})
} 

 function showdetailedHeader(data) {
	$('#errorHeader').show();
	$('#detailedHeader').show();
	$('#detailedHeader').hide();
		var selector = $("#detailedHeader");
		selector.html("");
		selector.append(JSON.stringify(data));
		data = $.parseJSON(selector.text());
		//console.log(data);
		table = $("#detailedHeaderid").DataTable({ 
			data : data,
			scrollX : true,
			scrollCollapse : true,
			fixedColumns : true,
			"columns" : [ {
			data : "msisdn",
			visible : true
		}, {
             "data" : "dealer_CODE"
         }, {
             "data" : "circle"
         }, {
             "data" : "ssa"
         }, {
             "data" : "approved_DATE"
         }, {
             "data" : "amount"
         }, {
             "data" : "cash_RECEIVED"
         }, {
             "data" : "face_VALUE"
         }, {
             "data" : "service_TAX"
         }, {
             "data" : "commission_AMOUNT"
         }, {
             "data" : "tds_CTOPUP"
         }, {
             "data" : "tds_SS"
         }, {
             "data" : "insertion_DATE"
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
 
 
function showerrorHeader(data) {
	$('#summaryHeader').show();
	$('#detailedHeader').show();
	$('#errorHeader').hide();
		var selector = $("#errorHeader");
		selector.html("");
		selector.append(JSON.stringify(data));
		data = $.parseJSON(selector.text());
		//console.log(data);
		table = $("#errorHeaderid").DataTable({ 
			data : data,
			scrollX : true,
			scrollCollapse : true,
			fixedColumns : true,
			"columns" : [ {
			data : "fab_SEQ",
			visible : true
		}, {
             "data" : "dealer_Id"
         }, {
             "data" : "msisdn"
         },  {
             "data" : "amount"
         }, {
             "data" : "description"
         } ,{
             "data" : "circle"
         }, {
             "data" : "ssa"
         }, {
             "data" : "insertion_DATE"
         }, {
             "data" : "status"
         }, {
             "data" : "service_TAX"
         }, {
             "data" : "face_VALUE"
         }, {
             "data" : "commission_AMOUNT"
         }, {
             "data" : "cash_RECEIVED"
         },{
             "data" : "approved_DATE"
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
 
function submitForm() {
	var isValid = true;//document.forms['frcReport'].checkValidity();
	/* circlehidden,cityhidden,mobile,searchType,status,searchBy,FromDate,ToDate */
	var zone = $('#zone').val();
	var region = $('#state1').val(); 
	var city = $('#city1').val();
	var msisdn = $('#mobile').val();
	var searchType = $('#searchType').val();
	var status = $('#status').val();
	var searchBy = $('#searchBy').val();
	
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
		isValid = false;05/07/2018
		$("#city").focus();
		return false;
	}*/
	console.log(zone + "~" + region + "~" + city + "~" + msisdn + + "~" + searchType + "~" + status + "~" + searchBy + "~" +  fromDate + "~" + toDate);
	alert(zone + "~" + region + "~" + city + "~" + msisdn + "~" + searchType + "~" + status +  "~" + searchBy + "~" +  fromDate + "~" + toDate);
	console.log("isValid :: " + isValid);
	alert("isvalied111 ::" + isValid);
	if (isValid) {
		$.ajax({
			url : 'get-all-MNPCommissionReports',
			type : 'POST',
			dataType : 'json',
			crossDomain : true,
			beforeSend : function(xhr) {
				//Set authentication headers=circlehidden,cityhidden
			},
			data : {
				"zone" : zone,
				"region" : region,
				"city" : city,
				"msisdn" : msisdn,
				"searchType" : searchType,
				"status" : status,
				"searchBy" : searchBy,
				"fromDate" : fromDate,
				"toDate" : toDate
			},
			success : function(data, textStatus, jqXHR) {
				if (data.error) {
					alert(data.message);
				} else {
					
					var searchType = $('#searchType').val();
					var status = $('#status').val();
					var searchBy = $('#searchBy').val();
					
					if(searchType== "summary"){
						alert("searchType ::"+searchType);
						showsummaryHeader(data);
					
					}else if(searchType== "detailed"){
						alert("searchType ::"+searchType);   
						showdetailedHeader(data);
						
					}else if(searchType== "error"){
						alert("searchType ::"+searchType);
						showerrorHeader(data);
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
					dateFormat : "dd-mm-yy",
					maxDate : -1,
					changeMonth: true,
					changeYear: true,
					onClose : function(selectedDate) {
						$("#ToDate").datepicker("option", "minDate", selectedDate);
					}
				});
				$("#ToDate").datepicker(
				{
					dateFormat : "dd-mm-yy",
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



