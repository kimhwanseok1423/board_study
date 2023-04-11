package com.board.service;

import java.util.List;



import com.board.dto.BoardDTO;
import com.board.dto.PageDTO;

public interface BoardService {
	public int countProcess();
public List<BoardDTO> listProcess(PageDTO pv);

}
