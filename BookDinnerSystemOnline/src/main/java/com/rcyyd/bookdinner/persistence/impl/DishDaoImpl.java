package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.persistence.DishDao;

@Repository
public class DishDaoImpl extends BaseDaoHibernateAdapter<Dish, Integer> implements DishDao {

}
