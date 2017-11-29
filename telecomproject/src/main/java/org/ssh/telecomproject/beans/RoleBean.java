package org.ssh.telecomproject.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 角色表
 * @author 😘
 *
 */
@Entity
@Table(name = "t_role")
public class RoleBean {
	
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;//角色表id
	
	@Column(name = "account_name",length = 30)
	private String roleName;//角色名称
	
	@Column(name = "role_type")
	private String juese;	//角色类型
	
	@Column(name = "pid")
	private Integer pid;//逻辑事务
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="role")//对应账户表中的角色属性
	private AccountBean account;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="role")
	private Set<AdminBean> admins;
	
	public RoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getJuese() {
		return juese;
	}

	public void setJuese(String juese) {
		this.juese = juese;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public AccountBean getAccount() {
		return account;
	}

	public void setAccount(AccountBean account) {
		this.account = account;
	}

	public Set<AdminBean> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<AdminBean> admins) {
		this.admins = admins;
	}
	

}
