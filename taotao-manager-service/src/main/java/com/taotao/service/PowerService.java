package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.commonmodule.SysPower;

public interface PowerService {

	EUDataGridResult getPowerList(int page, int rows);

	List<EUTreeNode> getPowerJsonList(String powerParentId);

	TaotaoResult insertPower(SysPower sysPower);

	TaotaoResult deletePower(String ids);

	SysPower selectPower(String id);
}
