package com.bbs.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// �����ڴ� ���� ¥�ֱ����ؼ�
public class ViewPage {

	private int startPage; //���� ������
	private int endPage; //�� ������
	private boolean prev; //������ư
	private boolean next; //������ư
	private int total; //��ü�Խù��� (���������� ���ϱ� ���ؼ�)
	private Criteria cri; //�������� ���ϱ� ���ؼ�
	
	
	public ViewPage(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0)) * 10; // �������� �����ִ� ���� endPage
		this.startPage = this.endPage - 9;
		
		int realEnd = (int)(Math.ceil(total * 1.0/cri.getAmount())); //������
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1; //2��° ������ �ܿ������� ������ �ϱ� ����
		this.next = this.endPage < realEnd; //�������������� ������ư�� �ʿ���� ����
	}
	
	
	
	
}
