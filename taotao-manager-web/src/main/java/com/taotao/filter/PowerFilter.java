package com.taotao.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * @description url访问过滤器 用户登录系统后，对普通用户在浏览器直接输入url地址访问本身没具有的权限页面进行控制。
 *              （注：目前访问权限控制只能控制用户访问的菜单，在菜单下的访问路径目前没有更好的办法控制）。
 */
public class PowerFilter extends HttpServlet implements Filter {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1295765347804389970L;

	/**
	 * 重定向的URL
	 */
	private String redirectURl = null;

	private static Logger LOG = Logger.getLogger(PowerFilter.class);

	/**
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		// 指定要重定向的页面
		redirectURl = "/jump.html";
	}

	/**
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 *      javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {

			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse sresponse = (HttpServletResponse) response;
			HttpSession session = req.getSession();
			
			chain.doFilter(request, response);

		} catch (Exception e) {
			throw new RuntimeException("权限过滤时候出现错误", e);
		}
	}

	/**
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		//
	}

}
