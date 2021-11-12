package com.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.mapper.BoardMapper;
import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;

@Service //BoardService여기에서 할거야!
//@AllArgsConstructor //모든생성자를 자동으로 잡아줌
public class BoardServiceImpl implements BoardService {

	@Autowired 
	private BoardMapper mapper; // 최종목적지
	
	@Override
	public void insert(BoardDTO dto) {		
		mapper.insert(dto);

	}

	@Override
	public void delete(Long bno) {
		mapper.delete(bno);
		
	}

	@Override
	public List<BoardDTO> list_all() {				
		return mapper.list_all();
	}


	@Override
	public BoardDTO select(Long bno) {
		return mapper.select(bno);
	}

	@Override
	public void update(BoardDTO dto) {
		mapper.update(dto);
		
	}

	@Override
	public List<BoardDTO> getListPaging(Criteria cri) {
		return mapper.getListPaging(cri);
	}

	@Override
	public int getTotal() {
		return mapper.getTotal();
	}





}
