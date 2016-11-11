package com.taotao.controller.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.utils.JsonUtils;
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

	@RequestMapping("/powerAjax/list")
	@ResponseBody
	private String getCatList(Integer page, Integer rows) {
		EUDataGridResult result = poserService.getPowerList(page, rows);
		String returnjson="";
		if(result!=null&&result.getTotal()>0){
			 returnjson=JsonUtils.objectToJson(result.getRows());		
		}
		return returnjson;
	}
}
