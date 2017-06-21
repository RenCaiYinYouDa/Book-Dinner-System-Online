package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.AdmUser;
import com.rcyyd.bookdinner.domain.User;

public interface AdmUserService extends UserService{
	
	User login(String username, String password);
	
	AdmUser getUserByAdmUsername(String username);
}
