package com.rcyyd.bookdinner.service.impl;

import java.util.List;


import javax.transaction.Transactional;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.AdmUser;
import com.rcyyd.bookdinner.domain.User;
import com.rcyyd.bookdinner.persistence.AdmUserDao;
import com.rcyyd.bookdinner.service.AdmUserService;


@Service
@Transactional
public class AdmUserServiceImpl implements AdmUserService{

	@Autowired
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
	public AdmUser getUserByUsername(String username) {
		List<AdmUser> us = userDao.findByKey(username, "username");
		if (us != null) {
			return us.get(0);
		}
		return null;
	}

}
