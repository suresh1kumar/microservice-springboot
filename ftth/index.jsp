
<%@ page import="java.io.*,javax.servlet.*,javax.servlet.http.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<LINK rel="stylesheet" type="text/css" href="Mvochercss.css">
<title>CTOPUP</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
}
.style1 {color: #FFFFFF}
-->
</style>
<SCRIPT  ID=serverEventHandlersJS ID=clientEventHandlersJS LANGUAGE=javascript  >
<!--
function window_onload()
{
	window.document.login.user.focus();
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
var status=0;
function document_onkeypress()
{
	charcode = window.event.keyCode;

	if (charcode == 13 )
	{
	  valid = true;
      if(document.login.user.value=="")
      {
        status = 1;
        alert("Please enter Member Login");
        document.login.user.focus();
        valid = false;
     }
      if(document.login.user.value !="" && document.login.pass.value=="")
      {
        status =1;
        alert("Please enter Your Password");
        document.login.pass.focus();
        valid = false
      }
         if(valid)
      {
      document.login.action = "LoginAuth.jsp";
	  document.login.method = "post";
	  document.login.submit();
	  return true;
	 }
  }
}
function Login()
{
   if(status!=1)
   {
 
   
var vendorID = document.login.vendorID.value;
     valid = true;


var z1 = /^[0-9]*$/;
if (!z1.test(vendorID)) {
alert("Vendor ID Should Be Number ONly");
        document.login.vendorID.focus();
        valid = false; 

 }
    if (document.login.vendorID.value.length != 9 ) {
    alert("Employee ID Should Be 9 Digit");
document.login.vendorID.focus();
    valid=false;
} 
  /** if (!(vendorID.value.length == 10)) {
   
        alert("Vendor ID Should Be 10 Digit");
        document.login.vendorID.focus();
        valid = false;
    } **/
if(document.login.vendorID.value=="")
    {

        alert("Please enter Employee ID");
        document.login.vendorID.focus();
        valid = false;
    }
    if(document.login.user.value=="")
    {

        alert("Please enter Member Login");
        document.login.user.focus();
        valid = false;
    }
   
    if(document.login.user.value !="" && document.login.pass.value=="")
    {
        alert("Please enter Your Password");
        document.login.pass.focus();
        valid = false
    }
    if(valid)
    {
	document.login.action = "LoginAuth.jsp?vendorID="+vendorID;
	document.login.method = "post";
	document.login.submit();
	return true;
	}
	}
}
function checkNumber(Number)
{
	var txtProductID=new String("");
	//alert ("Hi");
	txtProductID=Number.value;
	var snum;
	snum=txtProductID.charAt(0);
		for(i=0;i<txtProductID.length;i++)
		{

			var single;
			single=txtProductID.charAt(i);


			if(!(((single>='0')&&(single<='9'))))
			{
			   alert("Please enter only numeric values");
				return false;
				break;
			}

	    }
}
function document_onmousedown()
{
if(window.event.button==2)
	{
		alert("Right Button Restricted!");
		return false;
	}
	return true;
}
//-->
</script>
<script language=javascript for=document event=onkeypress>
<!--
document_onkeypress();
//-->
</Script>
<script language=javascript for=document event=onmousedown>
<!--
document_onmousedown();
//-->
</Script>
<link href="pyro_style.css" rel="stylesheet" type="text/css" />
</head>

<!--<body onload="MM_preloadImages('images/go_button_over.gif')">-->
<body onload="javascript:window_onload();" >
<form name=login>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="100%" height="130" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="18%" background="images/header_bg.jpg"><img src="images/bsnl.jpg.jpg" alt="bsnl" width="164" height="120" /></td>
            
<td align="center" width="20%" background="images/header_bg.jpg"><span class="sm-mag-nrm"><Font size="4" color="##483D8B">BSNL WEST ZONE</Font></span></td>
            <td width="72%" background="images/header_bg.jpg"><div align="right"><img src="images/channel_topup_logo.jpg" alt="Channel_topup" width="584" height="130" /></div></td>
          </tr>
        </table></td>

      </tr>

    </table>


<table width="100%" border="0" align="center" cellspacing="0" cellpadding="0">
<tr>
  


<td>
    <td><table width="100%" border="0" align="center" cellspacing="0" cellpadding="0">
     

</td>
        
        <td width="27%"><img src="images/logo_left'.gif" alt="Pyro Networks" width="193" height="317" /></td>
       
        <td width="35%" valign="top"> <div align="left">
          <p ><font color="red" size="2">
       <!--<marquee behavior="alternate">Please Enter Employee ID in addition to Member Login & Password</marquee>-->
<marquee behavior="alternate">Please change your password with employee id for security reason and do not share your password</marquee>
</font></p>
          <p>&nbsp;</p>
          <p>Pyro Networks has established
            strong standards in providing
            varied telecom solutions that
            have been accepted and utilized
            globally in GSM, GPRS and
            coexisting GSM/GPRS networks.<br/>
            We have pioneered in extending
            our services extensively in the
            Systems Integration space.
            <br/>
            Our vast experience in providing
            end-to-end solutions to the
            Telecom Industry has helped us to
            successfully map our competency,
            skills and expertise to the areas of
            Telecom Infrastructure and has
            enabled many success stories for
            us, in the last two years.
            We have proven expertise in
            designing solutions for wireless
            and wireline service providers
            cross the world. Our Telecom
            service offerings include a wide
            range of solutions that encompass
            strategic business and technology
            consultancy, systems integration
            for enterprises, operations, and
            business and network support systems.</p>
        </div></td>



        <td width="44%" valign="top"><table width="320" height="424" border="0" align="right" cellpadding="0" cellspacing="0">
          <tr>
            <td width="117" height="345" valign="top" background="images/blue_corner_cut.gif"><div align="left"></div></td>
            <td width="188" bgcolor="#003366" valign="top"><div align="left">
              <table width="190" height="261" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td>&nbsp;</td>
                    </tr>
                  <tr>
                  <td><h4>Employee ID</span></h4></td>
                    </tr>
                    <tr>
                  <td>
                      <input type =text name=vendorID size=20">
                    </td>
                    </tr>
                <tr>
                  <td><h4>Member Login </span></h4></td>
                    </tr>
                <tr>
                  <td>
                      <input type =text name=user size=20>
                    </td>
                    </tr>
                <tr>
                  <td><h4><strong>Password</strong></h4></td>
                    </tr>
                <tr>
                  <td><input type=password name=pass size=20></td>
                    </tr>
               
                  <td><div align="right"><a href="javascript:Login()" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Go','','images/go_button_over.gif',1)"><img src="images/go_button_up.gif" alt="Go" name="Go" width="59" height="36" hspace="0" border="0" align="left" id="Go" /></a></div></td>
                    </tr>
               
                <tr>
                  <td><h4><strong>
				  <%
try
{
String message=request.getParameter("message");
if(!message.equals("null"))
{
	out.println(message);
}}catch(Exception e){}
%></strong><span class="style1"><br />
 
               </tr>
 <tr><td><h4><strong><a href="CreateVendorID.jsp" target="_parent">Create New Employee ID</a></strong></h4></td</tr>
              
              </table>
            </div></td><td width="15"><div align="left"></div></td>
          </tr>
          <tr>
            <td width="117" height="79">&nbsp;</td>
            <td>&nbsp;</td>
            <td width="15">&nbsp;</td>
 
          </tr>
          
    
        </table></td>


      </tr>
    </table></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>

</table>
</form>
</body>
</html>
