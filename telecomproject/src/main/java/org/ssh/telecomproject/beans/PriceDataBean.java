package org.ssh.telecomproject.beans;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 资费表
 * @author 😘
 *
 */
@Entity
@Table(name = "t_pricedata")
public class PriceDataBean {
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;//资费表id
	
	@Column(name = "price_name",length=30)
	private String priceName;//资费名称
	
	@Column(name = "type")
	private Integer type;//资费类型
	
	@Column(name = "timelength")
	private Double timeLength;//基本时长
	
	@Column(name = "basicmoney")
	private Double basicMoney;//基本费用
	
	@Column(name = "hourmoney")
	private Double hourMoney;//单位费用
	
	@Column(name = "comment")
	private Double comment;//资费说明
	
	@Column(name = "state")
	private Integer state;//状态
	
	@Column(name = "statechange")
	private Date stateChange;//开通状态时间
	
	@Column(name = "pid")
	private Integer pid;//逻辑事务
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="pricetype")
	private Set<BusaccountBean> busaccounts;
	public PriceDataBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getTimeLength() {
		return timeLength;
	}
	public void setTimeLength(Double timeLength) {
		this.timeLength = timeLength;
	}
	public Double getBasicMoney() {
		return basicMoney;
	}
	public void setBasicMoney(Double basicMoney) {
		this.basicMoney = basicMoney;
	}
	public Double getHourMoney() {
		return hourMoney;
	}
	public void setHourMoney(Double hourMoney) {
		this.hourMoney = hourMoney;
	}
	public Double getComment() {
		return comment;
	}
	public void setComment(Double comment) {
		this.comment = comment;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getStateChange() {
		return stateChange;
	}
	public void setStateChange(Date stateChange) {
		this.stateChange = stateChange;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Set<BusaccountBean> getBusaccounts() {
		return busaccounts;
	}
	public void setBusaccounts(Set<BusaccountBean> busaccounts) {
		this.busaccounts = busaccounts;
	}
	
	
}
