package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Order_Dish;
import com.rcyyd.bookdinner.persistence.Order_DishDao;

@Repository
public class Order_DishDaoImpl extends BaseDaoHibernateAdapter<Order_Dish, Integer> implements Order_DishDao{

}
