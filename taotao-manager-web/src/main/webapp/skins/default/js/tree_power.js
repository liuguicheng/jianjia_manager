function openId() {
	// 获取选中的节点
	var nodes = $("#using_json").jstree("get_checked");
	alert(nodes);
}
$(function() {
	setTimeout(
			function() {

				$("#using_json")
						.jstree(
								{
									"core" : {
										"data" : {
											'url' : function(node) {
												return node.id === '#' ? '/power/powerjsonAjax/list.do'
														: '/power/powerjsonAjax/list.do';
											},
											'data' : function(node) {
												return {
													'id' : node.id === '#' ? 0
															: node.id
												};
											}

										}
									},
									"checkbox" : {
										"keep_selected_style" : false
									},
									"plugins" : [ "wholerow", "checkbox" ]
								}).on('loaded.jstree', function(e, data) {
							var inst = data.instance;
							var selectpowerstr = $("#powerStr").val();
							if (selectpowerstr.length > 0) {
								var s = selectpowerstr.split(",");
								$(s).each(function(index) {
									// console.log("1=="+index);
									var obj = inst.get_node(this);
									// console.log(obj);
									inst.select_node(obj);
								});

							}

						});
			}, 500);
	// 例子
	$('#jstree_demo_div1').jstree({
		'plugins' : [ "wholerow", "checkbox" ],
		'core' : {
			'data' : [ {
			// "text" : "Same but with checkboxes",
			// "children" : [
			// { "text" : "initially selected", "state" : { "selected" : true }
			// },
			// { "text" : "custom icon URL"},
			// { "text" : "initially open", "state" : { "opened" :
			// true,"selected" : true }, "children" : [ "Another node" ] },
			// { "text" : "custom icon class"}
			// ]
			}, "And wholerow selection" ]
		}
	});
});