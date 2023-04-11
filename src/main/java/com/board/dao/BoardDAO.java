package com.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.board.dto.BoardDTO;
import com.board.dto.PageDTO;

@Mapper
@Repository
public interface BoardDAO {
	public int count();
public List<BoardDTO> list(PageDTO pv);

}
