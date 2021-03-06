package com.homework.stage_2.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * druid过滤器. 
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = {
		// 忽略资源
		@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*") })
public class DruidStatFilter extends WebStatFilter {
}