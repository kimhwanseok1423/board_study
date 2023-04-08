package com.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.board.dto.BoardDTO;

@Mapper
@Repository
public interface BoardDAO {
public List<BoardDTO> list();

}
