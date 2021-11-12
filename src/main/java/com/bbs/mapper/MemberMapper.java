package com.bbs.mapper;

import java.util.List;

import com.bbs.model.MemberDTO;

public interface MemberMapper {
	public void insert(MemberDTO dto);
	public List<MemberDTO> list_all();
	public MemberDTO select(Long mno);
	public void update(MemberDTO dto);
	public void delete(Long mno);
}
