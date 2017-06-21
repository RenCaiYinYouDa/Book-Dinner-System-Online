package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.Status;

public interface StatusService {

	void addToStatus(Status status);
	boolean deleteFromStatus(Status status);
	
}
