package com.rcyyd.bookdinner.persistence.impl;


import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Security;
import com.rcyyd.bookdinner.persistence.SecurityDao;

@Repository
public class SecurityDaoDbImpl extends BaseDaoHibernateAdapter<Security, Integer> implements SecurityDao{

}
