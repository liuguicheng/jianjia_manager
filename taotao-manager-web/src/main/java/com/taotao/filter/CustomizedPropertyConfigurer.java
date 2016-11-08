package com.taotao.filter;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class CustomizedPropertyConfigurer extends PropertyPlaceholderConfigurer {
	/**
	 * 获取配置文件属性
	 */
	private static Map<String, Object> ctxPropertiesMap;
	
	//初始化配置文件
	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props)
			throws BeansException {

		super.processProperties(beanFactory, props);
		// load properties to ctxPropertiesMap
		ctxPropertiesMap = new HashMap<String, Object>();
		for (Object key : props.keySet()) {
			String keyStr = key.toString();

			String value = props.getProperty(keyStr);
			if (value != null && !"".equals(value)) {
				try {
					value = new String(value.getBytes("iso8859-1"), "utf-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			ctxPropertiesMap.put(keyStr, value);
		}
	}
	
	// 根据key 获取name
	public static Object getContextProperty(String name) {
		return ctxPropertiesMap.get(name);
	}
}
