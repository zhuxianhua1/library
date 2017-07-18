package com.hua.library.dao;

import java.util.List;

import com.hua.library.entity.BookCorc;

public interface BookInfoDao {
	List<BookCorc> selectBookInfo(BookCorc bookcorc);
}
