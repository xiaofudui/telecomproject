package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_role")
public class AdminBean implements Serializable {

	/**
	 * 管理员表
	 */
	private static final long serialVersionUID = 864294215411658772L;
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;
	
	@Column(name = "admin_name",length = 30)
	private String adminName;//管理员名字
	
	@Column(name = "admin_account",length = 30)
	private String adminAccount;//管理员账号
	
	@Column(name = "admin_pwd",length = 32)
	private String adminPwd;//管理员密码
	
	@Column(name = "telephone",length = 30)
	private String telephone;//电话
	
	@Column(name = "email",length = 30)
	private String email;//邮编
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_role_id")
	private RoleBean role;//角色ID
	
	@Column(name = "opentime")
	private Date opentime;//开通时间
	
	@Column(name = "pid")
	private Integer pid;//0-正常，1-删除
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="admin")
	private Set<OperationlogBean> operationlogs;
	public AdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RoleBean getRole() {
		return role;
	}
	public void setRole(RoleBean role) {
		this.role = role;
	}
	public Date getOpentime() {
		return opentime;
	}
	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Set<OperationlogBean> getOperationlogs() {
		return operationlogs;
	}
	public void setOperationlogs(Set<OperationlogBean> operationlogs) {
		this.operationlogs = operationlogs;
	}
	
}
