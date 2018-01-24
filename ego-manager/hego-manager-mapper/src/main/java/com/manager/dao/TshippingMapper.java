package com.manager.dao;

import com.manager.bean.Tshipping;

public interface TshippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Tshipping record);

    int insertSelective(Tshipping record);

    Tshipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Tshipping record);

    int updateByPrimaryKey(Tshipping record);
}