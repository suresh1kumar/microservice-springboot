<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
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

<link rel="stylesheet" type="text/css" href="bower_components/font-awesome/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="assets/pages/advance-elements/css/bootstrap-datetimepicker.css">

<link rel="stylesheet" type="text/css" href="bower_components/bootstrap-daterangepicker/daterangepicker.css" />

<link rel="stylesheet" type="text/css" href="bower_components/datedropper/datedropper.min.css" />

<link rel="stylesheet" type="text/css" href="bower_components/datatables.net-bs4/css/dataTables.bootstrap4.min.css">

<link rel="stylesheet" type="text/css" href="assets/icon/themify-icons/themify-icons.css">

<link rel="stylesheet" type="text/css" href="assets/icon/icofont/css/icofont.css">

<link rel="stylesheet" type="text/css" href="assets/pages/flag-icon/flag-icon.min.css">

<link rel="stylesheet" type="text/css" href="assets/pages/menu-search/css/component.css">

<link rel="stylesheet" type="text/css" href="assets/css/style.css">

<link rel="stylesheet" type="text/css" href="assets/css/color/color-1.css" id="color" />
<link rel="stylesheet" type="text/css" href="assets/css/linearicons.css">
<link rel="stylesheet" type="text/css" href="assets/css/simple-line-icons.css">
<link rel="stylesheet" type="text/css" href="assets/css/ionicons.css">
<link rel="stylesheet" type="text/css" href="assets/css/jquery.mCustomScrollbar.css">
</head>




<%@ include file="optionalBody.jsp"%>


<%@ include file="header_nave_bar.jsp"%>








<div class="pcoded-content">
<div class="pcoded-inner-content">

<div class="main-body user-profile">
<div class="page-wrapper">

<div class="page-header">
<div class="page-header-title">
<h4>User Profile</h4>
</div>
<div class="page-header-breadcrumb">
<ul class="breadcrumb-title">
<li class="breadcrumb-item">
<a href="index-2.html">
<i class="icofont icofont-home"></i>
</a>
</li>
<li class="breadcrumb-item"><a href="#!">User Profile</a>
</li>
<li class="breadcrumb-item"><a href="#!">User Profile</a>
</li>
</ul>
</div>
</div>


<div class="page-body">

<div class="row">
<div class="col-lg-12">
<div class="cover-profile">
<div class="profile-bg-img">
<img class="profile-bg-img img-fluid" src="assets/images/user-profile/bg-img1.jpg" alt="bg-img">
<div class="card-block user-info">
<div class="col-md-12">
<div class="media-left">
<a href="#" class="profile-image">
<img class="user-img img-circle" src="assets/images/user-profile/user-img.jpg" alt="user-img">
</a>
</div>
<div class="media-body row">
<div class="col-lg-12">
<div class="user-title">
<h2>Josephin Villa</h2>
<span class="text-white">Web designer</span>
</div>
</div>
<div>
<div class="pull-right cover-btn">
<button type="button" class="btn btn-primary m-r-10"><i class="icofont icofont-plus"></i> Follow</button>
<button type="button" class="btn btn-primary"><i class="icofont icofont-ui-messaging"></i> Message</button>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>

<div class="row">
<div class="col-lg-12">

<div class="tab-header">
<ul class="nav nav-tabs md-tabs tab-timeline" role="tablist" id="mytab">
<li class="nav-item">
<a class="nav-link active" data-toggle="tab" href="#personal" role="tab">Personal Info</a>
<div class="slide"></div>
</li>
<li class="nav-item">
<a class="nav-link" data-toggle="tab" href="#binfo" role="tab">User's Services</a>
<div class="slide"></div>
</li>
<li class="nav-item">
<a class="nav-link" data-toggle="tab" href="#contacts" role="tab">User's Contacts</a>
<div class="slide"></div>
</li>
<li class="nav-item">
<a class="nav-link" data-toggle="tab" href="#review" role="tab">Reviews</a>
<div class="slide"></div>
</li>
</ul>
</div>


<div class="tab-content">

<div class="tab-pane active" id="personal" role="tabpanel">

<div class="card">
<div class="card-header">
<h5 class="card-header-text">About Me</h5>
<button id="edit-btn" type="button" class="btn btn-sm btn-primary waves-effect waves-light f-right">
<i class="icofont icofont-edit"></i>
</button>
</div>
<div class="card-block">
<div class="view-info">
<div class="row">
<div class="col-lg-12">
<div class="general-info">
<div class="row">
<div class="col-lg-12 col-xl-6">
<table class="table m-0">
<tbody>
<tr>
<th scope="row">Full Name</th>
<td>Suresh Kumar Gupta</td>
</tr>
<tr>
<th scope="row">Gender</th>
<td>Mail</td>
</tr>
<tr>
<th scope="row">Birth Date</th>
<td>May 5th, 1990</td>
</tr>
<tr>
<th scope="row">Marital Status</th>
<td>Single</td>
</tr>
<tr>
<th scope="row">Location</th>
<td>Hyderabad (Telangana)</td>
</tr>
</tbody>
</table>
</div>

<div class="col-lg-12 col-xl-6">
<table class="table">
<tbody>
<tr>
<th scope="row">Email</th>
<td><a href="#!"><span class="__cf_email__" data-cfemail="b9fddcd4d6f9c9d1dcd7d0c197dad6d4">[email&#160;protected]</span></a></td>
</tr>
<tr>
<th scope="row">Mobile Number</th>
<td>(+91) - 7670852491</td>
</tr>
<tr>
<th scope="row">Twitter</th>
<td>@SKumar8409</td>
</tr>
<tr>
<th scope="row">Skype</th>
<td>suresh kumar(7670852491)</td>
</tr>
<tr>
<th scope="row">Website</th>
<td><a href="#!">https://sureshjavaorg.cfapps.io</a></td>
</tr>
</tbody>
</table>
</div>

</div>

</div>

</div>

</div>

</div>

<div class="edit-info">
<div class="row">
<div class="col-lg-12">
<div class="general-info">
<div class="row">
<div class="col-lg-6">
<table class="table">
<tbody>
<tr>
<td>
<div class="input-group">
<span class="input-group-addon"><i class="icofont icofont-user"></i></span>
<input type="text" class="form-control" placeholder="Full Name">
</div>
</td>
</tr>
<tr>
<td>
<div class="form-radio">
<div class="group-add-on">
<div class="radio radiofill radio-inline">
<label>
<input type="radio" name="radio" checked><i class="helper"></i> Male
</label>
</div>
<div class="radio radiofill radio-inline">
<label>
<input type="radio" name="radio"><i class="helper"></i> Female
</label>
</div>
</div>
</div>
</td>
</tr>
<tr>
<td>
<input id="dropper-default" class="form-control" type="text" placeholder="Select Your Birth Date" />
</td>
</tr>
<tr>
<td>
<select id="hello-single" class="form-control">
<option value="">---- Marital Status ----</option>
<option value="married">Married</option>
<option value="unmarried">Unmarried</option>
</select>
</td>
</tr>
<tr>
<td>
<div class="input-group">
<span class="input-group-addon"><i class="icofont icofont-location-pin"></i></span>
<input type="text" class="form-control" placeholder="Address">
</div>
</td>
</tr>
</tbody>
</table>
</div>

<div class="col-lg-6">
<table class="table">
<tbody>
<tr>
<td>
<div class="input-group">
<span class="input-group-addon"><i class="icofont icofont-mobile-phone"></i></span>
<input type="text" class="form-control" placeholder="Mobile Number">
</div>
</td>
</tr>
<tr>
<td>
<div class="input-group">
<span class="input-group-addon"><i class="icofont icofont-social-twitter"></i></span>
<input type="text" class="form-control" placeholder="Twitter Id">
</div>
</td>
</tr>

<tr>
<td>
<div class="input-group">
<span class="input-group-addon"><i class="icofont icofont-social-skype"></i></span>
<input type="email" class="form-control" placeholder="Skype Id">
</div>
</td>
</tr>
<tr>
<td>
<div class="input-group">
<span class="input-group-addon"><i class="icofont icofont-earth"></i></span>
<input type="text" class="form-control" placeholder="website">
</div>
</td>
</tr>
</tbody>
</table>
</div>

</div>

<div class="text-center">
<a href="#!" class="btn btn-primary waves-effect waves-light m-r-20">Save</a>
<a href="#!" id="edit-cancel" class="btn btn-default waves-effect">Cancel</a>
</div>
</div>

</div>

</div>

</div>

</div>

</div>
<div class="row">
<div class="col-lg-12">
<div class="card">
<div class="card-header">
<h5 class="card-header-text">Description About Me</h5>
<button id="edit-info-btn" type="button" class="btn btn-sm btn-primary waves-effect waves-light f-right">
<i class="icofont icofont-edit"></i>
</button>
</div>
<div class="card-block user-desc">
<div class="view-desc">
<p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?" "On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able To Do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pain.</p>
</div>
<div class="edit-desc">
<div class="col-md-12">
<textarea id="description">
                                                            <p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?" "On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able To Do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pain.</p>
                                                        </textarea>
</div>
<div class="text-center">
<a href="#!" class="btn btn-primary waves-effect waves-light m-r-20 m-t-20">Save</a>
<a href="#!" id="edit-cancel-btn" class="btn btn-default waves-effect m-t-20">Cancel</a>
</div>
</div>
</div>
</div>
</div>
</div>

</div>


<div class="tab-pane" id="binfo" role="tabpanel">

<div class="card">
<div class="card-header">
<h5 class="card-header-text">User Services</h5>
</div>
<div class="card-block">
<div class="row">
<div class="col-md-6">
<div class="card b-l-success business-info services m-b-20">
<div class="card-header">
<div class="service-header">
<a href="#"><h5 class="card-header-text">Shivani Hero</h5></a>
</div>
<span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip">
</span>
<div class="dropdown-menu dropdown-menu-right b-none services-list">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i> Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i> Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i> View</a>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-12">
<p class="task-detail">Lorem ipsum dolor sit amet, consectet ur adipisicing elit, sed do eiusmod temp or incidi dunt ut labore et.Lorem ipsum dolor sit amet, consecte.</p>
</div>

</div>

</div>

</div>
</div>
<div class="col-md-6">
<div class="card b-l-danger business-info services">
<div class="card-header">
<div class="service-header">
<a href="#"><h5 class="card-header-text">Dress and Sarees</h5></a>
</div>
<span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip">
</span>
<div class="dropdown-menu dropdown-menu-right b-none services-list">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i> Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i> Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i> View</a>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-12">
<p class="task-detail">Lorem ipsum dolor sit amet, consectet ur adipisicing elit, sed do eiusmod temp or incidi dunt ut labore et.Lorem ipsum dolor sit amet, consecte.</p>
</div>

</div>

</div>

</div>
</div>
<div class="col-md-6">
<div class="card b-l-info business-info services">
<div class="card-header">
<div class="service-header">
<a href="#"><h5 class="card-header-text">Shivani Auto Port</h5></a>
</div>
<span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip">
</span>
<div class="dropdown-menu dropdown-menu-right b-none services-list">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i> Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i> Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i> View</a>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-12">
<p class="task-detail">Lorem ipsum dolor sit amet, consectet ur adipisicing elit, sed do eiusmod temp or incidi dunt ut labore et.Lorem ipsum dolor sit amet, consecte.</p>
</div>

</div>

</div>

</div>
</div>
<div class="col-md-6">
<div class="card b-l-warning business-info services">
<div class="card-header">
<div class="service-header">
<a href="#"><h5 class="card-header-text">Hair stylist</h5></a>
</div>
<span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip">
</span>
<div class="dropdown-menu dropdown-menu-right b-none services-list">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i> Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i> Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i> View</a>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-12">
<p class="task-detail">Lorem ipsum dolor sit amet, consectet ur adipisicing elit, sed do eiusmod temp or incidi dunt ut labore et.Lorem ipsum dolor sit amet, consecte.</p>
</div>

</div>

</div>

</div>
</div>
<div class="col-md-6">
<div class="card b-l-danger business-info services">
<div class="card-header">
<div class="service-header">
<a href="#"><h5 class="card-header-text">BMW India</h5></a>
</div>
<span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip">
</span>
<div class="dropdown-menu dropdown-menu-right b-none services-list">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i> Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i> Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i> View</a>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-12">
<p class="task-detail">Lorem ipsum dolor sit amet, consectet ur adipisicing elit, sed do eiusmod temp or incidi dunt ut labore et.Lorem ipsum dolor sit amet, consecte.</p>
</div>

</div>

</div>

</div>
</div>
<div class="col-md-6">
<div class="card b-l-success business-info services">
<div class="card-header">
<div class="service-header">
<a href="#"><h5 class="card-header-text">Shivani Hero</h5></a>
</div>
<span class="dropdown-toggle addon-btn text-muted f-right service-btn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="tooltip">
</span>
<div class="dropdown-menu dropdown-menu-right b-none services-list">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i> Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i> Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i> View</a>
</div>
</div>
<div class="card-block">
<div class="row">
<div class="col-sm-12">
<p class="task-detail">Lorem ipsum dolor sit amet, consectet ur adipisicing elit, sed do eiusmod temp or incidi dunt ut labore et.Lorem ipsum dolor sit amet, consecte.</p>
</div>

</div>

</div>

</div>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-lg-12">
<div class="card">
<div class="card-header">
<h5 class="card-header-text">Profit</h5>
</div>
<div class="card-block">
<div id="main" style="height:300px;width: 100%;"></div>
</div>
</div>
</div>
</div>

</div>


<div class="tab-pane" id="contacts" role="tabpanel">
<div class="row">
<div class="col-lg-3">

<div class="card">
<div class="card-header contact-user">
<img class="img-circle" src="assets/images/user-profile/contact-user.jpg" alt="contact-user">
<h4>Angelica Ramos</h4>
</div>
<div class="card-block">
<ul class="list-group list-contacts">
<li class="list-group-item active"><a href="#">All Contacts</a></li>
<li class="list-group-item"><a href="#">Recent Contacts</a></li>
<li class="list-group-item"><a href="#">Favourite Contacts</a></li>
</ul>
</div>
<div class="card-block groups-contact">
<h4>Groups</h4>
<ul class="list-group">
<li class="list-group-item justify-content-between">
Project
<span class="badge badge-default badge-pill">30</span>
</li>
<li class="list-group-item justify-content-between">
Notes
<span class="badge badge-default badge-pill">20</span>
</li>
<li class="list-group-item justify-content-between">
Activity
<span class="badge badge-default badge-pill">100</span>
</li>
<li class="list-group-item justify-content-between">
Schedule
<span class="badge badge-default badge-pill">50</span>
</li>
</ul>
</div>
</div>
<div class="card">
<div class="card-header">
<h4 class="card-title">Contacts<span class="f-15"> (100)</span></h4>
</div>
<div class="card-block">
<div class="connection-list">
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-1.jpg" alt="f-1" data-toggle="tooltip" data-placement="top" data-original-title="Airi Satou">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-2.jpg" alt="f-2" data-toggle="tooltip" data-placement="top" data-original-title="Angelica Ramos">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-3.jpg" alt="f-3" data-toggle="tooltip" data-placement="top" data-original-title="Ashton Cox">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-4.jpg" alt="f-4" data-toggle="tooltip" data-placement="top" data-original-title="Cara Stevens">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-5.jpg" alt="f-5" data-toggle="tooltip" data-placement="top" data-original-title="Garrett Winters">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-1.jpg" alt="f-6" data-toggle="tooltip" data-placement="top" data-original-title="Cedric Kelly">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-3.jpg" alt="f-7" data-toggle="tooltip" data-placement="top" data-original-title="Brielle Williamson">
</a>
<a href="#"><img class="img-fluid img-circle" src="assets/images/user-profile/follower/f-5.jpg" alt="f-8" data-toggle="tooltip" data-placement="top" data-original-title="Jena Gaines">
</a>
</div>
</div>
</div>

</div>
<div class="col-lg-9">
<div class="row">
<div class="col-sm-12">

<div class="card">
<div class="card-header">
<h5 class="card-header-text">Contacts</h5></div>
 <div class="card-block contact-details">
<div class="data_table_main table-responsive dt-responsive">
<table id="simpletable" class="table  table-striped table-bordered nowrap">
<thead>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobileno.</th>
<th>Favourite</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="b4d5d6d7858687f4d3d9d5ddd89ad7dbd9">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="e4858687d5d6d7a48389858d88ca878b89">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="1f7e7d7c2e2d2c5f78727e7673317c7072">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="c6a7a4a5f7f4f586a1aba7afaae8a5a9ab">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="f8999a9bc9cacbb89f95999194d69b9795">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="5d3c3f3e6c6f6e1d3a303c3431733e3230">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="08696a6b393a3b486f65696164266b6765">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="debfbcbdefeced9eb9b3bfb7b2f0bdb1b3">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="0d6c6f6e3c3f3e4d6a606c6461236e6260">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="b0d1d2d3818283f0d7ddd1d9dc9ed3dfdd">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="c7a6a5a4f6f5f487a0aaa6aeabe9a4a8aa">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="fd9c9f9ecccfcebd9a909c9491d39e9290">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="fe9f9c9dcfcccdbe99939f9792d09d9193">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="7e1f1c1d4f4c4d3e19131f1712501d1113">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="c3a2a1a0f2f1f083a4aea2aaafeda0acae">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="9cfdfeffadaeafdcfbf1fdf5f0b2fff3f1">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="5637343567646516313b373f3a7835393b">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="2746454416151467404a464e4b0944484a">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="5130333260636211363c30383d7f323e3c">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="a0c1c2c3919293e0c7cdc1c9cc8ec3cfcd">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="9bfaf9f8aaa9a8dbfcf6faf2f7b5f8f4f6">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="05646766343736456268646c692b666a68">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="82e3e0e1b3b0b1c2e5efe3ebeeace1edef">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star-o" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
 <a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="34555657050607745359555d581a575b59">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="35545756040706755258545c591b565a58">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="2243404113101162454f434b4e0c414d4f">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="3253505103000172555f535b5e1c515d5f">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="98f9fafba9aaabd8fff5f9f1f4b6fbf7f5">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="c9a8abaaf8fbfa89aea4a8a0a5e7aaa6a4">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="1273707123202152757f737b7e3c717d7f">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="5130333260636211363c30383d7f323e3c">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="7e1f1c1d4f4c4d3e19131f1712501d1113">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
 <a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="f6979495c7c4c5b6919b979f9ad895999b">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="7011121341424330171d11191c5e131f1d">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="44252627757677042329252d286a272b29">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
 </div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="ee8f8c8ddfdcddae89838f8782c08d8183">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="ceafacadfffcfd8ea9a3afa7a2e0ada1a3">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="4c2d2e2f7d7e7f0c2b212d2520622f2321">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="ccadaeaffdfeff8caba1ada5a0e2afa3a1">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="dbbab9b8eae9e89bbcb6bab2b7f5b8b4b6">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="fd9c9f9ecccfcebd9a909c9491d39e9290">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="93f2f1f0a2a1a0d3f4fef2faffbdf0fcfe">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="d8b9babbe9eaeb98bfb5b9b1b4f6bbb7b5">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="fb9a9998cac9c8bb9c969a9297d5989496">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="1273707123202152757f737b7e3c717d7f">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="9cfdfeffadaeafdcfbf1fdf5f0b2fff3f1">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="97f6f5f4a6a5a4d7f0faf6fefbb9f4f8fa">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="68090a0b595a5b280f05090104460b0705">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="c3a2a1a0f2f1f083a4aea2aaafeda0acae">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="e9888b8ad8dbdaa98e84888085c78a8684">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td><a href="http://flatable.phoenixcoded.net/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="08696a6b393a3b486f65696164266b6765">[email&#160;protected]</a></td>
<td>9989988988</td>
<td><i class="fa fa-star" aria-hidden="true"></i></td>
<td>
<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog" aria-hidden="true"></i></button>
<div class="dropdown-menu dropdown-menu-right b-none contact-menu">
<a class="dropdown-item" href="#!"><i class="icofont icofont-edit"></i>Edit</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-delete"></i>Delete</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye-alt"></i>View</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-tasks-alt"></i>Project</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-ui-note"></i>Notes</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-eye"></i>Activity</a>
<a class="dropdown-item" href="#!"><i class="icofont icofont-badge"></i>Schedule</a>
</div>
</td>
</tr>
</tbody>
<tfoot>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobileno.</th>
<th>Favourite</th>
<th>Action</th>
</tr>
</tfoot>
</table>
</div>
</div>
</div>

</div>
</div>
</div>
</div>
</div>

<div class="tab-pane" id="review" role="tabpanel">
<div class="card">
<div class="card-header">
<h5 class="card-header-text">Review</h5>
</div>
<div class="card-block">
<ul class="media-list">
<li class="media">
<div class="media-left">
<a href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-1.png" alt="Generic placeholder image">
</a>
</div>
<div class="media-body">
<h6 class="media-heading">Sortino media<span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0">Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
<hr>

<div class="media mt-2">
<a class="media-left" href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-2.png" alt="Generic placeholder image">
</a>
<div class="media-body">
<h6 class="media-heading">Larry heading <span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0"> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
<hr>

<div class="media mt-2">
<div class="media-left">
<a href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-3.png" alt="Generic placeholder image">
</a>
</div>
<div class="media-body">
<h6 class="media-heading">Colleen Hurst <span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0">Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
</div>
<hr>
</div>
</div>
</div>

<div class="media mt-2">
<div class="media-left">
<a href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-1.png" alt="Generic placeholder image">
</a>
</div>
<div class="media-body">
<h6 class="media-heading">Cedric Kelly<span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0">Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
<hr>
</div>
</div>
<div class="media mt-2">
<a class="media-left" href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-4.png" alt="Generic placeholder image">
</a>
<div class="media-body">
<h6 class="media-heading">Larry heading <span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0"> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
<hr>

<div class="media mt-2">
<div class="media-left">
<a href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-3.png" alt="Generic placeholder image">
</a>
</div>
<div class="media-body">
<h6 class="media-heading">Colleen Hurst <span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0">Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
</div>
<hr>
</div>
</div>
</div>
<div class="media mt-2">
<div class="media-left">
<a href="#">
<img class="media-object img-circle comment-img" src="assets/images/avatar-2.png" alt="Generic placeholder image">
</a>
</div>
<div class="media-body">
<h6 class="media-heading">Mark Doe<span class="f-12 text-muted m-l-5">Just now</span></h6>
<div class="stars-example-css review-star">
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
<i class="icofont icofont-star"></i>
</div>
<p class="m-b-0">Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.</p>
<div class="m-b-25">
<span><a href="#!" class="m-r-10 f-12">Reply</a></span><span><a href="#!" class="f-12">Edit</a> </span>
</div>
<hr>
</div>
</div>
</div>
</li>
</ul>
<div class="md-float-material d-flex">
<div class="md-group-add-on p-relative col-lg-12">
<div class="input-group input-group-button input-group-primary">
<span class="input-group-addon"><i class="icofont icofont-comment"></i></span>
<input type="text" class="form-control" placeholder="Write Comment">
<span class="input-group-addon">
<button class="btn btn-primary"><i class="icofont icofont-plus"></i>Add Comment</button>
</span>
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

</div>
</div>

<div id="styleSelector">
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

<!-- <script data-cfasync="false" src="https://firepitsly.com/cdn-cgi/scripts/5c5dd728/Cloudflare-static/email-decode.min.js"></script> -->
 <!-- <script data-cfasync="false" src="cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script> -->
<script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>

<script type="text/javascript" src="bower_components/jquery-ui/jquery-ui.min.js"></script>
<script type="text/javascript" src="bower_components/tether/dist/js/tether.min.js"></script>
<script type="text/javascript" src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<script type="text/javascript" src="bower_components/jquery-slimscroll/jquery.slimscroll.js"></script>

<script type="text/javascript" src="bower_components/modernizr/modernizr.js"></script>
<script type="text/javascript" src="bower_components/modernizr/feature-detects/css-scrollbars.js"></script>

<script type="text/javascript" src="bower_components/classie/classie.js"></script>

<script type="text/javascript" src="assets/pages/advance-elements/moment-with-locales.min.js"></script>
<script type="text/javascript" src="bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="assets/pages/advance-elements/bootstrap-datetimepicker.min.js"></script>

<script type="text/javascript" src="bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>

<script type="text/javascript" src="bower_components/datedropper/datedropper.min.js"></script>

<script src="bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="bower_components/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="bower_components/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="bower_components/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>

<script src="bower_components/ckeditor/ckeditor.js"></script>

<script src="assets/pages/chart/echarts/js/echarts-all.js" type="text/javascript"></script>

<script type="text/javascript" src="bower_components/i18next/i18next.min.js"></script>
<script type="text/javascript" src="bower_components/i18next-xhr-backend/i18nextXHRBackend.min.js"></script>
<script type="text/javascript" src="bower_components/i18next-browser-languagedetector/i18nextBrowserLanguageDetector.min.js"></script>
<script type="text/javascript" src="bower_components/jquery-i18next/jquery-i18next.min.js"></script>

<script type="text/javascript" src="assets/js/script.js"></script>
<script src="assets/pages/user-profile.js"></script>
<script src="assets/js/pcoded.min.js"></script>
<script src="assets/js/demo-12.js"></script>
<script src="assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="assets/js/jquery.mousewheel.min.js"></script>
</body>

<!-- Mirrored from flatable.phoenixcoded.net/default/user-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 10 Jan 2019 11:43:33 GMT -->
</html>