package org.ssh.telecomproject.beans;

import java.util.Set;

/**
 * 角色表
 * @author 😘
 *
 */
public class RoleBean {
	
	private Long id;//角色表id
	private String roleName;//角色名称
	private String juese;	//角色类型
	private Integer pid;//逻辑事务
	private AccountBean account;
	private Set<AdminBean> admins;
	
	public RoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
