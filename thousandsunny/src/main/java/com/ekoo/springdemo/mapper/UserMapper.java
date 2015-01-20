package com.ekoo.springdemo.mapper;

import com.ekoo.springdemo.bean.User;


public interface UserMapper {

	User findById(int id);
	
}
