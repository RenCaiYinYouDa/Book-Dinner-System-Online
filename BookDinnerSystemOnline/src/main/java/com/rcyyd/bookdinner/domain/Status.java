package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status implements Serializable {
	@Id
	private Integer statusid;
	private String status;

	public Status() {
	}

	public Status(Integer typeid, String type) {
		this.statusid = statusid;
		this.status = status;
	}

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
