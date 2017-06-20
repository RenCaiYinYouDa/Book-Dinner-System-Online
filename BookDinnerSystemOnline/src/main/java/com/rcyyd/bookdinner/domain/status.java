package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status implements Serializable {
	@Id
	private String statusid;
	private String status;

	public Status() {
	}

	public Status(String typeid, String type) {
		this.statusid = statusid;
		this.status = status;
	}

	public String getStatusid() {
		return statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
