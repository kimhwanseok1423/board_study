package com.board.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.board.dto.BoardDTO;
import com.board.dto.PageDTO;
import com.board.service.BoardService;

@Controller
public class BoardController {
	
	
	@Autowired
	private PageDTO pdto;
	private int currentPage;
	@Autowired
	private BoardService service;
@RequestMapping("/list.do")
public ModelAndView  listMethod(PageDTO pv, ModelAndView mav)  {
	int totalRecord=service.countProcess();
	if(totalRecord >=1) {
		if(pv.getCurrentPage()==0) {
			this.currentPage=1;
		}else {
			this.currentPage=pv.getCurrentPage();
			
		}
		this.pdto=new PageDTO(this.currentPage,totalRecord);
		List<BoardDTO> aList=service.listProcess(this.pdto);
		mav.addObject("aList",aList);
		mav.addObject("pv", this.pdto);
		
	}
	mav.setViewName("board/list");	
	
	
	return mav;
	
	

}
@RequestMapping(value="/board/write.do",method=RequestMethod.GET)
public void getWrite() throws Exception{
	
	
}

}
