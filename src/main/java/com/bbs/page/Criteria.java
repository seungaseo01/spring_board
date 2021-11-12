package com.bbs.page;

public class Criteria {

	private int pageNum; //현재페이지
	private int amount; //한페이지당 보여줄 갯수
	private int skip; //뺄수
	
	
	public Criteria() {
		this(1,10); //한페이지당 10개
		this.skip = 0;//처음페이지에는 처음부터 보여줌
	}


	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.skip = (pageNum-1) * amount;
	}


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.skip = (pageNum-1) * this.amount;
		this.pageNum = pageNum;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.skip = (pageNum-1) * amount;
		this.amount = amount;
	}


	public int getSkip() {
		return skip;
	}


	public void setSkip(int skip) {
		this.skip = skip;
	}


	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", skip=" + skip + "]";
	}



	
	
	
	
	
	
}
