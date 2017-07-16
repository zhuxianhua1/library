package com.hua.library.dao;

import com.hua.library.entity.Tb_parameter;

public interface Tb_parameterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_parameter record);

    int insertSelective(Tb_parameter record);

    Tb_parameter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_parameter record);

    int updateByPrimaryKey(Tb_parameter record);
}