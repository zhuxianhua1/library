package com.hua.library.dao;

import com.hua.library.entity.Tb_borrow;

public interface Tb_borrowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_borrow record);

    int insertSelective(Tb_borrow record);

    Tb_borrow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_borrow record);

    int updateByPrimaryKey(Tb_borrow record);
}