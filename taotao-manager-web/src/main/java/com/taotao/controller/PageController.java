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
	@RequestMapping("/index")
	public String showIndex() {
		return "console/main/index";
	}
	
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return "console/main/" + page;
	}
	
	@RequestMapping("/login")
	public String Login() {
		return "console/main/login";
	}

	@RequestMapping("/logout")
	public String Logout() {
		return "console/main/login";
	}
	
	
	/**
	 * 展示其他页面 console目录下
	 */
	@RequestMapping("/console/main/{page}")
	public String showpage2(@PathVariable String page) {
		return "console/main/"+page;
	}
	/**
	 * 展示其他页面 plugins目录commodity下
	 */
	@RequestMapping("/plugins/commodity/{page}")
	public String showpage3(@PathVariable String page) {
		return "plugins/commodity/"+page;
	}
	/**
	 * 展示其他页面 plugins/common目录下
	 */
	@RequestMapping("/plugins/common/{page}")
	public String showpage4(@PathVariable String page) {
		return "plugins/common/"+page;
	}
	
	/**
	 * 展示其他页面 plugins/content目录下
	 */
	@RequestMapping("/plugins/content/{page}")
	public String showpage5(@PathVariable String page) {
		return "plugins/content/"+page;
	}
	
	/**
	 * 展示其他页面 plugins/system目录下
	 */
	@RequestMapping("/plugins/system/{page}")
	public String showpage6(@PathVariable String page) {
		return "plugins/system/"+page;
	}
}
