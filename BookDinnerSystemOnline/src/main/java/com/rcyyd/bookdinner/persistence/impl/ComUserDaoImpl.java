package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;



import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.persistence.ComUserDao;

@Repository
public class ComUserDaoImpl 
		extends BaseDaoHibernateAdapter<ComUser, Integer>
		implements ComUserDao {
}
