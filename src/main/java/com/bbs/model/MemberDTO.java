package com.bbs.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberDTO {
	private Long mno;
	private String mname;
	private String mtel;
	private String maddr;
	private int mage;
	private String mgender;
	private Timestamp mregdate;
}
