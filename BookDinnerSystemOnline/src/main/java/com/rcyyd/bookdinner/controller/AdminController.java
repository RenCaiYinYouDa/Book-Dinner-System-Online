package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.AdmUserService;
import com.rcyyd.bookdinner.service.DishService;
import com.rcyyd.bookdinner.service.OrderService;

@Controller
public class AdminController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private DishService dishService;
	@Autowired
	private AdmUserService admUserService;
	
	@GetMapping("admin/showOrders")
	public String toShowOrders(Integer page, Integer size, Model model){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		PageModel<Order> pm = orderService.getOrdersByPage(page, size);
		model.addAttribute("orderList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		return "admin/order-list";
	}
	
	@PostMapping("/admlogin")
	public String doLogin(String username, String password, String vc, Model model, HttpSession session) {
		String code = (String) session.getAttribute("vc");
		if (vc != null && code != null && vc.equalsIgnoreCase(code)) {
			if (admUserService.login(username, password) != null) {
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
	
	@PostMapping("/admlogout")
	public String doLogout(HttpSession session) {
		session.invalidate();
		return "show";
	}
}
