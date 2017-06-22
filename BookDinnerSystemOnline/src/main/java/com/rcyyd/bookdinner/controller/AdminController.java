package com.rcyyd.bookdinner.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.DishService;
import com.rcyyd.bookdinner.service.OrderService;
import com.rcyyd.bookdinner.util.CommonUtil;

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
	
	@GetMapping("admin/showDishes")
	public String toShowDishes(Integer page, Integer size, Model model){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		PageModel<Dish> pm = dishService.getDishesByPage(page, size);
		model.addAttribute("dishList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		return "admin/dish-list";
	}
	
	/**
	 * 处理更新和增加商品
	 * @param dish
	 * @param model
	 * @return
	 */
	@GetMapping("admin/addDish")
	public String toAddDish(Dish dish, Model model){
		if (dish != null){
			
		}
		return "admin/dishadd-form";
	}
	
	@PostMapping("admin/saveDish")
	public String toSaveDish(String dishname, MultipartFile image, Integer price, HttpServletRequest req) throws IOException{
		String photoPath = req.getServletContext().getRealPath("/dishimg");
		String photoFilename = image.getOriginalFilename();
		String photoSuffix = CommonUtil.getSuffix(photoFilename);
		String newPhotoFilename = CommonUtil.getMd5Filename(image.getInputStream(), photoSuffix);
		File photoDestFile = new File(photoPath + "/" + newPhotoFilename);
		if (!photoDestFile.exists()) {
			image.transferTo(photoDestFile);
		}
		Dish dish = new Dish();
		dish.setDishname(dishname);
		dish.setImage(newPhotoFilename);
		dish.setPrice(price);
		dish.setTypeid(0); //测试
		dishService.publishDish(dish);
		return "redirect: showDishes";
	}
}
