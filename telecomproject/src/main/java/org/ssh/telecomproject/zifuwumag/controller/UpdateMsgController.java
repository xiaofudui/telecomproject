package org.ssh.telecomproject.zifuwumag.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.zifuwumag.service.IZifuwuService;
@RestController
@RequestMapping("/userMsg")
public class UpdateMsgController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Resource
	private IZifuwuService zifuwuServiceImpl;
	private AccountBean ab;
	
	@RequestMapping(value="/getMsg",method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public AccountBean getAccountBean(AccountBean account) {
		System.out.println("进来了");
		account.setId(1L);
		account = zifuwuServiceImpl.getAccountByUserName(account);
		/*System.out.println(account.getAccountName());*/
		ab = account;
		System.out.println("出去了");
		return account;
	}
	@RequestMapping(value="/updateMsg",method=RequestMethod.PUT,produces= {"application/json;charset=utf-8"})
	public void updateAccountBean(AccountBean account) {
		System.out.println("进来了");
		ab.setUserPwd(account.getUserPwd());
		ab.setTelephone(account.getTelephone());
		zifuwuServiceImpl.updateAccountById(ab);
		/*System.out.println(account.getAccountName());*/
		System.out.println("出去了");
	}
}
