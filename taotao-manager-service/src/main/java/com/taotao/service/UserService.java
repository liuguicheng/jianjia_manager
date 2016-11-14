package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.commonmodule.SysStaff;

public interface UserService {

	EUDataGridResult getUserList(Integer page, Integer rows);

	TaotaoResult insertUser(SysStaff staff);

	TaotaoResult deleteUser(String ids);

	SysStaff selectUser(String id);

	TaotaoResult updateUser(String ids,int type);

}
