package com.zichen.bootstrap.service;

import com.zichen.bootstrap.base.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    int deleteByPrimaryKey(String annalid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User checkUser(User user);
}
