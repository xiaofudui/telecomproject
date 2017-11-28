package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;

public class OneosBean implements Serializable {

	/**
	 * 某一个业务
	 */
	private static final long serialVersionUID = -4603180770124160641L;
	
	private Integer id;
	private Date startTime;//开始使用的时间
	private Date outTime;//退出使用的时间
	private Long dateLength;//使用时间
	private Double price;//费用
	private String priceType;//支付类型
	private AllosBean allos;//某个用户开通的所有业务对象
	public OneosBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
