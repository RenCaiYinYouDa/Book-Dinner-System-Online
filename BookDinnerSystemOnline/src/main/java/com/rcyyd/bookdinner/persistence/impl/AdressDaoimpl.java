package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.persistence.AddressDao;

@Repository
public class AdressDaoimpl extends BaseDaoHibernateAdapter<Address, Integer> implements AddressDao{

}
