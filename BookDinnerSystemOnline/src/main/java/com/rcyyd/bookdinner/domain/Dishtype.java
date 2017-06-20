package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dish_type")
public class Dishtype implements Serializable {
	@Id
	private String typeid;
	private String type;

	public Dishtype() {
	}
	
	public Dishtype(String typeid, String type) {
		this.typeid = typeid;
		this.type = type;
	}

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}

