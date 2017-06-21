package com.rcyyd.bookdinner.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_security")
public class Security implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "securityid")
	private Integer securityid;
	
	@Column(name = "security")
	private String security;
	
	public Security() {
	}
	
	public Security(Integer securityid, String security) {
		this.securityid = securityid;
		this.security = security;
	}
	
	public Integer getSecurityid() {
		return securityid;
	}

	public void setSecurityid(Integer securityid) {
		this.securityid = securityid;
	}
	
	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}
}
