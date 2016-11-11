package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;

public interface RoleService {
	EUDataGridResult getRoleList(int page, int rows);
}
