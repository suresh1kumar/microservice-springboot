$(document).ready(function() {
	alert("country");
	$.ajax({
		url :'/Resume_Builder/getCountryDetails',
		success : function(data) {
			$("#country").empty();
			$("#country").append(
                    "<option selected='selected'>Select Country</option>");
			 $.each(data, function(i, val) {
	                $("#country").append(
	                        "<option value=" + i + ">" + val+ "</option>");
	            });
		}
	});
//function change2(){
	$('#country').change(function() {
		//alert($('select#country').val());
		$.ajax({
			url : '/Resume_Builder/getAllSrateBasedOnCountry',
			data : {
				countryid : $('select#country').val()
			},
			success : function(data) {
				
				$("#state").empty();
				$("#state").append(
                        "<option selected='selected'>Select State</option>");
			
				 $.each(data, function(i, val) {
		                $("#state").append(
		                        "<option value=" + i + ">" + val+ "</option>");
		            });
			}
		});//}
	});
	
	$('#state').change(function() {
		//alert($('select#country').val());
		$.ajax({
			url : '/Resume_Builder/getAllCityBasedOnState',
			data : {
				countryid : $('select#city').val()
			},
			success : function(data) {
				
				$("#city").empty();
				$("#city").append(
                        "<option selected='selected'>Select State</option>");
			
				 $.each(data, function(i, val) {
		                $("#city").append(
		                        "<option value=" + i + ">" + val+ "</option>");
		            });
			}
		});//}
	});
	
});
