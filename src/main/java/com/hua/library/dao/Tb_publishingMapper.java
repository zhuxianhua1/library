package com.hua.library.dao;

import com.hua.library.entity.Tb_publishing;

public interface Tb_publishingMapper {
    int insert(Tb_publishing record);

    int insertSelective(Tb_publishing record);
}