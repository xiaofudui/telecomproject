package org.ssh.telecomproject.usermag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.pojos.PagerBean;
import org.ssh.telecomproject.usermag.service.IAccountService;

@RestController
@RequestMapping("/login")
public class AccountController {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private IAccountService accountServiceImpl;
	
	
	/**
	 * 分页查询显示账户账号
	 * @param page
	 * @param row
	 * @param accountName
	 * @return
	 */
	@RequestMapping(value="/page",method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public PagerBean findallAccontBean(int page,int row,String accountName) {
		
		System.out.println(11111);
		
		
		System.out.println(page);
		System.out.println(row);
		System.out.println(accountName);
		Map params = new HashMap();
		params.put("accountName", accountName);
		
		PagerBean pagerBean = new PagerBean(page, row, params);
		
		try {
			pagerBean = accountServiceImpl.selectAccountpage(pagerBean);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(pagerBean);
		return pagerBean;
	}
	
	/**
	 * 增加一个账户账号
	 * @param accountBean
	 * @return
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST,produces= {"application/json;charset=utf-8"})
	public AccountBean insetAccontBean(AccountBean accountBean) {
		
		System.out.println(accountBean);
		accountBean.setPid(1);
		try {
			accountServiceImpl.addAccount(accountBean);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return accountBean;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE,produces= {"application/json;charset=utf-8"})
	public AccountBean deleteAccontBean(AccountBean accountBean) {
		
		System.out.println(accountBean);
		
		accountBean.setPid(0);
		try {
			accountServiceImpl.deleteAccount(accountBean);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return accountBean;
	}
	
}
