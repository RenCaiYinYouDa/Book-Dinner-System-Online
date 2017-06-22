package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.rcyyd.bookdinner.domain.AdmUser;
import com.rcyyd.bookdinner.service.AdmUserService;

public class AdmUserController {
	

	@Autowired
	private AdmUserService admUserService;

	@PostMapping("/admlogin")
	public String doLogin(String username, String password, Model model, HttpSession session) {
		AdmUser user = (AdmUser) admUserService.login(username, password);
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:show";
		} else {
			model.addAttribute("hint", "用户名或密码错误!");
			return "login";
		}
	}
	
	@PostMapping("/admlogout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "show";
	}
}
