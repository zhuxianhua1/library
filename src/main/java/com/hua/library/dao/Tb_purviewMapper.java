package com.hua.library.dao;

import com.hua.library.entity.Tb_purview;

public interface Tb_purviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_purview record);

    int insertSelective(Tb_purview record);

    Tb_purview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_purview record);

    int updateByPrimaryKey(Tb_purview record);
}