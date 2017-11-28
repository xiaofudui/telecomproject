package org.ssh.telecomproject.beans;

import java.util.Date;


/**
 * 操作日志
 * @author 😘
 *
 */
public class OperationlogBean {
	
	private Long id;//操作日志id
	private Integer operationType;//操作类型
	private String patam;//方法参数
	private String method;//方法名
	private Date dateTime;//操作时间
	private String classPath;//方法属于哪个类
	private AccountBean account;//账务账号ID
	private AdminBean admin;//管理员ID	
	private Integer pid;//逻辑事务
	private String resultType;//返回结果类型
	
	public OperationlogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
