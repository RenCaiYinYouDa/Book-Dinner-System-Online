package com.rcyyd.bookdinner.persistence.impl;

import org.springframework.stereotype.Repository;

import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.persistence.CommentDao;

@Repository
public class CommentDaoImpl extends BaseDaoHibernateAdapter<Comment, Integer> implements CommentDao {

}
