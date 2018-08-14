/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.rsea.tpm.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsea.tpm.test.dao.TestDao;
import com.rsea.tpm.test.entity.Test;


@Service
public class TestService {
	@Autowired
	private  TestDao testDao;

	public Test getUserById(String id) {
		return testDao.getTestById(id);
	}

	public void updateUser(Test test) {
		testDao.updateUser(test);
		
	}

	public void addUser(Test test) {
		testDao.addUser(test);
	}

	public Test getUserByNameAndPassword(String name, String password) {
		return testDao.getUserByNameAndPassword(name,password);
	}

	public void deleteUser(String id) {
		 testDao.deleteUser(id);
	}
}
