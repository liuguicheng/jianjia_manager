function logout() {

	window.location.href = "logout.do";
}
function showpage(url) {
	window.location.href = url;
}
// 返回上一页
function goIndex(index) {
	window.location.href = history.go(index);
}

$(document).ready(function() {
	// 获取系统名称
	$.ajax({
		type : "post",
		url : "../../showApplicationName.do",
		data : {
			propertyname : "application.appName"
		},
		dataType : "json",
		success : function(data) {
			$(document).attr("title", data.msg);
		}
	});
});