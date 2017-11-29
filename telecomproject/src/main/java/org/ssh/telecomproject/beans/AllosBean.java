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
@Table(name = "t_allos")
public class AllosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 494320506878175084L;
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_busaccount_id")
	private BusaccountBean busaccount;//业务账号
	
	@Column(name = "ipcomment",length = 30)
	private	String ipcomment;//服务器信息
	
	@Column(name = "timelength")
	private Long timelength;//月时长
	
	@Column(name = "price")
	private Double price;//费用
	
	@Column(name = "pricetype")
	private Integer pricetype;//资费类型
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_allaccount_id")
	private AllaccountBean allaccount;//所有账户账号某月的支付类
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="allos")
	private Set<OneosBean> oneoss;
	public AllosBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BusaccountBean getBusaccount() {
		return busaccount;
	}
	public void setBusaccount(BusaccountBean busaccount) {
		this.busaccount = busaccount;
	}
	public String getIpcomment() {
		return ipcomment;
	}
	public void setIpcomment(String ipcomment) {
		this.ipcomment = ipcomment;
	}
	public Long getTimelength() {
		return timelength;
	}
	public void setTimelength(Long timelength) {
		this.timelength = timelength;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getPricetype() {
		return pricetype;
	}
	public void setPricetype(Integer pricetype) {
		this.pricetype = pricetype;
	}
	public AllaccountBean getAllaccount() {
		return allaccount;
	}
	public void setAllaccount(AllaccountBean allaccount) {
		this.allaccount = allaccount;
	}
	public Set<OneosBean> getOneoss() {
		return oneoss;
	}
	public void setOneoss(Set<OneosBean> oneoss) {
		this.oneoss = oneoss;
	}
	
}	
