<%@include file="authentication.jsp"%>  
<%@ page
	import="com.mobitec.Mvoucher.*,java.sql.Connection,java.util.*,java.text.*,java.sql.ResultSet"%>
<%
  currency1 cvalue = new currency1();
  String currvalue = cvalue.currencyvalue();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>SalesReconciliation || Report</title>
<LINK rel="stylesheet" type="text/css" href="Mvochercss.css">
<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is Vanity Numbers page">
		<LINK rel="stylesheet" type="text/css" href="Mvochercss.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link href='http://www.mostlikers.com/favicon.ico' rel='icon' type='image/x-icon'/>
    <!--Bootstrap CSS --> 
    <link href="datajs/css/bootstrap.min.css" rel="stylesheet">
    <link href="datajs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="datajs/css/custom-style.css" rel="stylesheet">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/le-frog/jquery-ui.css" />
    <script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
    <!--/Bootstrap CSS --> 
    
    <!--JQuery DataTables--> 
    <script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    
    <!-- <script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script> -->
    <script src="datajs/js/bootstrap/bootstrap.min.js"></script>
    
    
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
  /* background-size: 100%;
  text-align: center;
  height: auto; */
}
body{
/* background: url("https://www.gizbot.com/img/2018/05/bsnl-offers-39gb-data-for-28-days-at-just-rs-98-1526578810.jpg");
  background-size: 100%;
  text-align: center;
  height: auto; */
}
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
</head>
<script language="JavaScript">
  var url;

function saveAsFlatFile(val)
{
  if(val=='sales')
    url="SalesReconciliationSave.jsp?saveAsCSV=true";
  if(val=='dealerWise')
    url="SalesReconciliationSave.jsp?saveAsCSVDealerWise=true";
 
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
</script>
<script language=javascript for=document event=onmousedown>
document_onmousedown();
</script>
<script>
function window_onload()
{
	
  //window.document.form1.search.focus();
   
}
 

      	function Search()
    	{
			var regNam=document.Distribution.regionName.value;
	        var cityNam=document.Distribution.cityName.value;
	           
	       fDate = document.Distribution.strFromDate.value;  //Value of from date
	       tDate = document.Distribution.strToDate.value;   //Value of to date
	       var k=0;
	       var m=0;
	       var r=0;
	       var t=0;
	       for(i=1;i<fDate.length;i++)             //function to get the date,month and year
	       {                                       //of the from date
	          if (fDate.charAt(i)=='-')
	              {
	               var ddf = fDate.substring(0,i);
	               k=i;
	               break;
	        }
	        }
       for(j=k+1;j<fDate.length;j++)
       {
         if (fDate.charAt(j)=='-')
              {
               var mmf = fDate.substring(k+1,j);
               m=j;
               break;
        }
        }

       var yyf = fDate.substring(m+1,fDate.length);
             var xf= parseInt(ddf);
             var yf= parseInt(mmf);
             var zf= parseInt(yyf);

      //alert("fDate :: xf = "+xf+" yf = "+yf+" zf = "+zf);
            for(a=1;a<tDate.length;a++)               //function to get the date,month and year
       {                                        //of the to Date
          if (tDate.charAt(a)=='-')
              {
               var ddt = tDate.substring(0,a);
               r=a;
               break;
        }
        }
       for(b=r+1;b<tDate.length;b++)
       {
         if (tDate.charAt(b)=='-')
              {
               var mmt = tDate.substring(r+1,b);
               t=b;
               break;
        }
        }

       var yyt = tDate.substring(t+1,tDate.length);
              var xt= parseInt(ddt);
               var yt= parseInt(mmt);
               var zt= parseInt(yyt);
      //alert("tDate :: xt = "+xt+" yt = "+yt+" zt = "+zt);
      
          fdate = new Date(yf+"/"+xf+"/"+zf);
          tdate = new Date(yt+"/"+xt+"/"+zt);

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

     /* if(document.Distribution.TypeSelect.value == "")
        {
            alert ("Please Select Type .. ");
            
            document.Distribution.TypeSelect.focus();
            return false;
        } */

        //   alert(type);
      document.Distribution.action = "SalesReconciliation.jsp?flag=true&strregNam="+regNam+"&strcityNam="+cityNam+"";
      
      document.Distribution.method = "post";
        document.Distribution.submit();
        return true;

     }
      //regionName,cityName,reportType,area,msisdn,strFromDate,strToDate
      	function resetall(){
      	  document.Distribution.regionName.value="";
  	      document.Distribution.cityName.value="";
  	      document.Distribution.reportType.value="";
  	      document.Distribution.reportType.value="";
  	      document.Distribution.area.value="";
  	    document.Distribution.msisdn.value="";
  	      document.Distribution.strFromDate.value="";
  	      document.Distribution.strToDate.value="";
  	      window.document.Distribution.action = "SalesReconciliation.jsp";
  	      window.document.Distribution.method = "post";
  	      window.document.Distribution.submit();
  	  return true;
  	  }
    	function regionCode()
  		{
  	   //alert("hi");
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
  	   var cityNam=document.Distribution.cityName.value;
  	
  	    document.Distribution.action="SalesReconciliation.jsp?strcityNam="+cityNam+"&strregNam="+regNam+"";
  	  	document.Distribution.method = "post";
  	  	document.Distribution.submit();
  	  	return true;
  	}
</script>
<%
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
    strPrivilage = SL.getScreenPermission(userName, "SalesReconciliation Report");
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
  %>

<%
	StringTokenizer st = null, st1 = null, st2 = null, st3 = null, st4 = null;
	String strFlag = "";
   
   // FRCReportsDaoImpl SR=new FRCReportsDaoImpl();
   
   
SalesReconciliationDaos SR=new SalesReconciliationDaos();

    String strFromDate = request.getParameter("strFromDate");
  	String strToDate = request.getParameter("strToDate");
  	strFlag = request.getParameter("flag");
  	String zonename = request.getParameter("zoneName");
    String strregNam = request.getParameter("regionName");
    String strcityNam = request.getParameter("cityName");
   String  areaType=request.getParameter("area");
    String ReportType = request.getParameter("reportType");
    String msisdn = request.getParameter("msisdn");
    
    //zonename,strregNam,strcityNam,ReportType, areaType,msisdn,strFromDate,strToDate
   

  %>
<%
String regionId1="";
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
    //regionId = "5";
    cityId = stInfo.nextToken();
    if (regionId.equals("0") && (cityId.equals("0")) && (!zoneId.equals("0"))) {

      info = addInfo.getInfo1(zoneId);
      stInfo = new StringTokenizer(info, "#");
      zoneFname = stInfo.nextToken();
      zoneSname = stInfo.nextToken();
      regionInfo = addInfo.getInfo2(zoneId);
      cityInfo = addInfo.getInfo3(zoneId, strregNam);
   
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

    if ((!zoneId.equals("0")) && (!regionId.equals("0")) && (!cityId.equals("0"))) {

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
    }
  %>
<%
ArrayList summaryList = new ArrayList();
ArrayList detailedList = new ArrayList();

if (strFlag != null && strFlag.equalsIgnoreCase("true")) {
	  System.out.println(">>>>>>>>>>>>>>>>Summary :"+ReportType);
    if (ReportType.equalsIgnoreCase("Summary")) {
    	//if (ReportType != null && ReportType.equalsIgnoreCase("Summary")) {
  	  System.out.println(">>>>>>>>>>>>>>>>Summary :");  
  		//summaryList=SR.get_totalallSalesSumaryOpt(zonename,strregNam,strcityNam,rechargeType,reportType,msisdn,strFromDate,strToDate);
  		summaryList=SR.SumaryOpt(zonename,strregNam,strcityNam,ReportType, areaType,msisdn,strFromDate,strToDate);
      	session.removeAttribute("summaryList");
        session.removeAttribute("detailedList");
        session.setAttribute("summaryList", summaryList);
  
    }
    if (ReportType.equalsIgnoreCase("Detailed")) {
  	   	
      	System.out.println(">>>>>>>>>>>>>>>>Detailed :"+ReportType);
      	detailedList=SR.DetailedSalesSumaryOpt(zonename,strregNam,strcityNam,ReportType, areaType,msisdn,strFromDate,strToDate);
      	session.removeAttribute("summaryList");
        session.removeAttribute("detailedList");
        session.setAttribute("detailedList", detailedList);
    }
  }

  %>

<body>

<header class = "w3-container w3-teal">
         <p class = "w3-large"> Reports>>SalesReconciliation!!</p>
 </header><br><br>
	 <div class = "w3-row w3-card-4  "  id="containerFORM">
 <br>
 
 <form name="Distribution">
 		<%
			if ((!cityId.equals("0")) && (!zoneId.equals("0")) && (!regionId.equals("0"))) {
		%>
			<%
				System.out.println("zone  id info====================::/* 1,1,1 */");
			%>
			
			<div class="w3-container w3-row-padding">
						<div class="w3-container w3-third">
						<label class = "w3-label w3-text-blue">Zone</label>
							<select class="form-control form-control-sm form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION> 
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label class = "w3-label w3-text-blue">Circle</label>
							<select class="form-control form-control-sm form-rounded" id=regionList2 onChange="regionCode()" name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label class = "w3-label w3-text-blue">City</label>
							<select class="form-control form-control-sm form-rounded" id=regionList onChange="regionCode()" name=cityName>
							  <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
							</select>
						</div>
		         </div>
		         <%
	        		} else if (cityId.equals("0") && (!zoneId.equals("numbers0"))&& (!regionId.equals("0"))) {
	        	%>
		    		<%
		    			System.out.println("zone  id info====================::/* 1,1,0 */");
		    		%>
		    		<div class="w3-container w3-row-padding">
						<div class="w3-container w3-third">
						<label class = "w3-label w3-text-blue">Zone</label>
							<select class="form-control form-control-sm form-rounded" id=regionList1 onChange="" name=zoneName >
							 <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label class = "w3-label w3-text-blue">Circle</label>
							<select class="form-control form-control-sm form-rounded" id=regionList2 onChange="" name=regionName>
							   <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label class = "w3-label w3-text-blue">City</label>
							<select class="form-control form-control-sm form-rounded" id=regionList onChange="cityCode()" name=cityName>
							 
							  <option value="">All</option>
							  <%
							  	while (stInfo.hasMoreTokens()) {
							  			citySname = stInfo.nextToken();
							  			cityFname = stInfo.nextToken();
							  			if (cityFname.equalsIgnoreCase(strcityNam)) {
							  %>
                				  <OPTION value="<%=cityFname%>"selected><%=cityFname%></OPTION>
            				<%
            					} else {
            				%>
            						 <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
               				 <%
               				 	}
               				 		}
               				 %> 
							</select>
						</div>
		         </div>
		         <%
	        			} else if (cityId.equals("0") && (regionId.equals("0")) && (!zoneId.equals("0"))) {
	        		%>
						<%
							System.out.println("zone  id info====================::/* 1,0,0 */");
						%>
						
						<div class="w3-row-padding">
						<div class="w3-third">
						<label class = "w3-label w3-text-blue">Zone</label>
							<select class="form-control form-control-sm form-rounded" id=regionList1 onChange="" name=zoneName >
							  <option value="<%=zoneFname%>"><%=zoneFname%></option>  
							</select>
						</div>
						<div class="w3-third">
						<label class = "w3-label w3-text-blue">Circle</label>
							<select class="form-control form-control-sm form-rounded" id=regionList2 onChange="regionCode2()" name=regionName>
							  <option value=""> All </option>
                               <%
                               	stInfo = new StringTokenizer(regionInfo, "#");

                               		while (stInfo.hasMoreTokens()) {
                               			regionSname = stInfo.nextToken();
                               			regionFname = stInfo.nextToken();

                               			if (regionFname.equalsIgnoreCase(strregNam)) {
                               				System.out.println("Region ----------------------");
                               %>
               						   <OPTION value="<%=regionFname%>" selected><%=regionFname%></OPTION>
            					<%
            						} else {
            					%>
           						  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
             				   <%
             				   	}
             				   		}
             				   %>
							</select>
						</div>
						
						<div class="w3-third">
						<label class = "w3-label w3-text-blue">City</label>
							<select class="form-control form-control-sm form-rounded" id=regionList3 onChange="cityCode()" name=cityName>
							  <option value=""> All </option>
                               <%
                               	stInfo = new StringTokenizer(cityInfo, "#");
                               		while (stInfo.hasMoreTokens()) {
                               			citySname = stInfo.nextToken();
                               			cityFname = stInfo.nextToken();
                               			if (cityFname.equalsIgnoreCase(strcityNam)) {
                               %>
                				  <OPTION value="<%=cityFname%>"selected><%=cityFname%></OPTION>
            				<%
            					} else {
            				%>
            					 <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
             				   <%
             				   	}
             				   		}
             				   %>
							</select>
						</div>
		         </div>
		          <%
	        		}
	        	%>
	        		<br>
	        		
	        		<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<!-- <label class = "w3-label w3-text-blue">ReportType</label> -->
							<select class="form-control form-control-sm form-rounded" id="reportType" name="reportType">
							<!-- <option value="">--select top up--</option> -->
							  
                    		<%
								if (ReportType != null && !ReportType.equalsIgnoreCase("") && !ReportType.equalsIgnoreCase("null")) {
									if (ReportType.equalsIgnoreCase("Summary")) {
								%>
									<OPTION value="Summary" selected>Summary</OPTION>
									<OPTION value="Detailed">Detailed</OPTION>
								<%
								} if (ReportType.equalsIgnoreCase("Detailed")) {
								%>
									<OPTION value="Summary">Summary</OPTION>
									<OPTION value="Detailed" selected>Detailed</OPTION>
								<%
								   }
								} else {
								%>
									<option value="">--reportType--</option>
									<OPTION value="Summary">Summary</OPTION>
									<OPTION value="Detailed">Detailed</OPTION>
								<%
								}
								%>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<select class="w3-select w3-hover-blue form-rounded" id="area" name="area">
							  <OPTION value="">All</OPTION>
							  <%
								if(areaType!=null && !areaType.equals("") && areaType.equalsIgnoreCase("Rural")){%>
								<OPTION value="<%=areaType%>" selected>Rural</OPTION>
								<%} else {%>
								<OPTION value="Rural">Rural</OPTION>
								<%}
								
								if(areaType!=null && !areaType.equals("") && areaType.equalsIgnoreCase("Urban")){%>
								<OPTION value="<%=areaType%>" selected>Urban</OPTION>
								<%} else {%>
								<OPTION value="Urban">Urban</OPTION>
								<%}%>
							</select>
						</div>
						
						<div class="w3-container w3-third">
					         	<input TYPE="text" class=" w3-select w3-hover-blue form-rounded date1" value="<%if(msisdn!=null){%><%=msisdn %><%}%>" name="msisdn" placeholder="Enter msisdn number"/><br>
					         </div>
		         </div>
		         <br>
		         
 						<div class="w3-container w3-row-padding">
				 			<div class="w3-container w3-half">
								<input id="fromDate" type="text" name="strFromDate" readonly class="form-control form-control-sm form-rounded date1" placeholder="Enter From Date"
				            		<% if(strFromDate!=null && !strFromDate.equals("")){
				                      		if(strFromDate.equalsIgnoreCase(strFromDate)){
				  					%>
				                              	 value="<%=strFromDate%>" 
				 					 <%
				              			}
				              			}
				 					 %>>
							</div>
							<div class="w3-container w3-half">
								<input id="toDate" name="strToDate" type="text" readonly class="form-control form-control-sm form-rounded date1" placeholder="Enter To Date"
				            			<% if(strToDate!=null && !strToDate.equals("")){
				                     		 if(strToDate.equalsIgnoreCase(strToDate)){
				  						%>
				                              value="<%=strToDate%>"
						  				<%
						             		 }
						              		}
						  				%>>
							</div>
						</div>
						
						
						<br>
				 		<div class="row">
								<div class="col-sm-2 ">
						           </div>
						           <div class="col-sm-4 ">
						               <INPUT TYPE="button" align="left" value="OK" class="btn btn-info btn-block" onclick="Search()">
						              <!--  <INPUT TYPE="button" value="Search" class="btn btn-info btn-block" onclick="Search()"> -->
						           </div>
						           
						           <div class="col-sm-4 ">
							         <INPUT TYPE="button" align="left" value="Reset" class="btn btn-danger btn-block" onclick="resetall()">
							        <!--  <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block" onclick="resetall()">  -->
						          </div>
						      </div>
 
 </form>
 </div>

<script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></Script>
<script>
$( function() {
$( "#fromDate" ).datepicker({
	dateFormat : "dd-mm-yy",
	//changeMonth: true,                  
    //changeYear: true,
	maxDate : -1,
onSelect: function(selectedDate) {
	       
            $('#toDate').datepicker('option', 'minDate', selectedDate );
      }
       //for only 7 days data

    });
$( "#toDate" ).datepicker({
   
	dateFormat : "dd-mm-yy",
	//changeMonth: true,
    //changeYear: true,
    minDate : 0,
	maxDate : -1,
    });
} );
</script>

<!-- 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
<!-- 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
<!-- 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
<!-- 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 -->
				<%
				
            if (StringWrapper.makeNotNull(strFlag).equalsIgnoreCase("true") && 
            		StringWrapper.makeNotNull(ReportType).equals("Summary") && summaryList != null) {
            	
            	if (summaryList.size() - 0 > 0) {
        %>
        <% System.out.println("___");%>
				<table border="0" align="right" width="3%">
					<tr>
						<td><a href="JavaScript:saveAsFlatFile('sales');" class="btn btn-success"><font color="#483D8B">SaveAs&nbsp;CSV</font> </a>&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
					</tr>
					<%
              }
              if (summaryList.size() - 0 <= 0) {
          	%>
					<center>
						<span class="sm-mag-nrm"><b><font color="#483D8B">No Record Found</font> </b> </span>
					</center>
				
					<%
            	}
            } else if (StringWrapper.makeNotNull(strFlag).equalsIgnoreCase("true") && 
            		StringWrapper.makeNotNull(ReportType).equalsIgnoreCase("Detailed") && detailedList != null) {
              if (detailedList.size() - 0 > 0) {
          %>
          <%System.out.println("---"); %>
					<table border="0" align="right" width="3%">
						<td>
							<a href="JavaScript:saveAsFlatFile('dealerWise');" class="btn btn-success"><font color="#483D8B">SaveAs&nbsp;CSV</font> </a>&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
						<%
                }
                if (detailedList.size() - 0 <= 0) {
            	%>
						<center>
							<span class="sm-mag-nrm"><b><font color="#483D8B">No Record Found</font> </b> </span>
						</center>
						<%
              		}
            	}  else {
                //no match
              }
            %>
           <hr>
						
				
		</form>
</body>
</html>
















<!-- 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000  -->


<%-- <%@include file="authentication.jsp"%>  
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="com.mobitec.Mvoucher.SalesReconciliation"%>
<%@ page  import="com.mobitec.Mvoucher.ScreenList" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Sales Report</title>
    <link rel="stylesheet" type="text/css" href="Mvochercss.css" />
    <script language="javascript" src="datetimepick/datetimepicker.js" type="text/javascript"></script>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	  	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	  	 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/typed.js/1.1.1/typed.min.js"></script>
		
		
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
  background: url("https://s3.amazonaws.com/codecademy-content/projects/adoptly/bg.jpg");
  background-size: 100%;
  //text-align: center;
  height: auto;
}
 /* body{
background: #70e1f5; 
background: -webkit-linear-gradient(to left, #70e1f5 , #ffd194); 
background: linear-gradient(to left, #70e1f5 , #ffd194); 
}  */
	</style>
	
	
	
	<script type="text/javascript">
	/* $(function(){
	      $(".element").typed({
	        strings: ["Reports Sales Reconciliation...", "an Engineer (MS)...","BSNL Sales Conciliation Report...", "a Java Developer..."],
	        typeSpeed:100,
	        backDelay:3000,
	        loop:true
	      });
	  }); */
	
	/* $(function() {
		   // var colors = ["#0099cc","#c0c0c0","#587b2e","#990000","#000000","#1C8200","#987baa","#981890","#AA8971","#1987FC","#99081E"];
		     var colors = ["#0099ff","#333300","#999966","#ffccff","#669999","#ccffff","#ffffff","#ffffcc","#ffcc99","#66ccff","#99ccff","#cccccc"];
		    setInterval(function() { 
		        var bodybgarrayno = Math.floor(Math.random() * colors.length);
		        var selectedcolor = colors[bodybgarrayno];
		        $("body").css("background",selectedcolor);
		    }, 3000);
		}); */ 
	</script>
	
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
	var fromDate = document.Distribution.strFromDate.value;
    var toDate =document.Distribution.strToDate.value;
var areaType=document.Distribution.area.value;
    var zoneNam=document.Distribution.zoneName.value;
    var regNam=document.Distribution.regionName.value;
    var cityNam=document.Distribution.cityName.value;
    var mdn=document.Distribution.msisdn.value;
    var ReportType="";
    if (document.getElementById('Report_Type').checked) {
 	  ReportType = document.getElementById('Report_Type').value;
 	 }
    /* if (document.getElementById('Report_Type').checked) {
  	  ReportType = document.getElementById('Report_Type').value;
  	 } */
alert("ReportType :: "+ ReportType);
  var url;
 
  url="SalesReconciliationSave.jsp?saveAsTextFileDW=true&strarea="+areaType+"&strregNam="+regNam+"&strcityNam="+cityNam+"&strFromDate="+fromDate+"&strToDate="+toDate+"&msisdn="+mdn+"&ReportType="+ReportType;

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
    var k=0;
    var m=0;
    var r=0;
    var t=0;
    for(i=1;i<fDate.length;i++)             //function to get the date,month and year
    {                                       //of the from date
       if (fDate.charAt(i)=='-')
           {
            var ddf = fDate.substring(0,i);
            k=i;
            break;
     }
     }
    for(j=k+1;j<fDate.length;j++)
    {
      if (fDate.charAt(j)=='-')
           {
            var mmf = fDate.substring(k+1,j);
            m=j;
            break;
     }
     }

    var yyf = fDate.substring(m+1,fDate.length);
          var xf= parseInt(ddf);
          var yf= parseInt(mmf);
          var zf= parseInt(yyf);

   //alert("fDate :: xf = "+xf+" yf = "+yf+" zf = "+zf);
         for(a=1;a<tDate.length;a++)               //function to get the date,month and year
    {                                        //of the to Date
       if (tDate.charAt(a)=='-')
           {
            var ddt = tDate.substring(0,a);
            r=a;
            break;
     }
     }
    for(b=r+1;b<tDate.length;b++)
    {
      if (tDate.charAt(b)=='-')
           {
            var mmt = tDate.substring(r+1,b);
            t=b;
            break;
     }
     }

    var yyt = tDate.substring(t+1,tDate.length);
           var xt= parseInt(ddt);
            var yt= parseInt(mmt);
            var zt= parseInt(yyt);
   //alert("tDate :: xt = "+xt+" yt = "+yt+" zt = "+zt);
   
       fdate = new Date(yf+"/"+xf+"/"+zf);
       tdate = new Date(yt+"/"+xt+"/"+zt);


       if(fdate  >  new Date())
   {

   alert("From Date cannot be Greater than Current Date..");
     document.Distribution.strFromDate.select();
     document.Distribution.strFromDate.focus();
     return false;
   }
       if(tdate > new Date())
   {
       alert("To Date cannot be Greater than Current Date..");
     document.Distribution.strToDate.select();
     document.Distribution.strToDate.focus();
     return false;
   }
       if(tdate < fdate)
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
  
  
  //if ((document.getElementById('Report_Type').checked==false)&&(document.getElementById('Report_Type1').checked==false)) {
	  if ((document.getElementById('Report_Type').checked==false)) {
 	  alert("Please select Report Type");
 	  return false;
 	 }
    
  
  
        var zoneNam=document.Distribution.zoneName.value;
        var regNam=document.Distribution.regionName.value;
        var cityNam=document.Distribution.cityName.value;
        document.Distribution.action = "SalesReconciliation.jsp?flag=true&strregNam="+regNam+"&strcityNam="+cityNam;
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
  	String areaType="";
  	String ReportType = "";
  	//ArrayList v1 = new ArrayList();
  	int v1=0;
  	strFromDate = request.getParameter("strFromDate");
  	strToDate = request.getParameter("strToDate");
  	strFlag = request.getParameter("flag");
    String strregNam = request.getParameter("strregNam");
    String strcityNam = request.getParameter("strcityNam");
    areaType=request.getParameter("area");
    ReportType = request.getParameter("Report_Type");
    System.out.println(">areaType>>>"+areaType);    

  	int iAdd = -1, iModify = -1, iDelete = -1, iPrintSave = -1;
  	String strAdd12 = "", result = "";
  	String strModify12 = "";
  	String strDelete12 = "";
  	String strPrntSave12 = "";
  	String strPrivilage = "";
  	
  	String userName = "";
  	StringTokenizer st5 = null;
  	String msisdn="";
  	ScreenList SL = new ScreenList();
  	userName = (String) session.getAttribute("user_id");
  	if(userName !=null && !userName.equalsIgnoreCase("")){
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
  	}
  	iPrintSave = 1;
  	
  	if (strFlag != null && strFlag.equalsIgnoreCase("true")&&ReportType.equalsIgnoreCase("Detailed")) {
  		msisdn = request.getParameter("msisdn");
  		SalesReconciliationDao saleReconciliation = new SalesReconciliationDao();
  		v1 = saleReconciliation.Sales_reconciliationData(strFromDate, strToDate, strregNam, strcityNam,msisdn);
  		//session.removeAttribute("salesReconciliation");
  		//session.setAttribute("salesReconciliation", v1);
  	}
  	
  	if (strFlag != null && strFlag.equalsIgnoreCase("true")&&ReportType.equalsIgnoreCase("Summary")) {
  		msisdn = request.getParameter("msisdn");
  		SalesReconciliationDao saleReconciliation = new SalesReconciliationDao();
  		v1 = saleReconciliation.Sales_reconciliationData_Summary(strFromDate, strToDate, strregNam, strcityNam,msisdn);
  		//session.removeAttribute("salesReconciliation");
  		//session.setAttribute("salesReconciliation", v1);
  	}
  %>
  <%

  	String strAuthNum = "", zoneName = "", regionName = "", cityName = "", zoneId = "";
  	String zoneFname = "", zoneSname = "", regionId = "", regionFname = "", regionSname = "", cityId = "", cityFname = "", citySname = "";
  	String info = "", regionInfo = "", cityInfo = "", dealerCode = "", region = "";
  	StringTokenizer stInfo1 = null;
  	StringTokenizer stInfo = null, reg1 = null;
  	AddDealerInfo addInfo = new AddDealerInfo();
  	if(userName !=null && !userName.equalsIgnoreCase("")){
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
  	}
  %>
  <BODY leftmargin="0" topmargin="25" marginwidth="0" marginheight="0" style="FILTER: progid:DXImageTransform.Microsoft.Gradient(endColorstr='#d6dff7', startColorstr='#FFFFFF', gradientType='0'">
    
    <header class = "w3-container w3-teal typewriter" >
         <h2 class="element">BSNL </h2><!--  Reports>>Sales Reconciliation >> -->
         <!-- <p class = "w3-large">Wi-fi Report!</p> -->
         
 </header>
 <!-- <div class="element"></div> -->
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
			         <div id="container123"></div>
			         <div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Zone</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode()" name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>City</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onClick="selectCircle()" onChange="regionCode()" name=cityName>
							  <OPTION value="<%=cityFname%>"><%=cityFname%></OPTION>
							</select>
						</div>
		         </div><br>
		         
			         <%}else if(cityId.equals("0") && (!zoneId.equals("numbers0")) &&(!regionId.equals("0"))){ %>
			    		<%System.out.println("zone  id info====================::1,1,0"); %>
			    			<div class="w3-container w3-row-padding">
						
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Zone</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode()" name=regionName>
							  <OPTION value="<%=regionFname%>"><%=regionFname%></OPTION>
							</select>
						</div>
						
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>City</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onChange="regionCode()" name=cityName>
							
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
						<label for="regionName" class="w3-text-blue"><b>Zone</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList1 onChange="" name=zoneName>
							  <OPTION value="<%=zoneFname%>"><%=zoneFname%></OPTION>
							</select>
						</div>
						<div class="w3-container w3-third">
						<label for="regionName" class="w3-text-blue"><b>Circle</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList2 onChange="regionCode2()" name=regionName>
							
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
						<label for="regionName" class="w3-text-blue"><b>City</b></label>
							<select class="w3-select w3-hover-blue form-rounded" id=regionList onChange="cityCode()" name=cityName>
							
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
					   
					   <div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id="Report_Type" name="Report_Type">
							 
							  <%
								if (ReportType != null && !ReportType.equalsIgnoreCase("") && !ReportType.equalsIgnoreCase("null")) {
									if (ReportType.equalsIgnoreCase("Summary")) {
								%>
									<OPTION value="Summary" selected>Summary</OPTION>
									<OPTION value="Detailed">Detailed</OPTION>
								<%
								} if (ReportType.equalsIgnoreCase("Detailed")) {
								%>
									<OPTION value="Summary" >Summary</OPTION>
									<OPTION value="DealerWiseSalesSummary" selected>Detailed</OPTION>
									<%
								}} else {
									
									%>
									<OPTION value="">--search on--</OPTION> 
									<OPTION value="Summary" >Summary</OPTION>
									<OPTION value="Detailed" >Detailed</OPTION>
								<%
								}
									%>
							  
							</select>
						</div>
						<div class="w3-container w3-third">
							<input type="radio" name="Report_Type" id="Report_Type" value="Detailed" <%=StringWrapper.makeNotNull(ReportType).equals("Detailed")?"checked":"" %>><font color="#483D8B" >&nbsp;&nbsp;&nbsp;Detailed</font>
						</div>
						
						<div class="w3-container w3-third">
							<input type="radio" name="Report_Type"id="Report_Type1" value="Summary" <%=StringWrapper.makeNotNull(ReportType).equals("Summary")?"checked":"" %>><font color="#483D8B" >&nbsp;&nbsp;&nbsp;Summary</font>
						</div>
						
						<div class="w3-container w3-third">
							<select class="w3-select w3-hover-blue form-rounded" id="area" name="area">
							  <OPTION value="">All</OPTION>
							  
							  <%
								if(areaType!=null && !areaType.equals("") && areaType.equalsIgnoreCase("Rural")){%>
								<OPTION value="<%=areaType%>" selected>Rural</OPTION>
								<%} else {%>
								<OPTION value="Rural">Rural</OPTION>
								<%}
								
								if(areaType!=null && !areaType.equals("") && areaType.equalsIgnoreCase("Urban")){%>
								<OPTION value="<%=areaType%>" selected>Urban</OPTION>
								<%} else {%>
								<OPTION value="Urban">Urban</OPTION>
								<%}%>
							</select>
						</div>
							<div class="w3-container w3-third">
					         	<input TYPE="text" class=" w3-select w3-hover-blue form-rounded date1" value="<%if(msisdn!=null){%><%=msisdn %><%}%>" name="msisdn" placeholder="Enter msisdn number"/><br>
					         </div>
						</div>
		         <br>
		         
		         	<div class="w3-container w3-row-padding">
		 			<div class="w3-container w3-half">
						<input id="fromDate" type="text" name="strFromDate"  readonly class=" w3-select w3-hover-blue form-rounded date1" placeholder="Enter From Date"
		            		<%if (strFromDate != null && !strFromDate.equals("")) {
								   if (strFromDate.equalsIgnoreCase(strFromDate)) {%>
									 value="<%=strFromDate%>" <%}
							  } else {%> value=""
										<%}%> readonly/>
					</div>
					<div class="w3-container w3-half">
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
					               <INPUT TYPE="button" class="btn btn-info btn-block" value="OK"  " onclick="Search()">
					           </div>
					           
					           <div class="col-sm-4 ">
						         <!-- <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block" onclick="fnReset();">  -->
						         <INPUT TYPE="button" value="Reset" class="btn btn-danger btn-block" onclick="resetall()">
					          </div>
					    </div>
 </div>
 </div>
 </div>
 </form>
 </div>
 
      <%
      if (strFlag != null && strFlag.equalsIgnoreCase("true") && v1 <= 0 ) {
      %>
      <br>
      <center>
        <span class="sm-mag-nrm"><b><font color="#483D8B">No Record Found</font> </b> </span>
      </center>
      <%
      }
      %>
      <%
     // if (strFlag != null && strFlag.equalsIgnoreCase("true") && v1 != null && v1.size() > 0 && iPrintSave == 1) {
    	 if (strFlag != null && strFlag.equalsIgnoreCase("true") && v1 > 0 && iPrintSave == 1) {
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
  </body>
</html> --%>