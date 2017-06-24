package com.rcyyd.bookdinner.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Order_Dish;
import com.rcyyd.bookdinner.persistence.Order_DishDao;
import com.rcyyd.bookdinner.service.Order_DishService;

@Service
@Transactional
public class Order_DishServiceImpl implements Order_DishService{
	@Autowired
	private Order_DishDao odDao;

	@Override
	public void addToOrder_Dish(Order_Dish od) {
		odDao.save(od);
	}
}
