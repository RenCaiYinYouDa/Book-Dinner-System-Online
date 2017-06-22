package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;

public interface OrderService {
	void addToOrder(Order order);
	boolean deleteFromOrder(Order order);
	List<Order> getAllOrders();
	PageModel<Order> getOrdersByPage(int page, int size);
}
