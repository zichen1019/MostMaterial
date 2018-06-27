package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String annalid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}