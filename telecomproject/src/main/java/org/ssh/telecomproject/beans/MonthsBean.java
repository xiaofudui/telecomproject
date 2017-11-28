package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

public class MonthsBean implements Serializable {

	/**
	 * 某一个账务账号下面不同业务按月查询提出的月对象（时间对象）
	 */
	private static final long serialVersionUID = -8286975373419975392L;
	
	private Integer id;
	private Date months;//时间（年月）
	private Long timeLength;//一个月的总时长
	
	public MonthsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
