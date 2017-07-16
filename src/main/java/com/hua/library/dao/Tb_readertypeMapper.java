package com.hua.library.dao;

import com.hua.library.entity.Tb_readertype;

public interface Tb_readertypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_readertype record);

    int insertSelective(Tb_readertype record);

    Tb_readertype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_readertype record);

    int updateByPrimaryKey(Tb_readertype record);
}