package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.AdmUser;
import com.rcyyd.bookdinner.persistence.AdmUserDao;

@Repository
public class AdmUserDaoImpl 
extends BaseDaoHibernateAdapter<
AdmUser, Integer>
implements AdmUserDao {
}
