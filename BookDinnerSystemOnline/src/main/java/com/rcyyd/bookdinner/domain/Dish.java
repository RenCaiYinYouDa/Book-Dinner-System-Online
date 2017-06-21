package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dish")
public class Dish implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dishid;
	private int typeid;
	private String dishname;
	private long price;
	private String brief;

	public int getDishid() {
		return dishid;
	}

	public void setDishid(int dishid) {
		this.dishid = dishid;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

}
