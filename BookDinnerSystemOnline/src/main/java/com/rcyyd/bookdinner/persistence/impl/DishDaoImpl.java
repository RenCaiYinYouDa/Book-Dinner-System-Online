package com.rcyyd.bookdinner.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.persistence.DishDao;

@Repository
public class DishDaoImpl extends BaseDaoHibernateAdapter<Dish, Integer> implements DishDao {

	@Override
	public PageModel<Dish> findCollection(int page, int size, List<Dish> list) {
		List<Dish> dataList = list;
		int totalCount = list.size();
		int totalPage = (totalCount - 1) / size + 1;
		return new PageModel<>(dataList, page, size, totalPage);
	}
	

}
