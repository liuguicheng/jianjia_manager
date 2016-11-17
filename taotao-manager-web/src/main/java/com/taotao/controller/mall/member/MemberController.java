package com.taotao.controller.mall.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.pojo.TbUser;
import com.taotao.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	/**
	 * 会员信息管理
	 */
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping("/list")
	@ResponseBody
	public String getItemList(Integer page, Integer rows) {
		EUDataGridResult result = memberService.getMemberList(page, rows);
		String returnjson="";
		if(result!=null&&result.getTotal()>0){
			 returnjson=JsonUtils.objectToJson(result.getRows());		
		}
		return returnjson;
	}
	
	
	@RequestMapping(value="/createMember", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createMember(TbUser staff) {
		TaotaoResult result = memberService.insertMember(staff);
		return result;
	}
	@RequestMapping(value="/del", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult delMember(String ids) {
		TaotaoResult result = memberService.deleteMember(ids);
		return result;
	}
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	@ResponseBody
	public TbUser editMember(String id) {
		TbUser staff= memberService.selectMember(id);
		return staff;
	}
}
