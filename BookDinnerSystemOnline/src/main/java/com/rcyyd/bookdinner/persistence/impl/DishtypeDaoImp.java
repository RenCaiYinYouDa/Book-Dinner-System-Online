package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Dishtype;
import com.rcyyd.bookdinner.persistence.DishtypeDao;

@Repository
public class DishtypeDaoImp extends BaseDaoHibernateAdapter<Dishtype, Integer> implements DishtypeDao{

}
