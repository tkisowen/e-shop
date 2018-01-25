package com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 页面处理请求类
 * @author Administrator
 *
 */
@Controller
public class PageController {

	/**
	 * 打开首页
	 * @return 首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
		
	}
	/**
	 * 打开其他页面
	 * @param page
	 * @return 其他页面
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}
	
}
