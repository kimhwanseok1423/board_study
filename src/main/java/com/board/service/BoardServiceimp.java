package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;
import com.board.dto.PageDTO;
@Service
public class BoardServiceimp implements BoardService{
@Autowired
	private BoardDAO dao;

	@Override
	public List<BoardDTO> listProcess(PageDTO pv) {
		
		return dao.list(pv);
		
	}

	
	
	
	@Override
	public int countProcess() {
		// TODO Auto-generated method stub
		return dao.count();
	}




	




}
