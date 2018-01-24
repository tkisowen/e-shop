package com.manager.dao;

import com.manager.bean.Tcat;

public interface TcatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tcat record);

    int insertSelective(Tcat record);

    Tcat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tcat record);

    int updateByPrimaryKey(Tcat record);
}