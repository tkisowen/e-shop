package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.bean.Titem;
import com.manager.service.ItemService;
import com.manager.tool.EUDataGridResult;
/**
 * 商品信息处理请求类
 * @author Administrator
 *
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService is;
	/**
	 * 根据ID查询商品信息
	 * @param itemId
	 * @return 返回商品信息
	 */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Object getItemById(@PathVariable Long itemId) {
		Titem titem = is.getItemById(itemId);
		return titem;
	}
	/**
	 * 商品列表查询
	 * @param page
	 * @param rows
	 * @return
	 */

	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(@RequestParam(value="page",defaultValue="1") Integer page,@RequestParam(value="rows",defaultValue="30") Integer rows) {
		EUDataGridResult result = is.getItemList(page,rows);
		return result;
	}
	
}
