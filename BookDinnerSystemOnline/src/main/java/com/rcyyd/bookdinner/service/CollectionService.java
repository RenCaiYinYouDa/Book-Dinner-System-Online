package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.domain.Dish;
import com.rcyyd.bookdinner.domain.PageModel;

public interface CollectionService {
	boolean save(Collection collection);
	
	boolean deleCollection(int addrid);
	
	boolean deleAllCollection(int userid);
	
	List<Collection>seleCollectByUserId(int userid);
	
	PageModel<Collection> getcollectionsByPage(int page, int size, int userid);
}
