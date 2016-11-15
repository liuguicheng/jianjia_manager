package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.pojo.TbItemParamExample.Criteria;
import com.taotao.pojo.commonmodule.SysRole;
import com.taotao.pojo.commonmodule.SysRoleExample;
import com.taotao.service.ItemParamService;

/**
 * 商品规格参数模板管理
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

	@Autowired
	private TbItemParamMapper itemParamMapper;
	
	@Override
	public TaotaoResult getItemParamByCid(long cid) {
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//判断是否查询到结果
		if (list != null && list.size() > 0) {
			return TaotaoResult.ok(list.get(0));
		}
		
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult insertItemParam(TbItemParam itemParam) {
		//补全pojo
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		//插入到规格参数模板表
		itemParamMapper.insert(itemParam);
		return TaotaoResult.ok();
	}

	@Override
	public EUDataGridResult selectItemParam(Integer page, Integer rows) {
		TbItemParamExample example=new TbItemParamExample();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<TbItemParam> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public TaotaoResult deleteItemParam(String ids) {
		try {
			if(ids!=null&&!"".equals(ids)){
				String[] idStrings=ids.split(",");
				for (String string : idStrings) {
					itemParamMapper.deleteByPrimaryKey(Long.valueOf(string));
				}
			}
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500,"删除异常",null);
	}

	@Override
	public TbItemParam selectItemParamById(Long itemId) {
		return itemParamMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public TaotaoResult updateItemParam(TbItemParam itemParam) {
		try {
			TbItemParam itemParam2=	selectItemParamById(itemParam.getId());
			itemParam2.setItemCatId(itemParam.getItemCatId());
			itemParam2.setParamData(itemParam.getParamData());
			itemParam2.setUpdated(new Date());
			itemParamMapper.updateByPrimaryKeySelective(itemParam2);
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500,"更新异常",null);
	}

}
