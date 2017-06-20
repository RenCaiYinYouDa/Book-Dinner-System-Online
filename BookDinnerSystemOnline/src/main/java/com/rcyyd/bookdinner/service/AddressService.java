package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Address;

public interface AddressService {
	boolean addAddress(Address address); //添加新地址
	
	boolean deleAddress(int addrid);//删除指定id编号的订单
	
	boolean deleAllAaddress(int userid);//清空当前用户的所有订单
	
	boolean updateAddress(Address address);//修改指定id编号订单的信息
	
	List<Address> getAllAddress();//获取所有的订单
}
