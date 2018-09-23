package com.zichen.bootstrap.service.impl;

import com.zichen.bootstrap.base.Comment;
import com.zichen.bootstrap.mapper.CommentMapper;
import com.zichen.bootstrap.mapper.UserMapper;
import com.zichen.bootstrap.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String annalid) {
        return commentMapper.deleteByPrimaryKey(annalid);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(String annalid) {
        return commentMapper.selectByPrimaryKey(annalid);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Comment> selectParentByHousingID(String annalid) {
        List<Comment> comments = commentMapper.selectParentByHousingID(annalid);
        for(Comment comment : comments){
            comment.setUser(userMapper.selectByPrimaryKey(comment.getAuthorid()));
        }
        return comments;
    }

    @Override
    public List<Comment> selectByParentID(String annalid) {
        List<Comment> comments = commentMapper.selectByParentID(annalid);
        for(Comment comment : comments){
            comment.setUser(userMapper.selectByPrimaryKey(comment.getAuthorid()));
        }
        return comments;
    }

}
