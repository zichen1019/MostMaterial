package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.Comment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(String annalid);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectByHousingID(String housingId);

    List<Comment> selectParentByHousingID(String housingId);

    List<Comment> selectByParentID(String parentId);
}