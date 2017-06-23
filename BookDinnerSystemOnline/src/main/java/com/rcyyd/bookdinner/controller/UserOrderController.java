package com.rcyyd.bookdinner.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.OrderService;

@Controller
public class UserOrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("showOrders")
	public String toShowOrders(Integer page, Integer size, Model model){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		int userid =1;
		PageModel<Order> pm = orderService.getOrdersByPageUser(page, size,userid);
		model.addAttribute("orderList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		return "user-order";
	}
	
}
