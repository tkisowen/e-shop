package com.manager.dao;

import com.manager.bean.TOitem;

public interface TOitemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TOitem record);

    int insertSelective(TOitem record);

    TOitem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TOitem record);

    int updateByPrimaryKey(TOitem record);
}