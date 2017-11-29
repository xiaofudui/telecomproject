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

/**
 * 服务器计费日志表(有问题)
 * 
 *
 */
@Entity
@Table(name = "t_countlog")
public class CountLogBean implements Serializable {
	
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;
	
	@Column(name = "start_time")
	private Date startTime;//业务账号登录服务器时间、计费开始时间
	
	@Column(name = "end_time")
	private Date endTime;//业务账号登录服务器时间、计费结束时间
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_busaccount_id")
	private BusaccountBean busaccount;//业务账号
	
	@Column(name = "ip",length=30)
	private String ip;//服务器ip地址
	
	@Column(name = "timelength")
	private Long timeLength;//时长
	
	@Column(name = "pid")
	private Integer pid;
	
	public CountLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public BusaccountBean getBusaccount() {
		return busaccount;
	}

	public void setBusaccount(BusaccountBean busaccount) {
		this.busaccount = busaccount;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(Long timeLength) {
		this.timeLength = timeLength;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
}
