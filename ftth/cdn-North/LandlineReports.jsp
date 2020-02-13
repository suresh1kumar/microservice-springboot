<%@ page language="java" import="java.util.*,com.mobitec.Mvoucher.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="LandLine.report">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LandLine || Report</title>
<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is Vanity Numbers page">
		<LINK rel="stylesheet" type="text/css" href="Mvochercss.css">
<link href='http://www.mostlikers.com/favicon.ico' rel='icon' type='image/x-icon'/>
    <!--Bootstrap CSS --> 
    <link href="datajs/css/bootstrap.min.css" rel="stylesheet">
    <link href="datajs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="datajs/css/custom-style.css" rel="stylesheet">

        <link href="datajs/css/w3.css" rel="stylesheet">
        <link href="datajs/css/jquery-ui.css" rel="stylesheet">
    <script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
    <!--/Bootstrap CSS --> 
    
    <!--JQuery DataTables--> 
   <script src="datajs/js/angularjs/jquery-1.12.4.js"></script>
    <script src="datajs/js/angularjs/jquery-ui.js"></script>
    
    <!-- <script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script> -->
    <script src="datajs/js/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="datajs/js/dataTables/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="datajs/js/dataTables/dataTables.bootstrap.min.js"></script>
    <!--/JQuery DataTables --> 
    
    <!--Angualrjs --> 
        <script type="text/javascript" src="datajs/js/angularjs/angular.min.js"></script>
        <script type="text/javascript" src="datajs/js/angularjs/angular-export.js"></script>
        <script type="text/javascript" src="datajs/js/angularjs/angular-datatables.min.js"></script>
        <style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}
</style>
		<STYLE>
    .TA {scrollbar-3dlight-color:black;
           scrollbar-arrow-color:black;
           scrollbar-base-color:#f8f8f8;
           scrollbar-darkshadow-color:#f8f8f8;
           scrollbar-face-color:#f0f0f0;
           scrollbar-highlight-color:#f8f8f8;
           scrollbar-shadow-color:black}
    </STYLE>
		<LINK rel="stylesheet" type="text/css" href="Mvochercss.css">
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
.ui-datepicker {
   background: #2c5893;
   border: 1px solid #0577cd;
   color: #333;
}

/* container size setting*/
.container {
   padding-right: 25px;
   padding-left: 25px;
   margin-right: auto;
   margin-left: auto;
   max-width: 700px;
   overflow:hidden;
   min-height:0px;
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
<style>
/* .button {
 background-color: #0639D3; 
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 10px;
  margin: 4px 2px;
  cursor: pointer;
  
} */
body {background-color: #E0E0E0;}
/* .button5 {border-radius: 50%;}
#exportable{
overflow-y:scroll;
height:400px;}
 */
 .ui-datepicker {
   background: #2c5893;
   border: 1px solid #0577cd;
   color: #333;
}
</style>
        
       
        
 <script type="text/javascript">
	var app=angular.module("LandLine.report",['datatables','export.csv']);
	app.controller("LandLine.report",
			['$scope','$window','$http',
				function($scope,$window,$http){
				
				$('#Sales').hide();
				$('#Detailed').hide();
				$('#Commission').hide();
				$('#ex1').hide();
				$('#ex2').hide();
				$('#ex3').hide();
				//------------------for date picker end---------------------- 
		          $(function() {
					$("#fromDate").datepicker(
					{
						dateFormat : "dd-mm-yy",
						maxDate : 0,
						//changeMonth: true,
						//changeYear: true,
						onClose : function(selectedDate) {
							$("#toDate").datepicker("option", "minDate", selectedDate);
						}
					});
					$("#toDate").datepicker(
					{
						dateFormat : "dd-mm-yy",
						minDate : 0,
						maxDate : 0,
						//changeMonth: true,
						//changeYear: true,
						onClose : function(selectedDate) {
							$("#fromDate").datepicker("option", "maxDate", selectedDate);
						}
					});
				});
			 $scope.LandLineDetails=function(){
				 //zoneName,regionName,cityName
				// var zoneName=$scope.country;
				//  var regionName=$scope.state;
				//  var cityName=$scope.city;
				//  var SearchOn=$scope.SearchOn;
				  var FilterOn=$scope.FilterOn;
				  var fromDate=$scope.fromDate;
				  var toDate=$scope.toDate;
				  
				 // alert("zoneName::"+zoneName);
				 // alert("regionName::"+regionName);
				 // alert("cityName::"+cityName);
				  
				  //alert("SearchOn::"+SearchOn);
				 // alert("FilterOn::"+FilterOn);
				 // alert("fromDate::"+fromDate);
				  //alert("toDate::"+toDate);
				  console.log("date ::):"+$scope.fromDate); 
				$http({
					url:"../../LandlineSalesReportController",
					method:"get",
					params:{
						//"zoneName" : $scope.country,
						//"regionName" : $scope.state,
						//"cityName" : $scope.city,
						"SearchOn" : $scope.SearchOn,
						"FilterOn" : $scope.FilterOn,
						"msisdn" : $scope.msisdn,
						"fromDate" : $scope.fromDate,
						"toDate" : $scope.toDate
					}
				}).then(function(result){
					var SearchOn=$scope.SearchOn;
					$window.alert("SearchOn::"+SearchOn);
					if(SearchOn == "SalesTransaction"){
						
						$scope.jsonLandLineListSales=result.data;
						$('#Sales').show();
						$('#ex1').show();
						$('#Detailed').hide();
						$('#Commission').hide();
						$('#ex2').hide();
						$('#ex3').hide();
					}else if(SearchOn == "DetailedTransaction"){
						$scope.jsonLandLineListDetailed=result.data;
						$('#Detailed').show();
						$('#ex2').show();
						$('#Sales').hide();
						$('#Commission').hide();
						$('#ex1').hide();
						$('#ex3').hide();
					}else if(SearchOn == "CommissionReport"){  
						
						$scope.jsonLandLineListCommission=result.data;
						$('#Commission').show();
						$('#ex3').show();
						$('#Sales').hide();
						$('#Detailed').hide();
						$('#ex1').hide();
						$('#ex2').hide();
					}
					
				},function(result){
					$window.alert("failure"+result.status);
				});
			}
			//-------------------------------------- for zoneal
				/* $scope.loadCountry=function(){
			    	  alert("country :: Block");
					$http({
						url:"../../ZonalInfoController",
						method:"get",
						params:{
							"zoneId" : $scope.zoneName
						}
					}).then(function(result){
						alert("Country Success block");
						$scope.countries = result.data; 
						
					},function(result){
						$window.alert("failure"+result.status);
					});
					
				}
			      $scope.loadState=function(){
			    	  //alert("Region :: Block");
			    	  var zid=$scope.zoneName;
			    	  alert("counstate ::"+zid);
					$http({
						url:"../../RegionInfoController",
						method:"get",
						params:{
							"zoneId" : $scope.zoneName
						}
					}).then(function(result){
						//alert("State Success block");
						$scope.states = result.data; 
						
					},function(result){
						$window.alert("failure"+result.status);
					});
					
				}
			      $scope.loadCity=function(){
			    	  alert("City :: Block");
			    	  var zid=$scope.zoneName;
			    	  var regionid=$scope.regionName;
			    	  alert("counstate ::"+zid);
			    	  alert("regionid ::"+regionid);
					$http({
						url:"../../CityInfoController",
						method:"get",
						params:{
							"zoneId" : $scope.zoneName,
							"regionId" : $scope.regionName
						}
					}).then(function(result){
						//alert("success city block");
						$scope.citys = result.data; 
						
					},function(result){
						$window.alert("failure"+result.status);
					});
					
				}; */
				
			//-------------------------------------- for zoneal
				/* $scope.loadCountry=function(){
			    	 // alert("country :: Block");
					$http({
						url:"../../ZonalInfoController",
						method:"get",
						params:{
							"zoneId" : $scope.country
						}
					}).then(function(result){
						//alert("Country Success block");
						$scope.countries = result.data; 
						
					},function(result){
						$window.alert("failure"+result.status);
					});
					
				}
			      $scope.loadState=function(){
			    	  //alert("Region :: Block");
			    	  var zid=$scope.country;
			    	  //alert("counstate ::"+zid);
					$http({
						url:"../../RegionInfoController",
						method:"get",
						params:{
							"zoneId" : $scope.country
						}
					}).then(function(result){
						//alert("State Success block");
						$scope.states = result.data; 
						
					},function(result){
						$window.alert("failure"+result.status);
					});
					
				}
			      $scope.loadCity=function(){
			    	  //alert("City :: Block");
			    	  var zid=$scope.country;
			    	  var regionid=$scope.state;
			    	  //alert("counstate ::"+zid);
			    	  //alert("regionid ::"+regionid);
					$http({
						url:"../../CityInfoController",
						method:"get",
						params:{
							"zoneId" : $scope.country,
							"regionId" : $scope.state
						}
					}).then(function(result){
						//alert("success city block");
						$scope.citys = result.data; 
						
					},function(result){
						$window.alert("failure"+result.status);
					});
					
				}; */
		//DisableDealer
			/* function DisableDealer(){   //AllDealers,FilterOn   
		  		   alert("11111111");
				  if(document.getElementById("FilterOn").value=="AllDealers"){
					  alert("Disable msisdn & ChooseDealerType!!");
				      document.getElementById("msisdn").disabled = true;
				  } else {
					 alert("Enable msisdn & ChooseDealerType!!");
				    document.getElementById("msisdn").disabled = false;
				  } 
				} */
				
			//	toDate,fromDate,msisdn,FilterOn,SearchOn,country,state,city
				/* var oriPerson = angular.copy($scope.country,$scope.state,$scope.city,$scope.SearchOn,$scope.FilterOn,$scope.msisdn,$scope.fromDate,$scope.toDate);
			   	 $scope.resetForm = function ()
			   	 {
			     	 $scope.country = angular.copy(oriPerson);
					 $scope.state = angular.copy(oriPerson);
					 $scope.city = angular.copy(oriPerson);
					 $scope.SearchOn = angular.copy(oriPerson);
					 $scope.FilterOn = angular.copy(oriPerson);
					 $scope.msisdn = angular.copy(oriPerson);
					 $scope.fromDate = angular.copy(oriPerson);
					 $scope.toDate = angular.copy(oriPerson);
					 
			      	$scope.LandLineReports.$setPristine();
			    	};

			    	$scope.isPersonChanged = function ()
			    	{
			      	return !angular.equals($scope.country,$scope.state,$scope.city,$scope.SearchOn,$scope.FilterOn,$scope.msisdn,$scope.fromDate,$scope.toDate, oriPerson);
			    }; */
			}]); 
			
</script>
<script type="text/javascript">
function DisableDealer(){   //AllDealers,FilterOn   
	 // alert("ddddddddddd");
	  if(document.getElementById("FilterOn").value=="AllDealers"){
		  //alert("Disable msisdn & ChooseDealerType!!");
	      document.getElementById("msisdn").disabled = true;
	  } else {
		 //alert("Enable msisdn & ChooseDealerType!!");
	    document.getElementById("msisdn").disabled = false;
	  } 
	} 
	
function DisableSummary(){   //AllDealers,FilterOn   
	  
	  if(document.getElementById("SearchOn").value=="SalesTransaction"){
		  //alert("Disable msisdn & ChooseDealerType!!");
	      document.getElementById("FilterOn").disabled = true;
	  } else {
		 //alert("Enable msisdn & ChooseDealerType!!");
	    document.getElementById("FilterOn").disabled = false;
	  } 
	}
/* function zoneCode()
{
	 var regNam=document.LandLineReports.SearchOn.value;
	  //var cityNam=document.LandLineReports.cityName.value;
	  document.LandLineReports.action="LandlineReports.jsp?SearchOn="+regNam"";
	  document.LandLineReports.method = "post";
	  document.LandLineReports.submit();
	  return true;
} */
function regionCode()
{
  document.LandLineReports.action="LandlineReports.jsp?apply=select";
  document.LandLineReports.method = "post";
  document.LandLineReports.submit();
  return true;
}
 function regionCode2()
{
  var regNam=document.LandLineReports.regionName.value;
  var cityNam=document.LandLineReports.cityName.value;
  document.LandLineReports.action="LandlineReports.jsp?strcityNam="+cityNam+"&strregNam="+regNam+"";
  document.LandLineReports.method = "post";
  document.LandLineReports.submit();
  return true;
}
 function cityCode()
{
	 //alert("city9999999999999");
  var regNam=document.LandLineReports.regionName.value;
  //var cityNam=document.Distribution.cityName.value;
  //document.Distribution.action="SalesReconciliation.jsp?strcityNam="+cityNam+"&strregNam="+regNam+"";
  //document.Distribution.method = "post";
  //document.Distribution.submit();
  if(regNam == '')
    alert("Please select Circle before SSA");
  return true;
}
 function resetall(){
		//	document.sms.radio1.checked=true;
		//regionName,cityName,SearchOn,FilterOn,msisdn,strFromDate,strToDate
          document.LandLineReports.regionName.value="";
          document.LandLineReports.cityName.value="";
			document.LandLineReports.SearchOn.value="";
			document.LandLineReports.FilterOn.value="";
			
			document.LandLineReports.msisdn.value="";
			document.LandLineReports.strFromDate.value="";
			document.LandLineReports.strToDate.value="";
			window.document.LandLineReports.action = "LandlineReports.jsp";
			window.document.LandLineReports.method = "post";
			window.document.LandLineReports.submit();
	return true;
}
 function display_c(){
	 var refresh=1000; // Refresh rate in milli seconds
	 mytime=setTimeout('display_ct()',refresh)
	 }

	 function display_ct() {
	 var x = new Date().toLocaleString()
	 //var x = (new java.util.Date()).toLocaleString()
	 document.getElementById('ct').innerHTML = x;
	 display_c();
	  }
 /* function Validate() {
     var ddlFruits = document.getElementById("ddlFruits");
     if (ddlFruits.value == "") {
         //If the "Please Select" option is selected display error.
         alert("Please select an option!");
         return false;
     }
     return true;
 } */
</script>

</head>


<%
String strzoneName = request.getParameter("zoneName");      
String strregNam = request.getParameter("regionName");//zoneName,regionName,cityName
String strcityNam = request.getParameter("cityName");

System.out.println("*************************<< jsp page >>****************************************");
System.out.println("zone name jsp ::"+strzoneName);
System.out.println("region name jsp::"+strregNam);
System.out.println("city name jsp::"+strcityNam);

	String strFromDate = request.getParameter("strFromDate");//strFromDate,strToDate,FilterOn
	String SearchOn = request.getParameter("SearchOn");
	String strToDate = request.getParameter("strToDate");
	System.out.println("strFromDate jsp ::"+strFromDate);
	//System.out.println("strToDate jsp::"+strToDate);
	
	String strFlag = request.getParameter("flag");
	//String strregNam = request.getParameter("strregNam");
	//String strcityNam = request.getParameter("strcityNam");
	String strwalletName=request.getParameter("strwalletName");
  	String strAuthNum = "", zoneName = "", regionName = "", cityName = "", zoneId = "",userName="";
  	String zoneFname = "", zoneSname = "", regionId = "", regionFname = "", regionSname = "", cityId = "", cityFname = "", citySname = "";
  	String info = "", regionInfo = "", cityInfo = "", dealerCode = "", region = ""; 
  	StringTokenizer stInfo1 = null;
  	StringTokenizer stInfo = null, reg1 = null;
  	String regionId1="";
  	String cityId1="";
  	AddDealerInfo addInfo = new AddDealerInfo();
  	userName = (String) session.getAttribute("user_id");
  	String zoneInfo = addInfo.getZoneInfo(userName);
  	stInfo = new StringTokenizer(zoneInfo, "~");
  	zoneId = stInfo.nextToken();
  	regionId = stInfo.nextToken();
  	//regionId="1";
  	cityId = stInfo.nextToken();
  	//cityId="1";
  	 if (regionId.equals("0") && (cityId.equals("0")) && (!zoneId.equals("0"))) {    

  		info = addInfo.getInfo1(zoneId);
  		stInfo = new StringTokenizer(info, "#");
  		zoneFname = stInfo.nextToken();
  		zoneSname = stInfo.nextToken();
  		regionInfo = addInfo.getInfo2(zoneId);     
  		cityInfo = addInfo.getInfo3(zoneId, strregNam);
  		//dealerCode=addInfo.getDealerCode1(zoneName,regionName,cityName,zoneId,regionId,cityId);
  		//reg1=new StringTokenizer(dealerCode,"~/");
  		//while(reg1.hasMoreTokens())
  		//{
  		//region=reg1.nextToken();
  		// }
  	}
  	if (cityId.equals("0") && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
  		info = addInfo.getInfo(zoneId, regionId);
  		cityInfo = addInfo.getcityInfo(zoneId, regionId);
  		stInfo = new StringTokenizer(info, "#");   
  		zoneFname = stInfo.nextToken();
  		zoneSname = stInfo.nextToken();
  		regionFname = stInfo.nextToken();
  		regionSname = stInfo.nextToken();
  		strregNam = regionFname;
  		stInfo = new StringTokenizer(cityInfo, "#");
  	}

  	//out.println(strcityNam);

  	if ((!zoneId.equals("0")) && (!regionId.equals("0")) && (!cityId.equals("0"))) {
  		// out.println("in zoneinfo");

  		info = addInfo.getInfo4(zoneId, regionId, cityId);
  		stInfo = new StringTokenizer(info, "#");
  		zoneFname = stInfo.nextToken();
  		zoneSname = stInfo.nextToken();
  		regionFname = stInfo.nextToken();
  		regionSname = stInfo.nextToken();
  		cityFname = stInfo.nextToken();
  		citySname = stInfo.nextToken();

  		strregNam = regionFname;
  		strcityNam = cityFname;

  		//dealerCode=zoneSname+"~"+regionSname+"~"+citySname;
  		//reg1=new StringTokenizer(dealerCode,"~/");
  		// while(reg1.hasMoreTokens())
  		//{
  		// region=reg1.nextToken();
  		//}
  	} 
  	//session.setAttribute( "theName", name );
  	//session.setAttribute("zoneId", zoneId);
  	//session.setAttribute("regionId", regionId);
  	//session.setAttribute("cityId", cityId);
  	
  	session.setAttribute("strzoneName", strzoneName);
  	session.setAttribute("strregNam", strregNam);
  	session.setAttribute("strcityNam", strcityNam);
  %>
<body ng-controller="LandLine.report" ng-init="loadCountry()" onload=display_ct();>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" align="left"><b>Land Line Report >>></b></a>
    </div>
    <ul class="nav navbar-nav">                                                                <!--  jsonLandLineListDetailed,jsonLandLineListCommission     -->                           
      <li class="active"> <a class="btn btn-success" data-toggle="tooltip" data-placement="top" title="Land Line Summary Report csv!!" align="right" id="ex1" export export-data="jsonLandLineListSales" export-title="'Landline Report'">Download</a></li>
      <li class="active"> <a class="btn btn-success" data-toggle="tooltip" data-placement="top" title="Land Line Detailed Report csv!!" align="right" id="ex2" export export-data="jsonLandLineListDetailed" export-title="'Landline Report'">Download</a></li>
      <li class="active"> <a class="btn btn-success" data-toggle="tooltip" data-placement="top" title="Land Line Commission Report csv!!" align="right" id="ex3" export export-data="jsonLandLineListCommission" export-title="'Landline Report'">Download</a></li>
      
    </ul>
  </div>
</nav>

<div class = "w3-row " id="containerFORM">
<label  class="w3-text-blue pull-center"><b>From Date : </b><span class="w3-text-red ">{{fromDate}}</span><b>,   To Date : </b><span class="w3-text-red ">{{toDate}}</span></label>
<label  class="w3-text-blue pull-right"><b>Date : </b><span id='ct' class="w3-text-red "></span></label>
<!-- <div class="w3-container"> -->
<hr>
                                                                <!--  fromDate,toDate   strFromDate,strToDate -->
				<!-- <h3 align="center"><b style="color:green;">From Date :{{fromDate}}  || To Date : {{toDate}}</b></h3> -->
		 <!--  <h3 align="center"><b style="color:green;">From Date : {{start_DATE}}  || To Date : {{end_DATE}}</b></h3> -->
		 
		  
		  
		  
		  

  
	<form name="LandLineReports">
 	<div class="container" style="background-color:lightblue">
		  <div class="jumbotron" style="background-color:lightblue">
		 
					   
					   <!-- <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="zoneName" class="w3-text-blue"> <b>Zone</b></label>
							<select name="country" ng-model="country" class="form-control" ng-change="loadState()">  
                          		<option value="">Select Zone</option>  
                          		<option ng-repeat="country in countries" value="{{country.zoneName}}" selected="selected">{{country.zoneName}}</option>  
                    	 </select>
						</div>
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select name="state" ng-model="state" class="form-control" ng-change="loadCity()">  
                          		<option value="">Select Region</option>  
                          		<option ng-repeat="state in states" value="{{state.circleName}}" selected="selected">  
                               		{{state.circleName}}  
                          		</option> 
                          	</select>
						</div>
					 	
						<div class="w3-container w3-third">
						<label for="cityName" class="w3-text-blue"><b>City</b></label>
							<select name="city" ng-model="city" class="form-control">  
                          		<option value="">Select City</option>  
                          		<option ng-repeat="citys1 in citys" value="{{citys1.cityName}}">  
                               			{{citys1.cityName}}  
                          		</option> 
                          	</select>
						</div>
		         </div><br> -->
		         <%
					 if (!regionId.equals("0") && (!cityId.equals("0")) && (!zoneId.equals("0"))) {
				   %> 
				   		<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="zoneName" class="w3-text-blue"> <b>Zone</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode()" name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="cityName" class="w3-text-blue"><b>City</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onClick="selectCircle()" onChange="regionCode()" name=cityName>
							  <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
							</select>
						</div>
		         </div><br>
				   
					<% 
					} if (cityId.equals("0") && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
					%>	
					 <%System.out.println("zone  id info====================::1,1,0"); %>
			    			<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="zoneName" class="w3-text-blue"><b>Zone</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>                                                   <!--  onChange="regionCode()",onChange="regionCode()" -->
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2  name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="cityName" class="w3-text-blue"><b>City</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onChange="regionCode2()" name=cityName>
							<!-- <option value=""> --city-- </option> -->
							   <option value=""> All </option>
                               <%
          						  while(stInfo.hasMoreTokens())
           							 {
           							 citySname= stInfo.nextToken();
            						 cityFname=stInfo.nextToken();

            						if(cityFname.equalsIgnoreCase(strcityNam)){
              				   %>
                				  <OPTION value="<%=cityFname%>"selected><%=cityFname%></OPTION>
            				<%}else{ %>
            						 <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
               				 <%}}%>
							</select>
						</div>
		         </div>
		    		<br>
					 
					 
					<%
						}if ((!zoneId.equals("0")) && (regionId.equals("0")) && (cityId.equals("0"))) {
					%> 
					<%System.out.println("zone  id info====================::1,0,0"); %>
							<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="zoneName" class="w3-text-blue"><b>Zone</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="zoneCode()" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode2()" name=regionName>
							<!-- <option value="">--circle--</option> -->
							  <option value=""> All </option>
                               <%stInfo=new StringTokenizer(regionInfo,"#");

          						  while(stInfo.hasMoreTokens())
            						 {
           							 regionSname= stInfo.nextToken();
          							  regionFname=stInfo.nextToken();

          							   if(regionFname.equalsIgnoreCase(strregNam)){
          								   System.out.println("Region ----------------------ssss-1,0,0 ::"+regionFname);
             					    %>
               						   <OPTION value="<%=regionFname%>"selected><%=regionFname%></OPTION>
            					<%}else{%>

           						  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
             				   <%}}%>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="cityName" class="w3-text-blue"><b>City</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onclick="cityCode()" onChange="regionCode2()" name=cityName>
							<!-- <option value=""> --city-- </option> -->
							 <option value=""> All </option>
                               <%stInfo=new StringTokenizer(cityInfo,"#");
           						 while(stInfo.hasMoreTokens())
          						 {
           							 citySname= stInfo.nextToken();  
            							cityFname=stInfo.nextToken(); 
           							 if(cityFname.equalsIgnoreCase(strcityNam)){
           								System.out.println("city ----------------------ssss-1,0,0 ::"+cityFname);
              					   %>
                				  <OPTION value="<%=cityFname%>"selected><%=cityFname%></OPTION>
            				<%}else{%>
            					 <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
             				   <%}}%>
							</select>
						</div>
		         	</div>
					   <%} %>
					  
					   
					   <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="SearchOn" class="w3-text-blue"> Search On</label>
							<select name="SearchOn" id="SearchOn" ng-model="SearchOn"  class="form-control form-control-sm form-rounded" onchange="" required>  
				                    <option ng-option value="SalesTransaction">Summary Transaction</option>
				                    <option ng-option value="DetailedTransaction">Detailed Transaction</option>
				                    <option ng-option value="CommissionReport">Commission Report</option>
			               </select>
						</div>
						<div class="w3-container w3-third">
						<label for="FilterOn" class="w3-text-blue">Filter On</label><!-- onChange="FilterOnValidate()" -->
							<select name="FilterOn" id="FilterOn" ng-model="FilterOn"  class="form-control form-control-sm form-rounded" onchange="DisableDealer()" required>  
				                    <option ng-option value="AllDealers">All Dealers</option>
				                    <option ng-option value="ChoseDealer">Chose Dealer</option>
				                    <option ng-option value="landline">Chose Land Line</option>
			               </select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="msisdn" class="w3-text-blue">Dealer</label>
							<input type="text" ng-model="msisdn" class="form-control form-control-sm form-rounded" id="msisdn" name="msisdn" placeholder="Input Msisdn Number" />
						</div>
		         </div><br>
		         
		          <div class="w3-container w3-row-padding">
						<div class="w3-container w3-half">
						<input id="fromDate" type="text" name="strFromDate" ng-model="fromDate" readonly class=" w3-select w3-hover-blue form-rounded date1" placeholder="Enter From Date"
		            		<%if (strFromDate != null && !strFromDate.equals("")) {
								   if (strFromDate.equalsIgnoreCase(strFromDate)) {%>
									 value="<%=strFromDate%>" <%}
							  } else {%> value=""
										<%}%> readonly/>
						</div>
						<div class="w3-container w3-half">
						<input id="toDate" name="strToDate" type="text" ng-model="toDate" readonly class=" w3-select w3-hover-blue form-rounded date1" placeholder="Enter To Date"
		            			<%if (strToDate != null && !strToDate.equals("")) {
									if (strToDate.equalsIgnoreCase(strToDate)) {%>
										value="<%=strToDate%>" <%}
								} else {%> value=""
										<%}%> readonly/>
						</div>
		         </div>
		         
		          <br>
			 		<div class="row">
							<div class="col-sm-2 ">
					           </div>
					           <div class="col-sm-4 ">
					               <!-- <INPUT TYPE="button" value="Search" class="btn btn-info btn-block" onclick="Search()"> -->
					               <INPUT TYPE="button" align="left" class="btn btn-info btn-block" value="OK"  ng-click="LandLineDetails()">
					           </div>
					           
					           <div class="col-sm-4 ">
						         <!-- <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block" onclick="fnReset();">  -->
						         <!-- <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block" ng-click="LandLineresetall()"> -->
						         <button type="button" class="btn btn-danger btn-block" onclick="resetall()"  >Reset</button>
					          </div>
					    </div> 
					</div>
				</div>
			</form>
			</div>
			<hr>
				<div class="table-responsive" id="Sales">
					<div id="exportable">
						<center><loading></loading></center>
           					<table datatable="ng"  id="examples2" class="table table-striped  table-hover table-sm" cellspacing="0" width="100%">
			                 <thead>
			                     <tr class="bg-primary">
	    							<th>CIRCLE</th>
									<th>SSA</th>
			                     	<th>TOTALCOUNT</th>
			                        <th>TOTALAMOUNT</th>
			                      </tr>
			                   </thead>
                  				<tbody>
			                        <tr ng-repeat="project in jsonLandLineListSales " >
			                        <td>{{project.circle}}</td>
									<td>{{project.ssa}}</td>
			                       	<td>{{project.totalcount}}</td>
									<td>{{project.total_amount}}</td>
			                      </tr>
			                </tbody>
			            </table>
            		</div>
            	</div>
           
            	<div class="table-responsive" id="Detailed">
					<div id="exportable">
						<center><loading></loading></center>
           					<table datatable="ng"  id="examples2" class="table table-striped  table-hover table-sm" cellspacing="0" width="100%">
                 			<thead>
	                        <tr class="bg-primary">
	                       
	    							<th>CIRCLE</th>
									<th>SSA</th>
									<th>DEALERNUMBER</th>
									<th>AMOUNT</th>
									<th>TRANSDATE</th>
	                        		
									<th>BALANCE_BEFORE</th>
									<th>BALANCE_AFTER</th>
									<th>ACCOUNT_NUMBER</th>
									<th>BILL_NUMBER</th>
	                        		<th>SMS_DEST_NUMBER</th>
	                        		<th>LANDLINE_NO</th>
	                        		<th>TRANSACTION_ID</th>
	                        		<th>RECEIPT_NUMBER</th>
	                          	</tr>
                   			</thead>
                  			<tbody>
		                        <tr ng-repeat="project in jsonLandLineListDetailed " >
		                       	<td>{{project.circle}}</td>
								<td>{{project.ssa}}</td>
								<td>{{project.dealernumber}}</td>
								<td>{{project.amount}}</td>
								<td>{{project.transdate}}</td>
								<td>{{project.balance_before}}</td>
								
								<td>{{project.balance_after}}</td>
								<!-- <td>{{project.maxdt1 | date:'dd-MM-yyyy'}}</td> -->
								<td>{{project.account_number}}</td>
								<td>{{project.bill_number}}</td>
								<td>{{project.sms_dest_number}}</td>
								<td>{{project.landline_no}}</td>
								<td>{{project.transaction_ID}}</td>
								<td>{{project.receipt_NUMBER}}</td>
		                      </tr>
		                	</tbody>
            			</table>
            		</div>
            	</div>
            
            <div class="table-responsive" id="Commission">
				<div id="exportable">
					<center><loading></loading></center>
           				<table datatable="ng"  id="examples2" class="table table-striped  table-hover table-sm" cellspacing="0" width="100%">
                 			<thead>
                        		<tr class="bg-primary">
	    							<th>CIRCLE</th>
									<th>SSA</th>
	                        		<th>ST_FRA_MOB</th>
									<th>ST_FRA_COMM_ADDED</th>
									<th>ST_SFRA_MOB</th>
									
									<th>ST_SFRA_COMM_ADDED</th>
									<th>ST_RET_MOB</th>
									<th>ST_RET_COMM_ADDED</th>
									<th>LL_Number</th>
									<th>BILL_AMOUNT</th>
									<th>TDS</th>
                          		</tr>
                   			</thead>
                  			<tbody>
                  			
		                        <tr ng-repeat="project in jsonLandLineListCommission" >
		                       	<td>{{project.circle}}</td>
								<td>{{project.ssa}}</td>
								<td>{{project.st_FRA_MOB}}</td>
								<td>{{project.st_FRA_COMM_ADDED}}</td>
								<td>{{project.st_SFRA_MOB}}</td>
								
								<td>{{project.st_SFRA_COMM_ADDED}}</td>
								<td>{{project.st_RET_MOB}}</td>
								<td>{{project.st_RET_COMM_ADDED}}</td>
								<td>{{project.ll_Number}}</td>
								<td>{{project.bill_AMOUNT}}</td>
								<td>{{project.tds}}</td>
								<!-- <td>{{project.maxdt1 | date:'dd-MM-yyyy'}}</td> -->
		                      </tr>
	                		</tbody>
            			</table>
            		</div>
           		 </div>
		
</body>
</html>
