package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbContentCategoryExample.Criteria;
import com.taotao.service.ContentCategoryService;

/**
 * 内容分类管理
 * <p>
 * Title: ContentCategoryServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 入云龙
 * @date 2015年9月8日上午9:17:41
 * @version 1.0
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;

	@Override
	public List<EUTreeNode> getCategoryList(long parentId) {
		List<TbContentCategory> list = selectContentCateGoryByParentId(parentId);
		List<EUTreeNode> resultList = new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			// 创建一个节点
			EUTreeNode node = new EUTreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent() ? "closed" : "open");

			resultList.add(node);
		}
		return resultList;
	}

	@Override
	public TaotaoResult insertContentCategory(long parentId, String name) {

		// 创建一个pojo
		TbContentCategory contentCategory = new TbContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		// '状态。可选值:1(正常),2(删除)',
		contentCategory.setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		// 添加记录
		contentCategoryMapper.insert(contentCategory);
		// 查看父节点的isParent列是否为true，如果不是true改成true
		TbContentCategory parentCat = contentCategoryMapper.selectByPrimaryKey(parentId);
		// 判断是否为true
		if (!parentCat.getIsParent()) {
			parentCat.setIsParent(true);
			// 更新父节点
			contentCategoryMapper.updateByPrimaryKey(parentCat);
		}
		// 返回结果
		return TaotaoResult.ok(contentCategory);
	}

	@Override
	public TaotaoResult updateContentCategory(Long id, String name) {
		try {
			TbContentCategory contentCategory = contentCategoryMapper.selectByPrimaryKey(id);
			contentCategory.setUpdated(new Date());
			contentCategory.setName(name);
			contentCategoryMapper.updateByPrimaryKey(contentCategory);
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500, "修改异常", null);
	}

	@Override
	public TaotaoResult deleteContentCategory(Long parentId, Long id) {
		try {
			//查询删除本身是否是父节点
			TbContentCategory contentCategory=	contentCategoryMapper.selectByPrimaryKey(id);
			if(contentCategory.getIsParent()){
				return new TaotaoResult(400, "您选择的广告分类包含子节点,请先删除子节点", null);
			}
			//删除节点
			contentCategoryMapper.deleteByPrimaryKey(id);
			//查询删除本身父节点是否需要修改 状态
			List<TbContentCategory> parentlist = selectContentCateGoryByParentId(contentCategory.getParentId());
			if(parentlist==null||parentlist.isEmpty()){
				contentCategory=contentCategoryMapper.selectByPrimaryKey(contentCategory.getParentId());
				contentCategory.setIsParent(false);
				contentCategoryMapper.updateByPrimaryKey(contentCategory);
			}
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500, "删除异常", null);
	}

	private List<TbContentCategory> selectContentCateGoryByParentId(Long id) {
		// 根据parentid查询节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(id);
		// 执行查询
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		return list;
	}

}
