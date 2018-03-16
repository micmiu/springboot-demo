package com.micmiu.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 2/28/2018
 * Time: 16:10
 */
@Controller
@EnableAutoConfiguration
public class IndexController {


	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@ApiOperation(value = "sayHello", notes = "Get hello message.")
	@GetMapping("/sayHello")
	@ResponseBody
	public String sayHello() {
		return "Hi micmiu.com，welcome to SpringBoot";
	}

}
