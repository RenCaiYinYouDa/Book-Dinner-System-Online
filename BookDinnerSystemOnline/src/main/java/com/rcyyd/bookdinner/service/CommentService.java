package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.domain.PageModel;

public interface CommentService {
	List<Comment> getAllComment();
	PageModel<Comment> getCommentsByPage(int page, int size, int dishid);
	boolean saveComment(Comment comment);
}
