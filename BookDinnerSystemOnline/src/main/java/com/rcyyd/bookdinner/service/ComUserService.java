package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.domain.Comment;


public interface ComUserService extends UserService{
	
	boolean register(ComUser comuser);
	
	boolean publishComment(Comment comment);

	boolean editComUser(ComUser user);
	
	boolean updateUser(ComUser user);
}
