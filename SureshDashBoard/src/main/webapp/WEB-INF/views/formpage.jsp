<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Form | Page</title>
  
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="cdn/bootstrap.min.css">
 <link rel="stylesheet" href="cdn/font-awesome.min.css">
 <link rel="stylesheet" href="cdn/ionicons.min.css">
 <link rel="stylesheet" href="cdn/AdminLTE.min.css">
 <link rel="stylesheet" href="cdn/skin-blue.min.css">
 <link rel="stylesheet" href="cdn/w3.css">
 
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
<style type="text/css">
#forms{
height: 300px;
}
#exportable{
overflow-y:scroll;
height:500px;

}
</style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

<%@ include file="header.jsp"%>
<%@ include file="sidenave.jsp"%>

 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>Page Header
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

    <!-- Main content -->
    <section class="content container-fluid">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->
<h1> </h1>
<div class="container">
<div class = "w3-row w3-card-4  "  id="containerFORM">
<form  name="myForm" id="forms">
		
			<div class="w3-container w3-row-padding">
				<div class="w3-container w3-third">
					<label class = "w3-label w3-text-blue">Book Title</label>
						<input type="text" id="bookTitle" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your bookTitle" required />
					</div>
				<div class="w3-container w3-third">
					<label class = "w3-label w3-text-blue">Author Name</label>
					<input type="text" id="authorName" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your authorName" required />
				</div>
							
			<div class="w3-container w3-third">
				<label class = "w3-label w3-text-blue">Book Description</label>
					<input type="text" id="bookDescription" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your bookDescription" required />
				</div>
			</div>
		
			<div class="w3-container w3-row-padding">
				<div class="w3-container w3-third">
					<label class = "w3-label w3-text-blue">Book Price</label>
						<input type="text" id="bookPrice" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your bookPrice" />
					</div>
				<div class="w3-container w3-third">
					<label class = "w3-label w3-text-blue">Iteam</label>
					<input type="text" id="isbn" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your isbn"/>
				</div>
							
			<div class="w3-container w3-third">
				<label class = "w3-label w3-text-blue">Create Date</label>
					<input type="text" id="createDate" class="form-control form-control-sm form-rounded w3-hover-blue"
													 placeholder="Enter your createDate" />
				</div>
			</div><br>
			
			<div class="row">
				<div class="col-sm-2 ">
				</div>
				<div class="col-sm-4 ">
					 <INPUT TYPE="button" align="left" value="OK" class="btn btn-info btn-block w3-hover-blue" onclick="Search()"> 
				</div>
							           
				<div class="col-sm-4 ">
					<INPUT TYPE="button" align="left" value="Reset" class="btn btn-danger btn-block w3-hover-blue" onclick="resetall()"> 
				</div>
			</div><br>
		</form>
	</div>
</div>


<div class="row">
			<h1>Country Web -  Page</h1>
			<div class="table-responsive">
				<div id="exportable">
					<table datatable="ng"  id="examples" class="table table-striped  table-hover table-sm" cellspacing="0" width="100%">
						<thead>
							<tr class="bg-primary">
							
					       		<th>BookId</th>
								<th>BookTitle</th>
								<th>AuthorName</th> 
								<th>BookDescription</th>
								<th>BookPrice</th>
								<th>Isbn</th>
								<th>CreateDate</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
						<tr ng-repeat="project in ctrl.users">
							<!-- <tr ng-repeat="project in jsonproductLists"> -->
								<td>{{project.id }}</td>
								<td>{{project.bookTitle }}</td>
								 <td>{{project.authorName }}</td>
								<td>{{project.bookDescription }}</td>
								<td>{{project.bookPrice }}</td>
								<td>{{project.isbn }}</td>
								<td>{{project.createDate }}</td>
								<td>
                              		<button type="button" ng-click="ctrl.edit(project.id)" class="btn btn-success custom-width">Edit</button>  
                              		<button type="button" ng-click="ctrl.remove(project.id)" class="btn btn-danger custom-width">Remove</button>
                              	</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			
		</div>




    </section>
    <!-- /.content -->
  </div>
 <%@ include file="footer.jsp"%>
</div>
<script type="text/javascript" src="cdn/jquery.min.js"></script>
<script type="text/javascript" src="cdn/bootstrap.min.js"></script>
<script type="text/javascript" src="cdn/adminlte.min.js"></script>

</body>
</html>