package com.manager.dao;

import com.manager.bean.Tparam;

public interface TparamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tparam record);

    int insertSelective(Tparam record);

    Tparam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tparam record);

    int updateByPrimaryKeyWithBLOBs(Tparam record);

    int updateByPrimaryKey(Tparam record);
}