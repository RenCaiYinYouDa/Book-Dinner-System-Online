package com.rcyyd.bookdinner.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.persistence.OrderDao;
import com.rcyyd.bookdinner.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void addToOrder(Order order) {
		orderDao.save(order);
	}

	@Override
	public boolean deleteFromOrder(Order order) {
		return orderDao.deleteById(order.getOrderid(), "orderid");
	}

	@Override
	public List<Order> getAllOrders() {
		return orderDao.findAll();
	}

	@Override
	public PageModel<Order> getOrdersByPage(int page, int size) {
		PageModel<Order> pm = orderDao.findByPage(page, size, "orderid");
		return pm;
	}
	
}
