<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sales Reconciliation </title>
<meta charset="UTF-8">

	  	<meta name="viewport" content="width=device-width, initial-scale=1">
	  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	  	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	  	<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<!-- dataTable - start -->
		<link href='https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css' rel='stylesheet'>
	  	<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
		
		<!-- dataTable - end
		Export Buttons - start -->
		<script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
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
	var url = "getAllWallet";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = changeWallet;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function changeWallet() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		alert("inside wallet : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		// document.getElementById("channelid").innerHTML = xmlHttp.responseText;    WA_ID,WALLET_NAME
		
		  var jsonwallet = JSON.parse(xmlHttp.responseText);
		  console.log("length :: "+jsonwallet.length);
		 $("#wallet").empty();
        var wallet_id = document.getElementById('wallet');
        for (var i = 0; i < jsonwallet.length; i++) {
        	wallet_id.innerHTML = wallet_id.innerHTML +
        	'<option value="' + jsonwallet[i].WA_ID + '">' + jsonwallet[i].WALLET_NAME + '</option>';
        }  
	}
}  
</script><!-- "wa_ID":3,"wallet_NAME":"CBP"},{"wa_ID":1,"wallet_NAME":"CTOPUP"}] -->
		
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
</head>
<body>
	<div class="container" id="addQuestion">
    <div id="blink222">
          <a href="#" class="btn btn-info form-rounded" >Reverse Recharge </a>
    </div>
   <div class="row">
        <div class="cpl-md-6">
           <h3 style="color:green">Reverse Recharge /TopUp transactions Report>>></h3> 
        </div>
        <div class="col-md-6">
        </div>
  </div>
<hr>

	<div class="panel panel-default" style="max-width:500px;margin-left:auto;margin-right:auto;">
            <div class="panel-heading">
                <!-- <h3 class="panel-title text-center">New Plan Add>></h3> -->
            </div>
            <div class="panel-body">
<form action="" method="POST">
			<input type="hidden" id="circlehidden" name="circlehidden" value="">
 	        <input type="hidden" id="cityhidden" name="cityhidden" value="">
 	        
 	        <fieldset class="well">
	           <legend class="well-legend"></legend>
		         <div class="row">
		             <div class="col-sm-6 centered" >
		                <label ></label>
			                <select id="zone" name="zone" class="form-control form-control-sm form-rounded" onchange="showState(this.value);">
			                    <option value='-1'>--select zone--</option>
			                </select>
		             </div>
		             
		          <div class="col-sm-6 centered">
			          <label ></label>
			             	<select  id='state1' name='state' class="form-control form-control-sm form-rounded" onchange="showCity(this.value);" >
			                    	<option value='-1'>--select state--</option>
			                </select>
		            </div>
		         </div>
	        </fieldset>
	        
	        
	        <fieldset class="well">
	           <legend class="well-legend"></legend>
		         <div class="row">
		             <div class="col-sm-6 centered" >
		                <label ></label>
			                <select  id='city1' name='city' class="form-control form-control-sm form-rounded" >
			              		  <option value='-1'>--select city--</option>
			                </select>
		             </div>
		             
		          <div class="col-sm-6 centered">
			          <label ></label>
			            	 <select id="wallet" name="wallet" class="form-control form-control-sm form-rounded">
			                     <option value='-1'>--select wallet--</option>
			                </select>
		            </div>
		         </div>
	        </fieldset>
	        
	        	<fieldset class="well">
	                <legend class="well-legend"></legend>
		               <div class="row">
		                  <div class="col-sm-6 centered" >
			                <label ></label>
			                  <input type="text" class="form-control form-control-sm form-rounded" id="fromDate" name="fromDate"  placeholder="FromDate[00:00:00]" />
		                  </div>
		                 <div class="col-sm-6 centered">
			             <label ></label>
			             <input type="text" class="form-control form-control-sm form-rounded" id="toDate" name="toDate"  placeholder="ToDate[00:00:00]" />
		                </div>
		             </div>
	           </fieldset>
	         <br>
		       <div class="row">
		           <div class="col-sm-6 ">
		               <!-- <button type="submit" class="btn btn-primary btn-block">Search</button> -->
		               <button type="button" class="btn btn-info btn-block" onclick="submitForm()">Search</button>
		           </div>
		           
		           <div class="col-sm-6 ">
			         <button type="submit" class="btn btn-primary btn-block">Reset</button>
		          </div>
		      </div>
 	        
 	      </form>
 	    </div>
 	  </div>
 	  	<div id="salesReconciliationTable" style="padding-top: 15px; display: none; ">
	                <table id="salesReconciliationId" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					          <td>CIRCLE_NAME</td>
			                  <td>SSA_NAME</td>
			                  <td>DENOMINATION</td>
			                  <td>TOT_CNT</td>
			                  <td>TOT_AMT</td>
			                  <td>CIRCLE_NAME</td>
			                  <td>SSA_NAME</td>
			                  <td>DENOMINATION</td>
			                  <td>TOT_CNT</td>
			                  <td>TOT_AMT</td>
			                  <td>CIRCLE_NAME</td>
			                  <td>SSA_NAME</td>
			                  <td>DENOMINATION</td>
			                  <td>TOT_CNT</td>
			                  <td>TOT_AMT</td>
			                  <td>CIRCLE_NAME</td>
			                  <td>SSA_NAME</td>
			                  <td>DENOMINATION</td>
			                  <td>TOT_CNT</td>
					    	</tr>
						</thead>
					</table>
					</div> 
 </div>
 
 	<script type="text/javascript">
       function showSalesReconciliationTable(data) {
		$('#salesReconciliationTable').hide();
   		var selector = $("#salesReconciliationTable");
   		selector.html("");
   		selector.append(JSON.stringify(data));
   		data = $.parseJSON(selector.text());
   		//console.log(data);
   		table = $("#salesReconciliationId").DataTable({ 
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
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
                 "data" : "tot_CNT"
             },  {
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
	                title: 'SalesReconciliation'
	            },
	            {
	                extend: 'csvHtml5',
	                title: 'SalesReconciliation'
	            }
	        ]
		})
	} 
   	function submitForm() {
		var isValid = true;//document.forms['frcReport'].checkValidity();

		var zone = $('#zone').val();
		var region = $('#circlehidden').val(); 
		var city = $('#cityhidden').val();
		var walletid = $('#walletid').val();
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
		console.log(zone + "~" + region + "~" + city + "~" + walletid + "~" + fromDate + "~" + toDate);
		alert(zone + "~" + region + "~" + city + "~" + walletid + "~" + fromDate + "~" + toDate);
		console.log("isValid :: " + isValid);
		alert("isvalied111 ::" + isValid);
		if (isValid) {
			$.ajax({
				url : 'get-all-SalesReconciliation',
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
					"walletid" : walletid,
					"fromDate" : fromDate,
					"toDate" : toDate
				},
				success : function(data, textStatus, jqXHR) {
					if (data.error) {
						alert(data.message);
					} else {
						
							alert("View Success ::");
							showSalesReconciliationTable(data);
						
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