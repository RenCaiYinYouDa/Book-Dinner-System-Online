package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.AdmUser;

public interface AdmUserService extends UserService{
	
	AdmUser getUserByAdmUsername(String username);
}
