<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html ng-app="products.controller">
<head>
<meta charset="UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title> Institute || Form</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  
  							   
  <link rel="stylesheet" href="cdn/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="cdn/bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="cdn/bower_components/Ionicons/css/ionicons.min.css">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="cdn/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="cdn/dist/css/skins/_all-skins.min.css">
  <!-- Morris chart -->
  <link rel="stylesheet" href="cdn/bower_components/morris.js/morris.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="cdn/bower_components/jvectormap/jquery-jvectormap.css">
  <!-- Date Picker -->
  <link rel="stylesheet" href="cdn/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="cdn/bower_components/bootstrap-daterangepicker/daterangepicker.css">
  <!-- bootstrap wysihtml5 - text editor -->
  
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  
  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">


<style type="text/css">
  .form-rounded {
border-radius: 1rem;
}
.btn-block{
border-radius: 1rem;
}
  #containerFORM {
   padding-right: 20px;
   padding-left: 20px;
   margin-right: auto;
   margin-left: auto;
   max-width: 1050px;
   overflow:hidden;
   min-height:0px;
}
select {
  text-align: center;
  text-align-last: center;
}
option {
  text-align: left;
}
.date1 {
    text-align: center;
    }
  </style>
  <style>
	.center{
	    position:absolute;
	    display:block;
	    left:35%;
	    top:35%;
	}
	</style>
	<style type="text/css">
	h3 {color:red;}
	


h2 {
    text-shadow: 2px 2px #FF0000;
}
.pp{
    width: 1250px;
    height: 550px;
    padding: 100px;
    
    box-shadow: 10px 10px grey;
}

	</style>

<style>
    /* Some custom styles to beautify this example */
    .row{     
        margin-top: 1rem;
       /* background: #dbdfe5;*/
    }
    [class^=col]{
        padding: 10px 15px;
        /*background: #abb1b8;*/
        border: 1px solid rgba(0,0,0,0.5)
    }
</style>
<script type="text/javascript">
	var app=angular.module("products.controller",[]);///'angularUtils.directives.dirPagination'  //,'export.csv'  
	
	
	app.controller("products_controller",
			['$scope','$window','$http','$filter',
				function($scope,$window,$http){
				
				$('#ex').hide();
				$('#hidt').hide();
				
				$scope.productDetails=function(){
					
				$http({
					url:"../../save-institute",
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
			   /*  $scope.addModal = function() {
					$scope.users_form = angular.copy($scope.master);
			        $scope.form_name = 'Add New Plan Information!!';
			        $('#form_modal').modal('show');
			    }; */
			    
			  
	         
		// for add record    
			    $scope.UserAddUpdate = function (users_form) {
			        var users_information = users_form;
			        alert("add");
			      
			        var name = users_information.name;//operator,circle
			        var phone=users_information.contact.phone;
			        var email=users_information.contact.email;   
			        var city=users_information.contact.permanentAddress.city;
			        var country=users_information.contact.permanentAddress.country;
			        
			        var zip=users_information.contact.permanentAddress.zip;
			        var detail=users_information.contact.permanentAddress.detail;
			        
			       
				    alert("name ::"+name);
			        alert("phone:"+phone);
			        alert("email:"+email);
			        alert("city- ::"+city);
			        alert("country- ::"+country);
			        
			        $http({
			          url: "http://localhost:5039/save-institute",
			          method: "GET",
			          //data: users_information,
			          params:{
			        	  	"name":name,
							"phone":phone,
							"email":email,
							"city":city,
							"country":country,
							"zip":zip,
							"detail":detail
							
						}
			         }).then(function(response) {
			        	 alert("addsssssssssssssss");
			        	//if(sno! = null && !sno==""){
			        		if(sno!=null && sno!="undefined"){
			        			//$scope.success_msg = "Record Updated Successfully!!!!";
			        			$scope.success_msg = "Record Updated Successfully!!!!";
			        		   //alert("addsssssssssssssss updatesuresh--------------------");
			        		//$scope.productDetails();
				 			
			        	}else{
			        		//alert("addsssssssssssssss addcccc");
			        		$scope.success_msg = "Record Added Successfully!!!!";
			        		$scope.productDetails();
			        	}
			             
			         },function (error){
			 			console.log(error);
			 		});
			        //$('#form_modal').modal('hide');
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
<div class="container">

<!-- <form>
	 <div class="row">
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Email :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Password :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p><p>Email2 :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Password2 :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Email3 :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Password3 :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
        </div>
        <div class="row">
		    <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Example Text area :</p></div>
		    <textarea class="col-sm-10 col-md-10 col-lg-10 col-xl-10" id="textarea1" ></textarea>
		</div>
		<div class="row">
			<div class="col-sm-2 ">
		</div>
		<div class="col-sm-4 ">
			<button type="button" class="btn btn-danger btn-block w3-hover-danger" data-dismiss="modal">Cancel</button>
		</div>
					           
		<div class="col-sm-4 ">
			<button type="submit" name="form_data" class="btn btn-info btn-block w3-hover-blue">Institute</button>
		</div><br>
	 </div> <br>
</form> -->
<br><br>
 <div class = "w3-row w3-card-4  "  id="containerFORM">
 <br><br>
 
 
 

 <form  ng-submit="UserAddUpdate(users_form);">
 <br><br>
 

	 <div class="row">
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Institute Name :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" ng-model="users_form.name" class="form-control" id="name" placeholder="Institute name">
            </div>
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Phone :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" ng-model="users_form.contact.phone" class="form-control" id="phone" placeholder="phone number">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p><p>Email :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" ng-model="users_form.contact.email" class="form-control" id="email" placeholder="Email">
            </div>
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>City :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" ng-model="users_form.contact.permanentAddress.city" class="form-control" id="city" placeholder="City">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Country :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" ng-model="users_form.contact.permanentAddress.country" class="form-control" id="country" placeholder="country">
            </div>
            <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Zip/Pin Code :</p></div>
            <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4">
            	<input type="text" ng-model="users_form.contact.permanentAddress.zip" class="form-control" id="zip" placeholder="Zip/Pin Code">
            </div>
        </div>
        <div class="row">
		    <div class="col-sm-2 col-md-2 col-lg-2 col-xl-2"><p>Example Text area :</p></div>
		    <textarea ng-model="users_form.contact.permanentAddress.detail" class="col-sm-10 col-md-10 col-lg-10 col-xl-10" id="textarea1" ></textarea>
		</div>
		<div class="row">
			<div class="col-sm-2 ">
		</div>
		<div class="col-sm-4 ">
			<button type="button" class="btn btn-danger btn-block w3-hover-danger" data-dismiss="modal">Cancel</button>
		</div>
					           
		<div class="col-sm-4 ">
			<button type="submit" name="form_data" class="btn btn-info btn-block w3-hover-blue">Institute</button>
		</div><br>
	 </div> <br>

<br><br>
 
 <!-- ----------------------------------------------- -->


		 <!-- <div class="w3-container w3-row-padding">
			<div class="w3-container w3-half">
			<label for="Institute" class="w3-text-blue"><b>Institute Name</b></label>
				<input type="text" ng-model="users_form.name" class="form-control form-control-sm form-rounded" name="name"  placeholder="Input name" />
			</div>
			<div class="w3-container w3-half">
			<label for="Phone" class="w3-text-blue"><b>Phone</b></label>
				<input type="text" ng-model="users_form.contact.phone" class="form-control form-control-sm form-rounded" name="Phone" placeholder="Input Phone" />
			</div>
		</div><br>
		
		
		<div class="w3-container w3-row-padding">
			<div class="w3-container w3-half">
			<label for="Email" class="w3-text-blue"><b>Email</b></label>
				<input type="text" ng-model="users_form.contact.email" class="form-control form-control-sm form-rounded" name="Email" placeholder="Input Email" />
			</div>
			<div class="w3-container w3-half">
			<label for="city" class="w3-text-blue"><b>City</b></label>
				<input type="text" ng-model="users_form.contact.contact.permanentAddress.city" class="form-control form-control-sm form-rounded" name="city" placeholder="Input city" />
			</div>
		</div><br>
		
		<div class="w3-container w3-row-padding">
			<div class="w3-container w3-half">
			<label for="country" class="w3-text-blue"><b>Country</b></label>
				<input type="text" ng-model="users_form.contact.permanentAddress.country" class="form-control form-control-sm form-rounded" name="country" placeholder="Input country" />
			</div>
			<div class="w3-container w3-half">
			<label for="zip" class="w3-text-blue"><b>Zip/Pin Code</b></label>
				<input type="text" ng-model="users_form.contact.permanentAddress.zip" class="form-control form-control-sm form-rounded" name="zip" placeholder="Input zip" />
			</div>
		</div><br>
		
		<div class="w3-container w3-row-padding">
			<div class="w3-container w3-half">
			<label for="country" class="w3-text-blue"><b>Address Detail</b></label>
				<input type="text" ng-model="users_form.contact.permanentAddress.detail" class="form-control form-control-sm form-rounded" name="details" placeholder="House No, Street, Landmark" />
			</div>
		</div><br>
		
		<div class="row">
			<div class="col-sm-2 ">
		</div>
		<div class="col-sm-4 ">
			<button type="button" class="btn btn-danger btn-block w3-hover-danger" data-dismiss="modal">Cancel</button>
		</div>
					           
		<div class="col-sm-4 ">
			<button type="submit" name="form_data" class="btn btn-info btn-block w3-hover-blue">Institute</button>
		</div><br>
	 </div> <br> -->
	 
	 
	 
	 	
		
                <!-- <table border="1" width="90%" align="center" cellpadding="5">     
                    <tr>
                        <td class="fheading"  colspan="4">Institute Form</td>
                    </tr>
                    <tr>
                        <td>Institute Name</td>
                        <td>
                            <input type="text" th:field="*{name}"/>
                        </td>
                        <td>Phone</td>
                        <td width="50%"><input type="text" th:field="*{contact.phone}"/></td>                       
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" th:field="*{contact.email}"/></td>
                        <td>City</td>
                        <td><input type="text" th:field="*{contact.permanentAddress.city}" /></td>                       
                    </tr>
                    <tr>                       
                        <td>Country</td>
                        <td>
                            <input type="text" th:field="*{contact.permanentAddress.country}"/>
                        </td>
                        <td>Zip/Pin Code</td>
                        <td><input type="text" th:field="*{contact.permanentAddress.zip}"/></td>
                    </tr>
                    <tr>
                        <td>Address Detail</td>
                        <td colspan="3">
                            <textarea th:field="*{contact.permanentAddress.detail}" placeholder="House No, Street, Landmark" title="description" cols="60" rows="3"></textarea>
                        </td>
                    </tr>               
                    <tr>                    
                        <td colspan="4" align="center">
                            <button >Save</button>
                        </td>                                        
                    </tr>

                </table> -->
            </form>
     </div> 
     </div>      
            <br><br>
            
   <!-- jQuery 3 -->
<!-- <script src="cdn/bower_components/jquery/dist/jquery.min.js"></script> -->

<!-- jQuery UI 1.11.4 -->
<script src="cdn/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->




<!-- Bootstrap 3.3.7 -->
<script src="cdn/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="cdn/bower_components/raphael/raphael.min.js"></script>
<script src="cdn/bower_components/morris.js/morris.min.js"></script>
<!-- Sparkline -->
<script src="cdn/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<!-- jvectormap -->

<!-- jQuery Knob Chart -->
<script src="cdn/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="cdn/bower_components/moment/min/moment.min.js"></script>

<!-- Slimscroll -->
<script src="cdn/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="cdn/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->


</body>
</html>