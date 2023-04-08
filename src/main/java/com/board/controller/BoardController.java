package com.board.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.board.dto.BoardDTO;
import com.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
@RequestMapping("/list.do")
public ModelAndView  test( ModelAndView model)  {
	List<BoardDTO> list =null;
	list=service.listProcess();
	model.addObject("list",list);
	model.setViewName("board/list");
	return model;
	
	

}
@RequestMapping(value="/board/write.do",method=RequestMethod.GET)
public void getWrite() throws Exception{
	
	
}
}
