package com.ekoo.springdemo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ekoo.springdemo.bean.User;
import com.ekoo.springdemo.exception.MyException;
import com.ekoo.springdemo.mapper.UserMapper;
import com.ekoo.springdemo.service.UserService;

@Service
public class userSerivceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(userSerivceImpl.class);
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public User findById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public boolean addUser(User user)  throws MyException{
		
		logger.info("userSerivceImpl--addUser");
		int i= userMapper.insert(user);
		if (user.getAge()==27) {
			throw new MyException("It's s Exception!");
		}
		
		return i==1?true:false;
	}

}
