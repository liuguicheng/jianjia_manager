$.validator.setDefaults({
	highlight : function(e) {
		$(e).closest(".form-group").removeClass("has-success").addClass(
				"has-error")
	},
	success : function(e) {
		e.closest(".form-group").removeClass("has-error").addClass(
				"has-success")
	},
	errorElement : "span",
	errorPlacement : function(e, r) {
		e.appendTo(r.is(":radio") || r.is(":checkbox") ? r.parent().parent()
				.parent() : r.parent())
	},
	errorClass : "help-block m-b-none",
	validClass : "help-block m-b-none"
}), $().ready(function() {
	//加载select
	onselect();
	//获取参数
	var sd=GetArgsFromHref();
	if (typeof(sd)!= "undefined"){ 
		$("#powerId").val(sd);
		//等select 加载完了，在加载其他
		 setTimeout(function () { 
			 onselectPower(sd);
		    }, 500);
		 //修改title
		 $("#titleid").html("修改菜单");
		
	}
	//初始化验证
	var e = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			powerName : "required",
			url:"required",
			powerTypeFlag: {
				required : !0,
				number:true,
				maxlength : 3
			}
		},
		messages : {
			powerName : e + "请输入菜单名称",
			url : e + "请输入菜单url",
			powerTypeFlag:{
				required: e + "请输入菜单排序",
				maxlength: e + "菜单排序最大3位数字",
				number:e+"菜单排序只能输入数字"
			},
			
		},submitHandler:function(form){  
            tjajx(); 
        }   
	});
});


function tjajx(){
	$.ajax({
		type : "post",
		url : "/power/save.do",
		data : $('#signupForm').serialize(),// ,
		dataType : "json",
		success : function(data) {
			if(data.status=="200"){
				swal({title:"操作提示",text:"操作成功",type:"success",closeOnConfirm: false} ,
					function(){
					location.reload() 
					  });
			}else{
				swal({title:"操作提示",text:"操作失败", type:"error",closeOnConfirm: false })
			}
		}
	});
}
//加载 select
function onselect(){
	
	$.ajax({
		type : "post",
		url : "/power/powerjsonAjax/list.do",
		data : "id=0",
		dataType : "json",
		success : function(data) {
			if(data!=""){
				    var selObj = $("#powerParentId");  
				    $.each(data,function(i,n){
				    	var value=n.id;  
					    var text=n.text;  
					    var children=n.children;
					    selObj.append("<option value='"+value+"'>"+text+"</option>");  
					    $.each(children,function(ii,nn){
					    	selObj.append("<option value='"+nn.id+"'>"+"&nbsp;&nbsp;&nbsp;&nbsp;"+nn.text+"</option>");  
					    });
				    });
			}else{
				swal({title:"操作提示",text:"获取根节点失败,请联系管理员", type:"error" })
			}
		}
	});
}
//获取 菜单信息
function onselectPower(id){
	
	$.ajax({
		type : "GET",
		url : "/power/edit.do",
		data : "id="+id,
		dataType : "json",
		success : function(data) {
			if(data!=""){
				    $("#powerName").val(data.powerName);
				    $("#url").val(data.url);
				    $("#imgurl").val(data.imgurl);
				    $("#isParent").val(data.isParent);
				    $("#powerTypeFlag").val(data.powerTypeFlag);
				    $("#powerParentId option").each(function (){  
			            var txt = $(this).val();
			            if(txt==data.powerParentId){
			            	 $(this).attr("selected","selected");
			            }
				    });
			}else{
				swal({title:"操作提示",text:"获取菜单详细出错,请联系管理员", type:"error" })
			}
		}
	});
}