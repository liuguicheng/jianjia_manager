package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.commonmodule.SysRole;

public interface RoleService {
	EUDataGridResult getRoleList(int page, int rows);

	TaotaoResult deleteRole(String ids);

	TaotaoResult insertRole(SysRole role);

	SysRole selectRole(String id);

	List<SysRole> selectRoleList();
}
