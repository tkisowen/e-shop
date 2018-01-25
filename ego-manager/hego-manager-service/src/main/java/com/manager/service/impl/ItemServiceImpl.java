package com.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.manager.bean.Titem;
import com.manager.dao.TitemMapper;
import com.manager.service.ItemService;
import com.manager.tool.EUDataGridResult;
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	TitemMapper tm;
	@Override
	public Titem getItemById(Long itemId) {
		
		return tm.selectByPrimaryKey(itemId);
	}
	@Override
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		//分页处理
		PageHelper.startPage(page,rows);
		List<Titem> list=tm.getItemList();
		//创建一个返回值对象
		EUDataGridResult  result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<Titem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
