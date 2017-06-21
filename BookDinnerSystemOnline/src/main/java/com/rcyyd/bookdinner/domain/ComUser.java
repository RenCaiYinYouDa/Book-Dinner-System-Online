package com.rcyyd.bookdinner.domain;
import javax.persistence.*;


@Entity
@Table(name="tb_comuser")
public class ComUser extends User{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	private String username;
	private String password;
	@ManyToOne
	@JoinColumn(name = "securityid")
	private Security security;
	@Column (name="\"key\"")
	private String key;
	private String email;
	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
