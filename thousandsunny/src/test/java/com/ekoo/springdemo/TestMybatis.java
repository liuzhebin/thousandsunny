package com.ekoo.springdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ekoo.springdemo.bean.User;
import com.ekoo.springdemo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class TestMybatis {

	@Autowired
	UserService userService;

	@Test
	public void test() {
		User user= userService.findById(2);
		System.out.println(user);
	}

}
