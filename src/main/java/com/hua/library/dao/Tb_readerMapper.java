package com.hua.library.dao;

import com.hua.library.entity.Tb_reader;

public interface Tb_readerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_reader record);

    int insertSelective(Tb_reader record);

    Tb_reader selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_reader record);

    int updateByPrimaryKeyWithBLOBs(Tb_reader record);

    int updateByPrimaryKey(Tb_reader record);
}