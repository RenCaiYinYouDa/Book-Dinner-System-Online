package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.persistence.OrderDao;

@Repository
public class OrderDaoDbImpl extends BaseDaoHibernateAdapter<Order, Integer> implements OrderDao{

}
