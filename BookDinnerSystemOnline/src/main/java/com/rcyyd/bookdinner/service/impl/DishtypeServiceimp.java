package com.rcyyd.bookdinner.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Dishtype;
import com.rcyyd.bookdinner.persistence.DishtypeDao;
import com.rcyyd.bookdinner.service.DishtypeService;

public class DishtypeServiceimp implements DishtypeService{

	@Autowired
	private DishtypeDao dishtypeDao;
	
	@Override
	public void addToDishtype(Dishtype dishtype) {
		dishtypeDao.save(dishtype);
	}

	@Override
	public boolean deleteFromDishtype(Dishtype dishtype) {
		dishtypeDao.delete(dishtype);
		return true;
	}

	
}
