package com.rcyyd.bookdinner.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_comment")
@NamedQuery(name = "TbComment.findAll", query = "SELECT b FROM TbComment b")
public class Comment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"commid\"")
	private Integer commid;

	@Column(name = "\"userid\"")
	private Integer userid;

	@Column(name = "comment")
	private String comment;

	@Column(name = "date")
	private Date date;

	@Column(name = "dishid")
	private Integer dishid;

	public Integer getCommid() {
		return commid;
	}

	public void setCommid(Integer commid) {
		this.commid = commid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDishid() {
		return dishid;
	}

	public void setDishid(Integer dishid) {
		this.dishid = dishid;
	}

}
