package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_months")
public class MonthsBean implements Serializable {

	/**
	 * 某一个账务账号下面不同业务按月查询提出的月对象（时间对象）
	 */
	private static final long serialVersionUID = -8286975373419975392L;
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Integer id;
	
	@Column(name = "months")
	private Date months;//时间（年月）
	
	@Column(name = "timelength")
	private Long timeLength;//一个月的总时长
	
	public MonthsBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMonths() {
		return months;
	}

	public void setMonths(Date months) {
		this.months = months;
	}

	public Long getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(Long timeLength) {
		this.timeLength = timeLength;
	}
	
}
