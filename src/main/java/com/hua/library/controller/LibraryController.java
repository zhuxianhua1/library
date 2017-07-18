package com.hua.library.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hua.library.dao.BookInfoDao;
import com.hua.library.dao.Tb_managerMapper;
import com.hua.library.entity.BookCorc;
import com.hua.library.entity.Tb_manager;
import com.hua.library.service.LibraryService;
import com.hua.library.service.impl.LirbraryServiceImpl;

@Controller
public class LibraryController {
	@Autowired
	private Tb_managerMapper managerMapper;
	@Autowired
	private LibraryService libraryService;
	private static final String LOGIN = "login";
	private static final String MAIN = "main";
	private static Logger LOGGER = Logger.getLogger(LibraryService.class);
	
	@RequestMapping(value="/login.do")
	public String getLogin(){
		
		return LOGIN;
	}
	
	@RequestMapping(value="/main.do",method=RequestMethod.POST)
	public String showUser(String name,String password, HttpServletRequest request){
		Tb_manager obj = new Tb_manager();
		obj.setName(name);
		Tb_manager tb_manager = managerMapper.selectByPrimaryKey(obj);
		
		
		if(tb_manager==null || tb_manager.equals(null)){
			LOGGER.error("用户名不正确");
			request.setAttribute("errorMsg","用户名不正确");
			return LOGIN;
		}
		if(!password.equals(tb_manager.getPwd())){
			LOGGER.info("getLogin() pwd is Incorrect"); 
			LOGGER.error("密码不正确");
			request.setAttribute("errorMsg","密码不正确");
			return LOGIN;
			
		}else{
			LOGGER.info("getLogin() password is Correct");
			LOGGER.info("密码正确");
		}
		BookCorc objs = new BookCorc();
		List<BookCorc> list = libraryService.getBookinfo(objs);
		for (BookCorc bookCorc : list) {
			System.out.println(bookCorc.toString());
		}
		request.setAttribute("listbookinfo",list);
		System.out.println(list.get(0).getBarcode());
		return MAIN;
	
	}
	
}
