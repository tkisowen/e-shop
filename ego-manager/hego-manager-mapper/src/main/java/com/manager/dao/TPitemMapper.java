package com.manager.dao;

import com.manager.bean.TPitem;

public interface TPitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPitem record);

    int insertSelective(TPitem record);

    TPitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPitem record);

    int updateByPrimaryKeyWithBLOBs(TPitem record);

    int updateByPrimaryKey(TPitem record);
}