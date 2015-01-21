package com.ekoo.springdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekoo.springdemo.bean.User;
import com.ekoo.springdemo.mapper.UserMapper;
import com.ekoo.springdemo.service.UserService;

@Service
public class userSerivceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
