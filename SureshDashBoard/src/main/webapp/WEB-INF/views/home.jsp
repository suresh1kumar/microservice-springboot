<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Home | Page</title>
  <!-- /Users-Account-Registration/src/main/resources/static/cdn/bootstrap.min.css -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

 <link rel="stylesheet" href="cdn/bootstrap.min.css">
 <link rel="stylesheet" href="cdn/font-awesome.min.css">
 <link rel="stylesheet" href="cdn/ionicons.min.css">
 <link rel="stylesheet" href="cdn/AdminLTE.min.css">
 <link rel="stylesheet" href="cdn/skin-blue.min.css">
 <link rel="stylesheet" href="cdn/car.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
<style type="text/css">


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
      <h1>
        Page Header
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->

<!-- 00000000000000000000000000000000000000000000000000000000000000000000000000000000 -->



<%@ include file="car.jsp"%>



<!-- 00000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
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