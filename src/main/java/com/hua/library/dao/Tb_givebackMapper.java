package com.hua.library.dao;

import com.hua.library.entity.Tb_giveback;

public interface Tb_givebackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_giveback record);

    int insertSelective(Tb_giveback record);

    Tb_giveback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_giveback record);

    int updateByPrimaryKey(Tb_giveback record);
}