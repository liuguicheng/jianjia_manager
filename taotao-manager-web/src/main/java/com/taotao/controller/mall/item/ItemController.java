package com.taotao.controller.mall.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.service.ItemService;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月2日上午10:52:46
 * @version 1.0
 */

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
	@RequestMapping(value="/item/save", method=RequestMethod.POST)
	@ResponseBody
	private TaotaoResult createItem(TbItem item, String desc, String itemParams) throws Exception {
		TaotaoResult result = itemService.createItem(item, desc, itemParams);
		return result;
	}
	@RequestMapping(value="/item/update", method=RequestMethod.POST)
	@ResponseBody
	private TaotaoResult updateItem(TbItem item, String desc, String itemParams) throws Exception {
		TaotaoResult result = itemService.updateItem(item, desc, itemParams);
		return result;
	}
	
	@RequestMapping("/item/delete")
	@ResponseBody
	public TaotaoResult insertItem(String ids) {
		TaotaoResult result = itemService.deleteItem(ids);
		return result;
	}
	
	@RequestMapping("/item/reshelf")
	@ResponseBody
	public TaotaoResult updateReshelfItem(String ids) {
		TaotaoResult result = itemService.updateReshelfItem(ids);
		return result;
	}
	
	@RequestMapping("/item/instock")
	@ResponseBody
	public TaotaoResult updateinstockItem(String ids) {
		TaotaoResult result = itemService.updateinstockItem(ids);
		return result;
	}
	
	
	/**
	 * 查询商品描述
	 */
	@RequestMapping("/item/desc/{itemId}")
	@ResponseBody
	public TaotaoResult getItemDescById(@PathVariable Long itemId) {
		TaotaoResult result = itemService.selectItemDescByItemId(itemId);
		return result;
	}
	
}
