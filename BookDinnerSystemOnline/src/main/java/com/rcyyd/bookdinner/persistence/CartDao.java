package com.rcyyd.bookdinner.persistence;

import com.rcyyd.bookdinner.domain.Cart;

public interface CartDao extends BaseDao<Cart, Integer>{
	Cart findCartByKeys(int userid, int dishid);
}
