package com.rcyyd.bookdinner.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Status;
import com.rcyyd.bookdinner.persistence.StatusDao;
import com.rcyyd.bookdinner.service.StatusService;

@Service
@Transactional

public class StatusServiceimp implements StatusService{
	
	@Autowired
	private StatusDao statusDao;
	
	@Override
	public void addToStatus(Status status) {
		statusDao.save(status);
	}

	@Override
	public boolean deleteFromStatus(Status status) {
		statusDao.delete(status);
		return true;
	}


}
