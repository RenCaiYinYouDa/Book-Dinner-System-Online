package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.OrderService;

@Controller
public class UserOrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("showOrders")
	public String toShowOrders(Integer page, Integer size, Model model,HttpServletRequest req){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		ComUser user=(ComUser)req.getSession().getAttribute("user");
		System.out.println(user.getUserid());
		PageModel<Order> pm = orderService.getOrdersByPageUser(page, size,user.getUserid());
		model.addAttribute("orderList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		return "user-order";
	}
	
}
