package com.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.bean.Titem;
import com.manager.dao.TitemMapper;
import com.manager.service.QueryService;
@Service
public class QueryServiceImpl implements QueryService{

	@Autowired
	TitemMapper tm;
	@Override
	public Titem getItemById(Long itemId) {
		
		return tm.selectByPrimaryKey(itemId);
	}

}
