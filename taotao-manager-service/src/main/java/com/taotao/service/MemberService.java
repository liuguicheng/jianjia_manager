package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbUser;

public interface MemberService {

	EUDataGridResult getMemberList(Integer page, Integer rows);

	TaotaoResult insertMember(TbUser staff);

	TaotaoResult deleteMember(String ids);


	TbUser selectMember(String id);
}
