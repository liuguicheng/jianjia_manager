package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
	TaotaoResult deleteItem(String ids);
	TaotaoResult updateReshelfItem(String ids);
	TaotaoResult updateinstockItem(String ids);
	TaotaoResult updateItem(TbItem item, String desc, String itemParams)throws Exception;
	TaotaoResult selectItemDescByItemId(Long itemId);
}
