package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(String annalid);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}