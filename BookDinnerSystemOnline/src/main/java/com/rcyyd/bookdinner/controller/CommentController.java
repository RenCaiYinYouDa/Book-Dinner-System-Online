package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.service.CommentService;

public class CommentController {

	@Autowired
	private CommentService commentService;

	@RequestMapping(value = "/getComment", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public @ResponseBody Iterable<Comment> getDistrictContractStatisticsDatas(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return commentService.getAllComment();
	}

}
