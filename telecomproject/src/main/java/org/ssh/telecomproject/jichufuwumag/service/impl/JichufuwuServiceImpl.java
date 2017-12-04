package org.ssh.telecomproject.jichufuwumag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.jichufuwumag.dao.IjichuwufuDao;
import org.ssh.telecomproject.jichufuwumag.service.IjichufuwuService;
@Service
public class JichufuwuServiceImpl implements IjichufuwuService{
	@Resource
	private IjichuwufuDao jihufuwuDaoImpl;
	@Override
	public AccountBean getAccountBean(AccountBean acount) {
		// TODO Auto-generated method stub
		return jihufuwuDaoImpl.getAccountBean(acount);
	}
	
}
