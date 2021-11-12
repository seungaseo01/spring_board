package com.bbs.mapper;

import java.util.List;

import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;

public interface BoardMapper {

	public void insert(BoardDTO dto); //BoardDTO를 통채로 입력(하나하나 하는것이 아님)
	
	public void delete(Long bno);
	
	public List<BoardDTO> list_all(); //List => java.util import
	
	public List<BoardDTO> getListPaging(Criteria cri); //paging
	
	public int getTotal(); //전체게시물 구하기ㄴ
	
	public BoardDTO select(Long bno);
	
	public void update(BoardDTO dto);
}
