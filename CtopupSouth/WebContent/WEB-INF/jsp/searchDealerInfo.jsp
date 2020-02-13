<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stock  || Allocation</title>
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
<div class="container " >

    <div id="blink222">
          <a href="#" class="btn btn-info form-rounded" >Stock Allocation</a>
    </div>
   <div class="row">
        <div class="cpl-md-6">
           <h3 style="color:green">Stock Allocation>>></h3> 
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
			                <select id="region" name="region" class="form-control form-control-sm form-rounded" onchange="showCity(this.value);">  
			                    <option value="" disabled selected>- State -</option>
			                </select>
		             </div>
		             
		          <div class="col-sm-6 centered">
			          <label ></label>
			             <select id="city" name="city" class="form-control form-control-sm form-rounded">  
			                    <option value="" disabled selected>- City -</option>
			                </select>
		            </div>
		         </div>
	        </fieldset>
		
		<fieldset class="well">
	              <legend class="well-legend"></legend>
		             <div class="row">
		               <div class="col-sm-6 centered" >
			            <label ></label>
			               <input type="number" class="form-control form-control-sm form-rounded" id="dealerCode" name="dealerCode"   onkeyup=numbersa(this);  placeholder="Input dealerCode[Number<10]" />
		               </div>
		       <div class="col-sm-6 centered">
			      <label ></label>
			         <input type="text" class="form-control form-control-sm form-rounded" id="firstName" name="firstName"  placeholder="Input FirstName[]" />
		       </div>
		   </div>
	     </fieldset>
	     
	     <fieldset class="well">
	              <legend class="well-legend"></legend>
		             <div class="row">
		               <div class="col-sm-6 centered" >
			            <label ></label>
			               <input type="number" class="form-control form-control-sm form-rounded" id="contactNumber" name="contactNumber"   onkeyup=numbersa(this);  placeholder="Input contactNumber[Number<10]" />
		               </div>
		       <div class="col-sm-6 centered">
			      <label ></label>
			         <input type="text" class="form-control form-control-sm form-rounded" id="secondName" name="secondName"  placeholder="Input secondName[]" />
		       </div>
		   </div>
	     </fieldset>
	     
	     <fieldset class="well">
	              <legend class="well-legend"></legend>  
		             <div class="row">
		               <div class="col-sm-6 centered" >
			            <label ></label>
			               <input type="number" class="form-control form-control-sm form-rounded" id="mobileNumber" name="mobileNumber"   onkeyup=numbersa(this);  placeholder="Input MobileNumber[Number<10]" />
		               </div>
		       <div class="col-sm-6 centered">
			      <label ></label>
			         <input type="text" class="form-control form-control-sm form-rounded" id="lastName" name="lastName"  placeholder="Input LastName[]" />
		       </div>
		   </div>
	     </fieldset>
	     
	     <fieldset class="well">
	              <legend class="well-legend"></legend>
		             <div class="row">
		               <div class="col-sm-6 centered" >
			            <label ></label>
			               <input type="number" class="form-control form-control-sm form-rounded" id="authorised" name="authorised"   onkeyup=numbersa(this);  placeholder="Input Authorised[Number<10]" />
		               </div>
		       <div class="col-sm-6 centered">
			      <label ></label>
			         <select  id="Status" name="status"  class="form-control form-control-sm form-rounded" >
			                 <option>--All--</option>
			                <option value="Active">Active</option>
                      		<option value="InActive">InActive</option>
			             </select>
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
	</form>
	</div>
			
</div>

				<hr>
				<br><br><br>
				
				<div id="stockAllocation" style="padding-top: 15px; display: none;">
					<table id="stockAllocationid" class="display" cellspacing="0" width="100%" style="  ">
						<thead>
					    	<tr>
					            <td>Franchise code</td>
								<td>First Name</td>
								<td>Second Name</td>
								<td>Last Name</td>
								<td>Contact Number</td>
								<td>Mobile Number</td>
								<td>Authorised Number</td>
								<td>Status</td>
					    	</tr>
						</thead>
					</table>
				</div>	
</div>

<script type="text/javascript">
	function showStockAllocation(data) {
	$('#stockAllocation').hide();
		var selector = $("#stockAllocation");
		selector.html("");
		selector.append(JSON.stringify(data));
		data = $.parseJSON(selector.text());
		//console.log(data);
		table = $("#stockAllocationid").DataTable({ 
			data : data,
			scrollX : true,
			scrollCollapse : true,
			fixedColumns : true,
			"columns" : [ {
			data : "dealer_CODE",
			visible : true
		}, {
             "data" : "first_NAME"
         },{
             "data" : "second_NAME"
         },{
             "data" : "last_NAME"
         },{
             "data" : "contact_NUMBER"
         },{
             "data" : "mobile_NUMBER"
         },{
             "data" : "authorised_MOBILE_NUMBER"
         },{
             "data" : "dealer_STATUS"
         }
		],
		"bDestroy" : true,
		dom : 'Bfrtip',
		buttons: [
            {
                extend: 'excelHtml5',
                title: 'stockAllocation'
            },
            {
                extend: 'csvHtml5',
                title: 'stockAllocation'
            }
        ]
	})
} 
function submitForm() {
	var isValid = true;//document.forms['frcReport'].checkValidity();
	var zone = $('#zone').val();
	var region = $('#circlehidden').val(); 
	var city = $('#cityhidden').val();
	var dealerCode = $('#dealerCode').val();
	var firstName = $('#firstName').val();
	var contactNumber = $('#contactNumber').val();
	var secondName = $('#secondName').val();
	var mobileNumber = $('#mobileNumber').val();
	var lastName = $('#lastName').val();
	var authorised = $('#authorised').val();
	var Status = $('#Status').val();
	
	/* if (fromDate == "") {
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
	}  */
	/*if(city == ""){
		isValid = false;05/07/2018
		$("#city").focus();
		return false;  //zone + "~" + 
	}*/
	console.log(region + "~" + city + "~" + dealerCode + + "~" + firstName + "~" + contactNumber + "~" + secondName + "~" +  mobileNumber + "~" + lastName  + "~" +  authorised + "~" + Status);
	alert(region + "~" + city + "~" + dealerCode + + "~" + firstName + "~" + contactNumber + "~" + secondName + "~" +  mobileNumber + "~" + lastName  + "~" +  authorised + "~" + Status);

	console.log("isValid :: " + isValid);
	alert("isvalied111 ::" + isValid);
	if (isValid) {
		$.ajax({
			url : 'get-all-StockAllocation',
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
				"dealerCode" : dealerCode,
				"firstName" : firstName,
				"contactNumber" : contactNumber,
				"secondName" : secondName,
				"mobileNumber" : mobileNumber,
				"lastName" : lastName,
				"authorised" : authorised,
				"Status" : Status
			},
			success : function(data, textStatus, jqXHR) {
				if (data.error) {
					alert(data.message);
				} else {
					
						alert("table data print GUI");
						showStockAllocation(data);
					
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
</body>
</html>