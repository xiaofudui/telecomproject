package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Set;

public class AllaccountBean implements Serializable {

	/**
	 * 所有账户账号某月的支付 表
	 */
	private static final long serialVersionUID = 5866302824700504326L;
	private Long id;
	private String idcomment;//账务账号真实姓名
	private AccountBean account;//账务账号id
	private Double price;//月的总费用
	private Integer month; //月份
	private Integer paytype;//支付方式 0-现金，1-网银
	private Integer paystate;//支付状态 0-未支付，1-已支付，2-支付异常
	private Set<AllosBean> alloss;
	public AllaccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
