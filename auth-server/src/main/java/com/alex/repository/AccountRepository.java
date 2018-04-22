package com.alex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.entity.Account;

/**
 * 处理数据到mongodb数据库
 * 
 * @author alex
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
	
	/**
	 * 参照spring data jpa 可以根据方法名称查询出数据无需实现
	 * @param name
	 * @return
	 */
	Account findByName(String name);
	
}
