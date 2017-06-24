package com.rcyyd.bookdinner.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.persistence.CommentDao;
import com.rcyyd.bookdinner.service.CommentService;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDao commentDao;

	@Override
	public List<Comment> getAllComment() {
		return commentDao.findAll();
	}

	@Override
	public PageModel<Comment> getCommentsByPage(int page, int size, int dishid) {
		PageModel<Comment> pm = commentDao.findByPageDish(page, size, dishid);
		return pm;
	}

	@Override
	public boolean saveComment(Comment comment) {
		commentDao.save(comment);
		return true;
	}
}
