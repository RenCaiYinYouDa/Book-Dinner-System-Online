package com.rcyyd.bookdinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.service.AddressService;
import com.rcyyd.bookdinner.service.ComUserService;
import com.rcyyd.bookdinner.service.UserService;

public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@Autowired
	private ComUserService comUserService;
	
	@DeleteMapping("/address")
	@ResponseBody
	public String addAddress(Address address){
		boolean flag = addressService.addAddress(address);
		return flag ? "Success" : "Failed";
	}
	
	@DeleteMapping("/address")
	@ResponseBody
	public String deleAddress(int addrid){
		boolean flag = addressService.deleAddress(addrid);
		return flag ? "Success" : "Failed";
	}
	
}
