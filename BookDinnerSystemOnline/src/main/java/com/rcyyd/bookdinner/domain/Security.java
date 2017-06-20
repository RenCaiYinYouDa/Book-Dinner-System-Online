package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_security")
public class Security implements Serializable{
	@Id
	@Column(name = "\"securityid\"")
	private String securityid;
	
	@Column(name = "\"security\"")
	private String security;
	
	public Security() {
	}
	
	public Security(String securityid, String security) {
		this.securityid = securityid;
		this.security = security;
	}
	
	public String getSecurityid() {
		return securityid;
	}

	public void setSecurityid(String securityid) {
		this.securityid = securityid;
	}
	
	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}
}
