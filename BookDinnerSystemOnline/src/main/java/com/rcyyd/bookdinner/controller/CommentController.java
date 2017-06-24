package com.rcyyd.bookdinner.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rcyyd.bookdinner.domain.Cart;
import com.rcyyd.bookdinner.domain.Comment;
import com.rcyyd.bookdinner.domain.PageModel;
import com.rcyyd.bookdinner.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;

	@GetMapping("showComments")
	public String toShowComments(Integer page, Integer size, Integer dishid, Model model){
		if (page == null){
			page = 1;
		}
		if (size == null){
			size = 10;
		}
		PageModel<Comment> pm = commentService.getCommentsByPage(page, size, dishid);
		model.addAttribute("commentList", pm.getDataList());
		model.addAttribute("commentCurrentPage", pm.getCurrentPage());
		model.addAttribute("commentTotalPage", pm.getTotalPage());
		return "details";
	}

}
