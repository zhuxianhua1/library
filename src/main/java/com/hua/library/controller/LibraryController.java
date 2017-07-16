package com.hua.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hua.library.dao.Tb_managerMapper;
import com.hua.library.entity.Tb_manager;
import com.hua.library.service.LibraryService;

@Controller
public class LibraryController {
	@Autowired
	private Tb_managerMapper managerMapper;
	private static final String LOGIN = "login";
	private static final String USERINDEX = "index";
	private static Logger LOGGER = Logger.getLogger(LibraryService.class);
	
	@RequestMapping(value="/login.do")
	public String getLogin(){
		
		return LOGIN;
	}
	
	@RequestMapping(value="/index.do",method=RequestMethod.POST)
	public String showUser(String name,String pwd, HttpServletRequest request){
		Tb_manager obj = new Tb_manager();
		obj.setName(name);
		Tb_manager tb_manager = managerMapper.selectByPrimaryKey(obj);
		if(tb_manager==null || tb_manager.equals(null)){
			LOGGER.error("用户名不正确");
			request.setAttribute("errorName","用户名不正确");
			return LOGIN;
		}
		if(!pwd.equals(tb_manager.getPwd())){
			LOGGER.info("getLogin() pwd is Incorrect"); 
			LOGGER.error("密码不正确");
			request.setAttribute("errorPassword","密码不正确");
			return LOGIN;
			
		}else{
			LOGGER.info("getLogin() password is Correct");
			LOGGER.info("密码正确");
		}
		return USERINDEX;
	}
	
	
}
