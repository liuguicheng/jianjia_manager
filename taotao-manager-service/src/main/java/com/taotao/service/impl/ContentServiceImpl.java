package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.HttpClientUtil;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.pojo.TbItem;
import com.taotao.service.ContentService;
import com.taotao.pojo.TbContentExample.Criteria;

/**
 * 内容管理
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;
	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_CONTENT_SYNC_URL}")
	private String REST_CONTENT_SYNC_URL;

	@Value("${WIDTH}")
	private Integer WIDTH;
	@Value("${WIDTHB}")
	private Integer WIDTHB;
	@Value("${HEIGHT}")
	private Integer HEIGHT;
	@Value("${HEIGHTB}")
	private Integer HEIGHTB;

	@Override
	public TaotaoResult insertContent(TbContent content) {
		// 补全pojo内容
		content.setCreated(new Date());
		content.setUpdated(new Date());
		contentMapper.insert(content);

		// 添加缓存同步逻辑
		try {
			HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + content.getCategoryId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return TaotaoResult.ok();
	}

	/*
	 * 同步缓存： 添加新分类内容时，删除缓存当中缓存。 当再次查询缓存时，从新查询数据库，把新的数据放入缓存，做到缓存同步。 *
	 */
	@Override
	public TaotaoResult deleteByContentId(String ids) {
		try {
			if (ids != null && !"".equals(ids)) {
				String[] idStrings = ids.split(",");
				TbContent tbContent =null;
				for (String string : idStrings) {
					tbContent=contentMapper.selectByPrimaryKey(Long.valueOf(string));
					// 执行新添加内容任务时，先删除缓存:缓存同步
					HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + tbContent.getCategoryId());
					contentMapper.deleteByPrimaryKey(tbContent.getId());
				}
				return TaotaoResult.ok();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500, "删除异常", null);
	}

	@Override
	public EUDataGridResult findContentByCategoryId(Long categoryId, Integer page, Integer rows) {
		// 创建example对象
		TbContentExample example = new TbContentExample();
		// 创建Criteria对象
		Criteria createCriteria = example.createCriteria();
		// 设置查询参数
		createCriteria.andCategoryIdEqualTo(categoryId);
		// 设置分页查询
		PageHelper.startPage(page, rows);
		// 执行查询
		List<TbContent> contentList = contentMapper.selectByExampleWithBLOBs(example);
		// 创建pageInfo 获取分页信息
		PageInfo<TbContent> pageInfo = new PageInfo<TbContent>(contentList);
		// 创建EasyUIResult封装分页结果信息
		EUDataGridResult result = new EUDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(contentList);
		return result;
	}

	@Override
	public TaotaoResult updateByContentId(TbContent content) {
		try {
			TbContent tbContent = contentMapper.selectByPrimaryKey(content.getId());

			// 执行新添加内容任务时，先删除缓存:缓存同步
			HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + tbContent.getCategoryId());
			content.setCreated(tbContent.getCreated());
			content.setUpdated(new Date());
			contentMapper.updateByPrimaryKeyWithBLOBs(content);
			return TaotaoResult.ok();
		} catch (Exception e) {
		}
		return new TaotaoResult(500,"修改出错",null);
	}

}
