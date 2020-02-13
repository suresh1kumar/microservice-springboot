<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html ng-app="products.controller">
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  
  		
  		<title>spring-microservices: Country</title>
  		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">
  		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet" type="text/css" />
<!-- <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> -->
<link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/le-frog/jquery-ui.css" />


<script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>


<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<!-- <script type="text/javascript" src="https://cdn.bootcss.com/angular-datatables/0.6.4/angular-datatables.min.js"></script>
 -->
        <script type="text/javascript">
	//var app=angular.module("products.controller",['datatables']); //,'export.csv'  
	
	//app.controller("products_controller",['$scope','$window','$http','$filter',function($scope,$window,$http){
		 //UserCRUDService.updateUser($scope.user.id,$scope.user.name,$scope.user.email)
		
		var app = angular.module('products.controller',[]);

		app.controller('products_controller', ['$scope','UserCRUDService', function ($scope,UserCRUDService) {
			  
			$scope.addModal = function() {
				$scope.users_form = angular.copy($scope.master);
		        $scope.form_name = 'Add New Information!!';
		        $('#form_modal').modal('show');
		    };
		    
		    $scope.updateUsers = function(project) {
		    	 alert("Edit");
		         $scope.form_name = 'Edit Plan Information!!';
		 			var edit_form = {};
		 			var id=project;
		 			var ids=id.userId;
		 			//var region=id.circle;
		 			alert("ID >:-"+ids );
		 			angular.copy(project, edit_form);
		 			$scope.users_form = edit_form;
		         	$('#form_modal').modal('show');
		     };
		     
		 // alert("update--::"+$scope.users_form.userId);
		    $scope.updateUsers1 = function () {//$scope.users_form
		        alert("update--");
		       // alert("$scope.users_form--::"+$scope.users_form.userId);
		        $('#form_modal').modal('show');
		    	UserCRUDService.updateUser($scope.users_form)
		          .then(function success(response){
		        	  $scope.users = response.data.message;
		        		alert("response message ::"+response.data.message);
		        	if(response.data.status == "success") {
		        		toastr.success(response.data.message, response.data.title, {
							closeButton:true
						});
		        		$scope.message = 'User added!';
		                  $scope.errorMessage = '';
		                  $scope.getAllUsers();
		        	} else {
						toastr.error(response.data.message, response.data.title, {
							allowHtml:true,
							closeButton:true
						});
						$scope.getAllUsers();
					}
		        	  $scope.message = 'User data updated!';
		              $scope.errorMessage = '';
		          },
		          function error(response){
		              $scope.errorMessage = 'Error updating user!';
		              $scope.message = '';
		          });
		    }
		    
		    $scope.getUser = function () {
		        var userId = $scope.users_form.userId;
		        UserCRUDService.getUser($scope.users_form.userId)
		          .then(function success(response){
		              $scope.users_form = response.data;
		              $scope.users_form.userId = userId;
		              $scope.message='';
		              $scope.errorMessage = '';
		          },
		          function error (response ){
		              $scope.message = '';
		              if (response.status === 404){
		                  $scope.errorMessage = 'User not found!';
		              }
		              else {
		                  $scope.errorMessage = "Error getting user!";
		              }
		          });
		    }
    //$scope.users_form.name,$scope.users_form.phone,$scope.users_form.email,$scope.users_form.country,$scope.users_form.city,$scope.users_form.address
    //users_form.name,users_form.phone,users_form.email,users_form.country,users_form.city,users_form.address
    				
		    $scope.UserAddUpdate = function () {
    		alert("add");
		        if ($scope.users_form != null && $scope.users_form.username) {
		            alert("2222222");
		        	//UserCRUDService.addUser($scope.users_form.username,$scope.users_form.phone,$scope.users_form.email,$scope.users_form.country,$scope.users_form.city,$scope.users_form.address)
		            //form_name
		        	UserCRUDService.addUser($scope.users_form)
		           
		        	.then (function success(response){
		        		$scope.users = response.data.message;
		        		alert("response message ::"+response.data.message);
		        	if(response.data.status == "success") {
		        		toastr.success(response.data.message, response.data.title, {
							closeButton:true
						});
		        		$scope.message = 'User added!';
		                  $scope.errorMessage = '';
		                  $scope.getAllUsers();
		        	} else {
						toastr.error(response.data.message, response.data.title, {
							allowHtml:true,
							closeButton:true
						});
						$scope.getAllUsers();
					}
		              },
		              function error(response){
		                  $scope.errorMessage = 'Error adding user!';
		                  $scope.message = '';
		            });
		        }
		        else {
		            $scope.errorMessage = 'Please enter a name!';
		            $scope.message = '';
		        }
		        $('#form_modal').modal('hide');
		    }
		    
		    $scope.deleteUser = function (project) {
		       var id=project;
		       alert("id :"+project);
		    	UserCRUDService.deleteUser(project)
		          .then (function success(response){
		        	  toastr.success(response.data.message, response.data.title, {
							closeButton:true
						});
		        	  $scope.message = 'User deleted!';
		              $scope.user = null;
		              $scope.errorMessage='';
		          },
		          function error(response){
		              $scope.errorMessage = 'Error deleting user!';
		              $scope.message='';
		          })
		    }
		    
		    $scope.getAllUsers = function () {
		        UserCRUDService.getAllUsers()
		          .then(function success(response){
		        	  $scope.jsonproductList=response.data;
		        	 // $scope.users = response.data._embedded.users;
		              $scope.message='';
		              $scope.errorMessage = '';
		          },
		          function error (response ){
		              $scope.message='';
		              $scope.errorMessage = 'Error getting users!';
		          });
		    }

		}]);

		app.service('UserCRUDService',['$http', function ($http) {
			
		    this.getUser = function getUser(userId){
		        return $http({
		          method: 'GET',
		          url: 'getUserData/'+userId
		        });
			}
		  // name,phone,email,country,city,address//users_form
		    //this.addUser = function addUser(username,phone,email,country,city,address){
		    this.addUser = function addUser(users_form){ 
			  return $http({
		          method: 'POST',
		          url: 'user',
		          //data: {name:name, email:email}  collage, mobile
		          data: {userId:users_form.userId,username:users_form.username,mobile:users_form.mobile,email:users_form.email,country:users_form.country,city:users_form.city,collage:users_form.collage}
			  });
		    }
			
		    this.deleteUser = function deleteUser(id){
		        alert("delete id :"+id);
		        toastr.warning("<div>Are you sure you want to delete this?</div>" +
		    			"<div class='btn-group pull-right'>" +
		    			"<button type='button' id='confirmationYes' class='btn btn-xs btn-default'><i class='glyphicon glyphicon-ok'></i> Yes</button>" +
		    			"<button type='button' class='btn btn-xs btn-default clear'><i class='glyphicon glyphicon-remove'></i> No</button>" +
		    			"</div>", "Delete Confirmation", {
		    		allowHtml:true,
		    		closeButton:true,
		    		onShown: function() {
		    			$("#confirmationYes").click(function() {
		    				return $http({
		          				method: 'DELETE',
		          				url: 'deleteUser/'+id
		        			})
		    			});
		    		}
		    	});
		      }
			
		  //  this.updateUser = function updateUser(users_form){
		      this.updateUser = function updateUser(users_form){  
			  alert("upppppp::"+users_form);
		        var userId=users_form.userId;
		    	//alert("users_form id :"+users_form.userId);
		    	return $http({
		         // method: 'PATCH',
		          method: 'PUT',
		          url: 'getUserData/'+userId,
		          //data: {name:name, email:email}
		          data: {username:users_form.username,mobile:users_form.mobile,email:users_form.email,country:users_form.country,city:users_form.city,collage:users_form.collage}
		        })
		    }
			
		    this.getAllUsers = function getAllUsers(){
		        return $http({
		          method: 'GET',
		          url: 'getUserData'
		        });
		    }

		}]);
</script>
</head>


<!-- <body ng-controller="products_controller" data-ng-init="productDetails()"> -->
<body ng-controller="products_controller" data-ng-init="getAllUsers()">
<header style="background: #171c66 !important;"><!--color:#ffae00;-->
	<div class="container-fluid">
	<div class="row">
    <div><h3 class="title" style="color:#ffae00;"><center> USER INFORMATION REPO</h3></center></div><br>
		<div class="col-md-6 logo">
			<!-- <img src="images/USER.png" class="img-responsive"> -->
		</div>
	</div>
</div>
</header>

<div class="generic-container" >
<div class="container">
		
		<div class="add_panel">
				<a ng-click="addModal();" class="model_form btn btn-primary">
				<i class="glyphicon glyphicon-plus pull-left"></i>Add User</a>
				            <div class="clearfix container"></div>
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
       <!--  <form ng-submit="ctrl.submit()" name="myForm"> -->
        <form  method="post" ng-submit="UserAddUpdate(users_form);" name="myform">
          <div class="modal-body with-padding">
 <!-- 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
 
 
			  <div class="row">
			<input type="hidden" name="hidden_id" ng-model="users_form.userId"  />
			<div class="col-sm-4">
			<label for="operator" class="form-control-label"> <b>Name</b></label>
			                      <input type="text" ng-model="users_form.username" class="form-control" name="name"  placeholder="Input name" />
			</div>
			<div class="col-sm-4">
			<label for="circle" class="form-control-label"><b>Email</b></label>
			<input type="text" ng-model="users_form.email" class="form-control" name="email"  placeholder="Input email" />
			</div>
			
			<div class="col-sm-4">
			<label for="type" class="form-control-label"><b>Phone</b></label>
			<input type="text" ng-model="users_form.mobile" class="form-control" name="phone"  placeholder="Input phone" />
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
			<input type="text" ng-model="users_form.collage" class="form-control" name="collage"  placeholder="Input collage" />
			</div>
			        </div><br>
			       
			            </div>
			<div class="modal-footer">
			<input type="hidden" name="hidden_id" value="{{hidden_id}}" />
			 <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
			 <button type="submit" value="{{!users_form.userId ? 'Add' : 'Update'}}" name="form_data" class="btn btn-primary">m</button>
			<input type="submit"  value="{{!users_form.userId ? 'Add' : 'Update'}}" class="btn btn-warning" >
			</div>
        </form>
      </div>
    </div>
  </div>
		

<!-- 000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
		<div class="row">
			<h1>Country Web -  Page</h1>
			<div class="table-responsive">
				<div id="exportable">
				
				<table datatable="ng"  id="examples" class="table table-striped  table-hover table-sm" cellspacing="0"  width="100%">
					<thead>
						<tr class="bg-primary">
						 	<th>USERID</th>
						    <th>CITY</th>
						    <th>COLLAGE</th>
						    <th>COUNTRY</th>
						    <th>EMAIL</th>
						    <th>MOBILE</th>
						   <th>USERNAME</th>
						   <th>Edit/Update</th>
						</tr>
					</thead>
					<tbody><!-- user_id ,city , collage , country , email , mobile , username  -->
						<tr ng-repeat="project in jsonproductList">
						<td>{{project.userId}}</td>
						<td>{{project.city}}</td>
						<td>{{project.collage}}</td>
						<td>{{project.country}}</td>
						<td>{{project.email}}</td>
						<td>{{project.mobile}}</td>
						<td>{{project.username}}</td>
						<!-- <td>{{project.start_DATE | date:'dd-MM-yyyy' }}</td> 
						<td>{{project.email | currency:"₹" }}</td>
						-->
						<td>
						<a href="javascript:void(0);" ng-click="updateUsers(project);">
						<i class="glyphicon glyphicon-edit btn btn-primary"></i>
						</a>
						<a href="javascript:void(0);" ng-click="deleteUser(project.userId)" class="delete">
						<i class="glyphicon glyphicon-trash btn btn-danger" ></i>
						</a>
						</td>
						</tr>
					</tbody>
				</table>
				</div>
			</div>
			
		</div>
		</div>
		
		</div>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>

</body>
</html>































<%-- 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="products.controller">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/le-frog/jquery-ui.css" />


<script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>

<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script type="text/javascript" src="https://cdn.bootcss.com/angular-datatables/0.6.4/angular-datatables.min.js"></script>





<script type="text/javascript">
	var app=angular.module("products.controller",['datatables']); //,'export.csv'  
	
	app.controller("products_controller",
			['$scope','$window','$http','$filter',
				function($scope,$window,$http){
				var REST_SERVICE_URI = 'http://localhost:5020/user/getUserData/';
				$('#ex').hide();
				$('#hidt').hide();
				
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
			 
		// for add record    
			    $scope.UserAddUpdate = function (users_form) {
			        var users_information = users_form;
			        alert("add");
			        var userId=users_information.userId;
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
			       //var REST_SERVICE_URI = 'http://localhost:5020/user/getUserData/';
			        $http({
			          url: "getUserData",
			          method: "POST",
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
			        	// alert("addsssssssssssssss");
			        	//if(sno! = null && !sno==""){
			        		if(userId!=null && userId!="undefined"){
			        			//$scope.success_msg = "Record Updated Successfully!!!!";
			        			$scope.success_msg = "Record Updated Successfully!!!!";
			        		   //alert("addsssssssssssssss updatesuresh--------------------");
			        		$scope.productDetails();
				 			
			        	}else{
			        		//alert("addsssssssssssssss addcccc");
			        		$scope.success_msg = "Record Added Successfully!!!!";
			        		//$scope.productDetails();
			        	}
			             
			         },function (error){
			        	 
			         alert("somthing error");
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
    		
			}]);
</script>
</head>
<body ng-controller="products_controller">

				<div class="pcoded-content">
				<div class="pcoded-inner-content">
				
				<div class="main-body">
				<div class="page-wrapper">
				
				
				
				<div class="page-body">
				<div class="row">
				<div class="col-sm-12">
				<br><br>
				<div class="card">
				
				<div class="add_panel">
				<a ng-click="addModal();" class="model_form btn btn-primary">
				<i class="glyphicon glyphicon-plus pull-left"></i>Open Form</a>
				            <div class="clearfix container"></div>
				</div>
				</div>
				
				</div>
				</div>
				</div>
				
				</div>
				</div>
				
				<div class="add_panel">
				<a ng-click="addModal();" class="model_form btn btn-primary">
				<i class="glyphicon glyphicon-plus pull-left"></i>Open Formnnnnnn</a>
				            <div class="clearfix container"></div>
				</div>
				<br><br><br><br>
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



</div>
</div>
</div>


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
			<input type="hidden" name="hidden_id" ng-model="users_form.userId"  />
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
 

</body>
</html>--%>