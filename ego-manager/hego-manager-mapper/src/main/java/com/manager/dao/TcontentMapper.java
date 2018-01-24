package com.manager.dao;

import com.manager.bean.Tcontent;

public interface TcontentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tcontent record);

    int insertSelective(Tcontent record);

    Tcontent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tcontent record);

    int updateByPrimaryKeyWithBLOBs(Tcontent record);

    int updateByPrimaryKey(Tcontent record);
}