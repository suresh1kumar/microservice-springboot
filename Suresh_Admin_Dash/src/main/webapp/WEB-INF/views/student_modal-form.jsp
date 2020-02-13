<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="products.controller">
<head>
<meta charset="UTF-8">
<title>Flat Able - Premium Admin Template by Phoenixcoded</title>


<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="Phoenixcoded">
<meta name="keywords" content=", Flat ui, Admin , Responsive, Landing, Bootstrap, App, Template, Mobile, iOS, Android, apple, creative app">
<meta name="author" content="Phoenixcoded">

<link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">

<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="bower_components/bootstrap/dist/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="assets/icon/themify-icons/themify-icons.css">

<link rel="stylesheet" type="text/css" href="assets/icon/icofont/css/icofont.css">

<link rel="stylesheet" type="text/css" href="assets/pages/flag-icon/flag-icon.min.css">

<link rel="stylesheet" type="text/css" href="assets/pages/menu-search/css/component.css">

<link rel="stylesheet" type="text/css" href="bower_components/datatables.net-bs4/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" type="text/css" href="assets/pages/data-table/css/buttons.dataTables.min.css">
<link rel="stylesheet" type="text/css" href="bower_components/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css">

<link rel="stylesheet" type="text/css" href="assets/css/style.css">

<link rel="stylesheet" type="text/css" href="assets/css/color/color-1.css" id="color" />
<link rel="stylesheet" type="text/css" href="assets/css/linearicons.css">
<link rel="stylesheet" type="text/css" href="assets/css/simple-line-icons.css">
<link rel="stylesheet" type="text/css" href="assets/css/ionicons.css">
<link rel="stylesheet" type="text/css" href="assets/css/jquery.mCustomScrollbar.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">

<script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="bower_components/jquery-ui/jquery-ui.min.js"></script>

 <script type="text/javascript" src="assets/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="assets/js/dataTables.bootstrap.min.js"></script>
    
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
<script type="text/javascript" src="assets/js/angular.min.js"></script>
<script type="text/javascript" src="assets/js/angular-export.js"></script>
<script type="text/javascript" src="assets/js/angular-datatables.min.js"></script>




<script type="text/javascript">
	var app=angular.module("products.controller",['datatables','export.csv']);///'angularUtils.directives.dirPagination'  //,'export.csv'  
	
	app.controller("products_controller",
			['$scope','$window','$http','$filter',
				function($scope,$window,$http){
				//$scope.type = ["All", "TOPUP","STV-DATA","STV-SMS","STV-SMS","STV-COMBO","STV-ISD","STV-UL VOICE","STV-REDUCE TARIFF","STV-VAS","STV-OTHERS","STV-VOUCHER","OTHERS"];
				$('#hidt').hide();
				$('#ex1').hide();
				$scope.loading = true;	
			       
				$scope.productDetails=function(){
			        	$scope.loading = true;	
				$http({
					url:"../../PlanUpdateViewController",
					method:"get",
					 
				}).then(function(result){
					//$window.alert("View Success......");
					$scope.jsonproductList=result.data;
					$('#hidt').show();
					$('#ex1').show();
					$scope.loading = false;
				},function(result){
					$window.alert("failure :)"+result.status);
					$scope.loading = false;
				});
				};
		//for model show
			    $scope.addModal = function() {
					$scope.users_form = angular.copy($scope.master);
			        $scope.form_name = 'Add New Student Information!!';
			        $('#form_modal').modal('show');
			    };
			    
			  
	          
		// for add record    
			    $scope.UserAddUpdate = function (users_form) {
			        var users_information = users_form;
			        alert("add");
			        //var sno = users_information.sno;//country,city,address
			        var name=users_information.name;
			        var phone=users_information.phone;
			        var email=users_information.email;
			        var country=users_information.country;
			        var city=users_information.city;
			        var address=users_information.address;
			        alert("name add:"+name);
			        alert("phone add:"+phone);
			        alert("email add:"+email);
			        alert("country add:"+country);
			        $http({
			          url: "getUserDatas",
			          method: "post",
			          //data: users_information,
			          params:{
			        	  	"name":name,
							"phone":phone,
							"email":email,
							"country":country,
							"city":city,
							"address":address
						}
			         }).then(function(response) {
			        	alert("ssssssssssssssss"); 
			         alert("success response message::"+response.data.message);
			         alert("success response title::"+response.data.title);
			         if(response.data.status == "success") {
			        		toastr.success(response.data.message, response.data.title, {
								closeButton:true
							});
			         } else {
							toastr.error(response.data.message, response.data.title, {
								allowHtml:true,
								closeButton:true
							});
						}
			        		/* if(sno!=null && sno!="undefined"){
			        			$scope.success_msg = "Record Updated Successfully!!!!";
			        			$scope.productDetails();
			        	}else{
			        		$scope.success_msg = "Record Added Successfully!!!!";
			        		$scope.productDetails();
			        	} */
			         },function (error){
			 			console.log(error);
			 		});
			        $('#form_modal').modal('hide');
			     };
			     
			     $scope.EditModal = function(project) {
			    	 alert("Are you sure want to Edit ");
			         $scope.form_name = 'Edit Plan Information!!';
			 		var edit_form = {};
			 		var id=project;
			 		var ids=id.sno;
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
    		
			}]);
</script>
</head>

<%@ include file="optionalBody.jsp"%>


<%@ include file="header_nave_bar.jsp"%>



<div ng-controller="products_controller">

<div class="pcoded-content">
<div class="pcoded-inner-content">

<div class="main-body">
<div class="page-wrapper">

<div class="page-header">
<div class="page-header-title">
<h4>Modal Forms</h4>
</div>
<div class="page-header-breadcrumb">
<ul class="breadcrumb-title">
<li class="breadcrumb-item">
<a href="index-2.html">
<i class="icofont icofont-home"></i>
</a>
</li>
<li class="breadcrumb-item"><a href="#!">Advance Components</a>
</li>
<li class="breadcrumb-item"><a href="#!">Modal Forms</a>
</li>
</ul>
</div>
</div>


<div class="page-body">
<div class="row">
<div class="col-sm-12">

<div class="card">
<div class="card-header">
<h5>Ready to use forms in - Modal</h5>
<span>Click on button to show ready-forms</span>
<div class="card-header-right">
<i class="icofont icofont-rounded-down"></i>
<i class="icofont icofont-refresh"></i>
<i class="icofont icofont-close-circled"></i>
</div>
</div>
<div class="card-block">
<div class="row modal-mob-btn">
<div class="col-sm-4">
<button class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#sign-in-modal">New Student Record</button>
</div>
<div class="col-sm-4">
<button class="btn btn-inverse btn-lg btn-block" data-toggle="modal" data-target="#pwd-recovery">Password Recovery</button>
</div>
<div class="col-sm-4">
<div class="add_panel">
			<a ng-click="addModal();" class="model_form btn btn-primary btn-lg btn-block">
				<i class="glyphicon glyphicon-plus pull-left"></i>New Student Record1</a>
            <div class="clearfix container"></div>
		</div>
</div>
</div>
</div>
</div>

</div>
</div>
</div>

</div>
</div>

<div class="table-responsive" id="hidts">
		
		<div id="exportable">
		
			<table datatable="ng"  id="examples" class="table table-striped  table-hover table-sm" cellspacing="0"  width="100%">
				<thead>
					<tr class="bg-primary">
						  <th>SNO</th>
		                  <th>FIRSTNAME</th>
		                  <th>LASTNAME</th>
		                  <th>EMAIL</th>
		                  <th>PHONENO</th>
		                  <th>COUNTRY</th>
		                  <th>CITY</th>
		                  <th>ADDRESS</th>
		                  <th>Edit/Update</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="project in jsonproductList">
						<td>{{project.operator}}</td>
						<td>{{project.circle}}</td>
						<td>{{project.denomination | currency:"₹" }}</td>
						<td>{{project.type}}</td>
						<td>{{project.talkvalue | currency:"₹" }}</td>
						<td>{{project.validity}}</td>
						<td>{{project.description}}</td>
						<td>{{project.country}}</td>
						<td>{{project.start_DATE | date:'dd-MM-yyyy' }}</td>
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




<div id="styleSelector">
</div>
</div>
</div>



<!-- <div class="modal fade" id="sign-in-modal" tabindex="-1">
<div class="modal-dialog" role="document">
<div class="modal-content">
<div class="modal-header">
<h5 class="modal-title">Sign In Now</h5>
<button type="button" class="close" data-dismiss="modal" aria-label="Close">
<span aria-hidden="true">&times;</span>
</button>
</div>
<div class="modal-body p-b-0">
<form  ng-submit="UserAddUpdate(users_form);" id="cat_form">
<div class="row">
<div class="col-sm-6">
<div>
<label class="form-control-label">First Name</label>
<input type="text" ng-model="users_form.fname" class="form-control" placeholder="Enter your First name">
</div>
</div>

<div class="col-sm-6">
<div>
<label class="form-control-label">Last Name</label>
<input type="text" ng-model="users_form.lname" class="form-control" placeholder="Enter your Last name">
</div>
</div>

</div>
<div class="row">
<div class="col-sm-6">
<div>
<label class="form-control-label">Email</label>
<input type="text" ng-model="users_form.email" class="form-control" placeholder="Enter your Valid Email">
</div>
</div>

<div class="col-sm-6">
<div>
<label class="form-control-label">Phone</label>
<input type="text" ng-model="users_form.phone" class="form-control" placeholder="Enter your Valid Phone">
</div>
</div>

</div>
<div class="form-group row m-t-15">
<div class="col-sm-6">
<div class="checkbox-fade fade-in-primary">
<label>
<input type="checkbox" value="">
<span class="cr">
<i class="cr-icon icofont icofont-ui-check txt-primary"></i>
</span>
<span>Keep Me Login</span>
</label>
</div>
</div>
<div class="col-sm-6">
<a href="#!">Forgot Password?</a>
</div>
</div>
</form>
</div>
<div class="modal-footer">
<button type="button" name="form_data" class="btn btn-primary">Submit</button>
<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
</div>



</div>
</div>
</div>
 -->

		



<!-- Form modal -->
  <div id="form_modal" class="modal fade" tabindex="-1" role="dialog">
    <!-- <div class="modal-dialog modal-md"> -->
    <div class="modal-dialog modal-lg">
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
 
				  
				   	<div class="row">
						<input type="hidden" name="hidden_id" ng-model="users_form.sno"  />
						<div class="col-sm-4">
							<label for="operator" class="form-control-label"> <b>Name</b></label>
	                       <input type="text" ng-model="users_form.name" class="form-control" name="name"  placeholder="Input name" />
						</div>
						<div class="col-sm-4">
							<label for="circle" class="form-control-label"><b>Email</b></label>
							<input type="text" ng-model="users_form.email" class="form-control" name="email"  placeholder="Input email" />
						</div>
						
						<div class="col-sm-4">
						<label for="type" class="form-control-label"><b>Phone</b></label>
							<input type="text" ng-model="users_form.phone" class="form-control" name="phone"  placeholder="Input phone" />
						</div>
		         	</div><br>
					 
					
 					<div class="row">
						<div class="col-sm-4">
							<label for="country" class="form-control-label"> <b>Country</b></label>
							<input type="text" ng-model="users_form.country" class="form-control" name="country"  placeholder="Input country" />
						</div>
						<div class="col-sm-4">
							<label for="city" class="form-control-label"> <b>City</b></label>
							<input type="text" ng-model="users_form.city" class="form-control" name="city"   placeholder="Input city" />
						</div>
						
						<div class="col-sm-4">
							<label for="address" class="form-control-label"> <b>Address</b></label>
							<input type="text" ng-model="users_form.address" class="form-control" name="address"  placeholder="Input address" />
						</div>
		         </div><br>
		         
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



</div>














<!--[if lt IE 9]>
<div class="ie-warning">
    <h1>Warning!!</h1>
    <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers to access this website.</p>
    <div class="iew-container">
        <ul class="iew-download">
            <li>
                <a href="http://www.google.com/chrome/">
                    <img src="assets/images/browser/chrome.png" alt="Chrome">
                    <div>Chrome</div>
                </a>
            </li>
            <li>
                <a href="https://www.mozilla.org/en-US/firefox/new/">
                    <img src="assets/images/browser/firefox.png" alt="Firefox">
                    <div>Firefox</div>
                </a>
            </li>
            <li>
                <a href="http://www.opera.com">
                    <img src="assets/images/browser/opera.png" alt="Opera">
                    <div>Opera</div>
                </a>
            </li>
            <li>
                <a href="https://www.apple.com/safari/">
                    <img src="assets/images/browser/safari.png" alt="Safari">
                    <div>Safari</div>
                </a>
            </li>
            <li>
                <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
                    <img src="assets/images/browser/ie.png" alt="">
                    <div>IE (9 & above)</div>
                </a>
            </li>
        </ul>
    </div>
    <p>Sorry for the inconvenience!</p>
</div>
<![endif]-->


<!-- <script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="bower_components/jquery-ui/jquery-ui.min.js"></script> -->
<script type="text/javascript" src="bower_components/tether/dist/js/tether.min.js"></script>
<script type="text/javascript" src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<script type="text/javascript" src="bower_components/jquery-slimscroll/jquery.slimscroll.js"></script>

<script type="text/javascript" src="bower_components/modernizr/modernizr.js"></script>
<script type="text/javascript" src="bower_components/modernizr/feature-detects/css-scrollbars.js"></script>

<script type="text/javascript" src="bower_components/classie/classie.js"></script>

<script src="bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="bower_components/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="assets/pages/data-table/js/jszip.min.js"></script>
<script src="assets/pages/data-table/js/pdfmake.min.js"></script>
<script src="assets/pages/data-table/js/vfs_fonts.js"></script>
<script src="bower_components/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="bower_components/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="bower_components/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="bower_components/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="bower_components/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>

<script type="text/javascript" src="bower_components/i18next/i18next.min.js"></script>
<script type="text/javascript" src="bower_components/i18next-xhr-backend/i18nextXHRBackend.min.js"></script>
<script type="text/javascript" src="bower_components/i18next-browser-languagedetector/i18nextBrowserLanguageDetector.min.js"></script>
<script type="text/javascript" src="bower_components/jquery-i18next/jquery-i18next.min.js"></script>

<script src="assets/pages/data-table/js/data-table-custom.js"></script>
<script type="text/javascript" src="assets/js/script.js"></script>
<script src="assets/js/pcoded.min.js"></script>
<script src="assets/js/demo-12.js"></script>
<script src="assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="assets/js/jquery.mousewheel.min.js"></script>
</body>

<!-- Mirrored from flatable.phoenixcoded.net/default/modal-form.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 10 Jan 2019 11:50:18 GMT -->
</html>