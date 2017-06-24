package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.domain.Security;
import com.rcyyd.bookdinner.service.ComUserService;
import com.rcyyd.bookdinner.service.CommentService;
import com.rcyyd.bookdinner.service.SecurityService;

@Controller
public class ComUserController {

	@Autowired
	ComUserService comUserService;

	@Autowired
	CommentService commentService;
	
	@Autowired
	SecurityService securityService;

	@PutMapping("/user/{username}")
	@ResponseBody
	public String editUser(ComUser user) {
		boolean flag = comUserService.editComUser(user);
		return flag ? "Success" : "Failed";
	}

	@PostMapping("/comlogin")
	public String doLogin(String username, String password, Model model, HttpSession session) {
		ComUser user = (ComUser) comUserService.login(username, password);
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect: indexShow";
		} else {
			model.addAttribute("hint", "用户名或密码错误!");
			return "login";
		}
	}

	@PostMapping("/comlogout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "show";
	}

	@PostMapping("/comreg")
	public String doRegister(String username, String password, Integer securityid, String key, String email, Model model, HttpSession session) {
		Security security = securityService.getSecurityById(securityid);
		ComUser user = new ComUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setKey(key);
		user.setEmail(email);
		user.setSecurity(security);
		if (comUserService.register(user)) {
			session.setAttribute("user", user);
			return "redirect: indexShow";
		} else {
			model.addAttribute("hint", "注册失败请尝试不同的用户名!");
			return "register";
		}
	}

	@PostMapping("/write")
	@ResponseBody
	public String doComment(Comment comment, HttpSession session, Model model) {

		return null;
	}
	
	@GetMapping("toLog")
	public String toLog(){
		return "login";
	}
}
