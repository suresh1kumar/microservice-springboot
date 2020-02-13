<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.util.*" %>
<%@page import="com.mobitec.Mvoucher.*" %>
<%@ page import="com.mobitec.Mvoucher.AddDealerInfo,com.mobitec.Mvoucher.ScreenList"%>
<%@ page import ="com.mobitec.Mvoucher.*,java.sql.Connection,java.util.*,java.text.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="products.controller">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Plan || Update</title>
<meta charset="utf-8">
  
    <link href='http://www.mostlikers.com/favicon.ico' rel='icon' type='image/x-icon'/>
    <!--Bootstrap CSS --> 
    <!-- <link href="datajs/css/bootstrap.min.css" rel="stylesheet"> -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- <link href="datajs/css/dataTables.bootstrap.min.css" rel="stylesheet"> -->
    <link href="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet" type="text/css" />
    <!-- <link href="datajs/css/custom-style.css" rel="stylesheet"> -->
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/le-frog/jquery-ui.css" />
    <!--/Bootstrap CSS --> 
    
    <!--JQuery DataTables--> 
    <script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <!-- <script src="datajs/js/bootstrap/bootstrap.min.js"></script> -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!-- <script type="text/javascript" src="datajs/js/dataTables/jquery.dataTables.min.js"></script> -->
    <script type="text/javascript" src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
    <!-- <script type="text/javascript" src="datajs/js/dataTables/dataTables.bootstrap.min.js"></script> -->
    <script type="text/javascript" src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
    <!--/JQuery DataTables --> 
    
    <!--Angualrjs --> 
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script> -->
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
        <!-- <script type="text/javascript" src="datajs/js/angularjs/angular.min.js"></script> -->
       <!--  <script type="text/javascript" src="datajs/js/angularjs/angular-export.js"></script> -->
        <!-- <script type="text/javascript" src="datajs/js/angularjs/angular-datatables.min.js"></script> -->
        <!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.8/angular-route.min.js"></script> -->
        <script type="text/javascript" src="https://cdn.bootcss.com/angular-datatables/0.6.4/angular-datatables.min.js"></script>
     <!--/Angualrjs --> 
<style type="text/css">
		
		.add_panel
{
	border-bottom: 2px solid #E6E9ED;
    padding: 1px 5px 6px;
	margin-bottom: 10px;
}
.repeat-item.ng-leave {
  -webkit-transition:0.5s linear all;
  transition:0.5s linear all;
}

.repeat-item.ng-enter,
.repeat-item.ng-leave.ng-leave-active {
  opacity:0;

}
.repeat-item.ng-leave,
.repeat-item.ng-enter.ng-enter-active {
  opacity:1;
 
}

.alert {
    border: 0;
    border-radius: 0;
}
.alert-success {
    background-color: #4caf50 !important;
    border-color: #449d48 !important;
    color: #fff !important;
}
		
		</style>
<style type="text/css">
   h2 {
    text-shadow: 2px 2px #FF0000;
  }
.modal-body {
    /* background-image: url('http://myfunnymemes.com/wp-content/uploads/2015/04/Doge-Meme-Lion-In-All-Its-Majestic-Glory.jpg'); 
    background: url("https://www.gizbot.com/img/2018/05/bsnl-offers-39gb-data-for-28-days-at-just-rs-98-1526578810.jpg");*/
background: url("http://myfunnymemes.com/wp-content/uploads/2015/04/Doge-Meme-Lion-In-All-Its-Majestic-Glory.jpg");
    background-repeat: no-repeat;
    background-size: cover;
    height: 400px;
}
.ui-datepicker {
   background: #333;
   border: 1px solid #555;
   color: #EEE;
}
 h1 {
    text-shadow: 2px 2px #FF0000;
}
#heas{
background-color:gray;
color:white;
}
.loading { border:0px solid #ddd; padding:20px; margin:40px 5px; width:80px;}
#exportable{
overflow-y:scroll;
height:500px;}

body {background-color: #E0E0E0;}
/* body{
background: #70e1f5; 
background: -webkit-linear-gradient(to left, #70e1f5 , #ffd194); 
background: linear-gradient(to left, #70e1f5 , #ffd194); 
} */

.button {
 background-color: #0639D3; /* Green w3-light-blue*/
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 10px;
  margin: 4px 2px;
  cursor: pointer;
  
}
.button5 {border-radius: 50%;}
   </style>
  
<script type="text/javascript">
	var app=angular.module("products.controller",['datatables']);///'angularUtils.directives.dirPagination'  //,'export.csv'  
	
	app.directive('loading', function () {
		//alert("lodddddddd");
	      return {
	        restrict: 'E',
	        replace:true,
	        template: '<div class="loading"><img src="http://www.nasa.gov/multimedia/videogallery/ajax-loader.gif" width="50" height="50" /><br>LOADING...</div>',
	        link: function (scope, element, attr) {
	              scope.$watch('loading', function (val) {
	                  if (val)
	                      $(element).show();
	                  else
	                      $(element).hide();
	              });
	        }
	      }
	  });
	app.controller("products_controller",
			['$scope','$window','$http','$filter',
				function($scope,$window,$http){
				//$scope.type = ["All", "TOPUP","STV-DATA","STV-SMS","STV-SMS","STV-COMBO","STV-ISD","STV-UL VOICE","STV-REDUCE TARIFF","STV-VAS","STV-OTHERS","STV-VOUCHER","OTHERS"];
				//$scope.type = ["All", "RECHARGE","STV","TOPUP","FRC","DATA","SPECIAL"];
				//$scope.Operator = ["BSNL", "RECHARGE","STV","TOPUP","FRC","DATA","SPECIAL"];
				//$scope.Country = ["IND"];
				$('#ex').hide();
				$('#hidt').hide();
				
				/* setTimeout(function(){
			           location.reload();
			       },50000); // 5000 milliseconds means 5 seconds.
			        */
			        
			      
			       
				$scope.productDetails=function(){
					
				$http({
					url:"../../PlanUpdateViewController",
					method:"get",
					 
				}).then(function(result){
					//$window.alert("View Success......");
					$scope.jsonproductList=result.data;
					$('#ex').show();
					$('#hidt').show();
				},function(result){
					$window.alert("failure :)"+result.status);
				});
				};
		//for model show
			    $scope.addModal = function() {
					$scope.users_form = angular.copy($scope.master);
			        $scope.form_name = 'Add New Plan Information!!';
			        $('#form_modal').modal('show');
			    };
			    
			  
	          //------------------for date picker end---------------------- 
	          $(function() {
				$("#fromDate").datepicker(
				{
					//dateFormat : "dd-mm-yy",
					dateFormat : "dd-mm-yy",
					maxDate : -1,
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
					maxDate : -1,
					//changeMonth: true,
					//changeYear: true,
					onClose : function(selectedDate) {
						$("#fromDate").datepicker("option", "maxDate", selectedDate);
					}
				});
			});
		// for add record    
			    $scope.UserAddUpdate = function (users_form) {
			        var users_information = users_form;
			        alert("add");
			       // users_form.start_DATE,users_form.end_DATE
			        
			        var sno = users_information.sno;//operator,circle
			        var bsnlid=users_information.operator;
			        var regionName=users_information.circle;
			        var type=users_information.type;
			        var country=users_information.country;
			        var denomination=users_information.denomination;
			        var talkvalue=users_information.talkvalue;
			        var validity=users_information.validity;
			        var description=users_information.description;
			        var fromdates=users_information.start_DATE;
			        var toDates=users_information.end_DATE;
			       
				   // alert("pid ::"+sno);
			        //alert("bsnlid:"+bsnlid);
			       // alert("regionName:"+regionName);
			       // alert("fromDate- ::"+fromdates);
			       // alert("toDate- ::"+toDates);
			        
			        $http({
			          url: "../../PlanUpdateAddUpdateController",
			          method: "GET",
			          //data: users_information,
			          params:{
			        	  	"bsnlid":bsnlid,
							"regionName":regionName,
							"type":type,
							"country":country,
							"denomination":denomination,
							"talkvalue":talkvalue,
							"validity":validity,
							"description":description,
							"sno":sno,
							"fromdates":fromdates,
							"toDates":toDates
						}
			         }).then(function(response) {
			        	// alert("addsssssssssssssss");
			        	//if(sno! = null && !sno==""){
			        		if(sno!=null && sno!="undefined"){
			        			//$scope.success_msg = "Record Updated Successfully!!!!";
			        			$scope.success_msg = "Record Updated Successfully!!!!";
			        		   //alert("addsssssssssssssss updatesuresh--------------------");
			        		$scope.productDetails();
				 			
			        	}else{
			        		//alert("addsssssssssssssss addcccc");
			        		$scope.success_msg = "Record Added Successfully!!!!";
			        		$scope.productDetails();
			        	}
			             
			         },function (error){
			 			console.log(error);
			 		});
			        $('#form_modal').modal('hide');
			     };
			     
			     $scope.EditModal = function(project) {
			    	 alert("Edit");
			         $scope.form_name = 'Edit Plan Information!!';
			 		var edit_form = {};
			 		var id=project;
			 		var ids=id.sno;
			 		//var region=id.circle;
			 		//alert("ID >:-"+ids );
			 		angular.copy(project, edit_form);
			 		$scope.users_form = edit_form;
			         $('#form_modal').modal('show');
			     };
			// end add record
			
			// for delete record
			
			$scope.DeleteModal = function(project) {
				var r = confirm("Are you sure want to delete ?");
				if (r == true) {
					var sno = project.sno;
					$http({
					method: 'GET',
					url: '../../PlanUpdateDeleteController',
					data: sno,
					params:{
						"sno":sno
						
					}
				}).then(function(response) {
					$scope.success_msg = "Record Deleted Successfully!!!!";
				
					$scope.productDetails();
					var index = $scope.users_list.indexOf(user);
					$scope.users_list.splice(index, 1);	
					
					$('#ex').show();
				},function (error){
					alert("Record are not found!!");
					console.log(error);
				});
				}
    		  };
    		
    		   /* $(function() {
		            var colors = ["#0099cc","#c0c0c0","#587b2e","#990000","#000000","#1C8200","#987baa","#981890","#AA8971","#1987FC","#99081E"];
		             
		            setInterval(function() { 
		                var bodybgarrayno = Math.floor(Math.random() * colors.length);
		                var selectedcolor = colors[bodybgarrayno];
		                $("body").css("background",selectedcolor);
		            }, 3000);
		        })  */
			}]);
</script>
	<script type="text/javascript">
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
</script>
</head>

<%
		String userName="";
		
		String zoneId = "",regionId = "", cityId = "";
		StringTokenizer stInfo;
		String regionids="";
		String recionnames="";
		String regionnid="";
		String strAuthNum = "", zoneName = "", regionName = "", cityName = "";
		String zoneFname = "", zoneSname = "",  regionFname = "", regionSname = "", cityFname = "", citySname = "";
		String info = "", regionInfo = "", cityInfo = "", dealerCode = "";
		String circleId1="",circleNmae1="";
		int circlId;

			userName = (String) session.getAttribute("user_id");
			AddDealerInfo addInfo = new AddDealerInfo();
		
			String zoneInfo = addInfo.getZoneInfo(userName);
			String strZoneName = "";
			String regionId1="";
			if (zoneInfo != null && !zoneInfo.equalsIgnoreCase("")) {
				stInfo = new StringTokenizer(zoneInfo, "~");
				while (stInfo.hasMoreTokens()) {
					zoneId = stInfo.nextToken(); 
					regionId = stInfo.nextToken();
					//regionId="1";
					cityId = stInfo.nextToken();
				}
				if (regionId.equals("0") && (cityId.equals("0")) && (!zoneId.equals("0"))) {

					info = addInfo.getInfo1(zoneId);
					stInfo = new StringTokenizer(info, "#");
					zoneFname = stInfo.nextToken();
					zoneSname = stInfo.nextToken();
				  //regionInfo = addInfo.getInfo2(zoneId);
					regionInfo = addInfo.getInfo2(zoneId);
					//cityInfo = planUpdateDao.getInfo3(zoneId, regionId);    

				}
				if (cityId.equals("0") && (!zoneId.equals("0")) && (!regionId.equals("0"))) { 
						 
					info = addInfo.getInfo(zoneId, regionId);
					cityInfo = addInfo.getcityInfo(zoneId, regionId);
					stInfo = new StringTokenizer(info, "#");
					zoneFname = stInfo.nextToken();
					zoneSname = stInfo.nextToken();
					regionFname = stInfo.nextToken();
					regionSname = stInfo.nextToken();
					//strregNam = regionFname;  
					stInfo = new StringTokenizer(cityInfo, "#");
				}

				if ((!zoneId.equals("0")) && (!regionId.equals("0")) && (!cityId.equals("0"))) {
						
					info = addInfo.getInfo4(zoneId, regionId, cityId);  
					stInfo = new StringTokenizer(info, "#");
					zoneFname = stInfo.nextToken();
					zoneSname = stInfo.nextToken();
					regionFname = stInfo.nextToken();
					regionSname = stInfo.nextToken();
					cityFname = stInfo.nextToken();
					citySname = stInfo.nextToken();
					//strregNam = regionFname;
					//strcityNam = cityFname;
				}
			 }
			session.setAttribute("circleName", regionId);
%>
<body ng-controller="products_controller" data-ng-init="productDetails()" onload=display_ct();>
<!--<header class="w3-container w3-teal typewriter">
		  
		  <h2 class="element">Plan Update </h2>
	</header>-->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand pull-left" href="#"><b>Plan Update >>></b></a>
     <!-- <a class="btn btn-success" data-toggle="tooltip" data-placement="top" title="Vanity Number Sales Report csv!!" align="right" id="ex" export export-data="jsonproductListVanityNumberSalesReport" export-title="'Users'">VNSRDownload</a>-->
    </div>
    <ul class="nav navbar-nav pull-right" >
      <!-- <li class="active"><a href="#">Home</a></li>
      <li ><a href="#">Home2</a></li> -->
      
      <li><button class="button button5 pull-right"><%out.println(zoneFname); %></button></li>
    </ul>
  </div>
</nav>
<a href="planTest.jsp">ERP</a>
	
	<br><br>
         
         <div class="add_panel">
			<a ng-click="addModal();" class="model_form btn btn-primary">
				<i class="glyphicon glyphicon-plus pull-left"></i>Add Plan </a>
<b class="w3-text-blue pull-right">Date :<span id='ct' class="w3-text-red "></span></b>
				<!-- <a class="btn btn-success" align="right" id="ex" export export-data="jsonproductList" export-title="'Users'">Download</a> -->
            <div class="clearfix container"></div><!-- fromDate,toDate -->
		</div>
 <br>
		<!-- <div>
			<h1 align="center">From Date : {{joinDate}}       To Date : {{joinDate1}}</h1>
		</div> -->
		
    <br />
		<div class="col-md-12">
		<div ng-if="success_msg" class="success_pop alert alert-success">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			 <strong> {{success_msg}} </strong> 
		</div>
		<div class="table-responsive" id="hidt">
		<div id="exportable">
		<center><loading></loading></center>
			<table datatable="ng"  id="examples" class="table table-striped  table-hover table-sm" cellspacing="0"  width="100%">
				<thead>
					<tr class="bg-primary">
						<!-- <tr class="bg-primary"> -->
		                  <th>OPERATOR</th>
		                  <th>CIRCLE</th>
		                  <th>DENOMINATION</th>
		                  <th>TYPE</th>
		                  <th>TALKVALUE</th>
		                  <th>VALIDITY</th>
		                  <th>DESCRIPTION</th>
		                  <th>COUNTRY</th>
		                  <th>START_DATE</th>
		                  <th>END_DATE</th>
		                  <!-- <th>SNO</th> -->
		                  <th>Edit/Update</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="project in jsonproductList">
						<td>{{project.operator}}</td>
						<td>{{project.circle}}</td>
						<td>{{project.denomination}}</td>
						<td>{{project.type}}</td>
						<td>{{project.talkvalue}}</td>
						<td>{{project.validity}}</td>
						<td>{{project.description}}</td>
						<td>{{project.country}}</td>
						<td>{{project.start_DATE | date:'dd-MM-yyyy' }}</td>
						<td>{{project.end_DATE | date:'dd-MM-yyyy'}}</td>
						<!-- <td>{{project.sno}}</td> -->
						<!-- <td>{{user.dob | date: "yyyy-MM-dd"}}</td> -->
						<td>
							<a href="javascript:void(0);" ng-click="EditModal(project);"> 
								<i class="glyphicon glyphicon-edit btn btn-primary"></i>
							</a>
							<a href="javascript:void(0);" ng-click="DeleteModal(project)" class="delete"> 
								<i class="glyphicon glyphicon-trash btn btn-danger" ></i> 
							</a>
						</td>
					</tr>
				</tbody>
			</table>
			</div>
		</div>
		<!--  </div> -->
		<!-- <div ng-if="success_msg" class="success_pop alert alert-success">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			 <h1><strong> {{success_msg}} </strong></h1> 
		</div> -->
		</div>
		
		
		
	<!-- Form modal -->
  <div id="form_modal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-md">
      <div class="modal-content">
       
       
        <div class="modal-header modal-header-info" id="heas">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title"><i class="icon-paragraph-justify2"></i>
          {{form_name}}</h4>
        </div>
        
        <!-- Form inside modal -->
        <form  method="post" ng-submit="UserAddUpdate(users_form);" id="cat_form">
          <div class="modal-body with-padding">
 <!-- 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
 
				   <%
					 if (!regionId.equals("0") && (!cityId.equals("0")) && (!zoneId.equals("0"))) {
				   %> 
				   		<div class="w3-container w3-row-padding">
						<input type="hidden" name="hidden_id" ng-model="users_form.sno"  />
						<div class="w3-container w3-third">
						<label for="operator" class="w3-text-blue"> <b>Operator1</b></label>
	                       <select name="operator" id="operator"  ng-model="users_form.operator" class="form-control form-control-sm form-rounded" required> 
                               <option ng-option value="BSNL">BSNL</option>
	                   		</select>
						</div>
						<div class="w3-container w3-third">
						<label for="circle" class="w3-text-blue"><b>Circle1</b></label>
							<select class="w3-select w3-hover-blue form-rounded" ng-model="users_form.circle" id=circle  name="circle" required>
							  <OPTION ng-option value="<%=regionFname%>"><%=regionFname%></OPTION>
							  <!-- <option ng-option value="1">1</option> -->
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="type" class="w3-text-blue"><b>Type1</b></label>
						
						<!-- <select class="w3-select w3-hover-blue form-rounded" name="ReportTypes1" ng-model="ReportTypes" ng-options="x for x in ReportType">
							</select> -->
							<select name="type" id="type" ng-model="users_form.type"  class="form-control form-control-sm form-rounded" required>  
				                    
				                    <option ng-option value="All">All</option>
				                    <option ng-option value="TOPUP">TOPUP</option>
				                    <option ng-option value="STV-DATA">STV-DATA</option>
				                    <option ng-option value="STV-SMS">STV-SMS</option>
				                    <option ng-option value="STV-COMBO">STV-COMBO</option>
				                    <option ng-option value="STV-ISD">STV-ISD</option>
				                    <option ng-option value="STV-UL VOICE">STV-UL VOICE</option>
				                    <option ng-option value="STV-REDUCE TARIFF">STV-REDUCE TARIFF</option>
				                    <option ng-option value="STV-VAS">STV-VAS</option>
				                    <option ng-option value="STV-OTHERS">STV-OTHERS</option>
				                    <option ng-option value="STV-VOUCHER">STV-VOUCHER</option>
				                    <option ng-option value="PLAN-VOUCHER">PLAN-VOUCHER</option>
				                    <option ng-option value="OTHERS">OTHERS</option>
				                    
			               </select>
			               
						</div>
		         </div><br>
				   
					<% 
					} if (cityId.equals("0") && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
					%>	
					 
					 <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="operator" class="w3-text-blue"> <b>Operator</b></label>
							<select name="operator" id="operator"  ng-model="users_form.operator" class="form-control form-control-sm form-rounded" required> 
                               <option ng-option value="BSNL">BSNL</option>
	                   		</select>
						</div>
						<div class="w3-container w3-third">
						<label for="circle" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" ng-model="users_form.circle" id=regionList2  name="circle">
							  <OPTION ng-option value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="type" class="w3-text-blue"><b>Type2</b></label>
							<select name="type" id="type" ng-model="users_form.type"  class="form-control form-control-sm form-rounded" required>  
				                    
				                    <option ng-option value="All">All</option>
				                    <option ng-option value="TOPUP">TOPUP</option>
				                    <option ng-option value="STV-DATA">STV-DATA</option>
				                    <option ng-option value="STV-SMS">STV-SMS</option>
				                    <option ng-option value="STV-COMBO">STV-COMBO</option>
				                    <option ng-option value="STV-ISD">STV-ISD</option>
				                    <option ng-option value="STV-UL VOICE">STV-UL VOICE</option>
				                    <option ng-option value="STV-REDUCE TARIFF">STV-REDUCE TARIFF</option>
				                    <option ng-option value="STV-VAS">STV-VAS</option>
				                    <option ng-option value="STV-OTHERS">STV-OTHERS</option>
				                    <option ng-option value="STV-VOUCHER">STV-VOUCHER</option>
				                    <option ng-option value="PLAN-VOUCHER">PLAN-VOUCHER</option>
				                    <option ng-option value="OTHERS">OTHERS</option>
			               </select>
						</div>
		         </div><br>
					 
					<%
						}if ((!zoneId.equals("0")) && (regionId.equals("0")) && (cityId.equals("0"))) {
					%> 
					<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="operator" class="w3-text-blue"> <b>Operator</b></label>
							<select name="operator" id="operator"  ng-model="users_form.operator" class="form-control form-control-sm form-rounded" required> 
                               <option ng-option value="BSNL">BSNL</option>
	                   		</select>
						</div>
						<div class="w3-container w3-third">
						<label for="circle" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" ng-model="users_form.circle" id=circle  name="circle">
							  <option value=""> All </option>
                               <%stInfo=new StringTokenizer(regionInfo,"#");

          						  while(stInfo.hasMoreTokens())
            						 {
           							 regionSname= stInfo.nextToken();
          							  regionFname=stInfo.nextToken();

          							   if(regionFname.equalsIgnoreCase(regionFname)){
          								   System.out.print("-");
             					    %>
               						   <OPTION ng-option value="<%=regionFname%>"selected><%=regionFname%></OPTION>
            					<%}else{%>

           						  <OPTION ng-option value="<%=regionFname%>"><%=regionFname%></OPTION>
             				   <%}}%>
							</select>
						</div>

						<div class="w3-container w3-third">
						<label for="type" class="w3-text-blue"><b>Type3</b></label>
							<select name="type" id="type" ng-model="users_form.type"  class="form-control form-control-sm form-rounded" required>  
				                    
				                    <option ng-option value="All">All</option>
				                    <option ng-option value="TOPUP">TOPUP</option>
				                    <option ng-option value="STV-DATA">STV-DATA</option>
				                    <option ng-option value="STV-SMS">STV-SMS</option>
				                    <option ng-option value="STV-COMBO">STV-COMBO</option>
				                    <option ng-option value="STV-ISD">STV-ISD</option>
				                    <option ng-option value="STV-UL VOICE">STV-UL VOICE</option>
				                    <option ng-option value="STV-REDUCE TARIFF">STV-REDUCE TARIFF</option>
				                    <option ng-option value="STV-VAS">STV-VAS</option>
				                    <option ng-option value="STV-OTHERS">STV-OTHERS</option>
				                    <option ng-option value="STV-VOUCHER">STV-VOUCHER</option>
				                    <option ng-option value="PLAN-VOUCHER">PLAN-VOUCHER</option>
				                    <option ng-option value="OTHERS">OTHERS</option>
			               </select>
						</div>
		         </div><br>
					
					<%
					}
				   %>
 					
 					<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="country" class="w3-text-blue"> <b>Country</b></label>
							<select name="country" ng-model="users_form.country" id="country" class="form-control form-control-sm form-rounded"> 
                                <option ng-option value="IND">IND</option>
	                   		</select>
	                   		
						</div>
						<div class="w3-container w3-third">
						<label for="denomination" class="w3-text-blue"> <b>Denomination</b></label>
							<input type="text" ng-model="users_form.denomination" class="form-control form-control-sm form-rounded" name="denomination"   placeholder="Input Denomination" />
						</div>
						
						<div class="w3-container w3-third">
						<label for="talkvalue" class="w3-text-blue"> <b>Talkvalue</b></label>
						<input type="text" ng-model="users_form.talkvalue" class="form-control form-control-sm form-rounded" name="talkvalue"  placeholder="Input Talkvalue" />
						</div>
		         </div><br>
		         
		         <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-half">
							<input type="text" ng-model="users_form.validity" class="form-control form-control-sm form-rounded" name="validity"  placeholder="Input Validity" />
						</div>
						<div class="w3-container w3-half">
							<input type="text" ng-model="users_form.description" class="form-control form-control-sm form-rounded" name="description" placeholder="Input Description" />
						</div>
						
		         </div><br>
		         
		         <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-half">
							<input type="text" ng-model="users_form.start_DATE" class="form-control form-control-sm form-rounded" id="fromDate" name="start_DATE"  placeholder="FromDate" /> 
						</div>
						
						<div class="w3-container w3-half">
						 <input type="text" ng-model="users_form.end_DATE" class="form-control form-control-sm form-rounded" id="toDate" name="end_DATE"  placeholder="ToDate" /> 
						</div>
						
		         </div><br>
 <!-- k-format="'dd-MM-yyyy'" -->
            
            </div>
			<div class="modal-footer">
			<input type="hidden" name="hidden_id" value="{{hidden_id}}" />
			  <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
			  <button type="submit" name="form_data" class="btn btn-primary">Submit</button>
			</div>
        </form>
      </div>
    </div>
  </div>

 
 <script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
 
 <!-- <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
 <script>
$( function() {
$( "#fromDate" ).datepicker({
	dateFormat : "dd-mm-yy",
	//maxDate : 0,
onSelect: function(selectedDate) {
	       
            $('#toDate').datepicker('option', 'minDate', selectedDate );
      }
       //for only 7 days data

    });
$( "#toDate" ).datepicker({
   
	dateFormat : "dd-mm-yy",
	//minDate : 0,
	//maxDate : 0,
    });
} );
</script> -->
</body>
</html>
