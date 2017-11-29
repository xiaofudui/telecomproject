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

/**
 * 业务账号表
 * 
 * @author Administrator
 *
 */

@Entity
@Table(name = "t_busaccount")
public class BusaccountBean implements Serializable {

	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_account_id")
	private AccountBean account;// 账务账号
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_pricetype_id")
	private PriceDataBean pricetype;// 资费类型id

	@Column(name = "ip",length=30)
	private String ip;// 服务器ip

	@Column(name = "business_account",length=30)
	private String businessAccount;// 业务账号

	@Column(name = "business_pwd",length=32)
	private String businessPwd;// 业务账号密码

	@Column(name = "state")
	private Integer state;// 状态，0-开通，1-暂停

	@Column(name = "opentime")
	private Date opentime;// 开通业务账号时间

	@Column(name = "pid")
	private Integer pid;// 0-正常，1-删除
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="busaccount")
	private Set<AllosBean> alloss;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="busaccount")
	private Set<CountLogBean> countlogs;// ---有问题，待思考

	public BusaccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AccountBean getAccount() {
		return account;
	}

	public void setAccount(AccountBean account) {
		this.account = account;
	}

	public PriceDataBean getPricetype() {
		return pricetype;
	}

	public void setPricetype(PriceDataBean pricetype) {
		this.pricetype = pricetype;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getBusinessAccount() {
		return businessAccount;
	}

	public void setBusinessAccount(String businessAccount) {
		this.businessAccount = businessAccount;
	}

	public String getBusinessPwd() {
		return businessPwd;
	}

	public void setBusinessPwd(String businessPwd) {
		this.businessPwd = businessPwd;
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

	public Set<AllosBean> getAlloss() {
		return alloss;
	}

	public void setAlloss(Set<AllosBean> alloss) {
		this.alloss = alloss;
	}

	public Set<CountLogBean> getCountlogs() {
		return countlogs;
	}

	public void setCountlogs(Set<CountLogBean> countlogs) {
		this.countlogs = countlogs;
	}
	
}
