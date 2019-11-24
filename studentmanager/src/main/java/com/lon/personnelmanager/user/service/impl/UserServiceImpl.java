package com.lon.personnelmanager.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lon.personnelmanager.user.entity.User;
import com.lon.personnelmanager.user.mapper.UserMapper;
import com.lon.personnelmanager.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	@Override
	public int insertUser(User user) {
		int i = mapper.insert(user);
		return i;
	}

	@Override
	public User login(User user) {
		User loginUser = mapper.login(user);
		return loginUser;
	}

}
