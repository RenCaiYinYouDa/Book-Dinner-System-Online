package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rcyyd.bookdinner.domain.AdmUser;
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
	
	
}
