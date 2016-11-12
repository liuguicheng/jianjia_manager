 function openId(){
        //获取选中的节点
        var nodes=$("#using_json").jstree("get_checked");
        alert(nodes);
    }
    $(function(){
        $("#using_json").jstree({
            "core": {
                "data": {
                	'url' : function (node) {
                	      return node.id === '#' ?
                	        '/power/powerjsonAjax/list.do' :
                	        '/power/powerjsonAjax/list.do';
                	    },
                	    'data' : function (node) {
                	      return { 'id' : node.id==='#'? 0:node.id  };
                	    }
                	
                }
            },
            "checkbox" : {
                "keep_selected_style" : false
            },"plugins" : [ "wholerow", "checkbox" ]
        })
    });