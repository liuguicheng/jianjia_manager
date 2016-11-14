package com.taotao.controller.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.pojo.commonmodule.SysRole;
import com.taotao.pojo.commonmodule.SysStaff;
import com.taotao.service.RoleService;
import com.taotao.service.UserService;

@Controller
@RequestMapping("/userinfo")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	/**
	 * 新增、修改、找回密码、修改密码、修改个人资料
	 */

	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return "console/usermanage/" + page;
	}
	
	
	@RequestMapping("/list")
	@ResponseBody
	private String getCatList(Integer page, Integer rows) {
		EUDataGridResult result = userService.getUserList(page, rows);
		String returnjson="";
		if(result!=null&&result.getTotal()>0){
			 returnjson=JsonUtils.objectToJson(result.getRows());		
		}
		return returnjson;
	}
	
	
	@RequestMapping(value="/createuser", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createUser(SysStaff staff) {
		TaotaoResult result = userService.insertUser(staff);
		return result;
	}
	@RequestMapping(value="/del", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult delUser(String ids) {
		TaotaoResult result = userService.deleteUser(ids);
		return result;
	}
	@RequestMapping(value="/upd", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult upd(String ids,Integer type ) {
		TaotaoResult result = userService.updateUser(ids,type);
		return result;
	}
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	@ResponseBody
	public SysStaff editUser(String id) {
		SysStaff staff= userService.selectUser(id);
		return staff;
	}
	
	@RequestMapping(value="/rolejsonAjax/list", method=RequestMethod.POST)
	@ResponseBody
	public List<SysRole> rolejsonList(String id) {
		List<SysRole> rolelist= roleService.selectRoleList();
		return rolelist;
	}
	
}
