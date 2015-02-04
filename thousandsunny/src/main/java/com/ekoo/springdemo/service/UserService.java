package com.ekoo.springdemo.service;

import com.ekoo.springdemo.bean.User;


public interface UserService {
	User findById(int i);

	boolean addUser(User user) throws  Exception;

	User findByName(String name);
}
