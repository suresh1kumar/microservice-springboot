<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reverse Recharge</title>
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
	var url = "getAllStateSingle";
	//url += "?count=" + str;
	xmlHttp.onreadystatechange = showState;  
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
    
});
function showState() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("channel--------------------");
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
function showDescriptionin_Details(str) {

	if (typeof XMLHttpRequest !== "undefined") {
		xmlHttp = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
	}
	if (xmlHttp == null) {
		alert("browser does not supported XMLHTTP request")
		return;
	}
	var url = "getAllDescriptionin_Details";
	url += "?count=" + str;
	xmlHttp.onreadystatechange = changeDescriptionin_Details;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
	
}
function changeDescriptionin_Details() {
	if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
		//alert("inside state : "+xmlHttp.responseText);
		console.log("xmlhttp.responseText :: "+xmlHttp.responseText);
		/* document.getElementById("state1").innerHTML = xmlHttp.responseText; */
		
		var jsonstate = JSON.parse(xmlHttp.responseText);
		$("#descriptionin").empty();
        var descriptioninid = document.getElementById('descriptionin');
        for (var i = 0; i < jsonstate.length; i++) {
        	descriptioninid.innerHTML = descriptioninid.innerHTML +
                '<option value="' + jsonstate[i].in_ID + '">' + jsonstate[i].description + '</option>';
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
    $('#descriptionin').change(function() {
        var cityhid=$('#descriptionin :selected').text();
    	console.log("cityhid :: "+cityhid);
    	$("#descriptioninhidden").val(cityhid);
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

input[type="submit"]:hover {
	background: white;
}
input[type="text"]:hover {
	background: pink;
}
input[type="number"]:hover {
	background: pink;
}
</style>	
<script type="text/javascript">
function setblinkColor()
{
  document.getElementById("blink2").style.background="green"
  setTimeout("blinkColor()",500);
}
</script>		
	<script type="text/javascript">
	   function letter1(input){
		  var regex= /[^a-z]/gi;
		 // alert(regex);
		  input.value=input.value.replace(regex, "");
	  } 
	   function numbersa(input){
			  var regex = /[^0-9]/g;
			  input.value=input.value.replace(regex, "");
		  }
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
		<fieldset class="well">
	           <legend class="well-legend"></legend>
		         <div class="row">
		             <div class="col-sm-6 centered" >
		                <label ></label>
			               <!-- <select id="state1" name="state1" class="form-control form-control-sm form-rounded" onchange="showDescriptionin_Details(this.value);"> -->
			                     <select id="state1" name="state1" class="form-control form-control-sm form-rounded">
			                     <option value='-1'>--select circle--</option>
			                </select>
		             </div>
		             
		          <div class="col-sm-6 centered">
			          <label ></label>
			             <select id="descriptionin" name="descriptionin" class="form-control form-control-sm form-rounded" >
			                     <option value='-1'>--select--</option> 
			                </select>
		            </div>
		                
		          <div class="col-sm-6 centered">
			          <label ></label>
			             <select name="transStatus" id="transStatus" class="form-control form-control-sm form-rounded"> 
                            <!--  <option >--All--</option> -->
                              <OPTION>
                        <span>-Select- </span>
                      </OPTION>
                               <option value="1">Pending</option>
                               <option value="2">Completed</option>
                               <option value="3">Rejected</option>
	                   </select>
		            </div>
		         </div>
	        </fieldset>
	        
	         <fieldset class="well">
	             <legend class="well-legend"></legend>
		             <div class="row">
		                <div class="col-sm-6 centered" >
			                <label ></label>
			                    <input type="number" class="form-control form-control-sm form-rounded" name="srcMobileNumber"  onkeyup=numbersa(this); placeholder="Input Source Mobile Number" />
		                 </div>
		      <div class="col-sm-6 centered">
			      <label ></label>
			         <input type="text" class="form-control form-control-sm form-rounded" name="destMobileNumber"  onkeyup=letter(this); placeholder="Input Destination Mobile Number" />
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
</div><hr>
<br>
				<div id="ReverseRechargeTable" style="padding-top: 15px; display: none; "></div>
	                <table id="ReverseRechargeid" cellspacing="0" width="100%" style=" ">
						<thead>
					    	<tr>
					            <td>Source MSISDN</td>
			                    <td>Destination MSISDN</td>
			                    <td>Amount </td>
			                    <td>Face Value</td>
			                    <td>S.Tax</td>
			                    <td>Transaction Date</td>
			                    <td>Insertion Date</td>
			                    <td>Completion Date</td>
			                    <td>S.Transaction Type</td>
			                    <td>Requested User</td>
			                    <td>User Approved</td>
					    	</tr>
						</thead>
					</table>


</div>

	  <script type="text/javascript">
	    function showReverseRechargeTable(data) {
		$('#ReverseRechargeTable').hide();
		var selector = $("#ReverseRechargeTable");
		selector.html("");
		selector.append(JSON.stringify(data));
		data = $.parseJSON(selector.text());
		//console.log(data);
		table = $("#ReverseRechargeid").DataTable({ 
			data : data,
			scrollX : true,
			scrollCollapse : true,
			fixedColumns : true,
			"columns" : [ {
				data : "src_msisdn",
				visible : true
			}, {
				data : "desc_msisdn"
			}, {
				data : "amount"
			}, {
				data : "reverted"
			}, {
				data : "stax"
			}, {
				data : "trans_date"
			}, {
				data : "comp_date"
			},{
				data : "t_type"
			},{
				data : "remark"
			},{
				data : "user_ins"
			},{
				data : "user_name"
			},{
				data : "ins_DATE"
			} 
			],
			"bDestroy" : true,
			dom : 'Bfrtip',
			buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'reverseRecharge'
	            },
	            {
	                extend: 'csvHtml5',
	                title: 'severseRecharge'
	            }
	        ]
			 /* buttons : [ 'csv', 'excel', 'print' ] */
		})
	}
	function submitForm() {
		var isValid = true;//document.forms['frcReport'].checkValidity();circlehidden,descriptioninhidden
		
		var region = $('#circlehidden').val();
		var IDName = $('#descriptionin').val();
		var transStatus = $('#transStatus').val();
		var srcMobileNumber = $('#srcMobileNumber').val();
		var destMobileNumber = $('#destMobileNumber').val();
		var fromDate = $('#fromDate').val();
		var toDate = $('#toDate').val();
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
			isValid = false;
			$("#city").focus();
			return false;
		}*/
		console.log(region + "~" + IDName + "~" + transStatus + "~" + srcMobileNumber + "~" + destMobileNumber + "~" + fromDate + "~" + toDate);
		alert(region + "~" + IDName + "~" + transStatus + "~" + srcMobileNumber + "~" + destMobileNumber + "~" + fromDate + "~" + toDate);
		console.log("isValid :: " + isValid);
		alert("isvalied111 ::" + isValid);
		if (isValid) {
			$.ajax({
				url : 'get-all-ReverseRchTop3',
				type : 'POST',
				dataType : 'json',
				crossDomain : true,
				beforeSend : function(xhr) {
					//Set authentication headers=circlehidden,cityhidden
				},
				data : {
					"region" : region,
					"IDName" : IDName,
					"transStatus" : transStatus,
					"srcMobileNumber" : srcMobileNumber,
					"destMobileNumber" : destMobileNumber,
					"fromDate" : fromDate,
					"toDate" : toDate
				},
				success : function(data, textStatus, jqXHR) {
					if (data.error) {
						alert("error"+data.message);
					} else {
						alert("suresssssssssssssssss");
						showReverseRechargeTable(data);
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