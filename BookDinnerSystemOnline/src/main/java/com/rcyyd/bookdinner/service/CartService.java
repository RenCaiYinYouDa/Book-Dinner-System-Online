package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.Cart;

public interface CartService {
	void addToCart(Cart cart);
	boolean deleteFromCart(Cart cart);
}
