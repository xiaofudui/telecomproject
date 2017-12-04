package org.ssh.telecomproject.zifuwumag.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ssh.telecomproject.zifuwumag.service.IZifuwuService;

@RestController
@RequestMapping("/os")
public class CheckOsDetailController {
	private Logger log = Logger.getLogger(this.getClass());
	@Resource
	private IZifuwuService zifuwuServiceImpl;
	@RequestMapping(value="/getOsDetail",method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public List<?> getOneosBean(int id,int accountid){
		List<?> list = zifuwuServiceImpl.getAllosBeanByMonth(id, accountid);
		/*System.out.println(list.get(0));*/
		return list;
	}
}
