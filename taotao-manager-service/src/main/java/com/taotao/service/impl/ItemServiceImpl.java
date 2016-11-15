package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.mapper.TbItemDescMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.mapper.TbItemParamItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.pojo.TbItemDescExample;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.pojo.TbItemParamItem;
import com.taotao.pojo.TbItemParamItemExample;
import com.taotao.service.ItemService;

/**
 * 商品管理Service
 * <p>
 * Title: ItemServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 入云龙
 * @date 2015年9月2日上午10:47:14
 * @version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Autowired
	private TbItemDescMapper itemDescMapper;

	@Autowired
	private TbItemParamItemMapper itemParamItemMapper;

	@Override
	public TbItem getItemById(long itemId) {

		// TbItem item = itemMapper.selectByPrimaryKey(itemId);
		// 添加查询条件
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}

	/**
	 * 商品列表查询
	 * <p>
	 * Title: getItemList
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @see com.taotao.service.ItemService#getItemList(long, long)
	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		// 查询商品列表
		TbItemExample example = new TbItemExample();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception {
		// item补全
		// 生成商品ID
		Long itemId = IDUtils.genItemId();
		item.setId(itemId);
		// '商品状态，1-正常，2-下架，3-删除',
		item.setStatus((byte) 1);
		item.setCreated(new Date());
		item.setUpdated(new Date());
		// 插入到数据库
		itemMapper.insert(item);
		// 添加商品描述信息
		TaotaoResult result = insertItemDesc(itemId, desc);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		// 添加规格参数
		result = insertItemParamItem(itemId, itemParam);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		return TaotaoResult.ok();
	}

	/**
	 * 添加商品描述
	 * <p>
	 * Title: insertItemDesc
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param desc
	 */
	private TaotaoResult insertItemDesc(Long itemId, String desc) {
		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(new Date());
		itemDesc.setUpdated(new Date());
		itemDescMapper.insert(itemDesc);
		return TaotaoResult.ok();
	}

	/**
	 * 添加规格参数
	 * <p>
	 * Title: insertItemParamItem
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param itemId
	 * @param itemParam
	 * @return
	 */
	private TaotaoResult insertItemParamItem(Long itemId, String itemParam) {
		// 创建一个pojo
		TbItemParamItem itemParamItem = new TbItemParamItem();
		itemParamItem.setItemId(itemId);
		itemParamItem.setParamData(itemParam);
		itemParamItem.setCreated(new Date());
		itemParamItem.setUpdated(new Date());
		// 向表中插入数据
		itemParamItemMapper.insert(itemParamItem);

		return TaotaoResult.ok();

	}

	@Override
	public TaotaoResult deleteItem(String ids) {
		try {
			if (ids != null && !"".equals(ids)) {
				String[] idStrings = ids.split(",");
				TbItem item = null;
				for (String string : idStrings) {
					item = itemMapper.selectByPrimaryKey(Long.valueOf(string));
					item.setStatus((byte) 3);
					itemMapper.updateByPrimaryKey(item);
				}
			}
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500, "删除异常", null);
	}

	// 下架
	@Override
	public TaotaoResult updateReshelfItem(String ids) {
		try {
			if (ids != null && !"".equals(ids)) {
				String[] idStrings = ids.split(",");
				TbItem item = null;
				for (String string : idStrings) {
					item = itemMapper.selectByPrimaryKey(Long.valueOf(string));
					item.setStatus((byte) 1);
					itemMapper.updateByPrimaryKey(item);
				}
			}
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500, "修改异常", null);
	}

	// 上架
	@Override
	public TaotaoResult updateinstockItem(String ids) {
		try {
			if (ids != null && !"".equals(ids)) {
				String[] idStrings = ids.split(",");
				TbItem item = null;
				for (String string : idStrings) {
					item = itemMapper.selectByPrimaryKey(Long.valueOf(string));
					item.setStatus((byte) 2);
					itemMapper.updateByPrimaryKey(item);
				}
			}
			return TaotaoResult.ok(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TaotaoResult(500, "修改异常", null);
	}

	@Override
	public TaotaoResult updateItem(TbItem item, String desc, String itemParams) throws Exception {
		TbItem iteminfo = itemMapper.selectByPrimaryKey(Long.valueOf(item.getId()));
		iteminfo.setBarcode(item.getBarcode());
		iteminfo.setCid(item.getCid());
		iteminfo.setImage(item.getImage());
		iteminfo.setPrice(item.getPrice());
		iteminfo.setSellPoint(item.getSellPoint());
		iteminfo.setTitle(item.getTitle());
		iteminfo.setUpdated(new Date());
		// 插入到数据库
		itemMapper.updateByPrimaryKey(iteminfo);
		// 添加商品描述信息
		TaotaoResult result = updateItemDesc(iteminfo.getId(), desc);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		// 添加规格参数
		result = updateItemParamItem(iteminfo.getId(), itemParams);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		return TaotaoResult.ok();
	}

	private TaotaoResult updateItemParamItem(Long id, String itemParams) {
		TbItemParamItemExample example = new TbItemParamItemExample();
		com.taotao.pojo.TbItemParamItemExample.Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(id);
		List<TbItemParamItem> list = itemParamItemMapper.selectByExample(example);
		if (list != null && !list.isEmpty()) {

			TbItemParamItem itemParamItem = list.get(0);
			itemParamItem.setParamData(itemParams);
			itemParamItem.setUpdated(new Date());
			// 向表中插入数据
			itemParamItemMapper.updateByPrimaryKey(itemParamItem);
		}
		return TaotaoResult.ok();
	}

	private TaotaoResult updateItemDesc(Long id, String desc) {
		TbItemDescExample example = new TbItemDescExample();
		com.taotao.pojo.TbItemDescExample.Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(id);
		List<TbItemDesc> list = itemDescMapper.selectByExample(example);
		if (list != null && !list.isEmpty()) {

			TbItemDesc itemdesc = list.get(0);
			itemdesc.setItemDesc(desc);
			itemdesc.setUpdated(new Date());
			// 向表中插入数据
			itemDescMapper.updateByPrimaryKey(itemdesc);
		}
		return TaotaoResult.ok();
	}

}
