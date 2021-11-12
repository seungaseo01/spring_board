package com.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.mapper.BoardMapper;
import com.bbs.mapper.MemberMapper;
import com.bbs.model.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void insert(MemberDTO dto) {
		mapper.insert(dto);

	}

	@Override
	public List<MemberDTO> list_all() {
		
		return mapper.list_all();
	}

	@Override
	public MemberDTO select(Long mno) {
		return mapper.select(mno);
	}

	@Override
	public void update(MemberDTO dto) {
		mapper.update(dto);
		
	}

	@Override
	public void delete(Long mno) {
		mapper.delete(mno);
		
	}

}
