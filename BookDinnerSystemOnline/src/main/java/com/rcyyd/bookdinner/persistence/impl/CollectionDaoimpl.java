package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.persistence.CollectionDao;

@Repository
public class CollectionDaoimpl extends BaseDaoHibernateAdapter<Collection,Integer> implements CollectionDao {

}
