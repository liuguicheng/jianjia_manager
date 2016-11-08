package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.HttpClientUtil;
import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.commonmodule.SysPowerMapper;
import com.taotao.pojo.commonmodule.SysPower;
import com.taotao.pojo.commonmodule.SysPowerExample;
import com.taotao.service.PowerService;

@Service
public class PowerServiceImpl implements PowerService {

	@Autowired
	private SysPowerMapper powerMapper;

	@Override
	public EUDataGridResult getPowerList(int page, int rows) {
		SysPowerExample example = new SysPowerExample();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<SysPower> list = powerMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<SysPower> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
