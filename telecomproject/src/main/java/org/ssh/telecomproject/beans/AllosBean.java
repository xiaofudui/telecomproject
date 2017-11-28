package org.ssh.telecomproject.beans;

import java.io.Serializable;
import java.util.Set;

public class AllosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 494320506878175084L;
	private Long id;
	private BusaccountBean busaccount;//业务账号
	private	String ipcomment;//服务器信息
	private Long timelength;//月时长
	private Double price;//费用
	private Integer pricetype;//资费类型
	private AllaccountBean allaccount;//所有账户账号某月的支付类
	private Set<OneosBean> oneoss;
	public AllosBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}	
