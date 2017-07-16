package com.hua.library.dao;

import com.hua.library.entity.Tb_manager;

public interface Tb_managerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_manager record);

    int insertSelective(Tb_manager record);

    Tb_manager selectByPrimaryKey(Tb_manager manager);

    int updateByPrimaryKeySelective(Tb_manager record);

    int updateByPrimaryKey(Tb_manager record);
}