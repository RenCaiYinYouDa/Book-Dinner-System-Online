package com.rcyyd.bookdinner.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.persistence.DishDao;
import com.rcyyd.bookdinner.service.DishService;

@Service
@Transactional
public class DishServiceImpl implements DishService {

	@Autowired
	private DishDao dishDao;
	
	@Override
	public PageModel<Dish> getDishesByPage(int page, int size) {
		PageModel<Dish> pm = dishDao.findByPage(page, size, "dishid");
		return pm;
	}

	@Override
	public boolean publishDish(Dish dish) {
		dishDao.save(dish);
		return true;
	}

	@Override
	public Dish getDishByid(int id) {
		return dishDao.findById(id);
	}

	@Override
	public boolean deleteDish(Dish dish) {
		dishDao.delete(dish);
		return true;
	}

	@Override
	public boolean updateDish(Dish dish) {
		dishDao.update(dish);
		return true;
	}

}
