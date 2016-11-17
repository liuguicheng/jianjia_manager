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
	 * 后台-通用内容管理、登陆、首页等
	 */
	@RequestMapping("/console/main/{page}")
	public String showpage2(@PathVariable String page) {
		return "console/main/"+page;
	}
	/**
	 * 后台-商品管理
	 */
	@RequestMapping("/plugins/commodity/{page}")
	public String showpage3(@PathVariable String page) {
		return "plugins/commodity/"+page;
	}
	/**
	 * 后台图片管理
	 */
	@RequestMapping("/plugins/common/{page}")
	public String showpage4(@PathVariable String page) {
		return "plugins/common/"+page;
	}
	
	/**
	 * 后台-内容管理
	 */
	@RequestMapping("/plugins/content/{page}")
	public String showpage5(@PathVariable String page) {
		return "plugins/content/"+page;
	}
	
	
	/**
	 * 会员管理
	 */
	@RequestMapping("/plugins/member/{page}")
	public String showpage7(@PathVariable String page) {
		return "plugins/member/"+page;
	}
}
