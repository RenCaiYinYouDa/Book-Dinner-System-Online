package com.rcyyd.bookdinner.persistence.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Cart;
import com.rcyyd.bookdinner.persistence.CartDao;

@Repository
public class CartDaoDbImpl extends BaseDaoHibernateAdapter<Cart, Integer> implements CartDao{
	
	@Override
	public Cart findCartByKeys(int userid, int dishid) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("select count(*) from Cart c where c.userid = "+ userid+" and c.dishid = " + dishid);
		Long cnt = (Long) query.uniqueResult();
		if (cnt > 0){
			List<Cart> list = sessionFactory.getCurrentSession()
					.createQuery("from Cart c where c.userid = "+ userid+" and c.dishid = " + dishid).getResultList();
			return list.get(0);
		}else{
			return null;
		}
	}
}
