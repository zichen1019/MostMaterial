package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.User;

public interface UserMapper {
    int deleteByPrimaryKey(String annalid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User checkUser(String loginname);
}