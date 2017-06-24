package com.rcyyd.bookdinner.service;

import java.util.ArrayList;
import java.util.List;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.PageModel;

public interface DishService {
	PageModel<Dish> getDishesByPage(int page, int size);
	PageModel<Dish> getDishesByPage(int page, int size,int dishid);
	PageModel<Dish> getDishesBylist(int page, int size,List<Dish> dishs);
	boolean publishDish(Dish dish);
	Dish getDishByid(int id);
	boolean deleteDish(Dish dish);
	boolean updateDish(Dish dish);
}
