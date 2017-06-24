package com.rcyyd.bookdinner.service.impl;


import java.util.List;


import javax.transaction.Transactional;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.domain.User;
import com.rcyyd.bookdinner.persistence.ComUserDao;
import com.rcyyd.bookdinner.persistence.CommentDao;
import com.rcyyd.bookdinner.service.ComUserService;
@Service
@Transactional
public class ComUserServiceImpl implements ComUserService{

	@Autowired
	ComUserDao userDao;
	
	@Autowired
	CommentDao comDao;
	
	@Override
	public User login(String username, String password) {
		List<ComUser> us = userDao.findByKey(username, "username");
		ComUser user = null;
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
	public boolean register(ComUser comuser) {
		comuser.setPassword(DigestUtils.md5Hex(comuser.getPassword()));
		return userDao.save(comuser) != null;
	}

	@Override
	public boolean publishComment(Comment comment) {
		// TODO Auto-generated method stub
		return comDao.save(comment) != null;
	}

	@Override
	public ComUser getUserByUsername(String username) {
		List<ComUser> us = userDao.findByKey(username, "username");
		if (us != null) {
			return us.get(0);
		}
		return null;
	}

	@Override
	public boolean editComUser(ComUser user) {
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		userDao.update(user);
		return true;
	}

	@Override
	public boolean updateUser(ComUser user) {
		// TODO Auto-generated method stub
		userDao.update(user);
		return true;
	}

}
