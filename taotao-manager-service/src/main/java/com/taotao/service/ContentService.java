package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {

	TaotaoResult insertContent(TbContent content);

	EUDataGridResult findContentByCategoryId(Long categoryId, Integer page, Integer rows);

	TaotaoResult deleteByContentId(String ids);

	TaotaoResult updateByContentId(TbContent content);
}
