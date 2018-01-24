package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.bean.Titem;
import com.manager.service.QueryService;

@Controller
public class QueryAction {

	@Autowired
	private QueryService qs;
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Object getItemById(@PathVariable Long itemId) {
		Titem titem = qs.getItemById(itemId);
		return titem;
	}
}
