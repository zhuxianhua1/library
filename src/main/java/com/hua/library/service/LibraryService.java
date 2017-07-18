package com.hua.library.service;

import java.util.List;

import com.hua.library.entity.BookCorc;
import com.hua.library.entity.Tb_manager;

public interface LibraryService {
	public String obtionGetname(Integer id);
	public Tb_manager getUserPaw(Tb_manager manager);
	public List<BookCorc> getBookinfo(BookCorc bookcorc);
}
