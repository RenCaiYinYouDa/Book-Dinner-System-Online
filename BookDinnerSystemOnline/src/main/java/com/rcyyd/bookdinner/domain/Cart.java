package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 购物车实体类
 * @author 曾左英
 *
 */
@Entity
@Table(name="tb_cart")
public class Cart implements Serializable{
	@Id
	private int dishid;
	@Id
	private int userid;
	private int count;
	public int getDishid() {
		return dishid;
	}
	public void setDishid(int dishid) {
		this.dishid = dishid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
