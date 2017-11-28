package org.ssh.telecomproject.usermag.service;

import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.pojos.PagerBean;

public interface IAccountService {

	/**
	 * 增加一个账务账号
	 * @param accountBean
	 */
	public void addAccount(AccountBean accountBean);
	
	/**
	 * 删除一个账务账号，只是把改变状态
	 * @param accountBean
	 */
	public void deleteAccount(AccountBean accountBean);
	
	/**
	 * 根据id查询账务账号
	 * @param id
	 */
	public AccountBean selectAccountById(Long id);
	
	/**
	 * 修改账务账号信息
	 * @param accountBean
	 */
	public void updateAccount(AccountBean accountBean);
	
	/**
	 * 分页查询账务账号
	 * @param pagerBean
	 * @return
	 */
	public PagerBean selectAccountpage(PagerBean pagerBean);
	
}
