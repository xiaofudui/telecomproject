package org.ssh.telecomproject.usermag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.pojos.PagerBean;
import org.ssh.telecomproject.usermag.dao.IAccountDao;
import org.ssh.telecomproject.usermag.service.IAccountService;
@Service
public class AccountServiceImpl implements IAccountService {
	
	@Resource
	private IAccountDao accountDaoImpl;
	
	@Override
	public void addAccount(AccountBean accountBean) {
		// TODO Auto-generated method stub
		accountDaoImpl.addAccount(accountBean);
	}

	@Override
	public void deleteAccount(AccountBean accountBean) {
		// TODO Auto-generated method stub
		accountDaoImpl.deleteAccount(accountBean);
	}

	@Override
	public AccountBean selectAccountById(Long id) {
		// TODO Auto-generated method stub
		return accountDaoImpl.selectAccountById(id);
	}

	@Override
	public void updateAccount(AccountBean accountBean) {
		// TODO Auto-generated method stub
		accountDaoImpl.updateAccount(accountBean);
	}

	@Override
	public PagerBean selectAccountpage(PagerBean pagerBean) {
		// TODO Auto-generated method stub
		return accountDaoImpl.selectAccountpage(pagerBean);
	}

}
