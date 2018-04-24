/*function checkBillingAddress(){
	if($('#theSameAsShippingAddress').is(":checked")){
		$(".billingAddress").prop("disabled", true);
	}else{
		$(".billingAddress").prop("disabled", false);
	}
}*/

function checkPasswordMatch(){
	var password = $("#newPassword").val();
	var confirmPassword = $("#confirmPassword").val();
	
	if(password == "" && confirmPassword == ""){
		$("#checkPasswordMatch").html("");
		$("#updateUserInfoBtn").prop('disabled', false);
	}else{
		if(password != confirmPassword){
			$("#checkPasswordMatch").html("Passwords do not match.");
			$("#updateUserInfoButton").prop('disabled', true);
		}else{
			$("#checkPasswordMatch").html("Passwords match.");
			$("#updateUserInfoBtn").prop('disabled', false);
		}
	}
}

$(document).ready(function(){
	/*$(".cartItemQty").on('change', function(){
		var id = this.id;
		$('#update-item-'+id).css('display', 'inline-block');
	});
	$("#theSameAsShippingAddress").on('click', checkBillingAddress);*/
	$("#confirmPassword").keyup(checkPasswordMatch);
	$("#newPassword").keyup(checkPasswordMatch);
})