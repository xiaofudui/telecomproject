package org.ssh.telecomproject.zifuwumag.service;

import java.util.List;

import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.beans.AllaccountBean;
import org.ssh.telecomproject.pojos.PagerBean;

public interface IZifuwuService {
	/**
	 *用户查看自己信息
	 * @param userName
	 * @return
	 */
	public AccountBean getAccountByUserName(AccountBean account);
	/**
	 * 用户修改信息
	 * @param userName
	 */
	public void updateAccountById(AccountBean account);
	/**
	 * 查看用户账单
	 * @param account
	 * @return
	 */
	public PagerBean findAllaccountBean(PagerBean pagerBean);
	/**
	 * 按月查询用户账单
	 * @param id
	 * @param month
	 * @return
	 */
	public AllaccountBean getAllaccountBeanByMonth(int id,int month);
	/**
	 * 查看具体某月的业务明细
	 * @param id
	 * @param month
	 * @return
	 */
	public List<?> getAllosBeanByMonth(int id,int accountid);
}
