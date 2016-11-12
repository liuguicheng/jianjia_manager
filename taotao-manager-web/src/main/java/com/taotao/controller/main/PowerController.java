package com.taotao.controller.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.pojo.commonmodule.SysPower;
import com.taotao.service.PowerService;

@Controller
@RequestMapping("/power")
public class PowerController {
	@Autowired
	private PowerService poserService;

	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return "console/power/" + page;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createPower(SysPower sysPower) {
		TaotaoResult result = poserService.insertPower(sysPower);
		return result;
	}
	@RequestMapping(value="/del", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult delPower(String ids) {
		TaotaoResult result = poserService.deletePower(ids);
		return result;
	}
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	@ResponseBody
	public SysPower editPower(String id) {
		SysPower syspower= poserService.selectPower(id);
		return syspower;
	}
	
	//分页形式的 菜单列表
	@RequestMapping("/powerAjax/list")
	@ResponseBody
	private String getPowerList(Integer page, Integer rows) {
		EUDataGridResult result = poserService.getPowerList(page, rows);
		String returnjson="";
		if(result!=null&&result.getTotal()>0){
			 returnjson=JsonUtils.objectToJson(result.getRows());		
		}
		return returnjson;
	}
	
	//tree形式的 菜单列表
	@RequestMapping("/powerjsonAjax/list")
	@ResponseBody
	private List<EUTreeNode> getPowerJsonList(@RequestParam(value="id", defaultValue="0")String powerParentId) {
		List<EUTreeNode> result = poserService.getPowerJsonList(powerParentId);
		return result;
	}
}
