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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_account")
@OptimisticLocking(type = OptimisticLockType.VERSION)
public class AccountBean implements Serializable {
 
	/**
	 * 账务账号表
	 */
	private static final long serialVersionUID = -4491026279069262646L;
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;
	
	@Column(name = "account_name",length = 20)
	private String accountName;// 账务帐号
	
	@Column(name = "gender")
	private Integer gender;// 性别
	
	@Column(name = "idcard", length = 20)
	private String idcard;// 身份证
	
	@Column(name = "user_name", length = 20)
	private String userName;// 业务帐号
	
	@Column(name = "user_pwd", length = 32)
	private String userPwd;// 业务帐号密码
	
	@Column(name = "telephone", length = 20)
	private String telephone;// 电话
	
	@Column(name = "address", length = 50)
	private String address;// 地址
	
	@Column(name = "postalcode", length = 20)
	private String postalcode;// 邮编
	
	@Column(name = "qq")
	private Long qq;// QQ
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_role_id")
	private RoleBean role;// 角色ID
	
	@Column(name = "state")
	private Integer state;// 状态（1开通/2暂停/3恢复）
	
	@Column(name = "opentime")
	private Date opentime;// 开通时间
	
	@Column(name = "pid")
	private Integer pid;// 0-正常，1-删除
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="account")//===============================OperationlogBean中属性名
	private Set<OperationlogBean> operationlogs;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="account")//=======AllaccountBean中属性名
	private Set<AllaccountBean> allaccounts;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="account")//====BusaccountBean的属性名
	private Set<BusaccountBean> busaccounts;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="accout")//====LoginlogBean的属性名
	private Set<LoginlogBean> loginlogs;

	public AccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public Long getQq() {
		return qq;
	}

	public void setQq(Long qq) {
		this.qq = qq;
	}

	public RoleBean getRole() {
		return role;
	}

	public void setRole(RoleBean role) {
		this.role = role;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public Set<AllaccountBean> getAllaccounts() {
		return allaccounts;
	}

	public void setAllaccounts(Set<AllaccountBean> allaccounts) {
		this.allaccounts = allaccounts;
	}

	public Set<BusaccountBean> getBusaccounts() {
		return busaccounts;
	}

	public void setBusaccounts(Set<BusaccountBean> busaccounts) {
		this.busaccounts = busaccounts;
	}

	public Set<LoginlogBean> getLoginlogs() {
		return loginlogs;
	}

	public void setLoginlogs(Set<LoginlogBean> loginlogs) {
		this.loginlogs = loginlogs;
	}

	/*@Override
	public String toString() {
		return "AccountBean [id=" + id + ", accountName=" + accountName + ", gender=" + gender + ", idcard=" + idcard
				+ ", userName=" + userName + ", userPwd=" + userPwd + ", telephone=" + telephone + ", address="
				+ address + ", postalcode=" + postalcode + ", qq=" + qq + ", state=" + state + ", opentime=" + opentime
				+ ", pid=" + pid + "]";
	}*/
	
	

}
