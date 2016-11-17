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
// 获取url传参
function GetArgsFromHref() {
	/* 用途: 接收地直栏参数 取id=1 根据ID的值 */
	var urlinfo = window.location.href; // 获取当前页面的url
	var len = urlinfo.length;// 获取url的长度
	var offset = urlinfo.indexOf("?");// 设置参数字符串开始的位置
	var newsidinfo = urlinfo.substr(offset, len)// 取出参数字符串 这里会获得类似“id=1”这样的字符串
	var newsids = newsidinfo.split("=");// 对获得的参数字符串按照“=”进行分割
	var newsid = newsids[1];// 得到参数值
	var newsname = newsids[0];// 得到参数名字
	return newsid;
}

// 时间对象的格式化;
function formatdate(time) {
	var format = 'yyyy-MM-dd HH:mm:ss';
	var t = new Date(time);
	var tf = function(i) {
		return (i < 10 ? '0' : '') + i
	};
	return format.replace(/yyyy|MM|dd|HH|mm|ss/g, function(a) {
		switch (a) {
		case 'yyyy':
			return tf(t.getFullYear());
			break;
		case 'MM':
			return tf(t.getMonth() + 1);
			break;
		case 'mm':
			return tf(t.getMinutes());
			break;
		case 'dd':
			return tf(t.getDate());
			break;
		case 'HH':
			return tf(t.getHours());
			break;
		case 'ss':
			return tf(t.getSeconds());
			break;
		}
	})
}
function selectproject() {
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
}
