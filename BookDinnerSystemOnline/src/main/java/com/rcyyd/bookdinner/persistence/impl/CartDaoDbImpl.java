package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Cart;
import com.rcyyd.bookdinner.persistence.CartDao;

@Repository
public class CartDaoDbImpl extends BaseDaoHibernateAdapter<Cart, Integer> implements CartDao{

}
