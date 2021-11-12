package com.bbs.service;

import java.util.List;

import com.bbs.model.MemberDTO;

public interface MemberService {
	public void insert(MemberDTO dto);
	public List<MemberDTO> list_all();
	public MemberDTO select(Long mno);
	public void update(MemberDTO dto);
	public void delete(Long mno);
}
