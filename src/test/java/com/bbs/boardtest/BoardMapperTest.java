package com.bbs.boardtest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbs.mapper.BoardMapper;
import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper; 
	
//	@Test
	public void boardInsertTest() {
//		BoardDTO dto = new BoardDTO();
//		dto.setBno(1L); Long타입 넣는법
//		dto.setBtitle("테스트 제목4");
//		dto.setBcontent("테스트 내용4");
//		dto.setBwriter("테스트 작성자4");
//		
//		boardMapper.insert(dto);
//		log.info("=================boardInsertTest 확인===================");
//		log.info(dto);
//		log.info("=================boardInsertTest 확인===================");

		
//		정보넣기
		for(int i = 1; i <= 1000 ;i++) {
			BoardDTO dto = new BoardDTO();
			
			dto.setBtitle(i+"번 제목입니다");
			dto.setBcontent(i+"번 내용입니다");
			dto.setBwriter(i+"번 작성자입니다");
			
			boardMapper.insert(dto);
		}
		

		
	}
	
	@Test
	public void boardSelectAllTest() {
		
		log.info("=================boardSelectAllTest 확인===================");
		boardMapper.list_all().forEach(board -> log.info(board));
		log.info("=================boardSelectAllTest 확인===================");
		
	}
	
	
	
//	@Test
	public void pagingTest() {
		Criteria cri = new Criteria();
		cri.setPageNum(10);
		cri.setAmount(10);
		List<BoardDTO> list = boardMapper.getListPaging(cri);
		list.forEach(i -> System.out.println(i));
	}
	
	
	
	
	
	
	
	
	
	
	
//	@Test
	public void boardDeleteTest() {
		
		boardMapper.delete(3L);
		
	}
	
//	@Test
	public void boardSelectTest() {
		
		BoardDTO dto = boardMapper.select(1004L);
		System.out.println(dto);
		
	}
	
	
//	@Test
	public void boardUpdateTest() {
		BoardDTO dto = new BoardDTO();
		dto.setBno(1003L); 
		dto.setBtitle("수정 제목");
		dto.setBcontent("수정 내용");
	
		boardMapper.update(dto);

		System.out.println(dto);
		
	}
	
	
	
	
	

}
