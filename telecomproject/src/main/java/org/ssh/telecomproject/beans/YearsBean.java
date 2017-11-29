package org.ssh.telecomproject.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 年表
 * @author 😘
 *
 */
@Entity
@Table(name = "t_years")
public class YearsBean {
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Long id;//年表ID
	
	@Column(name = "ip",length = 20)
	private String ip;//服务器IP
	
	@Column(name = "years")
	private Date years;//年份
	
	@Column(name = "timelength")
	private Long timeLength;//时长
	
	public YearsBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getYears() {
		return years;
	}

	public void setYears(Date years) {
		this.years = years;
	}

	public Long getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(Long timeLength) {
		this.timeLength = timeLength;
	}
	

}
