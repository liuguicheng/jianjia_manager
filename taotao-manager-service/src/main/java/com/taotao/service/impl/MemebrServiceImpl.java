package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import com.taotao.pojo.TbUserExample.Criteria;
import com.taotao.pojo.commonmodule.SysStaff;
import com.taotao.service.MemberService;

@Service
public class MemebrServiceImpl implements MemberService {
	@Autowired
	TbUserMapper userMapper;
	
	@Override
	public EUDataGridResult getMemberList(Integer page, Integer rows) {
		TbUserExample example = new TbUserExample();
		//Criteria criteria=example.createCriteria();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<TbUser> list = userMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<TbUser> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public TaotaoResult insertMember(TbUser staff) {
		if(staff!=null){
			if(staff.getId()!=null){
				staff.setCreated(new Date());
				staff.setUpdated(new Date());
				userMapper.updateByPrimaryKey(staff);
				return new TaotaoResult(staff);
			}else{
				staff.setCreated(new Date());
				staff.setUpdated(new Date());
				userMapper.insert(staff);
				return new TaotaoResult(staff);
			}
		}
		return new TaotaoResult(500, "添加会员错误", null);
	}

	@Override
	public TaotaoResult deleteMember(String ids) {
		try {
			if (ids != null && ids.length() > 0) {
				String[] idStrings = ids.split(",");
				for (String string : idStrings) {
					userMapper.deleteByPrimaryKey(Long.valueOf(string));
				}
				return TaotaoResult.ok(null);
			}

		} catch (Exception e) {
			System.out.println("删除会员====" + e.getMessage());
		}
		return new TaotaoResult(500, "删除会员出错", null);
	}


	@Override
	public TbUser selectMember(String id) {
		return userMapper.selectByPrimaryKey(Long.valueOf(id));
	}

}
