package com.lon.personnelmanager.user.service;

import com.lon.personnelmanager.user.entity.User;

public interface UserService {
	
	/**
	 * 添加用户
	 */
	public int insertUser(User user);
	
	/**
	 * 登录
	 * @return
	 */
	public User login(User user);

}
