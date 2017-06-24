package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rcyyd.bookdinner.domain.AdmUser;
import com.rcyyd.bookdinner.service.AdmUserService;

@Controller
public class AdmUserController {
	
	@Autowired
	private AdmUserService admUserService;

	@PostMapping("/admlogin")
	public String doLogin(String loginName, String loginPwd, Model model, HttpSession session, RedirectAttributes attr) {
		AdmUser user = (AdmUser) admUserService.login(loginName, loginPwd);
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect: admin/showDishes";
		} else {
			model.addAttribute("hint", "用户名或密码错误!");
			attr.addAttribute("loginFlag", 1);
			return "redirect: toLog";
		}
	}
	
	@PostMapping("admlogout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "show";
	}
}
