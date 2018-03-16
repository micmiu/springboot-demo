package com.micmiu.demo.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/6/2018
 * Time: 22:26
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
		initParams = {@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
public class DruidStatFilter extends WebStatFilter {

}
