package com.zichen.bootstrap.service.impl;

import com.zichen.bootstrap.base.User;
import com.zichen.bootstrap.mapper.UserMapper;
import com.zichen.bootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String annalid) {
        return userMapper.deleteByPrimaryKey(annalid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String annalid) {
        return userMapper.selectByPrimaryKey(annalid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User checkUser(User user) {
        if(user.getLoginname() != null && user.getLoginpssd() != null){
            user = userMapper.checkUser(user.getLoginname());
        }
        return user;
    }
}
