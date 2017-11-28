package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

public class DaysBean implements Serializable {
	/**
	 * 日期表
	 */
	private Long id;
	private String ip;
	private Date days;//天数
	private Integer timeLength;//时长

	public DaysBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
