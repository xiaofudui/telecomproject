package org.ssh.telecomproject.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_operation")
public class OperationBean implements Serializable {

	/**
	 * 操作对象（该对象包括了不同的操作）
	 */
	private static final long serialVersionUID = 5451880821604556651L;
	@Id
	@GenericGenerator(name = "hibernate.identity", strategy = "identity")
	@GeneratedValue(generator = "hibernate.identity")
	private Integer id;
	
	@Column(name = "operation_name",length = 20)
	private String OperationName;//该操作的名称
	
	public OperationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperationName() {
		return OperationName;
	}

	public void setOperationName(String operationName) {
		OperationName = operationName;
	}
	
}
