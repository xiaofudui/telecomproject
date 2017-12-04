package org.ssh.telecomproject.zifuwumag.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.ssh.telecomproject.BaseDao;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.beans.AllaccountBean;
import org.ssh.telecomproject.pojos.PagerBean;
import org.ssh.telecomproject.zifuwumag.dao.IZifuwuDao;
@Repository
public class ZifuwuDaoImpl extends BaseDao implements IZifuwuDao {

	@Override
	public AccountBean getAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		System.out.println(account.getId());
		AccountBean ab = (AccountBean)getSession().get(AccountBean.class, account.getId());
		System.out.println("出来了");
		System.out.println(ab);
		return ab;
	}

	@Override
	public void updateAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		getSession().update(account);
	}

	@Override
	public PagerBean findAllaccountBean(PagerBean pagerBean) {
		// TODO Auto-generated method stub
		String hql = "select count(al.id) from AllaccountBean as al left join al.account as ac where ac.id = :id";
		Query query = getSession().createQuery(hql);// 这行代码，除了创建一个Query接口实例以外，例外一个作用就是预编译上面的HQL语句
		/*query.setInteger("id", Integer.valueOf(String.valueOf(account.getId())));
		List<AllaccountBean> list = query.list();*/
		query.setInteger("id",Integer.valueOf(String.valueOf(pagerBean.getParams().get("id"))));//
		Long rows = (Long) query.uniqueResult();
		pagerBean.setTotal(Integer.valueOf(String.valueOf(rows)));
		hql = "from AllaccountBean as al left join fetch al.account as ac where ac.id = :id";
		query = getSession().createQuery(hql);
		query.setInteger("id",Integer.valueOf(String.valueOf(pagerBean.getParams().get("id"))));//
		query.setFirstResult(pagerBean.getIndex());
		query.setMaxResults(pagerBean.getNums());
		List<?> list = query.list();
		pagerBean.setRows(list);
		return pagerBean;
	}

	@Override
	public AllaccountBean getAllaccountBeanByMonth(int id, int month) {
		// TODO Auto-generated method stub
		String hql = "from AllaccountBean as al left join fetch al.account as ac where ac.id = :id and al.month = :month";
		Query query = getSession().createQuery(hql);
		query.setInteger("id", id);
		query.setInteger("month", month);
		AllaccountBean allaccount = (AllaccountBean) query.list().get(0);
		return allaccount;
	}

	@Override
	public List<?> getAllosBeanByMonth(int id, int accountid) {
		// TODO Auto-generated method stub
		String hql = "from OneosBean as o join fetch o.allos as alo join fetch alo.allaccount as al join fetch al.account as ac where ac.id = :id and al.id = :accountid";
		Query query = getSession().createQuery(hql);
		query.setInteger("id", id);
		query.setInteger("accountid", accountid);
		List<?> list = query.list();
		return list;
	}

}
