package com.rcyyd.bookdinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rcyyd.bookdinner.service.CartService;

@Controller
public class CartController {
	@Autowired
	private CartService cartService;
	
	@GetMapping("showCart")
	public String toShowCart(Integer userid, Model model){
		model.addAttribute("cartList", cartService.getAllDishesByUserId(userid));
		return "shopCart";
	}
}
