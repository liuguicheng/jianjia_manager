package com.taotao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.filter.CustomizedPropertyConfigurer;

@Controller
public class CommonController {

	/**
	 * 获取通用数据 controller
	 */

	@RequestMapping("/showApplicationName.do")
	@ResponseBody
	public TaotaoResult showApplicationName(HttpServletRequest request) {
		String propertyname = request.getParameter("propertyname");
		if (propertyname != null && !"".equals(propertyname)) {
			String appName = (String) request.getSession().getAttribute(propertyname);
			if (appName == null) {

				// 获取全局配置文件
				appName = (String) CustomizedPropertyConfigurer.getContextProperty(propertyname);
				System.out.println(appName);
				request.getSession().setAttribute(propertyname, appName);
			}
			return TaotaoResult.build(200, appName, null);
		}
		return TaotaoResult.build(200, "", null);
	}
}
