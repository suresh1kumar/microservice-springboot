<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/pivotal.css" />" />
	<title>spring-microservices: Home</title>
	
	<style >
	
	
	
ul { list-style: none; }
ul>li>a {
color: grey;
text-decoration: none;
line-height: 1.8;
}
ul>li>a:hover,
a:hover{
color: #ff6600;
font-weight: 500;
}

.col-heading {
display: block;
font-size: 2rem;
text-transform: uppercase;
color:#304f50;
font-weight: 500;
margin: 1rem 0;
padding: .4rem 0px;
border-bottom: 1px solid #c7c7c7; 
letter-spacing: 3px;
}

.fa {
color: #304f50;
margin-right: 10px;
font-size:18px;
width:2.25rem;
}
#to-top {
display: none;
position: fixed;
bottom: 40px;
right: 20px;
font-size: 18px;
border: none;
outline: none;
background-color: #304f50;
color: white;
padding: 15px;
border-radius: 14px;
cursor: pointer;
z-index: 99;
}
#to-top:hover {
background-color: #555;
}

#bottom-footer {
background-color:cadetblue;
color:white;
margin-top: 2rem;
padding-top: .3rem;
}
.vertical-links>li {
display: inline-block;
vertical-align: text-bottom;
}
.vertical-links>li>a {
color: white;
font-weight: 400;
margin-left: 1rem;
list-style-type:square;
}
	</style>
	
<style type="text/css">
.bgimg {
    background-image: url('<c:url value="resources/images/pivotal-logo-600.png" />');
}
</style>
</head>

<body >

	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<a title="Spring IO" href="http://www.spring.io"> 
							<img src="<c:url value="resources/images/spring-trans-dark.png"/>" height="50"/>
						</a>
						<b style="text-align:center">
							<a href="#">HOSPITAL MANAGEMENT</a>
						</b>
					</div>
					<div>
						<ul class="nav navbar-nav navbar-right">
							<li>
								<a href="http://www.pivotal.io">
									<img alt="Pivotal" title="Pivotal" height="20" src="<c:url value="resources/images/pivotal-logo-600.png" />" />
								</a>
							</li>
							
						</ul>
					</div>
				</div>
			</nav>
		</div>
		
		
<nav role="navigation" class="navbar navbar-default">
	<div class="">
		<a href="http://www.javaguides.net" class="navbar-brand">Java Guides</a>
	</div>
	<div class="navbar-collapse">
		<ul class="nav navbar-nav">
		<li><a href="institute-form">Add institute</a></li>
			<!-- <li class="active"><a href="/">Home</a></li>
			<li><a href="institute-form">Patients</a></li>
			<li><a href="homephysiciansList_url">Physicians</a></li> -->
			<li><a href="#">Diseases</a></li>
		</ul>
		<ul class="nav navbar-nav">
			<!-- <li><a href="/logout">Logout</a></li> -->
		</ul>
	</div>
</nav>
	
<div style="background-image: url('https://images.pexels.com/photos/263210/pexels-photo-263210.jpeg?cs=srgb&dl=adult-ambulance-care-263210.jpg&fm=jpg'); height: 500px; width: 1200px; background-repeat: no-repeat;">Text here</div>
	
	
</div>	


<!-- <br></br><br></br><br></br><br></br> -->

<div class="container-fluid" style="background-color:#eff5f5;">
    <div class="row  row-no-gutters">
      <div class="col-xs-12 col-sm-6 col-md-3" >
        <ul>
          <li class="col-heading">Subheading</li>
          <li>
            <i class="fa fa-phone" aria-hidden="true"></i><a href="tel:+917670852491">+917670852491</a>
          </li>
          <li>
            <i class="fa fa-mobile" aria-hidden="true"></i><a href="sms:+917670852491">SMS Message</a>
          </li>
          <li>
             <i class="fa fa-map-marker" aria-hidden="true"></i><a href="#">Address</a>
          </li> 
          <li>
             <i class="fa fa-envelope-square" aria-hidden="true"></i><a href="mailto:someone@yoursite.com?subject=Email Subject line">Email Us</a>  
          </li> 
        </ul>
      </div>     

      <div class="col-xs-12 col-sm-6 col-md-3" >
        <ul>
          <li class="col-heading">Subheading</li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
        </ul>
      </div>      

      <div class="col-xs-12 col-sm-6 col-md-3" >
        <ul>
          <li class="col-heading">Subheading</li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
        </ul>
      </div>
      
      <div class="col-xs-12 col-sm-6 col-md-3" >
        <ul>
          <li class="col-heading">Subheading</li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
          <li><a href="#">Link to page</a></li>
        </ul>
      </div>
    </div> <!--  end row  -->
    
    <div class="row row-no-gutters" id="bottom-footer" >
      
      <div class="col-xs-12 col-md-5 text-center" >
          <ul class="vertical-links small">
            <li><a href="#">Privacy</a></li>
            <li><a href="#">Terms & Conditions</a></li>
            <li><a href="#">Site Map</a></li>
            <li><a href="#">Contact Us</a></li>
          </ul>
      </div>
      <div class="col-xs-12 col-md-2 text-center" >
        <p><i class="fa fa-heart-o" aria-hidden="true"></i></p>
      </div>
      <div class="col-xs-12 col-md-5 text-center" >
        <ul>
          <li class="small">© Copyright 2019 Website by <a href="#" style="color:white;font-weight:500;">Developr</a>. All Rights reserved.</li>
        </ul>
      </div>
    </div> <!--  end row  -->

  </div> <!--  end container-fluid  -->


</body>
</html>
