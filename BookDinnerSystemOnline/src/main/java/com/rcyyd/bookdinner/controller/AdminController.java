package com.rcyyd.bookdinner.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String toShowOrders(Integer page, Integer size, Integer type, Model model){
		if (type == null){
			type = -1;
		}
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		PageModel<Order> pm = orderService.getOrdersByStatus(page, size, type);
		model.addAttribute("orderList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		model.addAttribute("status", type);
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
		model.addAttribute("dishcurrentPage", pm.getCurrentPage());
		model.addAttribute("dishtotalPage", pm.getTotalPage());
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
	public String toSaveDish(String dishname, String brief, MultipartFile image, Integer price, HttpServletRequest req) throws IOException{
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
		dish.setBrief(brief);
		dishService.publishDish(dish);
		return "redirect: showDishes";
	}
	
	@PostMapping("admin/updateDish")
	public String toUpdateDish(Integer dishid, String dishname, String brief, MultipartFile image, Integer price, HttpServletRequest req) throws IOException{
		String photoPath = req.getServletContext().getRealPath("/dishimg");
		String photoFilename = image.getOriginalFilename();
		String photoSuffix = CommonUtil.getSuffix(photoFilename);
		String newPhotoFilename = CommonUtil.getMd5Filename(image.getInputStream(), photoSuffix);
		File photoDestFile = new File(photoPath + "/" + newPhotoFilename);
		if (!photoDestFile.exists()) {
			image.transferTo(photoDestFile);
		}
		Dish dish = new Dish();
		dish.setDishid(dishid);
		dish.setDishname(dishname);
		dish.setImage(newPhotoFilename);
		dish.setPrice(price);
		dish.setTypeid(0); //测试
		dish.setBrief(brief);
		dishService.updateDish(dish);
		return "redirect: showDishes";
	}
	
	@GetMapping("admin/updateOrderStatus")
	public String toUpdateOrderStatus(Integer orderid, String ordernum, Integer statusid, Integer userid, Integer addrid, String date, Integer page, Integer type, RedirectAttributes attr){
		Order order = new Order();
		order.setOrderid(orderid);
		order.setOrdernum(ordernum);
		order.setStatusid(statusid);
		order.setUserid(userid);
		order.setAddrid(addrid);
		order.setDate(new Date());
		orderService.updateOrder(order);
		attr.addAttribute("page", page);
		attr.addAttribute("type", type);
		return "redirect:showOrders";
	}
	
	/**
	 * 处理跳转到修改页面
	 * @param dishid 跳转参数
	 * @param model
	 * @return 跳转到修改页面
	 */
	@GetMapping("admin/updateDish")
	public String toUpdateDish(Integer dishid, Model model){
		Dish dish = dishService.getDishByid(dishid);
		model.addAttribute("dishid", dish.getDishid());
		model.addAttribute("dishname", dish.getDishname());
		model.addAttribute("dishprice", dish.getPrice());
		model.addAttribute("dishimg", dish.getImage());
		model.addAttribute("dishbrief", dish.getBrief());
		return "admin/dishadd-form";
	}
	
	@GetMapping("admin/deleteDish")
	public String toDeleteDish(Integer dishid){
		Dish dish = dishService.getDishByid(dishid);
		dishService.deleteDish(dish);
		return "redirect:showDishes";
	}
}
