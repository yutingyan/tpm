/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.rsea.tpm.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.rsea.tpm.test.entity.Test;


@Mapper
public interface TestDao {

	public Test getTestById(@Param("id") String id);

	public void updateUser(@Param("test") Test test);

	public void addUser(@Param("test") Test test);

	public Test getUserByNameAndPassword(@Param("name") String name, @Param("password") String password);

	public void deleteUser(@Param("id")String id);
	
}
