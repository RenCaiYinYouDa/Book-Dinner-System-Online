package com.rcyyd.bookdinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rcyyd.bookdinner.service.AddressService;
import com.rcyyd.bookdinner.service.ComUserService;
import com.rcyyd.bookdinner.service.UserService;

public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@Autowired
	private ComUserService comUserService;
	
	@DeleteMapping("/address/{addrid}")
	@ResponseBody
	public String delAddress(@PathVariable String address){
		boolean flag = addressService.deleAddress(addrid);
		return flag ? "Success" : "Failed";
	}
}
