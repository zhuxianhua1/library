package com.hua.library.dao;

import com.hua.library.entity.Tb_library;

public interface Tb_libraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_library record);

    int insertSelective(Tb_library record);

    Tb_library selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_library record);

    int updateByPrimaryKeyWithBLOBs(Tb_library record);

    int updateByPrimaryKey(Tb_library record);
}