package com.taotao.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	/**
	 * 登陆、注册、找回密码、修改密码、修改个人资料
	 */

	@RequestMapping("/login")
	public String Login() {
		return "console/main/login";
	}

	@RequestMapping("/logout")
	public String Logout() {
		return "console/main/login";
	}
}
