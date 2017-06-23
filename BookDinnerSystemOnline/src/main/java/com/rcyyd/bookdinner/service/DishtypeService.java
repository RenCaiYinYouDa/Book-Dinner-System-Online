package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Dishtype;

public interface DishtypeService {

	void addToDishtype(Dishtype dishtype);
	boolean deleteFromDishtype(Dishtype dishtype);
	List<Dishtype> getAllTypes();
}
