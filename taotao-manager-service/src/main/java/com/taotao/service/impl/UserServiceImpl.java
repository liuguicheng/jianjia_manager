package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.common.utils.MD5;
import com.taotao.mapper.commonmodule.SysRoleMapper;
import com.taotao.mapper.commonmodule.SysStaffMapper;
import com.taotao.pojo.commonmodule.SysRole;
import com.taotao.pojo.commonmodule.SysStaff;
import com.taotao.pojo.commonmodule.SysStaffExample;
import com.taotao.pojo.commonmodule.SysStaffExample.Criteria;
import com.taotao.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	SysStaffMapper staffMapper;
	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public EUDataGridResult getUserList(Integer page, Integer rows) {
		SysStaffExample example = new SysStaffExample();
		Criteria criteria=example.createCriteria();
		criteria.andIsdelNotEqualTo(0);
		// 分页处理
		PageHelper.startPage(page, rows);
		List<SysStaff> list = staffMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<SysStaff> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}


	@Override
	public TaotaoResult insertUser(SysStaff staff) {
		try {
			if ("".equals(staff.getStaffId())) {
				staff.setStaffId(IDUtils.genImageName());
				staff.setIsdel(1);
				staff.setCreatedate(new Date());
				staff.setPassword(MD5.md5(staff.getPassword()));
				//查询角色名称
				String roleName = queryRoleName(staff);
				staff.setRoleName(roleName);
				staffMapper.insert(staff);
			} else {
				staff.setCreatedate(new Date());
				staffMapper.updateByPrimaryKey(staff);
			}
			return new TaotaoResult(staff);
		} catch (Exception e) {
			return new TaotaoResult(500, e.getMessage(), null);
		}
	}


	private String queryRoleName(SysStaff staff) {
		String roleName="";
		SysRole role=sysRoleMapper.selectByPrimaryKey(staff.getRoleId());
		if(role!=null){
			roleName=role.getRoleName();
		}
		return roleName;
	}


	@Override
	public TaotaoResult deleteUser(String ids) {
		try {
			if (ids != null && ids.length() > 0) {
				String[] idStrings = ids.split(",");
				SysStaff staff=null;
				for (String string : idStrings) {
					staff=staffMapper.selectByPrimaryKey(string);
					staff.setIsdel(0);
					staffMapper.updateByPrimaryKey(staff);
				}
				return TaotaoResult.ok(null);
			}

		} catch (Exception e) {
			System.out.println("删除用户====" + e.getMessage());
		}
		return new TaotaoResult(500, "删除用户出错", null);
	}


	@Override
	public SysStaff selectUser(String id) {
		return staffMapper.selectByPrimaryKey(id);
	}


	@Override
	public TaotaoResult updateUser(String ids,int type) {
		try {
			if (ids != null && ids.length() > 0) {
				String[] idStrings = ids.split(",");
				SysStaff staff=null;
				for (String string : idStrings) {
					staff=staffMapper.selectByPrimaryKey(string);
					staff.setIsdel(type);
					staffMapper.updateByPrimaryKey(staff);
				}
				return TaotaoResult.ok(null);
			}

		} catch (Exception e) {
			System.out.println("修改用户====" + e.getMessage());
		}
		return new TaotaoResult(500, "修改用户出错", null);
	}

}
