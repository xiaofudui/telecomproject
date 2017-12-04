package org.ssh.telecomproject.jichufuwumag.dao;

import org.ssh.telecomproject.beans.AccountBean;

public interface IjichuwufuDao {
	/**
	 * 用户登录
	 * @param acount
	 * @return
	 */
	public AccountBean getAccountBean(AccountBean acount);
}
