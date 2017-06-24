package com.rcyyd.bookdinner.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@PostMapping("publishComments")
	public String toPublishComments(String commentstr, Integer userid, Integer dishid, RedirectAttributes attr){
		Comment comment = new Comment();
		comment.setUserid(userid);
		comment.setDishid(dishid);
		comment.setDate(new Date());
		comment.setComment(commentstr);
		commentService.saveComment(comment);
		attr.addAttribute("dishid", dishid);
		return "redirect: showComments";
	}
}
