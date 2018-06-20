package com.zichen.bootstrap.service.impl;

import com.zichen.bootstrap.base.View;
import com.zichen.bootstrap.mapper.ViewMapper;
import com.zichen.bootstrap.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewServiceImpl implements ViewService{

    @Autowired
    private ViewMapper viewMapper;

    @Override
    public View selectByPrimaryKey(String id) {
        return viewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(View record) {
        return viewMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(View record) {
        return viewMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return deleteByPrimaryKey(id);
    }

    @Override
    public View selectByViewName(String viewName) {
        return viewMapper.selectByViewName(viewName);
    }
}
