package com.ekoo.springdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public boolean addUser(User user)  throws Exception{
		
		int i= userMapper.insert(user);
		
		return i==1?true:false;
	}
	@Override
	public User findByName(String name) {
		return userMapper.selectByName(name);
	}

}
