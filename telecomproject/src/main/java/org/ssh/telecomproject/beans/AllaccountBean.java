package org.ssh.telecomproject.beans;

import java.io.Serializable;
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
@Table(name = "t_allaccount")
public class AllaccountBean implements Serializable {

	/**
	 * 所有账户账号某月的支付 表
	 */
	private static final long serialVersionUID = 5866302824700504326L;
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;
	
	@Column(name = "idcomment",length = 30)
	private String idcomment;//账务账号真实姓名
	/*@JsonIgnore*/
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_account_id")
	private AccountBean account;//账务账号id
	
	@Column(name = "price")
	private Double price;//月的总费用
	
	@Column(name = "month")
	private Integer month; //月份
	
	@Column(name = "paytype")
	private Integer paytype;//支付方式 0-现金，1-网银
	
	@Column(name = "paystate")
	private Integer paystate;//支付状态 0-未支付，1-已支付，2-支付异常
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="allaccount")
	private Set<AllosBean> alloss;
	public AllaccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdcomment() {
		return idcomment;
	}
	public void setIdcomment(String idcomment) {
		this.idcomment = idcomment;
	}
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getPaytype() {
		return paytype;
	}
	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}
	public Integer getPaystate() {
		return paystate;
	}
	public void setPaystate(Integer paystate) {
		this.paystate = paystate;
	}
	public Set<AllosBean> getAlloss() {
		return alloss;
	}
	public void setAlloss(Set<AllosBean> alloss) {
		this.alloss = alloss;
	}
	
	
	
}
