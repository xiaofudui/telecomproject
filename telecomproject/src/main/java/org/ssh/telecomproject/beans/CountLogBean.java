package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务器计费日志表(有问题)
 * 
 *
 */
public class CountLogBean implements Serializable {
	private Long id;
	private Date startTime;//业务账号登录服务器时间、计费开始时间
	private Date endTime;//业务账号登录服务器时间、计费结束时间
	private BusaccountBean busaccount;//业务账号
	private String ip;//服务器ip地址
	private Long timeLength;//时长
	private Integer pid;
	
	public CountLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
