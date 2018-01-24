package com.manager.dao;

import com.manager.bean.Tcategory;

public interface TcategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tcategory record);

    int insertSelective(Tcategory record);

    Tcategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tcategory record);

    int updateByPrimaryKey(Tcategory record);
}