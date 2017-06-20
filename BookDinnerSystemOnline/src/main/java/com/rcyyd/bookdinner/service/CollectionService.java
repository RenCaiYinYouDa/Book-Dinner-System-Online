package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.Collection;

public interface CollectionService {
	boolean save(Collection collection);
	
	boolean deleCollection(int addrid);
	
	boolean deleAllCollection(int userid);
}
