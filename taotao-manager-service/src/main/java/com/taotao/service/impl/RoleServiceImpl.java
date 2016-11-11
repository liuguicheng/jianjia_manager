package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.commonmodule.SysRoleMapper;
import com.taotao.pojo.commonmodule.SysRole;
import com.taotao.pojo.commonmodule.SysRoleExample;
import com.taotao.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Override
	public EUDataGridResult getRoleList(int page, int rows) {
		SysRoleExample example = new SysRoleExample();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<SysRole> list = sysRoleMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<SysRole> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
