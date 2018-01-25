package com.manager.dao;

import java.util.List;

import com.manager.bean.Titem;

public interface TitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Titem record);

    int insertSelective(Titem record);

    Titem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Titem record);

    int updateByPrimaryKey(Titem record);

	List<Titem> getItemList();
}