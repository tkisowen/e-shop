package com.manager.dao;

import com.manager.bean.Tusers;

public interface TusersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tusers record);

    int insertSelective(Tusers record);

    Tusers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tusers record);

    int updateByPrimaryKey(Tusers record);
}