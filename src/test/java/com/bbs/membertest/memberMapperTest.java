package com.bbs.membertest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbs.mapper.BoardMapper;
import com.bbs.mapper.MemberMapper;
import com.bbs.model.BoardDTO;
import com.bbs.model.MemberDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class memberMapperTest {
	
	@Autowired
	private MemberMapper memberMapper; 
	
//	@Test
	public void memberInsertTest() {
//		MemberDTO dto = new MemberDTO();

//		dto.setMname("testname");
//		dto.setMtel("1234567");
//		dto.setMaddr("대구");
//		dto.setMgender("여성");
//		
//		memberMapper.insert(dto);
//		System.out.println(dto);
		


	}
	
//	@Test
	public void memberSelectAllTest() {
		
		log.info("=================boardSelectAllTest 확인===================");
		memberMapper.list_all().forEach(member -> log.info(member));
		log.info("=================boardSelectAllTest 확인===================");
		
	}
	
//	@Test
	public void memberDeleteTest() {
		
		memberMapper.delete(1002L);
		
	}
	
//	@Test
	public void memberSelectTest() {
		
		MemberDTO dto = memberMapper.select(1001L);
		System.out.println(dto);
		
	}
	
	
	@Test
	public void memberUpdateTest() {
		MemberDTO dto = new MemberDTO();
		dto.setMno(995L);
		dto.setMname("수정 이름"); 
		dto.setMtel("수정번호");
		dto.setMaddr("수정주소");
		dto.setMage(32);
		dto.setMgender("여성");
	
		memberMapper.update(dto);

		System.out.println(dto);
		
	}
	
	
	
	

}
