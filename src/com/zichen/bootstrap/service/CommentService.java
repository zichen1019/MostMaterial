package com.zichen.bootstrap.service;

import com.zichen.bootstrap.base.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    int deleteByPrimaryKey(String annalid);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectParentByHousingID(String housingId);

    List<Comment> selectByParentID(String parentId);

}
