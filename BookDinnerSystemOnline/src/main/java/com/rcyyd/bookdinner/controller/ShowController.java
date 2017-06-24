package com.rcyyd.bookdinner.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.Dishtype;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.DishService;
import com.rcyyd.bookdinner.service.DishtypeService;

/**
 * ��ʼ����ʾ��ҳ
 * 
 * @author ����
 *
 */
@Controller
public class ShowController{
	
	@Autowired
	DishService dishService;
	
	@Autowired
	DishtypeService dishTypeService;
	
	/**
	 * ��ʼ��ҳ��
	 * @return
	 */
	@GetMapping("indexShow")
	public String initShow(Integer page, Integer size, Model model) {
		if (page == null) page = 1;
		if (size == null) size = 6;
		PageModel<Dish> pm = dishService.getDishesByPage(page, size);
		model.addAttribute("dishList", pm.getDataList());
		model.addAttribute("currentPage", pm.getCurrentPage());
		model.addAttribute("totalPage", pm.getTotalPage());
		List<Dishtype> typeList = dishTypeService.getAllTypes();
		model.addAttribute("typeList", typeList);
		
		return "show";
	}
	
	@GetMapping("getDish") 
	public String getDish(Integer dishid, Model model) {
		Dish dish = dishService.getDishByid(dishid);
		model.addAttribute("dish", dish);
		return "details";
	}

}














