package org.ssh.telecomproject.zifuwumag.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.beans.AllaccountBean;
import org.ssh.telecomproject.pojos.PagerBean;
import org.ssh.telecomproject.zifuwumag.service.IZifuwuService;

@RestController
@RequestMapping("/account")
public class CheckAccountController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Resource
	private IZifuwuService zifuwuServiceImpl;
	
	@RequestMapping(value="/getFee",method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public PagerBean getAllaccountBean(int page,int row,int id) {
		/*account.setId(1L);*/
		Map params = new HashMap();
		params.put("id", id);
		PagerBean pagerBean = new PagerBean(page, row, params);
		try {
			pagerBean = zifuwuServiceImpl.findAllaccountBean(pagerBean);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return pagerBean;
	}
	
	@RequestMapping(value="/getFeeByMonth",method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public AllaccountBean getAllaccountBeanByMonth(int id,int month) {
		AllaccountBean allaccount = zifuwuServiceImpl.getAllaccountBeanByMonth(id, month);
		return allaccount;
	}
}
