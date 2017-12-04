package org.ssh.telecomproject.jichufuwumag.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.jichufuwumag.service.IjichufuwuService;
@Controller
@RequestMapping("/login")
public class LoginController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Resource
	private IjichufuwuService jichufuwuServiceImpl;
	
	
	@RequestMapping(value="/check")//路径就是"/sysmag/login"    --mapping--   LoginController.login()
	public String login(String userName,String userPwd) {
		
		System.out.println(userName);
		System.out.println(userPwd);
		//查询后台得到User
		AccountBean account = new AccountBean();
		account.setUserName(userName);
		account.setUserPwd(userPwd);
		account = jichufuwuServiceImpl.getAccountBean(account);
		if(account!=null) {
			System.out.println("========");
			return "redirect:http://127.0.0.1:8080/telecomproject/jsp/index.jsp";
			
		}else {
			return "";
		}

	}
}
