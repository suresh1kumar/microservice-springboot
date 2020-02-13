<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Dashboard</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  
  							   
  <link rel="stylesheet" href="cdn/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="cdn/bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="cdn/bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="cdn/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="cdn/dist/css/skins/_all-skins.min.css">
  <!-- Morris chart -->
  <link rel="stylesheet" href="cdn/cdn/bower_components/morris.js/morris.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="cdn/bower_components/jvectormap/jquery-jvectormap.css">
  <!-- Date Picker -->
  <link rel="stylesheet" href="cdn/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="cdn/bower_components/bootstrap-daterangepicker/daterangepicker.css">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet" href="cdn/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<link rel="stylesheet" href="imagesure/css/animate.min.css">
<script src="imagesure/js/jquery.min.js"></script>
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">



<script src="imagesure/js/wow.min.js"></script>
	<script>new WOW().init();</script>

	<style>
/*Style HTML tags*/
	body{
		font:400 15px Lato,sans-serif;
		line-height:1.8;
		color:#818181;
	}
	h1{
		font-size:5em !important;
	}
	footer{
		height:100%;
		background-color:#0080FF;	
	}
	footer a{
		color:#FFF;	
	}
	footer .glyphicon{
		font-size:20px;
		margin-bottom:20px;
		color:#FFF;		
	}
	footer a:hover{
		text-decoration:none;
		color:#D3D3D3;	
	}
/*Style Navigation Bar*/
	.navbar{
		margin-bottom:0;
		background-color:#0080FF;
		z-index:9999;
		border:0;
		font-size:12px !important;
		line-height:1.42 !important;
		letter-spacing:4px;
		border-radius:0;
		font-family:Montserrat,sans-serif;
	
		}
		.navbar li a, .navbar .navbar-brand{
		color:#FFF !important;	
		}
		.navbar-nav li a:hover, .navbar-nav li.active a{
		color:#0080FF !important;
		background-color:#FFF !important;
			
		}
		.navbar-brand>img{
		height:54px;
		width:auto;
		}
		.navbar-default .navbar-toggle{
			border-color:#FFF;
			color:#FFF !important;
		}
		.navbar-default .navbar-toggle .icon-bar{
			background-color:#FFF;

		}
		.navbar a{
			padding:2px 5px 2px 15px;
		}
/*Style Jumbotron*/
		.jumbotron{
			background-color:#0080FF;
			color:#FFF;
			padding:100px 25px;
			font-family:Montserrat, sans-serif;
		}
		.fa{
			font-size:20px;
			padding:0 10px;
		}
		.container-fluid{
			padding:60px 20px;
		}
		.text-white{
			color:#FFF;
		}
		.btn{
			background-color:#0080FF;
			color:#FFF;
		}
		.filter-button{
			font-size:18px;
			border:1px solid #42B32F;
			border-radius:5px;
			text-align:center;
			color:#FFF;
			margin-bottom:30px;
		}
		.filter-button:hover{
			font-size:18px;
			border:1px solid #42B32F;
			border-radius:5px;
			text-align:center;
			color:#FFF;
			background-color:#0000FF;
		}
		.btn-default:active .filter-button:active{
			background-color:#0000FF;
			color:#FFF;
		}
		.gallery-images{
			margin-bottom:30px;
			display:inline-block;
		}
		@media screen and (max-width:991px){
			.jumbotron{
				padding-top:150px;
				padding-bottom:50px;
			}
		}

		@media screen and (max-width:768px){
			.jumbotron{
				padding:50px 0;
			}
			h1{
				font-size:5em !important;
			}
			.col-sm-4{
				text-align:center;
				margin:25px 0;
			}
		}
		@media screen and (max-width:780px){
			h1{
				font-size:3em !important;
			}
		}
	</style>

</head>
<body class="hold-transition skin-blue sidebar-mini" id="myPage">
<div class="wrapper">


<%@ include file="header.jsp"%>

<%@ include file="sidenave.jsp"%>


  
  
  
  
 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h2>
        Page Header
        <small>Optional description</small>
      </h2>
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



<!--Navigation Bar Begins-->
<!-- <nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">

Button that replaces the navbar when Navbar is collapsed
			<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#myNavbar">
		Three Lines within the Button
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>

			</button>
		Logo on the top left corner
			<a href="#myPage" class="navbar-brand"><img src="img/bw-logo-t3.png"></a>		
		</div>
	Links in the navBar
		<div class="collapse navbar-collapse" id="#myNavbar">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="">ABOUT</a></li>
				<li><a href="">SERVICES</a></li>
				<li class="active"><a href="gallery.html">GALLERY</a></li>
				<li><a href="">PRICING</a></li>
				<li><a href="">OUR TEAM</a></li>
				<li><a href="">OUR CUSTOMERS</a></li>
				<li><a href="">CONTACT</a></li>
			</ul>
		</div>
	</div>
</nav> -->
<div>
<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#myNavbar">
</div>
<!--Navigation Bar End-->
<!--JUmbotron Begins-->
<div class="jumbotron text-center">
	<h1>Gallery</h1>
	<p>Lorem ipsum dolor sit amet, consectetur adipiscing edit</p>
</div>
<!--JUmbotron End-->
<!--Image Grid Begings-->
<div class="container-fluid">
	<div class="row">
<!-- Devide Screen width into 1/3 in mobile phone and 1/6 other Devices(Column for category button) -->
		<div class="col-lg-2 col-md-2 col-sm-2 col-xs-4">
			<button class="btn btn-default filter-button" data-filter="all">Gallery</button><br>

<button class="btn btn-default filter-button" data-filter="allahabad">Allahabad</button><br>
<button class="btn btn-default filter-button" data-filter="lucknow">Lucknow</button><br>
<button class="btn btn-default filter-button" data-filter="agra">Agra</button><br>
<button class="btn btn-default filter-button" data-filter="new-delhi">Delhi</button><br>
<button class="btn btn-default filter-button" data-filter="mumbai">Mumbai</button>
<button class="btn btn-default filter-button" data-filter="jammu-kashmir">kashmir</button>

		</div>

<!-- Devide Screen width into 2/3 in mobile phone and 5/6 other Devices (Image Grid)-->

<div class="col-lg-10 col-sm-10 col-md-10 col-xs-8">
<!--One Image in a row in mobile phone,Two in tablets,three in medium size Devices,and four in all other big screen Devices-->
<!--===============agra start===============-->
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter agra">
<img src="/imagesure/gallery-pics/agra/taj-mahal.jpg" class="img-responsive" title="Taj Mahal">
	</div>
<!-- /imagesure/gallery-pics/agra/agra-fort.jpg -->
	<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter agra">
<img src="/imagesure/gallery-pics/agra/agra-fort.jpg" class="img-responsive" title="agra-fort">
	</div>
<!--===============agra end===============-->

<!--===============allahabad start===============-->
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter allahabad">
<img src="/imagesure/gallery-pics/allahabad/all-saints-cathedral.jpg" class="img-responsive" title="all-saints-cathedral">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter allahabad">
<img src="/imagesure/gallery-pics/allahabad/kumbh-allahabad-1.jpg" class="img-responsive" title="kumbh-allahabad-1">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter allahabad">
<img src="/imagesure/gallery-pics/allahabad/kumbh-allahabad-3.jpg" class="img-responsive" title="kumbh-allahabad-3">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter allahabad">
<img src="/imagesure/gallery-pics/allahabad/naini-bridge.jpg" class="img-responsive" title="naini-bridge">
	</div>
<!--===============allahabad end===============-->


<!--===============jammu-kashmir start===============-->
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter jammu-kashmir">
<img src="/imagesure/gallery-pics/jammu-kashmir/himalayas.jpg" class="img-responsive" title="himalayas">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter jammu-kashmir">
<img src="/imagesure/gallery-pics/jammu-kashmir/sonamarg-valley.jpg" class="img-responsive" title="sonamarg-valley">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter jammu-kashmir">
<img src="/imagesure/gallery-pics/jammu-kashmir/suru-valley.jpg" class="img-responsive" title="suru-valley">
	</div>
<!--===============jammu-kashmir end===============-->

<!--===============lucknow start===============-->
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter lucknow">
<img src="/home/suresh/suresh-gallery/img/gallery-pics/lucknow/bara-imam-bara.JPG" class="img-responsive" title="himalayas">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter lucknow">
<img src="/imagesure/gallery-pics/lucknow/chota-imam-bara.jpg" class="img-responsive" title="sonamarg-valley">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter lucknow">
<img src="/imagesure/gallery-pics/lucknow/bara-imam-bara.JPG" class="img-responsive" title="suru-valley">
	</div>
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter lucknow">
<img src="/imagesure/gallery-pics/lucknow/bara-imam-bara.JPG" class="img-responsive" title="suru-valley">
	</div>
<!--===============lucknow end===============-->


<!--===============mumbai start===============-->
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter mumbai">
<img src="/imagesure/gallery-pics/mumbai/cstm.jpg" class="img-responsive" title="himalayas">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter mumbai">
<img src="/imagesure/gallery-pics/mumbai/gateway-of-india.JPG" class="img-responsive" title="sonamarg-valley">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter mumbai">
<img src="/imagesure/gallery-pics/mumbai/hotel-taj.jpg" class="img-responsive" title="suru-valley">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter mumbai">
<img src="/imagesure/gallery-pics/mumbai/suraj.jpg" class="img-responsive" title="suru-valley">
	</div>
<!--===============mumbai end===============-->

<!--===============mumbai start===============-->
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter new-delhi">
<img src="/imagesure/gallery-pics/new-delhi/akshardham-temple-1.jpg" class="img-responsive" title="himalayas">
	</div>

<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 gallery-images filter new-delhi">
<img src="/imagesure/gallery-pics/new-delhi/india-gate.jpg" class="img-responsive" title="sonamarg-valley">
	</div>
<!--===============mumbai end===============-->

</div>


	</div>
</div><br><br>
<!--Image Grid End-->

<!--Footer Begins-->
<footer class="container-fluid">
	<div class="row">
		<div class="col-sm-4">
			<h3 class="text-white">ABOUT<h3>
			<p class="text-white"><a href="#">About Us</a></p>
			<p class="text-white"><a href="#">Privacy</a></p>
		</div>
		<div class="col-sm-8 text-center">
			<h3 class="text-white">Socialise</h3>
			<a href="#"><i class="fa fa-facebook"></i></a>
			<a href="#"><i class="fa fa-youtube"></i></a>
			<a href="#"><i class="fa fa-twitter"></i></a>
			<a href="#"><i class="fa fa-instagram"></i></a>
			<a href="#"><i class="fa fa-pinterest"></i></a>
			<a href="#"><i class="fa fa-linkedin"></i></a>
		</div>
	</div>

<div class="row text-center">
	<a href="#myPage" title="TO Top"><span class="glyphicon glyphicon-chevron-up"></span></a>
	<p class="text-white">Bootstrap Theme Made by<a href="#" title="vigit me on Facebook">tsureshjavaorg.com</a></p>
</div>
</footer>
<!--Footer End-->
	<!--- if you are only going to call the JavaScript when the whole document is loaded then it is wise to put the JavaScript at the end of body. By putting .JS file at the end you load the whole page and then fetch the .JS file -->

	<!-- For Fetching the Images According to their Categories -->
    <script>
		$(document).ready(function(){
	    	$(".filter-button").click(function(){
	        	var value = $(this).attr('data-filter');
	        
	        	if(value == "all"){
	            	//$('.filter').removeClass('hidden');
	            	$('.filter').show('1000');
	        	}
	        	else{
					// $('.filter[filter-item="'+value+'"]').removeClass('hidden');
					// $(".filter").not('.filter[filter-item="'+value+'"]').addClass('hidden');
		            $(".filter").not('.'+value).hide('3000');
		            $('.filter').filter('.'+value).show('3000');
	            }
	    	});
	    
	    	if ($(".filter-button").removeClass("active")) {
				$(this).removeClass("active");
			}

			$(this).addClass("active");
		});
	</script>




<!-- 00000000000000000000000000000000000000000000000000000000000000000000000000000000 -->



<%@ include file="car.jsp"%>



<!-- 00000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
    </section>
    <!-- /.content -->
  </div>
  <%@ include file="footer.jsp"%> 
  
  <!-- /.content-wrapper -->
  
  
  
  
  
  
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
<script src="cdn/bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="cdn/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="cdn/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="cdn/bower_components/raphael/raphael.min.js"></script>
<script src="cdn/bower_components/morris.js/morris.min.js"></script>
<!-- Sparkline -->
<script src="cdn/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="cdn/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="cdn/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="cdn/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="cdn/bower_components/moment/min/moment.min.js"></script>
<script src="cdn/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="cdn/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="cdn/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="cdn/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="cdn/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="cdn/dist/js/adminlte.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="cdn/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="cdn/dist/js/demo.js"></script>
</body>
</html>