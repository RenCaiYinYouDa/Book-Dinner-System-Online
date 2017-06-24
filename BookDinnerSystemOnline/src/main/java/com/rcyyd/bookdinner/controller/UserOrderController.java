package com.rcyyd.bookdinner.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.type.descriptor.java.PrimitiveByteArrayTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.CollectionService;
import com.rcyyd.bookdinner.service.DishService;
import com.rcyyd.bookdinner.service.OrderService;

@Controller
public class UserOrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private DishService dishService;
	@Autowired
	private CollectionService collectionService;
	@GetMapping("showPersonOrder")
	public String toShowOrders(Integer page, Integer size, Model model,HttpServletRequest req){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		ComUser user=(ComUser)req.getSession().getAttribute("user");
		PageModel<Order> pm = orderService.getOrdersByPageUser(page, size,user.getUserid());
		model.addAttribute("orderList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		return "user-order";
	}
	
	@GetMapping("showPrivateDishes")
	public String toShowDishes(Integer page, Integer size, Model model,HttpServletRequest req){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		ComUser user=(ComUser)req.getSession().getAttribute("user");
		List<Collection> collections=collectionService.seleCollectByUserId(user.getUserid());
		List<Dish> dishs = new ArrayList<Dish>();
		for(int i=0;i<collections.size();i++){
			dishs.add(i, dishService.getDishByid(i+1));
		}
		
		System.out.print(dishs.size());
		PageModel<Dish> pm = dishService.getDishesBylist(page, size,dishs);	
			
		model.addAttribute("dishList", pm.getDataList());
		model.addAttribute("dishcurrentPage", pm.getCurrentPage());
		model.addAttribute("dishtotalPage", pm.getTotalPage());
		return "collection";
	}
	
	
	
}
