package com.micmiu.demo.service.impl;

import com.micmiu.demo.dao.AutocarRepository;
import com.micmiu.demo.domain.Autocar;
import com.micmiu.demo.service.AutocarService;
import com.micmiu.demo.vo.AutocarQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/1/2018
 * Time: 17:20
 */
@Service
public class AutocarServiceImpl implements AutocarService {

	@Autowired
	private AutocarRepository autocarRepository;

	@Override
	public void create(Autocar autocar) {
		autocarRepository.save(autocar);
	}

	@Override
	public void update(Autocar autocar) {
		autocarRepository.saveAndFlush(autocar);
	}

	@Override
	public void delete(Long id) {
		autocarRepository.delete(id);
	}

	@Override
	public Autocar findById(Long id) {
		return autocarRepository.findOne(id);
	}

	@Override
	public List<Autocar> queryAll() {
		return autocarRepository.findAll();
	}

	@Override
	public Page<Autocar> queryPage(Integer pageNo, Integer pageSize) {
		Pageable pageable = new PageRequest(pageNo, pageSize);
		return autocarRepository.findAll(pageable);
	}

	@Override
	public Page<Autocar> queryPage(Integer pageNo, Integer pageSize, final AutocarQuery queryVo) {
		Pageable pageable = new PageRequest(pageNo, pageSize);
		Page<Autocar> dataPage = autocarRepository.findAll(new Specification<Autocar>() {
			@Override
			public Predicate toPredicate(Root<Autocar> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();
				if (null != queryVo.getBrand() && !"".equals(queryVo.getBrand())) {
					list.add(criteriaBuilder.equal(root.get("name").as(String.class), queryVo.getBrand()));
				}
				Predicate[] p = new Predicate[list.size()];
				return criteriaBuilder.and(list.toArray(p));
			}
		}, pageable);
		return dataPage;
	}
}
