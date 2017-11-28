package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 业务账号表
 * @author Administrator
 *
 */
public class BusaccountBean implements Serializable{
	private Long id;
	private AccountBean account;//账务账号
	private PriceDataBean pricetype;//资费类型id	
	private String ip;//服务器ip
	private String businessAccount;//业务账号
	private String businessPwd;//业务账号密码
	private Integer state;//状态，0-开通，1-暂停
	private Date opentime;//开通业务账号时间
	private Integer pid;//0-正常，1-删除
	private Set<AllosBean> alloss;
	private Set<CountLogBean> countlogs;//---有问题，待思考

	public BusaccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
