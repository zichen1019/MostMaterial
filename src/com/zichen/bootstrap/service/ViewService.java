package com.zichen.bootstrap.service;

import com.zichen.bootstrap.base.View;
import org.springframework.stereotype.Service;

@Service
public interface ViewService {

    View selectByPrimaryKey(String id);

    int insert(View record);

    int updateByPrimaryKey(View record);

    int deleteByPrimaryKey(String id);

    View selectByViewName(String viewName);
}
