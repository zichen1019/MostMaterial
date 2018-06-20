package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.View;

public interface ViewMapper {
    int deleteByPrimaryKey(String id);

    int insert(View record);

    int insertSelective(View record);

    View selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);

    View selectByViewName(String viewName);
}