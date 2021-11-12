package com.bbs.service;

import java.util.List;

import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;



public interface BoardService {
	
	public void insert(BoardDTO dto);
	public void delete(Long bno);
	public List<BoardDTO> list_all();
	public List<BoardDTO> getListPaging(Criteria cri);
	public int getTotal();
	public BoardDTO select(Long bno);
	public void update(BoardDTO dto);
	
	
}
