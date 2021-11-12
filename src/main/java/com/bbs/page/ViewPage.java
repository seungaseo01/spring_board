package com.bbs.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 생성자는 따로 짜주기위해서
public class ViewPage {

	private int startPage; //시작 페이지
	private int endPage; //끝 페이지
	private boolean prev; //이전버튼
	private boolean next; //다음버튼
	private int total; //전체게시물수 (페이지수를 구하기 위해서)
	private Criteria cri; //페이지를 구하기 위해서
	
	
	public ViewPage(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0)) * 10; // 마지막에 곱해주는 수가 endPage
		this.startPage = this.endPage - 9;
		
		int realEnd = (int)(Math.ceil(total * 1.0/cri.getAmount())); //최종값
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1; //2번째 페이지 단에서부터 보여자 하기 때문
		this.next = this.endPage < realEnd; //끝페이지에서는 다음버튼이 필요없기 때문
	}
	
	
	
	
}
