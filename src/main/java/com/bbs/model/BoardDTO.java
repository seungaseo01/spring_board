package com.bbs.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data //(getter,setter,tostring 다들어가 있고 필요한 경우 따로 지정할 수 있음)
public class BoardDTO {

	private Long bno; // 게시물이 많아질 수 있기때문에 롱으로 줌()
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Timestamp bregdate; // java.sql로 import


}
