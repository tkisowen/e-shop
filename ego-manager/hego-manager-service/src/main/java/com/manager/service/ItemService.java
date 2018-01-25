package com.manager.service;

import com.manager.bean.Titem;
import com.manager.tool.EUDataGridResult;
/**
 * 商品信息处理请求类
 * @author Administrator
 *
 */
public interface ItemService {

	/**
	 * 根据ID查询商品信息
	 * @param itemId
	 * @return 返回商品信息
	 */
	public Titem getItemById(Long itemId);
	/**
	 * 商品列表查询
	 * @param page
	 * @param rows
	 * @return
	 */

	public EUDataGridResult getItemList(Integer page, Integer rows);

	
}
