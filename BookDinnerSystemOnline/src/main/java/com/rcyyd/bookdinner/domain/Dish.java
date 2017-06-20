package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dish")
@NamedQuery(name = "TbDish.findAll", query = "SELECT b FROM TbDish b")
public class Dish implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"dishid\"")
	private Integer dishid;

	@Column(name = "\"dishname\"")
	private String dishname;

	@Column(name = "typeid")
	private Integer typeid;

	@Column(name = "price")
	private long price;

	@Column(name = "brief")
	private long brief;

	public Integer getDishid() {
		return dishid;
	}

	public void setDishid(Integer dishid) {
		this.dishid = dishid;
	}

	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getBrief() {
		return brief;
	}

	public void setBrief(long brief) {
		this.brief = brief;
	}

}
