package com.hua.library.dao;

import com.hua.library.entity.Tb_booktype;

public interface Tb_booktypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_booktype record);

    int insertSelective(Tb_booktype record);

    Tb_booktype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_booktype record);

    int updateByPrimaryKey(Tb_booktype record);
}