package org.ssh.telecomproject.beans;

import java.io.Serializable;

public class OperationBean implements Serializable {

	/**
	 * 操作对象（该对象包括了不同的操作）
	 */
	private static final long serialVersionUID = 5451880821604556651L;
	
	private Integer id;
	private String OperationName;//该操作的名称
	
	public OperationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
