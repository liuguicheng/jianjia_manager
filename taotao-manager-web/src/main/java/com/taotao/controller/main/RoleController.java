package com.taotao.controller.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.utils.JsonUtils;
import com.taotao.service.PowerService;
import com.taotao.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private PowerService poserService;
	
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return "console/role/" + page;
	}

	@RequestMapping("/powerRole/list")
	@ResponseBody
	private String getCatList(Integer page, Integer rows) {
		EUDataGridResult result = roleService.getRoleList(page, rows);
		String returnjson="";
		if(result!=null&&result.getTotal()>0){
			 returnjson=JsonUtils.objectToJson(result.getRows());		
		}
		return returnjson;
	}
	
	@RequestMapping("/power/list")
	@ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value="id", defaultValue="0")Long parentId) {
		List<EUTreeNode> list = poserService.getPowerList(parentId);
		return list;
	}
}
