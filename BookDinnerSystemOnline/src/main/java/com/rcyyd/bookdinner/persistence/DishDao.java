package com.rcyyd.bookdinner.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.PageModel;

public interface DishDao extends BaseDao<Dish, Integer> {
	 PageModel<Dish> findCollection(int page, int size, List<Dish> list);
}
