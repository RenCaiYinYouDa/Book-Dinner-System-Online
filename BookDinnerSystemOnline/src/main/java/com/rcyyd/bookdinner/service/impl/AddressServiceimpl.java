package com.rcyyd.bookdinner.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.persistence.AddressDao;
import com.rcyyd.bookdinner.service.AddressService;
@Service
@Transactional
public class AddressServiceimpl implements AddressService {

	@Autowired
	private  AddressDao addressDao;
	
	/**
	 * 添加新的地址
	 */
	@Override
	public boolean addAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDao.save(address)!=null;		
	}
 
	/**
	 * 删除指定id编号的地址
	 */
	@Override
	public boolean deleAddress(int addrid) {
		// TODO Auto-generated method stub
		return addressDao.deleteById(addrid);
	}

	/**
	 * 清空当前用户所有的地址
	 */
	@Override
	public boolean deleAllAaddress(int userid) {
		// TODO Auto-generated method stub
		return addressDao.deleteById(userid, "userid");
	}

	/**
	 * 修改地址
	 */
	@Override
	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		addressDao.update(address);
		return true;
	}

	/** 
	 * 获取所有的地址
	 */
	@Override
	public List<Address> getAllAddress(int userid) {
		// TODO Auto-generated method stub
		return addressDao.findByKey(userid, "userid");
	}

}
