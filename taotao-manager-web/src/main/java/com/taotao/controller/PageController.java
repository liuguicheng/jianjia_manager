package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 */
@Controller
public class PageController {

	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	/**
	 * 展示其他页面 JSP目录下
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}
	/**
	 * 展示其他页面 console目录下
	 */
	@RequestMapping("/console/main/{page}")
	public String showpage2(@PathVariable String page) {
		return "console/main/"+page;
	}
	/**
	 * 展示其他页面 common目录下
	 */
	@RequestMapping("/common/{page}")
	public String showpage3(@PathVariable String page) {
		return "common/"+page;
	}
	/**
	 * 展示其他页面 commodity目录下
	 */
	@RequestMapping("/commodity/{page}")
	public String showpage4(@PathVariable String page) {
		return "commodity/"+page;
	}
	
	/**
	 * 展示其他页面 common目录下
	 */
	@RequestMapping("/system/{page}")
	public String showpage5(@PathVariable String page) {
		return "system/"+page;
	}
	
	/**
	 * 展示其他页面 common目录下
	 */
	@RequestMapping("/nav/{page}")
	public String showpage6(@PathVariable String page) {
		return "nav/"+page;
	}
}
