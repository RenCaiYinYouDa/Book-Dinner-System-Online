package com.rcyyd.bookdinner.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rcyyd.bookdinner.domain.Cart;
import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.Order_Dish;
import com.rcyyd.bookdinner.service.CartService;
import com.rcyyd.bookdinner.service.OrderService;
import com.rcyyd.bookdinner.service.Order_DishService;

@Controller
public class CartController {
	@Autowired
	private CartService cartService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private Order_DishService odService;
	
	@GetMapping("showCart")
	public String toShowCart(Integer userid, Model model){
		model.addAttribute("cartList", cartService.getAllDishesByUserId(userid));
		return "shopCart";
	}
	
	@GetMapping("changeCartCount")
	public String toChangeCartCount(Integer dishid, Integer userid, Integer count, RedirectAttributes attr){
		Cart cart = new Cart();
		cart.setDishid(dishid);
		cart.setUserid(userid);
		cart.setCount(count);
		cartService.changeCart(cart);
		attr.addAttribute("userid", userid);
		return "redirect:showCart";
	}
	
	@GetMapping("deleteCart")
	public String toDeleteCart(Integer dishid, Integer userid, RedirectAttributes attr){
		Cart cart = new Cart();
		cart.setDishid(dishid);
		cart.setUserid(userid);
		cartService.deleteFromCart(cart);
		attr.addAttribute("userid", userid);
		return "redirect:showCart";
	}
	
	@GetMapping("generateOrder")
	public String toGenerateOrder(Integer userid){
		List<Cart> cartList = cartService.getAllDishesByUserId(userid);
		SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		for (Cart c : cartList){
			String ordernum = formatter.format(new Date());
			Order o = new Order();
			o.setUserid(c.getUserid());
			o.setStatusid(0);
			o.setDate(new Date());
			o.setOrdernum(ordernum);
			o.setAddrid(0);
			orderService.addToOrder(o);
			Order_Dish od = new Order_Dish();
			od.setOrdernum(ordernum);
			od.setDishid(c.getDishid());
			od.setCount(c.getCount());
			odService.addToOrder_Dish(od);
			cartService.deleteFromCart(c);
		}
		return "redirect: showPersonOrder";
	}
	
	@GetMapping("addToCart")
	public String toAddToCart(Integer dishid, Integer userid, Integer page, RedirectAttributes attr){
		Cart cart = cartService.getCartByKeys(userid, dishid);
		if (cart != null){
			cart.setCount(cart.getCount() + 1);
			cartService.changeCart(cart);
		}else{
			cart = new Cart();
			cart.setUserid(userid);
			cart.setDishid(dishid);
			cart.setCount(1);
			cartService.addToCart(cart);
		}
		attr.addAttribute("page", page);
		return "redirect: indexShow";
	}
}
