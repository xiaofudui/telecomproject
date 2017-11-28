package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class AdminBean implements Serializable {

	/**
	 * 管理员表
	 */
	private static final long serialVersionUID = 864294215411658772L;
	private Long id;
	private String adminName;//管理员名字
	private String adminAccount;//管理员账号
	private String adminPwd;//管理员密码
	private String telephone;//电话
	private String email;//邮编
	private RoleBean role;//角色ID
	private Date opentime;//开通时间
	private Integer pid;//0-正常，1-删除
	private Set<OperationlogBean> operationlogs;
	public AdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
