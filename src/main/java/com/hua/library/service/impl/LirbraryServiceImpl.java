package com.hua.library.service.impl;

import java.util.List;

import javax.xml.ws.WebServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.library.dao.BookInfoDao;
import com.hua.library.dao.Tb_bookcaseMapper;
import com.hua.library.dao.Tb_managerMapper;
import com.hua.library.entity.BookCorc;
import com.hua.library.entity.Tb_manager;
import com.hua.library.service.LibraryService;

@Service("libraryService")
public class LirbraryServiceImpl implements LibraryService {
	
	@Autowired
	private Tb_bookcaseMapper bookcaseMapper;
	@Autowired
	private Tb_managerMapper managerMapper;
	@Autowired
	private BookInfoDao bookinfodao;
	
	@Override
	public String obtionGetname(Integer id) {
		String str = bookcaseMapper.selectByPrimaryKey(id).getName();
		return str;
	}

	@Override
	public Tb_manager getUserPaw(Tb_manager manager) {
		Tb_manager list = managerMapper.selectByPrimaryKey(manager);
		
		return list;
	}

	@Override
	public List<BookCorc> getBookinfo(BookCorc bookcorc) {
		List<BookCorc> list = bookinfodao.selectBookInfo(bookcorc);
		return list;
	}

	
	
}
