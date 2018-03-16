package com.micmiu.demo.service;

import com.micmiu.demo.domain.Autocar;
import com.micmiu.demo.vo.AutocarQuery;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/1/2018
 * Time: 17:19
 */
public interface AutocarService {

	void create(Autocar autocar);

	void update(Autocar autocar);

	void delete(Long id);

	Autocar findById(Long id);

	List<Autocar> queryAll();

	Page<Autocar> queryPage(Integer pageNo, Integer pageSize);

	Page<Autocar> queryPage(Integer pageNo, Integer pageSize, final AutocarQuery query);
}
