package com.rcyyd.bookdinner.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_collection")
public class Collection {
	@Id
	private int dishid;//≤À∆∑±‡∫≈
	private int userid;//”√ªß±‡∫≈
	
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
}
