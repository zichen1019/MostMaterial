package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(String annalid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}