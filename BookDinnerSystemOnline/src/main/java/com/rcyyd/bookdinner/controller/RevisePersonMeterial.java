package com.rcyyd.bookdinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rcyyd.bookdinner.service.ComUserService;
import com.rcyyd.bookdinner.service.SecurityService;
import com.rcyyd.bookdinner.service.UserService;

@Controller
public class RevisePersonMeterial {
	@Autowired
	private ComUserService comuserservice;
	
	@Autowired
	private SecurityService securityService;
	
	
}
