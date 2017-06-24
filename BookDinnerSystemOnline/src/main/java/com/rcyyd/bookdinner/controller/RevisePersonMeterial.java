package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.domain.Security;
import com.rcyyd.bookdinner.service.ComUserService;

@Controller
public class RevisePersonMeterial {
	@Autowired
	private ComUserService comuserService;
	
		
	@RequestMapping("/saveUser")
	public String tosaveUser(ComUser comUser,String securitystr,String email,String key,HttpServletRequest req){
		ComUser user=(ComUser)req.getSession().getAttribute("user");
		Security sec=user.getSecurity();
		sec.setSecurity(securitystr);	
		user.setSecurity(sec);
		user.setEmail(email);
		user.setKey(key);
		//user.setSecurity(security);
		comuserService.updateUser(user);
		return "redirect:rivisemeterial.jsp";	
	}
}
