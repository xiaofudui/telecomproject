package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

public class LoginlogBean implements Serializable {

	/**
	 * 登录日志对象
	 */
	private static final long serialVersionUID = 3120642365008438153L;
	
	private Integer id;
	private Date loginTime;//登录时间
	private Date outTime;//退出时间
	private AccountBean accout;//账务账号
	
	public LoginlogBean() {
		super();
	}

}
