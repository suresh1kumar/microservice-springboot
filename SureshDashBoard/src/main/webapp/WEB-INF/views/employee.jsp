<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Employee</title>

<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="cdn/bootstrap.min.css"> 
 <link rel="stylesheet" href="cdn/font-awesome.min.css">
 <link rel="stylesheet" href="cdn/ionicons.min.css">
 <link rel="stylesheet" href="cdn/AdminLTE.min.css">
 <link rel="stylesheet" href="cdn/skin-blue.min.css">
 
 
 
    	<!-- <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> -->
    	<!-- <link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/le-frog/jquery-ui.css" /> -->
    	
    	
    	
        
 
 
 <!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
     	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->
      
      




 <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">


</head>
<body ng-app="EmployeeManagement" ng-controller="EmployeeController" class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

<%@ include file="header.jsp"%>
<%@ include file="sidenave.jsp"%>

 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1> Page Header
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li>
        	<a href="#">
        		<i class="fa fa-dashboard"></i> Level
        	</a>
        </li>
        <li class="active">Here</li>
      </ol>
    </section>
    
    
    
    
    
    
    
    <section class="content container-fluid">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->
        
        <!------------------------------
         | Your Page Content Here      |        
         ------------------------------->


<div class="generic-container" >
	<div class="container">
		
		
		
		<!-- Form modal -->
  
       
       
      
        <!-- Form inside modal -->
    <div class="container">
        <form ng-submit="submitEmployee()" >
        
		 	<input type="hidden" ng-model="employeeForm.empId" />
          <div class="modal-body with-padding">
					 
					 <div class="w3-container w3-row-padding">
						<div class="w3-container w3-half">
						<label for="operator" class="w3-text-blue"> <b>Employee No</b></label>
							<input type="text" ng-model="employeeForm.empNo" id="empNo" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your empNo" required ng-minlength="3"/>
						</div>
						<div class="w3-container w3-half">
						<label for="circle" class="w3-text-blue"><b>Description</b></label>
							<input type="text" ng-model="employeeForm.empName" id="destStation" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your empName" required ng-minlength="3"/>
						</div>
						
						
		         </div><br>
		         
            </div>
            
            <div class="row">
				<div class="col-sm-2 ">
				</div>
				<div class="col-sm-4 ">
					 <input type="submit"  value="Submit" class="btn btn-info btn-block w3-hover-blue" >
				</div>
				<div class="col-sm-4 ">
					<button type="button" ng-click="reset()" class="btn btn-danger btn-block w3-hover-blue" >Reset Form</button>
				</div>
			</div>
			
        </form>
    </div>
		

<!-- 000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
		<div class="row">
			<h1>Country Web -  Page</h1>
			<div class="table-responsive">
				<div id="exportable">
					<table datatable="ng"  id="examples" class="table table-striped  table-hover table-sm" cellspacing="0" width="100%">
						<thead>
							<tr class="bg-primary">
								<th>EMPLOYEE Id</th>
					            <th>EMPLOYEE No</th>
					            <th>EMPLOYEE Name</th>
					            <th>ACTION</th>
							</tr>
						</thead>
						<tbody>
						<tr ng-repeat="employee in employees">
								<td> {{ employee.empId }}</td>
            					<td> {{ employee.empNo }}</td>
            					<td >{{ employee.empName }}</td>
								<td>
								<button type="button" ng-click="editEmployee(employee)" class="btn btn-success custom-width">Edit</button>  
                              		<button type="button" ng-click="deleteEmployee(employee)" ng-confirm-click=" Are you SURE you want to Delete?" class="btn btn-danger custom-width">Remove</button>
                              		
                              		<!-- <button type="button" ng-click="ctrl.edit(project.userId)" class="btn btn-success custom-width">Edit</button>  
                              		<button type="button" ng-click="ctrl.remove(project.userId)" ng-confirm-click=" Are you SURE you want to Delete?" class="btn btn-danger custom-width">Remove</button> -->
                              	</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			
		</div>
		</div>
		
		</div>
	
	
	






<!-- <form ng-submit="submitEmployee()">
         <table border="0">
            <tr>
               <td>Emp Id</td>
               <td>{{employeeForm.empId}}</td>
            </tr>
            <tr>
               <td>Emp No</td>
               <td><input type="text" ng-model="employeeForm.empNo" /></td>
            </tr>
            <tr>
               <td>Emp Name</td>
               <td><input type="text" ng-model="employeeForm.empName"  /></td>
            </tr>
            <tr>
               <td colspan="2">
                  <input type="submit" value="Submit" class="blue-button" />
               </td>
            </tr>
         </table>
      </form>
      <br/>
      <a class="create-button" ng-click="createEmployee()">Create Employee</a>
      
 <div >     
      <div class="container">
      <div class="row">
			<h1>Country Web -  Page</h1>
			<div class="table-responsive">
				<div id="exportable">
					<table datatable="ng"  id="examples" class="table table-striped  table-hover table-sm" cellspacing="0" width="100%">
						<thead>
							<tr class="bg-primary">
							
					       		<th>EMPLOYEE Id</th>
					            <th>EMPLOYEE No</th>
					            <th>EMPLOYEE Name</th>
					            <th>ACTION</th>
							</tr>
						</thead>
						<tbody>
						<tr ng-repeat="employee in employees">
								<td> {{ employee.empId }}</td>
            					<td> {{ employee.empNo }}</td>
            					<td >{{ employee.empName }}</td>
								<td>
                              		<button type="button" ng-click="editEmployee(employee)" class="btn btn-success custom-width">Edit</button>  
                              		<button type="button" ng-click="deleteEmployee(employee)" ng-confirm-click=" Are you SURE you want to Delete?" class="btn btn-danger custom-width">Remove</button>
                              	</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
      </div>
 </h4>
  -->
 
 
 
    
    </section>
    </div>
</div>
  </div>
  <%@ include file="footer.jsp"%>
  
  
  
  
  
  
  
  
      
     <!--  <script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
    	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> -->
    	
    	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    	
      <!-- <script type="text/javascript" src="cdn/jquery.min.js"></script>
      <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> -->
      <script src="<c:url value='/static/bookangular/employee.js' />"></script>
<script type="text/javascript" src="cdn/bootstrap.min.js"></script>
<script type="text/javascript" src="cdn/adminlte.min.js"></script>
</body>
</html>