$(document).ready(function() {
$("#checkout_form").submit(function() {

var firstname = $("#firstName").val();
var lastname = $("#lastName").val();
var address1 = $("#addressLine1").val();
var address2 = $("#addressLine2").val();
var city = $("#city").val();

var postcode = $("#postcode").val();
var state = $("#state").val();
var country = $("#country").val();


var email = $("#email").val();




if (firstname === '' && lastname === '' && address1 === '' &&
        
		address2 === '' && city === '' && postcode === '' &&      
            
		state === '' && country === '' && email === '' 
    ) {
	//$( ".columns" ).css("border", "3px solid red" );
	$('#firstName').css('border', '3px solid red');
	$('#lastName').css('border', '3px solid red');
	$('#addressLine1').css('border', '3px solid red');
	$('#addressLine2').css('border', '3px solid red');
	$('#city').css('border', '3px solid red');
	$('#postcode').css('border', '3px solid red');
	$('#state').css('border', '3px solid red');
	$('#country').css('border', '3px solid red');
	$('#email').css('border', '3px solid red');
	
	
	alert("Please Fill Required	Fields");
return false; // Indicates that don't submit the form, stay on same page
} else {
	



if ($('#firstname').val() == '') {
    $('#firstname').css('border', '3px solid red');
    alert("Please Fill Required Fields");
    return false;
}
else {
    $('#firstname').css('border-color', '');
    //return true;
}


if ($('#lastname').val() == '') {
    $('#lastname').css('border', '3px solid red');
    return false;
}
else {
    $('#lastname').css('border-color', '');
    //return true;
}



if ($('#address1').val() == '') {
    $('#address1').css('border', '3px solid red');
    return false;
}
else {
    $('#address1').css('border-color', '');
    //return true;
}



if ($('#address2').val() == '') {
    $('#address2').css('border', '3px solid red');
    return false;
}
else {
    $('#address2').css('border-color', '');
    //return true;
}



if ($('#city').val() == '') {
    $('#city').css('border', '3px solid red');
    return false;
}
else {
    $('#city').css('border-color', '');
    //return true;
}



if ($('#postcode').val() == '') {
    $('#postcode').css('border', '3px solid red');
    return false;
}
else {
    $('#postcode').css('border-color', '');
    //return true;
}



if ($('#state').val() == '') {
    $('#state').css('border', '3px solid red');
    return false;
}
else {
    $('#state').css('border-color', '');
    //return true;
}


if ($('#country').val() == '') {
    $('#country').css('border', '3px solid red');
    return false;
}
else {
    $('#country').css('border-color', '');
    //return true;
}


if ($('#email').val() == '') {
    $('#email').css('border', '3px solid red');
    return false;
}
else {
    $('#email').css('border-color', '');
    //return true;
}

}



});
});

