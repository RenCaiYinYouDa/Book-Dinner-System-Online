package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rcyyd.bookdinner.service.DishService;

@Controller
public class DetailController {
	
	@Autowired
	private DishService dishService;
	
	@GetMapping("showDishDetail")
	public String toShowDishDetail(Integer dishid, HttpSession session, RedirectAttributes attr){
		session.setAttribute("dish", dishService.getDishByid(dishid));
		attr.addAttribute("dishid", dishid);
		return "redirect: showComments";
	}
}
