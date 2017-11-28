package org.ssh.telecomproject.beans;

import java.util.Date;
import java.util.Set;
/**
 * 资费表
 * @author 😘
 *
 */
public class PriceDataBean {
	
	private Long id;//资费表id
	private String priceName;//资费名称
	private Integer type;//资费类型
	private Double timeLength;//基本时长
	private Double basicMoney;//基本费用
	private Double hourMoney;//单位费用
	private Double comment;//资费说明
	private Integer state;//状态
	private Date stateChange;//开通状态时间
	private Integer pid;//逻辑事务
	private Set<BusaccountBean> busaccounts;
	public PriceDataBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
