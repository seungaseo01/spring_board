package com.bbs.mapper;

import java.util.List;

import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;

public interface BoardMapper {

	public void insert(BoardDTO dto); //BoardDTO�� ��ä�� �Է�(�ϳ��ϳ� �ϴ°��� �ƴ�)
	
	public void delete(Long bno);
	
	public List<BoardDTO> list_all(); //List => java.util import
	
	public List<BoardDTO> getListPaging(Criteria cri); //paging
	
	public int getTotal(); //��ü�Խù� ���ϱ⤤
	
	public BoardDTO select(Long bno);
	
	public void update(BoardDTO dto);
}
