package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.EUTreeNode2;
import com.taotao.common.pojo.EUTreeState;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.commonmodule.SysPowerMapper;
import com.taotao.pojo.commonmodule.SysPower;
import com.taotao.pojo.commonmodule.SysPowerExample;
import com.taotao.pojo.commonmodule.SysPowerExample.Criteria;
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

	@Override
	public List<EUTreeNode2> getPowerJsonList(String powerParentId) {

		return queryPowerTreeNode(powerParentId);
	}

	private List<EUTreeNode2> queryPowerTreeNode(String powerParentId) {
		SysPowerExample example = new SysPowerExample();
		Criteria criteria = example.createCriteria();
		if (!powerParentId.equals("-1")) {
			criteria.andPowerParentIdEqualTo(powerParentId);
		}
		List<SysPower> list = powerMapper.selectByExample(example);

		List<EUTreeNode2> resultList = new ArrayList<EUTreeNode2>();
		EUTreeState states = new EUTreeState(true, false);
		if (list != null && !list.isEmpty()) {
			for (SysPower power : list) {
				// 创建一个节点
				EUTreeNode2 node = new EUTreeNode2();
				node.setId(Long.valueOf(power.getPowerId()));
				node.setText(power.getPowerName());
				node.setState(states);
				node.setChildren(queryPowerTreeNode(power.getPowerId()));
				resultList.add(node);
			}

		}
		return resultList;
	}

	@Override
	public TaotaoResult insertPower(SysPower sysPower) {
		try {
			if (sysPower.getPowerId().equals("")) {
				// 新增
				sysPower.setPowerId(IDUtils.genImageName());
				sysPower.setIsParent(false);
				powerMapper.insert(sysPower);
			} else {
				// 更新
				powerMapper.updateByPrimaryKey(sysPower);
			}
			if (!sysPower.getPowerParentId().equals("0")) {
				SysPower parentPower = powerMapper.selectByPrimaryKey(sysPower.getPowerParentId());
				if (!parentPower.getIsParent()) {
					parentPower.setIsParent(true);
					// 更新父节点
					powerMapper.updateByPrimaryKey(parentPower);
				}
			}
			return TaotaoResult.ok(sysPower);
		} catch (Exception e) {
			return new TaotaoResult(500, e.getMessage(), null);
		}
	}

	@Override
	public TaotaoResult deletePower(String ids) {
		try {
			if (ids != null && ids.length() > 0) {
				String[] idStrings = ids.split(",");
				SysPower sysPower = null;
				for (String string : idStrings) {
					sysPower = powerMapper.selectByPrimaryKey(string);
					boolean fa = selectParentList(sysPower);
					if (!fa) {
						powerMapper.deleteByPrimaryKey(string);
					} else {
						return new TaotaoResult(500, "删除菜单出错,你选择删除的菜单包含父菜单,请先删除子菜单!", null);
					}
				}
				return TaotaoResult.ok(null);
			}

		} catch (Exception e) {
			System.out.println("删除菜单====" + e.getMessage());
		}
		return new TaotaoResult(500, "删除菜单出错", null);
	}

	private boolean selectParentList(SysPower sysPower) {
		SysPowerExample example = new SysPowerExample();
		Criteria criteria = example.createCriteria();
		criteria.andPowerParentIdEqualTo(sysPower.getPowerId());
		List<SysPower> list = powerMapper.selectByExample(example);
		if (list != null && !list.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public SysPower selectPower(String id) {
		return powerMapper.selectByPrimaryKey(id);
	}

}
