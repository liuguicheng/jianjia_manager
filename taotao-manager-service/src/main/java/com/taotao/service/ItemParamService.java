package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
	EUDataGridResult selectItemParam(Integer page, Integer rows);
	TaotaoResult deleteItemParam(String ids);
	TbItemParam selectItemParamById(Long itemId);
	TaotaoResult updateItemParam(TbItemParam itemParam);
}
