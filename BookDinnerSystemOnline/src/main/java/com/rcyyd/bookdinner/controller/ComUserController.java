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
import com.rcyyd.bookdinner.service.ComUserService;
import com.rcyyd.bookdinner.service.CommentService;

@Controller
public class ComUserController {

	@Autowired
	ComUserService comUserService;
	
	@Autowired
	CommentService commentService;
	
	@GetMapping(value = "/user/{username}", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getComUser(@PathVariable String username) {
		ComUser user = comUserService.getUserByComUsername(username);
		return JSON.toJSONString(user);
	}
	
	@PostMapping("/user")
	@ResponseBody
	public String addComUser(ComUser user) {
		boolean flag = comUserService.register(user);
		return flag ? "Success" : "Failed";
	}
	
	@PutMapping("/user/{username}")
	@ResponseBody
	public String editUser(ComUser user) {
		boolean flag = comUserService.editComUser(user);
		return flag ? "Success" : "Failed";
	}
	
	@PostMapping("/comlogin")
	public String doLogin(String username, String password, String vc, Model model, HttpSession session) {
		String code = (String) session.getAttribute("vc");
		if (vc != null && code != null && vc.equalsIgnoreCase(code)) {
			if (comUserService.login(username, password) != null) {
				session.setAttribute("username", username);
				return "redirect:show";
			} else {
				model.addAttribute("hint", "用户名或密码错误!");
				return "login";
			}
		} else {
			model.addAttribute("hint", "请输入正确的验证码!");
			return "login";
		}
	}
	
	@PostMapping("/comlogout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "show";
	}
	
	@PostMapping("/comreg")
	public String doRegister(ComUser user, Model model) {
		if (comUserService.register(user)) {
			return "redirect: toLogin";
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
}
