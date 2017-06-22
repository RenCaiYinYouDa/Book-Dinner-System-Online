package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Address;

public interface AddressService {
	boolean addAddress(Address address); //添加新地址
	
	boolean deleAddress(int addrid);//删除指定id编号的订单
	
	boolean deleAllAaddress(int userid);//清空当前用户的所有地址
	
	boolean updateAddress(Address address);//修改指定id编号地址的信息
	
	List<Address> getAllAddress(int userid);//获取当前用户所有的地址
}
