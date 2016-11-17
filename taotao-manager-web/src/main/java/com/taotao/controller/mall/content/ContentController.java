package com.taotao.controller.mall.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;
import com.taotao.service.ContentService;

/**
 * 内容管理Controller
 * <p>Title: ContentController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月8日上午11:13:52
 * @version 1.0
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult insertContent(TbContent content) {
		TaotaoResult result = contentService.insertContent(content);
		return result;
	}
	/**
	 * 需求：根据内容分类Id，查询内容分类下面内容表 
	 * 请求：/content/query/list
	 *  参数：Long categoryId
	 * 分页参数：EasyUI框架自动传递：integer page,integer rows 
	 * 返回值：json格式EasyUIResult
	 * easyUI框架需要分页返回值信息格式如下： {total:6,rows:[{},{},{}]}
	 */
	@RequestMapping("/query/list")
	public @ResponseBody EUDataGridResult findContentByCategoryId(Long categoryId, Integer page, Integer rows) {
		EUDataGridResult easyUIResult = contentService.findContentByCategoryId(categoryId, page, rows);
		return easyUIResult;
	}
	
	@RequestMapping(value="/content/delete", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult deleteContent(String ids) {
		TaotaoResult result = contentService.deleteByContentId(ids);
		return result;
	}
	@RequestMapping(value="/content/edit", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult editContent(TbContent content) {
		TaotaoResult result = contentService.updateByContentId(content);
		return result;
	}
	
}
