package com.rcyyd.bookdinner.service.impl;

import java.util.List;


import org.apache.commons.codec.digest.DigestUtils;


import com.rcyyd.bookdinner.domain.AdmUser;
import com.rcyyd.bookdinner.domain.User;
import com.rcyyd.bookdinner.persistence.AdmUserDao;
import com.rcyyd.bookdinner.service.AdmUserService;

public class AdmUserServiceImpl implements AdmUserService{

	AdmUserDao userDao;
	
	@Override
	public User login(String username, String password) {
		List<AdmUser> us = userDao.findByKey(username, "username");
		AdmUser user = null;
		if (us != null) {
			user = us.get(0);
			if (user != null) {
				String md5 = DigestUtils.md5Hex(password);
				if (user.getPassword().equals(md5)) {
					return user;
				}
			}
		}
		return null;
	}

	@Override
	public AdmUser getUserByAdmUsername(String username) {
		List<AdmUser> us = userDao.findByKey(username, "username");
		if (us != null) {
			return us.get(0);
		}
		return null;
	}

}
