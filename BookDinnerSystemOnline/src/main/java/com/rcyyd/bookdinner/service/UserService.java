package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.User;

public interface UserService {

	/**
	 * 
	 * @param username
	 * @param password
	 * @return 用户登录成功，返回用户对象，否则返回空
	 */
	User login(String username, String password);
	User getUserByUsername(String username);
}
