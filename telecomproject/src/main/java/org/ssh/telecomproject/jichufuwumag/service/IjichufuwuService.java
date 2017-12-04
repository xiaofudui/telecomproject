package org.ssh.telecomproject.jichufuwumag.service;

import org.ssh.telecomproject.beans.AccountBean;

public interface IjichufuwuService {
	
	/**
	 * 用户登录
	 * @param acount
	 * @return
	 */
	public AccountBean getAccountBean(AccountBean acount);
}
