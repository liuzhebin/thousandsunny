package com.ekoo.springdemo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekoo.springdemo.bean.User;
import com.ekoo.springdemo.mapper.UserMapper;
import com.ekoo.springdemo.service.UserService;

@Service
public class userSerivceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(userSerivceImpl.class);
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(int id) {
		logger.info("Welcome home! The client locale is {}.");
		return userMapper.selectByPrimaryKey(id);
	}

}
