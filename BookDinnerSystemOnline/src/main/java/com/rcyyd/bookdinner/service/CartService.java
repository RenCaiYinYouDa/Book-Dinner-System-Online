package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Cart;

public interface CartService {
	void addToCart(Cart cart);
	boolean deleteFromCart(Cart cart);
	boolean changeCart(Cart cart);
	List<Cart> getAllDishesByUserId(Integer userid);
}
