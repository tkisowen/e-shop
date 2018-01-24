package com.manager.dao;

import com.manager.bean.Tdesc;

public interface TdescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(Tdesc record);

    int insertSelective(Tdesc record);

    Tdesc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(Tdesc record);

    int updateByPrimaryKeyWithBLOBs(Tdesc record);

    int updateByPrimaryKey(Tdesc record);
}