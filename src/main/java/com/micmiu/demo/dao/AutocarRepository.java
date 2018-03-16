package com.micmiu.demo.dao;

import com.micmiu.demo.domain.Autocar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/5/2018
 * Time: 15:50
 */
@Repository
public interface AutocarRepository extends JpaRepository<Autocar, Long>, JpaSpecificationExecutor<Autocar> {
}
