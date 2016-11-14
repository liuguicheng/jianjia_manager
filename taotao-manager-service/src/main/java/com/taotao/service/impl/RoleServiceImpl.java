package com.taotao.service.impl;

import java.util.List;

import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.mapper.commonmodule.SysPowerMapper;
import com.taotao.mapper.commonmodule.SysRoleMapper;
import com.taotao.mapper.commonmodule.SysRolePowerMapper;
import com.taotao.pojo.commonmodule.SysRole;
import com.taotao.pojo.commonmodule.SysRoleExample;
import com.taotao.pojo.commonmodule.SysRolePower;
import com.taotao.pojo.commonmodule.SysRolePowerExample;
import com.taotao.pojo.commonmodule.SysRolePowerExample.Criteria;
import com.taotao.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Autowired
	private SysRolePowerMapper sysRolePowerMapper;
	@Autowired
	private SysPowerMapper powerMapper;
	
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

	@Override
	public TaotaoResult deleteRole(String ids) {
		try {
			if (ids != null && ids.length() > 0) {
				String[] idStrings = ids.split(",");
				for (String string : idStrings) {
					sysRoleMapper.deleteByPrimaryKey(string);
				}
				return TaotaoResult.ok(null);
			}

		} catch (Exception e) {
			System.out.println("删除角色====" + e.getMessage());
		}
		return new TaotaoResult(500, "删除角色出错", null);
	}

	@Override
	public TaotaoResult insertRole(SysRole role) {
		try {
			if ("".equals(role.getRoleId())) {
				role.setRoleId(IDUtils.genImageName());
				sysRoleMapper.insert(role);
			} else {
				sysRoleMapper.updateByPrimaryKey(role);
			}
			return new TaotaoResult(role);
		} catch (Exception e) {
			return new TaotaoResult(500, e.getMessage(), null);
		}
	}

	@Override
	public SysRole selectRole(String id) {
		return sysRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysRole> selectRoleList() {
		SysRoleExample example = new SysRoleExample();
		List<SysRole> list = sysRoleMapper.selectByExample(example);
		return list;
	}

}
