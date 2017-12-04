package org.ssh.telecomproject.jichufuwumag.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.ssh.telecomproject.BaseDao;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.jichufuwumag.dao.IjichuwufuDao;
@Repository
public class JihufuwuDaoImpl extends BaseDao implements IjichuwufuDao {

	@Override
	public AccountBean getAccountBean(AccountBean acount) {
		// TODO Auto-generated method stub
		String hql = "from AccountBean as a where a.userName = :userName and a.userPwd = :userPwd";
		Query query = getSession().createQuery(hql);
		query.setString("userName", acount.getUserName());
		query.setString("userPwd", acount.getUserPwd());
		AccountBean account = (AccountBean) query.list().get(0);
		return account;
	}

}
