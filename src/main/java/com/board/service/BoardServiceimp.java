package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;
@Service
public class BoardServiceimp implements BoardService{
@Autowired
	private BoardDAO dao;

	@Override
	public List<BoardDTO> listProcess() {
		
		return dao.list();
		
	}
	

}
