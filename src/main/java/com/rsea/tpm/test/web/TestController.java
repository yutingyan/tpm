/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.rsea.tpm.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rsea.tpm.test.entity.Test;
import com.rsea.tpm.test.service.TestService;



@Controller  
@RequestMapping("/test")
public class TestController  {

	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping("/getUserById")
	public Test getUserById(String id) {
		return testService.getUserById(id);
	}
	
	@RequestMapping("/login")
	public ModelAndView getUserByNameAndPassword(String name,String password) {
		Test test= testService.getUserByNameAndPassword(name,password);
		if (test!=null&&test.getName()!=null) {
			ModelAndView mv = new ModelAndView("views/test/userEdit");
			mv.addObject("user", test);
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("views/test/userLogin");
			return mv;
		}
	}
	@RequestMapping("/regist")
	public ModelAndView regist() {
		ModelAndView mv = new ModelAndView("views/test/userEdit");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/updateUser")
	public String updateUser(String id,String name,String password) {
		Test test=new Test();
		if (!id.equals("")) {
			test=testService.getUserById(id);
			test.setName(name);
			test.setPassword(password);
			testService.updateUser(test);
		}else {
			test.setName(name);
			test.setPassword(password);
			testService.addUser(test);
		}
		 return "success";
	}
	
	
	@RequestMapping("/index")
	public ModelAndView protocol() {
		ModelAndView mv = new ModelAndView("views/test/userLogin");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete(String id) {
		testService.deleteUser(id);
		return "success";
	}
	
	
}
