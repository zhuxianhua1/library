package com.hua.library.dao;

import com.hua.library.entity.Tb_bookinfo;

public interface Tb_bookinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_bookinfo record);

    int insertSelective(Tb_bookinfo record);

    Tb_bookinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_bookinfo record);

    int updateByPrimaryKey(Tb_bookinfo record);
}