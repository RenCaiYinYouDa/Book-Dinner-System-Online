package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.Order;

public interface OrderService {
	void addToOrder(Order order);
	boolean deleteFromOrder(Order order);
}
