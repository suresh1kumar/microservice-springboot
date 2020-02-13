<%@include file="authentication.jsp"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="com.mobitec.Mvoucher.SalesReconciliation"%>
<jsp:directive.page import="com.mobitec.Mvoucher.ScreenList;" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Sales Report</title>
    <link rel="stylesheet" type="text/css" href="Mvochercss.css" />
     <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	  	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	  	 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		
		
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
   max-width: 800px;
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
	
.jumbotron {
 /*  background: url("https://s3.amazonaws.com/codecademy-content/projects/adoptly/bg.jpg"); */
  background-size: 100%;
  //text-align: center;
  height: auto;
}
body{
background: url("https://images1.livehindustan.com/uploadimage/library/2018/02/05/16_9/16_9_1/BSNL_Free_Sunday_Calls_extended_for_3_months_1517831295.jpg");
  background-size: 100%;
  //text-align: center;
  height: auto;
}
}
	</style>
    <script language="JavaScript">
function saveAsPDF()
{
  var url;
  url="SalesReconciliationSave.jsp?saveAsPDFDW=true";
  document.Distribution.action = url;
  document.Distribution.method = "post";
  document.Distribution.submit();
}
function saveAsExcel()
{
  var url;
 
  url="SalesReconciliationSave.jsp?saveAsExcelDW=true";
  document.Distribution.action = url;
  document.Distribution.method = "post";
  document.Distribution.submit();
}
function saveAsFlatFile()
{
  var url;
 
  url="SalesReconciliationSave.jsp?saveAsTextFileDW=true";
  document.Distribution.action = url;
  document.Distribution.method = "post";
  document.Distribution.submit();
}


function document_onmousedown()
{
  if(window.event.button==2)
  {
    alert("Right Button Restricted");
    return false;
  }
  return true;
}
function Search()
{
       fDate = document.Distribution.strFromDate.value;  //Value of from date
       tDate = document.Distribution.strToDate.value;   //Value of to date
       var sysdate = Number(new Date());
       
       var fromDate = window.document.Distribution.strFromDate.value;
       var toDate =window.document.Distribution.strToDate.value;
        
       fromDate=fromDate.replace("-","/");
       fromDate=fromDate.replace("-","/");
       toDate=toDate.replace("-","/");
       toDate=toDate.replace("-","/");
      
       fromDate=Number(new Date(fromDate));
       toDate = Number(new Date(toDate));
       
       
       if(fromDate  >  sysdate)
       {

        alert("From Date cannot be Greater than Current Date..");
        document.Distribution.strFromDate.select();
        document.Distribution.strFromDate.focus();
        return false;
      }
      if(toDate > sysdate)
      {
        alert("To Date cannot be Greater than Current Date..");
        document.Distribution.strToDate.select();
        document.Distribution.strToDate.focus();
        return false;
      }
      if(toDate < fromDate)
      {
        alert("From Date cannot be Greater than To Date..");
        document.Distribution.strToDate.select();
        document.Distribution.strToDate.focus();
        return false;
      }
     if(document.Distribution.strFromDate.value == "")
        {
            alert ("Please Select From Date .. ");
            document.Distribution.strFromDate.focus();
            return false;
        }
        if(document.Distribution.strToDate.value == "")
        {
            alert ("Please Select To Date .. ");
            document.Distribution.strToDate.focus();
            return false;
        }
        var zoneNam=document.Distribution.zoneName.value
        var regNam=document.Distribution.regionName.value;
        var cityNam=document.Distribution.cityName.value;
        var walletname=document.Distribution.walletname.value;
     
        document.Distribution.action = "SalesReconciliation.jsp?flag=true&strregNam="+regNam+"&strcityNam="+cityNam+"&strwalletName="+walletname;
        document.Distribution.method = "post";
        document.Distribution.submit();
        return true;
  
       }
 function resetall()
{
  document.Distribution.strToDate.value="";
  document.Distribution.strFromDate.value="";
  window.document.Distribution.action = "SalesReconciliation.jsp";
  window.document.Distribution.method = "post";
  window.document.Distribution.submit();
  return true;
}
 function regionCode()
{
  document.Distribution.action="SalesReconciliation.jsp?apply=select";
  document.Distribution.method = "post";
  document.Distribution.submit();
  return true;
}
 function regionCode2()
{
  var regNam=document.Distribution.regionName.value;
  var cityNam=document.Distribution.cityName.value;
  document.Distribution.action="SalesReconciliation.jsp?strcityNam="+cityNam+"&strregNam="+regNam+"";
  document.Distribution.method = "post";
  document.Distribution.submit();
  return true;
}
 function cityCode()
{
  var regNam=document.Distribution.regionName.value;
  //var cityNam=document.Distribution.cityName.value;
  //document.Distribution.action="SalesReconciliation.jsp?strcityNam="+cityNam+"&strregNam="+regNam+"";
  //document.Distribution.method = "post";
  //document.Distribution.submit();
  if(regNam == '')
    alert("Please select Circle before SSA");
  return true;
}
  
</script>
  </head>
  <%
  	String strFromDate = "";
  	String strToDate = "";
  	String strFlag = "";
  //	String walletType="";
  	ArrayList v1 = new ArrayList();
  	strFromDate = request.getParameter("strFromDate");
  	strToDate = request.getParameter("strToDate");
  	strFlag = request.getParameter("flag");
    String strregNam = request.getParameter("strregNam");
    String strcityNam = request.getParameter("strcityNam");
	String strwalletName=request.getParameter("strwalletName");
  	int iAdd = -1, iModify = -1, iDelete = -1, iPrintSave = -1;
  	String strAdd12 = "", result = "";
  	String strModify12 = "";
  	String strDelete12 = "";
  	String strPrntSave12 = "";
  	String strPrivilage = "";
  	String userName = "";
  	StringTokenizer st5 = null;
  	ScreenList SL = new ScreenList();
  	userName = (String) session.getAttribute("user_id");
  	strPrivilage = SL.getScreenPermission(userName, "Sales Report");
  	st5 = new StringTokenizer(strPrivilage, "#");
  	while (st5.hasMoreTokens()) {
  		strAdd12 = st5.nextToken();
  		System.out.println(strAdd12);
  		strModify12 = st5.nextToken();
  		System.out.println(strModify12);
  		strDelete12 = st5.nextToken();
  		System.out.println(strDelete12);
  		strPrntSave12 = st5.nextToken();
  		System.out.println(strPrntSave12);
  	}
  	iAdd = Integer.parseInt(strAdd12);
  	iModify = Integer.parseInt(strModify12);
  	iDelete = Integer.parseInt(strDelete12);
  	iPrintSave = Integer.parseInt(strPrntSave12);
  	System.out.println("strwalletName in jsp " + strwalletName);
  	iPrintSave = 1;
  	if (strFlag != null && strFlag.equalsIgnoreCase("true")) {
  		SalesReconciliation saleReconciliation = new SalesReconciliation();
  		v1 = saleReconciliation.getData(strFromDate, strToDate, strregNam, strcityNam,strwalletName);
  		session.removeAttribute("salesReconciliation");
  		session.setAttribute("salesReconciliation", v1);
  	}
  %>
  <%

  	String strAuthNum = "", zoneName = "", regionName = "", cityName = "", zoneId = "";
  	String zoneFname = "", zoneSname = "", regionId = "", regionFname = "", regionSname = "", cityId = "", cityFname = "", citySname = "";
  	String info = "", regionInfo = "", cityInfo = "", dealerCode = "", region = "";
  	StringTokenizer stInfo1 = null;
  	StringTokenizer stInfo = null, reg1 = null;
  	AddDealerInfo addInfo = new AddDealerInfo();
  	String zoneInfo = addInfo.getZoneInfo(userName);
  	stInfo = new StringTokenizer(zoneInfo, "~");
  	zoneId = stInfo.nextToken();
  	regionId = stInfo.nextToken();
  	cityId = stInfo.nextToken();
  	if (regionId.equals("0") && (cityId.equals("0")) && (!zoneId.equals("0"))) {

  		info = addInfo.getInfo1(zoneId);
  		stInfo = new StringTokenizer(info, "#");
  		zoneFname = stInfo.nextToken();
  		zoneSname = stInfo.nextToken();
  		regionInfo = addInfo.getInfo2(zoneId);
  		cityInfo = addInfo.getInfo3(zoneId, strregNam);
  		//dealerCode=addInfo.getDealerCode1(zoneName,regionName,cityName,zoneId,regionId,cityId);
  		//reg1=new StringTokenizer(dealerCode,"~/");
  		//while(reg1.hasMoreTokens())
  		//{
  		//region=reg1.nextToken();
  		// }
  	}
  	if (cityId.equals("0") && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
  		info = addInfo.getInfo(zoneId, regionId);
  		cityInfo = addInfo.getcityInfo(zoneId, regionId);
  		stInfo = new StringTokenizer(info, "#");
  		zoneFname = stInfo.nextToken();
  		zoneSname = stInfo.nextToken();
  		regionFname = stInfo.nextToken();
  		regionSname = stInfo.nextToken();
  		strregNam = regionFname;
  		stInfo = new StringTokenizer(cityInfo, "#");
  	}

  	//out.println(strcityNam);

  	if ((!zoneId.equals("0")) && (!regionId.equals("0")) && (!cityId.equals("0"))) {
  		// out.println("in zoneinfo");

  		info = addInfo.getInfo4(zoneId, regionId, cityId);
  		stInfo = new StringTokenizer(info, "#");
  		zoneFname = stInfo.nextToken();
  		zoneSname = stInfo.nextToken();
  		regionFname = stInfo.nextToken();
  		regionSname = stInfo.nextToken();
  		cityFname = stInfo.nextToken();
  		citySname = stInfo.nextToken();

  		strregNam = regionFname;
  		strcityNam = cityFname;

  		//dealerCode=zoneSname+"~"+regionSname+"~"+citySname;
  		//reg1=new StringTokenizer(dealerCode,"~/");
  		// while(reg1.hasMoreTokens())
  		//{
  		// region=reg1.nextToken();
  		//}
  	}
  %>
  <BODY leftmargin="0" topmargin="25" marginwidth="0" marginheight="0" style="FILTER: progid:DXImageTransform.Microsoft.Gradient(endColorstr='#d6dff7', startColorstr='#FFFFFF', gradientType='0'">
    <header class = "w3-container w3-teal">
         <h2> Reports>>Sales Reconciliation >></h2>
         <!-- <p class = "w3-large">Wi-fi Report!</p> -->
 </header>
   <br>
 <div class = "w3-row w3-border" id="containerFORM">
 <br>
 <form name="Distribution">
 	<div class="container">
		  <div class="jumbotron">
		  	<%
		if((!cityId.equals("0")) && (!zoneId.equals("0")) &&(!regionId.equals("0"))){
			%>
			<%System.out.println("zone  id info====================::1,1,1"); %>
			         
			         <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode()" name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onClick="selectCircle()" onChange="regionCode()" name=cityName>
							  <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
							</select>
						</div>
		         </div><br>
		         
			         <%}else if(cityId.equals("0") && (!zoneId.equals("numbers0")) &&(!regionId.equals("0"))){ %>
			    		<%System.out.println("zone  id info====================::1,1,0"); %>
			    			<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode()" name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onChange="regionCode()" name=cityName>
							<option value=""> --city-- </option>
							   <option value=""> All </option>
                               <%
          						  while(stInfo.hasMoreTokens())
           							 {
           							 citySname= stInfo.nextToken();
            						 cityFname=stInfo.nextToken();

            						if(cityFname.equalsIgnoreCase(strcityNam)){
              				   %>
                				  <OPTION value="<%=cityFname%>"selected><%=cityFname%></OPTION>
            				<%}else{ %>
            						 <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
               				 <%}}%>
							</select>
						</div>
		         </div>
		    		<br>
			    
					    <%}else if(cityId.equals("0") && (regionId.equals("0")) &&(!zoneId.equals("0"))){ %>
							<%System.out.println("zone  id info====================::1,0,0"); %>
							<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode2()" name=regionName>
							<option value="">--circle--</option>
							  <option value=""> All </option>
                               <%stInfo=new StringTokenizer(regionInfo,"#");

          						  while(stInfo.hasMoreTokens())
            						 {
           							 regionSname= stInfo.nextToken();
          							  regionFname=stInfo.nextToken();

          							   if(regionFname.equalsIgnoreCase(strregNam)){
          								   System.out.println("Region ----------------------ssss-1,0,0 ::"+regionFname);
             					    %>
               						   <OPTION value="<%=regionFname%>"selected><%=regionFname%></OPTION>
            					<%}else{%>

           						  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
             				   <%}}%>
							</select>
						</div>
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onChange="cityCode()" name=cityName>
							<option value=""> --city-- </option>
							 <option value=""> All </option>
                               <%stInfo=new StringTokenizer(cityInfo,"#");
           						 while(stInfo.hasMoreTokens())
          						 {
           							 citySname= stInfo.nextToken();  
            							cityFname=stInfo.nextToken(); 
           							 if(cityFname.equalsIgnoreCase(strcityNam)){
              					   %>
                				  <OPTION value="<%=cityFname%>"selected><%=cityFname%></OPTION>
            				<%}else{%>
            					 <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
             				   <%}}%>
							</select>
						</div>
		         	</div>
					   <%} %>
					   <br>
					   
					   <div class="w3-container w3-row-padding">
						<%
							Types_of_wallet stockMWA = new Types_of_wallet();
								String wallet = stockMWA.getWalletType();
								System.out.println(" :: " + wallet);
								String wallets[] = wallet.split(",");
						%>
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id="walletname" name="walletname">
							  <%
								if (strFlag != null && strFlag.equalsIgnoreCase("true")){
									for (int wa = 0; wa < wallets.length; wa++) {
									      System.out.println(" :: " + wallets[wa]);
								%>
									<%
										if (wallets[wa].equalsIgnoreCase(strwalletName)) {
									%>
									<option value="<%=strwalletName%>" selected><%=strwalletName%></option>
									<%
								} else {
									%>
									<option value="<%=wallets[wa]%>"><%=wallets[wa]%></option>
									<%
										  }
									    }
									} else {
										%>
									<%
										for (int wa = 0; wa < wallets.length; wa++) {
											System.out.println(" wallets[wa] = " + wallets[wa]);
									%>
									<option value="<%=wallets[wa]%>" selected><%=wallets[wa]%></option>
									<%
											strwalletName = wallets[wa];
										  }
										%>
									<%
										}
									%>
							</select>
						</div>
						<div class="w3-container w3-third">
						<input id="fromDate" type="text" name="strFromDate"  readonly class=" w3-select w3-hover-blue form-rounded date1" placeholder="Enter From Date"
		            		<%if (strFromDate != null && !strFromDate.equals("")) {
								   if (strFromDate.equalsIgnoreCase(strFromDate)) {%>
									 value="<%=strFromDate%>" <%}
							  } else {%> value=""
										<%}%> readonly/>
					</div>
					<div class="w3-container w3-third">
						<input id="toDate" name="strToDate" type="text" readonly class=" w3-select w3-hover-blue form-rounded date1" placeholder="Enter To Date"
		            			<%if (strToDate != null && !strToDate.equals("")) {
									if (strToDate.equalsIgnoreCase(strToDate)) {%>
										value="<%=strToDate%>" <%}
								} else {%> value=""
										<%}%> readonly/>
					</div>
		         </div>
					  <br>
			 		<div class="row">
							<div class="col-sm-2 ">
					           </div>
					           <div class="col-sm-4 ">
					               <!-- <INPUT TYPE="button" value="Search" class="btn btn-info btn-block" onclick="Search()"> -->
					               <INPUT TYPE="button" align="left" class="btn btn-info btn-block" value="OK" " onclick="Search()">
					           </div>
					           
					           <div class="col-sm-4 ">
						         <!-- <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block" onclick="fnReset();">  -->
						         <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block"  onclick="resetall()">
					          </div>
					    </div> 
					   
					   
					   
					   
		  
		  </div>
	</div>
 
 </form>
 </div> 
    
    
    <!-- 00000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
   <%--  <form name="Distribution">
      <p align=left>
        <strong><span class="sm-mag-nrm"> <font size=2 color="#483D8B"><b> Reports>>Sales Reconciliation </b> </font> </span> </strong>
      </p>
      <table valign="top" cellspacing="0" border="0" width="70%" cellpadding="1" align="center">
        <tr>
          <td valign="top" width="100%">
            <fieldset>
              <legend>
                <span class="sm-mag-nrm"><b><font color="#483D8B">By Area</font> </b> </span>
              </legend>
              <table cellspacing="0" border="0" width="100%" cellpadding="1">
                <%
                if ((!cityId.equals("0")) && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
                %>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">Zone </Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList1 onChange="" name=zoneName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <OPTION value="<%=zoneFname%>">
                      <%=zoneFname%>
                    </OPTION>
                  </SELECT>
                </td>
                </TD>
                <td>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">Circle</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList2 onChange="regionCode()" name=regionName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <OPTION value="<%=regionFname%>">
                      <%=regionFname%>
                    </OPTION>
                  </SELECT>
                </TD>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">SSA</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList onChange="regionCode()" name=cityName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <OPTION value="<%=cityFname%>">
                      <%=cityFname%>
                    </OPTION>
                  </SELECT>
                </td>
                
                <TD width=50><span class="sm-mag-nrm"><p class="just">
                                                                               <Font color="#483D8B">Wallet Type <Font color="#FF0000">*</Font></Font>
                                                                       </p> </span></td>
                                                                       <td>
								<%
										Types_of_wallet stockMWA = new Types_of_wallet();
											String wallet = stockMWA.getWalletType();
											System.out.println(" :: " + wallet);
											String wallets[] = wallet.split(",");
									%> </span> <SELECT id=walletname name=walletname style="WIDTH: 102px;"
								class="sm-mag-nrm">


									<%
										
											if (strFlag != null && strFlag.equalsIgnoreCase("true")){

												for (int wa = 0; wa < wallets.length; wa++) {
													System.out.println(" :: " + wallets[wa]);
													%>

									<%
														if (wallets[wa].equalsIgnoreCase(strwalletName)) {
													%>
									<option value="<%=strwalletName%>" selected><%=strwalletName%></option>

									<%
														} else {
													%>

									<option value="<%=wallets[wa]%>"><%=wallets[wa]%></option>

									<%
														}
												}
											} else {
											
												%>

									<%
													for (int wa = 0; wa < wallets.length; wa++) {
																System.out.println(" wallets[wa] = " + wallets[wa]);
												%>

									<option value="<%=wallets[wa]%>" selected><%=wallets[wa]%></option>
									<%
									strwalletName = wallets[wa];
													}
												%>
									<%
										}
									%>


							</select>
							</td>
                <%
                }
                %>
                <%
                if (cityId.equals("0") && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
                %>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">Zone</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList1 onChange="" name=zoneName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <OPTION value="<%=zoneFname%>">
                      <%=zoneFname%>
                    </OPTION>
                  </SELECT>
                </td>
                </TD>
                <td>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">Circle</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList2 onChange="" name=regionName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <OPTION value="<%=regionFname%>">
                      <%=regionFname%>
                    </OPTION>
                  </SELECT>
                </TD>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">SSA</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList onClick="cityCode()" name=cityName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <option value="">
                      -select-
                    </option>
                    <%
                    			while (stInfo.hasMoreTokens()) {
                    			citySname = stInfo.nextToken();
                    			cityFname = stInfo.nextToken();

                    			if (cityFname.equalsIgnoreCase(strcityNam)) {
                    %>
                    <OPTION value="<%=strcityNam%>" selected>
                      <%=strcityNam%>
                    </OPTION>
                    <%
                    } else {
                    %>
                    <OPTION value="<%=cityFname%>">
                      <%=cityFname%>
                    </OPTION>
                    <%
                    		}
                    		}
                    %>
                  </SELECT>
                </td>
                
                 <TD width=50><span class="sm-mag-nrm"><p class="just">
                                                                               <Font color="#483D8B">Wallet Type <Font color="#FF0000">*</Font></Font>
                                                                       </p> </span></td>
                                                                       <td>
								<%
										Types_of_wallet stockMWA = new Types_of_wallet();
											String wallet = stockMWA.getWalletType();
											System.out.println(" :: " + wallet);
											String wallets[] = wallet.split(",");
									%> </span> <SELECT id=walletname name=walletname style="WIDTH: 102px;"
								class="sm-mag-nrm">


									<%
										
											if (strFlag != null && strFlag.equalsIgnoreCase("true")){

												for (int wa = 0; wa < wallets.length; wa++) {
													System.out.println(" :: " + wallets[wa]);
													%>

									<%
														if (wallets[wa].equalsIgnoreCase(strwalletName)) {
													%>
									<option value="<%=strwalletName%>" selected><%=strwalletName%></option>

									<%
														} else {
													%>

									<option value="<%=wallets[wa]%>"><%=wallets[wa]%></option>

									<%
														}
												}
											} else {
											
												%>

									<%
													for (int wa = 0; wa < wallets.length; wa++) {
																System.out.println(" wallets[wa] = " + wallets[wa]);
												%>

									<option value="<%=wallets[wa]%>" selected><%=wallets[wa]%></option>
									<%
									strwalletName = wallets[wa];
													}
												%>
									<%
										}
									%>


							</select>
							</td>
                <%
                }
                %>
                <%
                if (cityId.equals("0") && (regionId.equals("0")) && (!zoneId.equals("0"))) {
                %>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">Zone</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList1 onChange="" name=zoneName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <OPTION value="<%=zoneFname%>">
                      <%=zoneFname%>
                    </OPTION>
                  </SELECT>
                </td>
                </TD>
                <td>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">Circle</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList2 onChange="regionCode2()" name=regionName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <option value="">
                      -select-
                    </option>
                    <%
                    		stInfo = new StringTokenizer(regionInfo, "#");

                    		while (stInfo.hasMoreTokens()) {
                    			regionSname = stInfo.nextToken();
                    			regionFname = stInfo.nextToken();

                    			if (regionFname.equalsIgnoreCase(strregNam)) {
                    %>
                    <OPTION value="<%=regionFname%>" selected>
                      <%=regionFname%>
                    </OPTION>
                    <%
                    } else {
                    %>
                    <OPTION value="<%=regionFname%>">
                      <%=regionFname%>
                    </OPTION>
                    <%
                    		}
                    		}
                    %>
                  </SELECT>
                </TD>
                <TD width=50>
                  <span class="sm-mag-nrm"><p class="just">
                      <Font color="#483D8B">SSA</Font>
                    </p> </span>
                </td>
                <td>
                  <SELECT id=regionList3 onClick="cityCode()" name=cityName style="WIDTH: 102px;" class="sm-mag-nrm">
                    <option value="">
                      -select-
                    </option>
                    <%
                    		stInfo = new StringTokenizer(cityInfo, "#");
                    		while (stInfo.hasMoreTokens()) {
                    			citySname = stInfo.nextToken();
                    			cityFname = stInfo.nextToken();

                    			if (cityFname.equalsIgnoreCase(strcityNam)) {
                    %>
                    <OPTION value="<%=strcityNam%>" selected>
                      <%=strcityNam%>
                    </OPTION>
                    <%
                    } else {
                    %>
                    <OPTION value="<%=cityFname%>">
                      <%=cityFname%>
                    </OPTION>
                    <%
                    		}
                    		}
                    %>
                  </SELECT>
                </td>
                
                 <TD width=50><span class="sm-mag-nrm"><p class="just">
                                                                               <Font color="#483D8B">Wallet Type <Font color="#FF0000">*</Font></Font>
                                                                       </p> </span></td>
                                                                       <td>
								<%
										Types_of_wallet stockMWA = new Types_of_wallet();
											String wallet = stockMWA.getWalletType();
											System.out.println(" :: " + wallet);
											String wallets[] = wallet.split(",");
									%> </span> <SELECT id=walletname name=walletname style="WIDTH: 102px;"
								class="sm-mag-nrm">


									<%
										
											if (strFlag != null && strFlag.equalsIgnoreCase("true")){

												for (int wa = 0; wa < wallets.length; wa++) {
													System.out.println(" :: " + wallets[wa]);
													%>

									<%
														if (wallets[wa].equalsIgnoreCase(strwalletName)) {
													%>
									<option value="<%=strwalletName%>" selected><%=strwalletName%></option>

									<%
														} else {
													%>

									<option value="<%=wallets[wa]%>"><%=wallets[wa]%></option>

									<%
														}
												}
											} else {
											
												%>

									<%
													for (int wa = 0; wa < wallets.length; wa++) {
																System.out.println(" wallets[wa] = " + wallets[wa]);
												%>

									<option value="<%=wallets[wa]%>" selected><%=wallets[wa]%></option>
									<%
									strwalletName = wallets[wa];
													}
												%>
									<%
										}
									%>


							</select>
							</td>
                <%
                }
                %>
                </fieldset>
              </table>
          </td>
          <td valign="top" width="25%"></td>
        </tr>
      </table>
      <table valign="top" cellspacing="0" border="0" width="80%" cellpadding="1" align="center">
        <tr>
          <td valign="top" width="100%">
            <fieldset>
              <legend>
                <span class="sm-mag-nrm"><b><font color="#483D8B">Transaction Period</font> </b> </span>
              </legend>
              <table cellspacing="0" border="0" width="100%" cellpadding="1">
                <td nowrap align="left" width="15%">
                  <span class="sm-mag-nrm">&nbsp;&nbsp;&nbsp;&nbsp;<font color="#483D8B">From Date</font> </span><Font color="#FF0000">*</Font>
                <td align="left" width="20%">
                  <input id="demo1" type="text" name="strFromDate" readonly size="13" class="sm-mag-nrm" <% if(strFromDate!=null && !strFromDate.equals("")){                      if(strFromDate.equalsIgnoreCase(strFromDate)){%>
                    value="<%=strFromDate%>" <% }}%>>
                  <a href="javascript:NewCal('demo1','mmddyyyy')"><IMG style="Z-INDEX:101; LEFT: 415px; POSITION: left; TOP: 165px" height="16" alt="Pick a date" src="images/calendar.gif" width="16" border="0"> </a>
                </td>
                <td nowrap align="left" width="15%">
                  <span class="sm-mag-nrm"><font color="#483D8B"> &nbsp;&nbsp;To Date</font><Font color="#FF0000">*</Font>
                  </span>
                </td>
                <td align="left" width="20%">
                  <input id="demo2" name="strToDate" readonly type="text" size="13" class="sm-mag-nrm" <% if(strToDate!=null && !strToDate.equals("")){                      if(strToDate.equalsIgnoreCase(strToDate)){  %> value="<%=strToDate%>"
                    <%              }              }  %>>
                  <a href="javascript:NewCal('demo2','mmddyyyy')"><IMG style="Z-INDEX:101; LEFT: 415px; POSITION: left;TOP: 190px" height="16" alt="Pick a date" src="images/calendar.gif" width="16" border="0"> </a>
                </td>
                <td align="left" width="10%">
                  <INPUT TYPE="button" align="left" value="OK" class="sm-mag-nrm" style="WIDTH: 80px; HEIGHT: 22px" STYLE="font-size:8pt; " onclick="Search()">
                </td>
                <td align="left" width="10%">
                  <INPUT TYPE="button" align="left" value="Reset" class="sm-mag-nrm" style="WIDTH: 80px; HEIGHT: 22px" STYLE="font-size:8pt;" onclick="resetall()">
                </td>
                </tr>
              </table>
        </fieldset>
        </td>
        <td valign="top" width="25%"></td>
        </tr>
      </table> --%>
      <%
      if (strFlag != null && strFlag.equalsIgnoreCase("true") && v1 != null && v1.size() <= 0) {
      %>
      <br>
      <center>
        <span class="sm-mag-nrm"><b><font color="#483D8B">No Record Found</font> </b> </span>
      </center>
      <%
      }
      %>
      <%
      if (strFlag != null && strFlag.equalsIgnoreCase("true") && v1 != null && v1.size() > 0 && iPrintSave == 1) {
      %>
      <table border="0" align="right" width="3%">
        <tr>
          <td>
            <a href="JavaScript:saveAsFlatFile();" class="btn btn-success"><font color="#483D8B">SaveAs&nbsp;CSV</font> </a>&nbsp;&nbsp;&nbsp;&nbsp;
          </td>
          
        </tr>
      </table>
      <%
      }
      %>
    
  </body>
  <script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
<script>
$( function() {
$( "#fromDate" ).datepicker({
	dateFormat : "dd-mm-yy",
	changeMonth: true,                  
    changeYear: true,
	//maxDate : 0,
onSelect: function(selectedDate) {
	       
            $('#toDate').datepicker('option', 'minDate', selectedDate );
      }
       //for only 7 days data

    });
$( "#toDate" ).datepicker({
   
	dateFormat : "dd-mm-yy",
	changeMonth: true,
    changeYear: true,
	//minDate : 0,
	//maxDate : 0,
    });
} );
</script>
</html>
