<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Channel || Report</title>
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
		
		<!-- <style type="text/css">
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

		</style>  -->
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
	var url = "getAllChannel";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = cityChange1;  
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function cityChange1() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("channel--------------------");
		//alert("inside channel : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		// document.getElementById("channelid").innerHTML = xmlHttp.responseText; 
		
		  var jsonchannel = JSON.parse(xmlHttp.responseText);
		  console.log("length :: "+jsonchannel.length);
		  console.log("one val :: "+jsonchannel[1].req_type);
		 $("#channelid").empty();
        var channel_id = document.getElementById('channelid');
        for (var i = 0; i < jsonchannel.length; i++) {
        	channel_id.innerHTML = channel_id.innerHTML +
        	'<option value="' + jsonchannel[i].req_type + '">' + jsonchannel[i].request_FROM + '</option>';
        }  
	}
}  
</script>
 <script language="javascript" type="text/javascript">

 //===========================================
	 function showZone(str) {
alert("zone:")
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
		url += "?count=" + str;
		xmlHttp.onreadystatechange = zoneChange;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);
		
	}
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
</style>
</head>
<body>
<div class="container" style="max-width:600px;margin:60px auto;">
<header>
<p style="text-align:left">Channel Wise Report >>></p>
</header>
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">

		<fieldset class="well">
	          <div class="row">
	               <div class="col-sm-6 centered">
	                   <label ></label>
			                <select id="channelid" name="channelid" class="form-control form-control-sm form-rounded" onchange="showZone(this.value);">
			                     <option value='-1'>--select channel--</option>
			                </select>
	              </div>
	              <div class="col-sm-6 centered">
	                 <label ></label>
			             <select id="zone" name="zone" class="form-control form-control-sm form-rounded" onchange="showState(this.value);">
			                    <option value='-1'>--select zone--</option>
			             </select>
	             </div>
	        </div>
	   </fieldset> <br>
	   
	   <fieldset class="well">
	          <div class="row">
	               <div class="col-sm-6 centered">
	                   <label ></label>
			               <select  id='state1' name='state1' class="form-control form-control-sm form-rounded"  onchange="showCity(this.value);" >
			                    <option value='-1'>--select state--</option>
			                </select>
	              </div>
	              <div class="col-sm-6 centered">
	                 <label ></label>
			             <select  id='city1' name='city1' class="form-control form-control-sm form-rounded" >
			                <option value='-1'>--select city--</option>
			             </select>
	             </div>
	        </div>
	   </fieldset><br>
	   
	   	<fieldset class="well">	
	       <div class="row">
	         <div class="col-sm-6 centered">
	            <label> <input type="radio" name="SearchOn"  id="SearchOn" value="2" checked="checked">&nbsp;&nbsp;&nbsp;&nbsp;Success</label>
	         </div>
	        <div class="col-sm-6 centered">
	            <label><input type="radio" name="SearchOn" id="SearchOn" value="-2">&nbsp;&nbsp;&nbsp;&nbsp;Cancel</label>
	        </div></div>
	  </fieldset>
	
		<fieldset class="well">	
	        <div class="row">
	           <div class="col-sm-6 centered">
	              <label> <input TYPE="radio" NAME="searchType1" value="CurrentDay"  id="searchType1" checked="checked" onClick="disableStatus2();">&nbsp;&nbsp;&nbsp;&nbsp;Current</label>
	         </div>
	       <div class="col-sm-6 centered">
	             <label><input TYPE="radio" NAME="searchType1" value="N"  id="searchType1" onClick="disableStatus1();" >&nbsp;&nbsp;&nbsp;&nbsp;Old Date</label>
	       </div></div>
	   </fieldset>
	   
			<div class="row" id="dateblock" style="display: none;">
			 <fieldset class="well">
	             <div class="row">
	               <div class="col-sm-6 centered">
	                   <label ></label>
			               <input type="text" id="fromDate"  name="fromDate" class="form-control form-control-sm form-rounded " placeholder="From Date" required >
	              </div>
	              <div class="col-sm-6 centered">
	                 <label ></label>
			             <input type="text" id="toDate"  name="toDate" class="form-control form-control-sm form-rounded " placeholder="To Date" required > 
	             </div>
	        </div>
	   </fieldset>
				</div><br>
				
				
				<div class="row">
		           <div class="col-sm-6 ">
		               <button type="button" class="btn btn-primary btn-block form-rounded" id="sub" onclick="submitForm()">OK</button>
		           </div>
		           
		           <div class="col-sm-6 ">
		           <button type="reset" class="btn btn-warning btn-block form-rounded" id="res">Reset</button>
		          </div>
		      </div>

</div>
<hr>
    
	       	
	       	
	



<!-- ======================================================================================================================================================= -->
<!-- <div class="container " >
			<h5 style="margin-bottom: 20px">Channel Wise Report >>></h5>
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">
 	        
			<fieldset class="well">
	    			<legend class="well-legend" style="padding-top: 2px">By Area</legend>
					<div class="row">
					<div class="col-sm-6">
							<select id="channelid" name="channelid" onchange="showZone(this.value);">
			                     <option value='-1'>--select channel--</option>
			                </select>
						</div>
						<div class="col-sm-6">
							<select id="zone" name="zone" onchange="showState(this.value);">
			                    <option value='-1'>--select zone--</option>
			                </select>
						</div>
					</div>
				</fieldset>	
				<fieldset class="well">
	    			<legend class="well-legend" style="padding-top: 2px">By Area</legend>
					<div class="row">
					<div class="col-sm-6">
							<select  id='state1' name='state1'  onchange="showCity(this.value);" >
			                    <option value='-1'>--select state--</option>
			                </select>
						</div>
						<div class="col-sm-6">
							<select  id='city1' name='city1'  >
			                <option value='-1'>--select city--</option>
			                </select>
						</div>
					</div>
				</fieldset>	
				<fieldset class="well">
	    			<legend class="well-legend">Success Cancle Data</legend>
					<div class="row">
						<div class="col-sm-6">
							<label class="radio-inline ">
								<input type="radio" name="SearchOn"  id="SearchOn" value="2" checked="checked">success
							</label>
						</div>
						<div class="col-sm-6">
						<label class="radio-inline ">
							<input type="radio" name="SearchOn" id="SearchOn" value="-2">cancle
						</label>
						</div>
					</div>
				</fieldset>	
				<fieldset class="well">
	    			<legend class="well-legend">Current Old Data</legend>checked="checked"
					<div class="row">
						<div class="col-sm-6">
							<label class="radio-inline ">
								<input type="radio" name="searchType1" value="CurrentDay"  id="searchType1"  onClick="disableStatus2();">Current
								<input TYPE="radio" NAME="searchType1" value="CurrentDay"  id="searchType1" checked="checked" onClick="disableStatus2();" >Current
							</label>
						</div>
						<div class="col-sm-6">
						<label class="radio-inline ">
							<input type="radio" name="searchType1" value="N"  id="searchType1" onClick="disableStatus1();">Old Date
							<input TYPE="radio" NAME="searchType1" value="N"  id="searchType1" onClick="disableStatus1();" >Old Date
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
						<button type="button" class="btn btn-info btn-block" onclick="submitForm()">OK</button>
					</div>
					<div class="col-sm-6 ">
						<button type="reset" class="btn btn-warning btn-block">Reset</button>
					</div>
				</div>	
				<br><br><br> -->
				<!-- <div id=applications style="padding-top: 15px; display: none;">
					<table id="employees" class="display" cellspacing="0" width="100%" style="  "> -->
					
					<div id="applications" style="padding-top: 15px; display: none; "></div>
	                <table id="employees" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					            <td>DATE1</td>
			                    <td>SOURCE_CIRCLENAME</td>
			                    <td>SSA_NAME</td>
			                    <td>SOURCE_MSISDN</td>
			                    <td>DEST_MSISDN</td>
			                    <td>AMOUNT</td>
			                    <td>TRANSACTION_TYPE</td>
			                    <td>STATUS1</td>
			                    <td>SOURCE_BALANCE_BEFORE</td>
			                    <td>SOURCE_BALANCE_AFTER</td>
			                    <td>DEST_BALANCE_BEFORE</td>
			                    <td>DEST_BALANCE_AFTER</td>
			                    <td>DEST_CIRCLE_NAME</td>
					    	</tr>
						</thead>
					</table>
				<!-- </div> -->
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
				data : "create_stmt",
				visible : true
			}, {
				data : "circlename"
			}, {
				data : "cityname"
			}, {
				data : "sourcemsisdn"
			}, {
				data : "descmsisdn"
			}, {
				data : "amount"
			}, {
				data : "transaction_type"
			} ,{
				data : "status"
			} ,{
				data : "source_balance_before"
			} ,{
				data : "source_balance_after"
			} ,{
				data : "dest__balance_before"
			} ,{
				data : "dest__balance_after"
			} ,{
				data : "source_circlename"
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

		//var SearchOn = $('#SearchOn').val();
		var SearchOn = $("input[name='SearchOn']:checked").val();
		var region = $('#state1').val();
		var city = $('#city1').val();
		var channelid = $('#channelid').val();
		//var searchType1 = $('#searchType1').val();
		var searchType1 = $("input[name='searchType1']:checked").val();
		var zone = $('#zone').val();
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
			$("#state1").focus();
			return false;
		} 
		/*if(city == ""){
			isValid = false;
			$("#city").focus();
			return false;
		}*/
		console.log(SearchOn + "~" + region + "~" + city + "~" + channelid + "~" + searchType1 + "~" + zone + "~" + fromDate + "~" + toDate);
		alert(SearchOn + "~" + region + "~" + city + "~" + channelid + "~" + searchType1 + "~" + zone + "~" + fromDate + "~" + toDate);
		console.log("isValid :: " + isValid);
		alert("isvalied111 ::" + isValid);
		if (isValid) {
			$.ajax({
				url : 'get-all-channels',
				type : 'POST',
				dataType : 'json',
				crossDomain : true,
				beforeSend : function(xhr) {
					//Set authentication headers=circlehidden,cityhidden
				},
				data : {
					"SearchOn" : SearchOn,
					"region" : region,
					"city" : city,
					"channelid" : channelid,
					"searchType1" : searchType1,
					"zone" : zone,
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