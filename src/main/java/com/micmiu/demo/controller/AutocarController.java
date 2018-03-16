package com.micmiu.demo.controller;

import com.micmiu.demo.domain.Autocar;
import com.micmiu.demo.service.AutocarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/1/2018
 * Time: 16:42
 */
@RestController
@RequestMapping("/demo/autocar")
@Api(value = "AutoCar相关API")
@EnableAutoConfiguration
public class AutocarController {

	@Autowired
	private AutocarService autocarService;

	@ApiOperation(value = "Query all data list.", notes = "查询所有数据")
	@GetMapping("/listAll")
	public List<Autocar> listAll() {
		return autocarService.queryAll();
	}


	@ApiOperation(value = "Query page data list.", notes = "分页查询数据")
	@GetMapping("/listPage")
	public Page<Autocar> listPage(Integer pageNo, Integer pageSize) {
		return autocarService.queryPage(pageNo, pageSize);
	}

	@ApiOperation(value = "create.", notes = "创建操作")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Autocar autocar) {
		autocarService.create(autocar);
		return "SUCCESS";
	}

	@ApiOperation(value = "update", notes = "更新操作")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Autocar autocar) {
		autocarService.update(autocar);
		return "SUCCESS";
	}

	@ApiOperation(value = "delete", notes = "删除操作")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Long id) {
		autocarService.delete(id);
		return "SUCCESS";
	}

	@ApiOperation(value = "read", notes = "查看操作")
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public Autocar read(Long id) {
		return autocarService.findById(id);
	}

}
