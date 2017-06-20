package com.rcyyd.bookdinner.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_addr")
public class Address {
	@Id
	private int addrid;// 地址编号
	private int userid;//用户编号
	private String address;//地址
	
	public int getAddid() {
		return addrid;
	}
	public void setAddid(int addrid) {
		this.addrid = addrid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

