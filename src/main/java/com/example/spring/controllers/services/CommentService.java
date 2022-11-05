package com.example.spring.controllers.services;

import com.example.spring.repositories.models.Comment;
import com.example.spring.vo.CreateCommentRequest;

import java.util.List;
/**
 * use in Controller layer
 */
public interface CommentService {
    void createComment(CreateCommentRequest request, String userId, long postSeq) throws Exception;

    List<Comment> findCommentByUserId(String userId) throws Exception;

    void deleteComment(String userId, String commentId) throws Exception;
}
