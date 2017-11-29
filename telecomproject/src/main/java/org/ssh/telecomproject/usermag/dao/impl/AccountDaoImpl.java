package org.ssh.telecomproject.usermag.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.ssh.telecomproject.BaseDao;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.pojos.PagerBean;
import org.ssh.telecomproject.usermag.dao.IAccountDao;
@Repository
public class AccountDaoImpl extends BaseDao implements IAccountDao {

	@Override
	public void addAccount(AccountBean accountBean) {
		// TODO Auto-generated method stub
		getSession().save(accountBean);
	}

	@Override
	public void deleteAccount(AccountBean accountBean) {
		// TODO Auto-generated method stub
		getSession().update(accountBean);
	}

	@Override
	public AccountBean selectAccountById(Long id) {
		// TODO Auto-generated method stub
		return (AccountBean) getSession().get(AccountBean.class, id);
	}

	@Override
	public void updateAccount(AccountBean accountBean) {
		// TODO Auto-generated method stub
		getSession().update(accountBean);
	}

	@Override
	public PagerBean selectAccountpage(PagerBean pagerBean) {
		// TODO Auto-generated method stub
		String hql = "select count(a.id) from AccountBean as a where a.accountName like CONCAT(:accountName,'%')";
		Query query = getSession().createQuery(hql);
		query.setProperties(pagerBean.getParams());
		Long ro = (Long) query.uniqueResult();
		pagerBean.setTotal(Integer.valueOf(String.valueOf(ro)));
		hql="from AccountBean as a where a.accountName like CONCAT(:accountName,'%')";
		query = getSession().createQuery(hql);
		query.setProperties(pagerBean.getParams());
		query.setFirstResult(pagerBean.getIndex());
		query.setMaxResults(pagerBean.getNums());
		List<?> list = query.list();
		pagerBean.setRows(list);
		return pagerBean;
	}

}
