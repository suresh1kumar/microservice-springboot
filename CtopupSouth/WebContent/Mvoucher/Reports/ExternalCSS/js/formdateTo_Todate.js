/*Form date to ToDate*/

$(document).ready(function(){
	var minDate=new Date();
	$("#strFormBate").datepicker({
	showAnim: 'drop',
	numberOfMonth: 1,
	minDate: minDate,
	dateFormat: 'dd/mm/yy',
	onClose:function(selectedDate){
	$('#strToDate').datepicker("option","minDate",selectedDate);
	}
	});

	$("#strToDate").datepicker({
	showAnim: 'drop',
	numberOfMonth: 1,
	minDate: minDate,
	dateFormat: 'dd/mm/yy',
	onClose:function(selectedDate){
	$('#strFormBate').datepicker("option","minDate",selectedDate);
	}
	});	
});


/*for hide the date when click the current radio button*/

function disableStatus2()
{
	document.getElementById("dateblock").style.display="none";
	return true;
}

function disableStatus1()
{
	document.getElementById("dateblock").style.display="block";
	return true;
}