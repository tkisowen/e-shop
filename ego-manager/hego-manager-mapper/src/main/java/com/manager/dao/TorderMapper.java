package com.manager.dao;

import com.manager.bean.Torder;

public interface TorderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Torder record);

    int insertSelective(Torder record);

    Torder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
}