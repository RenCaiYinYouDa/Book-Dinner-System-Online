package com.rcyyd.bookdinner.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.Order;
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

	@Override
	public PageModel<Dish> getDishesByPage(int page, int size, int dishid) {
		PageModel<Dish> pm = dishDao.findByPageUser(page, size,dishid);
		return pm;
	}

	@Override
	public PageModel<Dish> getDishesBylist(int page, int size, List<Dish> dishs) {
		PageModel<Dish> pm= dishDao.findCollection(page, size, dishs);
		return pm;
	}

	@Override
	public PageModel<Dish> getDishePageByLike(String keyword, int page, int size) {
		// TODO Auto-generated method stub
		return dishDao.findByLike(keyword, "dishname", page, size);
	}

	@Override
	public PageModel<Dish> getDishePageByTypeid(Integer typeid, int page, int size) {
		// TODO Auto-generated method stub
		return dishDao.findByKey(typeid, "typeid", page, size);
	}

}
