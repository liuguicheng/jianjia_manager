package com.taotao.service;

import com.taotao.common.pojo.TaotaoResult;

public interface ItemParamItemService {

	String getItemParamByItemId(Long itemId);

	TaotaoResult selectItemParamItemByItemId(Long itemId);
}
