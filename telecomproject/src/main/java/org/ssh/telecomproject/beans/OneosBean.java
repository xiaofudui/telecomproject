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
@Table(name = "t_oneos")
public class OneosBean implements Serializable {

	/**
	 * 某一个业务
	 */
	private static final long serialVersionUID = -4603180770124160641L;
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Integer id;
	
	@Column(name = "start_time")
	private Date startTime;//开始使用的时间
	
	@Column(name = "out_time")
	private Date outTime;//退出使用的时间
	
	@Column(name = "datelength")
	private Long dateLength;//使用时间
	
	@Column(name = "price")
	private Double price;//费用
	
	@Column(name = "priceType")
	private Integer priceType;//支付类型
	/*@JsonIgnore*/
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_allos_id")
	private AllosBean allos;//某个用户开通的所有业务对象
	public OneosBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Long getDateLength() {
		return dateLength;
	}
	public void setDateLength(Long dateLength) {
		this.dateLength = dateLength;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getPriceType() {
		return priceType;
	}
	public void setPriceType(Integer priceType) {
		this.priceType = priceType;
	}
	public AllosBean getAllos() {
		return allos;
	}
	public void setAllos(AllosBean allos) {
		this.allos = allos;
	}
	@Override
	public String toString() {
		return "OneosBean [id=" + id + ", startTime=" + startTime + ", outTime=" + outTime + ", dateLength="
				+ dateLength + ", price=" + price + ", priceType=" + priceType + "]";
	}
	
}
