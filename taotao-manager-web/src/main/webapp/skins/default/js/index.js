function logout(){
	
	window.location.href="logout.do";
}
function showpage(url){
	window.location.href=url;
}

$(document).ready(function() {
	$.ajax({
		type : "post",
		url : "../../showApplicationName.do",
		data : {
			propertyname : "application.appName"
		},
		dataType : "json",
		success : function(data) {
			 $(document).attr("title",data.msg);
		}
	});
});