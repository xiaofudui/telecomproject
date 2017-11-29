package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "t_loginlog")
public class LoginlogBean implements Serializable {

	/**
	 * 登录日志对象
	 */
	private static final long serialVersionUID = 3120642365008438153L;
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Integer id;
	
	@Column(name = "login_time")
	private Date loginTime;//登录时间
	
	@Column(name = "out_time")
	private Date outTime;//退出时间
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_account_id")
	private AccountBean accout;//账务账号
	
	public LoginlogBean() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public AccountBean getAccout() {
		return accout;
	}

	public void setAccout(AccountBean accout) {
		this.accout = accout;
	}
	
}
