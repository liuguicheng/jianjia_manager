<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css"
	href="/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript"
	src="/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<table class="easyui-datagrid" id="itemParamList" title="规格列表"
	data-options="singleSelect:false,collapsible:true,pagination:true,url:'/item/param/list.do',method:'get',pageSize:30,toolbar:itemParamListToolbar">
	<thead>
		<tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'id',width:60">ID</th>
			<th data-options="field:'itemCatId',width:80">商品类目ID</th>
			<!-- <th data-options="field:'itemCatName',width:100">商品类目</th> -->
			<th
				data-options="field:'paramData',width:300,formatter:formatItemParamData">规格(只显示分组名称)</th>
			<th
				data-options="field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建日期</th>
			<th
				data-options="field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime">更新日期</th>
		</tr>
	</thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="编辑商品规格"
	data-options="modal:true,closed:true,iconCls:'icon-save',href:'item-param-edit.do'"
	style="width: 80%; height: 80%; padding: 10px;"></div>
<script>
	function formatItemParamData(value, index) {
		var json = JSON.parse(value);
		var array = [];
		$.each(json, function(i, e) {
			array.push(e.group);
		});
		return array.join(",");
	}

	function getSelectionsIds() {
		var itemList = $("#itemParamList");
		var sels = itemList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].id);
		}
		ids = ids.join(",");
		return ids;
	}

	var itemParamListToolbar = [
			{
				text : '新增',
				iconCls : 'icon-add',
				handler : function() {
					//window.open("/plugins/commodity/item-param-add.do");
					TAOTAO.createWindow({
						url : "/plugins/commodity/item-param-add.do",
					});
				}
			},
			{
				text : '编辑',
				iconCls : 'icon-edit',
				handler : function() {
					var ids = getSelectionsIds();
					if (ids.length == 0) {
						$.messager.alert('提示', '必须选择一个商品规格才能编辑!');
						return;
					}
					if (ids.indexOf(',') > 0) {
						$.messager.alert('提示', '只能选择一个商品规格!');
						return;
					}
					$("#itemEditWindow")
							.window(
									{
										onLoad : function() {
											//回显数据
											var data = $("#itemParamList")
													.datagrid("getSelections")[0];
											$("#itemeEditForm").form("load",
													data);
											//加载类目规格参数
											$.getJSON('/item/param/itemparam/'
																	+ data.id
																	+ ".do",
															function(_data) {
																if (_data
																		&& _data.paramData) {
																	//回显规格参数
																	var paramData = JSON
																			.parse(_data.paramData);
																	for ( var i in paramData) {
																		var pd = paramData[i];
																		var html="<li class='param'>"+
																		"<ul>"+
																		"<li>"+
																		"<input class=\"easyui-textbox textbox-f\" style=\"width: 150px; display: none;\" textboxname=\"group\">"+
																		"<span class=\"textbox\" style=\"width: 148px; height: 20px;\">"+
																		"<input type=\"text\" class=\"textbox-text validatebox-text textbox-prompt\" value=\""+pd.group+"\" autocomplete=\"off\" placeholder=\"\" style=\"margin-left: 0px; margin-right: 0px; padding-top: 3px; padding-bottom: 3px; width: 140px;\">"+
																		"<input type=\"hidden\" class=\"textbox-value\" name=\"group\" value=\""+pd.group+"\"></span>&nbsp;<a href=\"javascript:void(0)\" class=\"easyui-linkbutton addParam l-btn l-btn-small l-btn-plain\" title=\"添加参数\" data-options=\"plain:true,iconCls:'icon-add'\" group=\"\" id=\"\">"+
																		"<span class=\"l-btn-left l-btn-icon-left\"><span class=\"l-btn-text l-btn-empty\">&nbsp;</span><span class=\"l-btn-icon icon-add\">&nbsp;</span></span></a>"+
																		"</li>";
																		for ( var j in pd.params) {
																			  var ps = pd.params[j];
																			  html+="<li>"+
																				"<span>|-------</span>"+
																				"<input style=\"width: 150px; display: none;\" class=\"easyui-textbox textbox-f\" textboxname=\"param\">"+
																				"<span class=\"textbox\" style=\"width: 148px; height: 20px;\">"+
																				"<input type=\"text\" class=\"textbox-text validatebox-text textbox-prompt\" value=\""+ps+"\" autocomplete=\"off\" placeholder=\"\" style=\"margin-left: 0px; margin-right: 0px; padding-top: 3px; padding-bottom: 3px; width: 140px;\"><input type=\"hidden\" class=\"textbox-value\" name=\"param\" value=\""+ps+"\"></span>"+
																				"&nbsp;<a href=\"javascript:void(0)\" class=\"easyui-linkbutton delParam l-btn l-btn-small l-btn-plain\" title=\"删除\" data-options=\"plain:true,iconCls:'icon-cancel'\" group=\"\" id=\"\"><span class=\"l-btn-left l-btn-icon-left\">"+
																				"<span class=\"l-btn-text l-btn-empty\">&nbsp;</span><span class=\"l-btn-icon icon-cancel\">&nbsp;</span></span></a>	"+					
																			"</li>";
																		}
																		 html+="</ul>"+"</li>";
																		 $(".addGroup").parent().parent().append(html);
																	}		
																	
																	$("li").find(".delParam").click(function(){
																		  $(this).parent().remove();
																	  });
																	$(".addParam").click(function(){
																		var html2="<li>"+
																		"<span>|-------</span>"+
																		"<input style=\"width: 150px; display: none;\" class=\"easyui-textbox textbox-f\" textboxname=\"param\">"+
																		"<span class=\"textbox\" style=\"width: 148px; height: 20px;\">"+
																		"<input type=\"text\" class=\"textbox-text validatebox-text textbox-prompt\" value=\"\" autocomplete=\"off\" placeholder=\"\" style=\"margin-left: 0px; margin-right: 0px; padding-top: 3px; padding-bottom: 3px; width: 140px;\"><input type=\"hidden\" class=\"textbox-value\" name=\"param\" value=\"\"></span>"+
																		"&nbsp;<a href=\"javascript:void(0)\" class=\"easyui-linkbutton delParam l-btn l-btn-small l-btn-plain\" title=\"删除\" data-options=\"plain:true,iconCls:'icon-cancel'\" group=\"\" id=\"\"><span class=\"l-btn-left l-btn-icon-left\">"+
																		"<span class=\"l-btn-text l-btn-empty\">&nbsp;</span><span class=\"l-btn-icon icon-cancel\">&nbsp;</span></span></a>	"+					
																	"</li>";
																		$(this).parent().parent().append(html2);
																		$("li").find(".delParam").click(function(){
																			  $(this).parent().remove();
																		  });
																		
																	  });
																	
																}
															});

											TAOTAO.init({
												"cid" : data.itemCatId,
												"id":data.id
											});
										}
									}).window("open");
				}
			},
			{
				text : '删除',
				iconCls : 'icon-cancel',
				handler : function() {
					var ids = getSelectionsIds();
					if (ids.length == 0) {
						$.messager.alert('提示', '未选中商品规格!');
						return;
					}
					$.messager
							.confirm(
									'确认',
									'确定删除ID为 ' + ids + ' 的商品规格吗？',
									function(r) {
										if (r) {
											var params = {
												"ids" : ids
											};
											$
													.post(
															"/item/param/delete.do",
															params,
															function(data) {
																if (data.status == 200) {
																	$.messager
																			.alert(
																					'提示',
																					'删除商品规格成功!',
																					undefined,
																					function() {
																						$(
																								"#itemParamList")
																								.datagrid(
																										"reload");
																					});
																}
															});
										}
									});
				}
			} ];
</script>