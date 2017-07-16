package com.hua.library.dao;

import com.hua.library.entity.Tb_bookcase;

public interface Tb_bookcaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_bookcase record);

    int insertSelective(Tb_bookcase record);

    Tb_bookcase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_bookcase record);

    int updateByPrimaryKey(Tb_bookcase record);
}