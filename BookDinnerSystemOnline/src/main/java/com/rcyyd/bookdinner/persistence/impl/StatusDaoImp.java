package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Status;
import com.rcyyd.bookdinner.persistence.StatusDao;

@Repository
public class StatusDaoImp extends BaseDaoHibernateAdapter<Status, Integer> implements StatusDao{

}
