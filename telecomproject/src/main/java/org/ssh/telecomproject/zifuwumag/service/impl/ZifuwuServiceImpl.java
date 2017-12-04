package org.ssh.telecomproject.zifuwumag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.beans.AllaccountBean;
import org.ssh.telecomproject.pojos.PagerBean;
import org.ssh.telecomproject.zifuwumag.dao.IZifuwuDao;
import org.ssh.telecomproject.zifuwumag.service.IZifuwuService;
@Service
public class ZifuwuServiceImpl implements IZifuwuService {
	@Resource
	private IZifuwuDao ZifuwuDaoImpl;

	@Override
	public AccountBean getAccountByUserName(AccountBean account) {
		// TODO Auto-generated method stub
		AccountBean ab = ZifuwuDaoImpl.getAccountById(account);
		System.out.println(ab.getAccountName());
		return ab;
	}

	@Override
	public void updateAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		ZifuwuDaoImpl.updateAccountById(account);
	}

	@Override
	public PagerBean findAllaccountBean(PagerBean pagerBean) {
		// TODO Auto-generated method stub
		return ZifuwuDaoImpl.findAllaccountBean(pagerBean);
	}

	@Override
	public AllaccountBean getAllaccountBeanByMonth(int id, int month) {
		// TODO Auto-generated method stub
		return ZifuwuDaoImpl.getAllaccountBeanByMonth(id, month);
	}

	@Override
	public List<?> getAllosBeanByMonth(int id, int accountid) {
		// TODO Auto-generated method stub
		return ZifuwuDaoImpl.getAllosBeanByMonth(id, accountid);
	}

}
