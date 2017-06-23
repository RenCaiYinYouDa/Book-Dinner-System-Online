package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.PageModel;

public interface DishService {
	PageModel<Dish> getDishesByPage(int page, int size);
	boolean publishDish(Dish dish);
	Dish getDishByid(int id);
}
