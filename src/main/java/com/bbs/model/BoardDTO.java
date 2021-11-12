package com.bbs.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data //(getter,setter,tostring �ٵ� �ְ� �ʿ��� ��� ���� ������ �� ����)
public class BoardDTO {

	private Long bno; // �Խù��� ������ �� �ֱ⶧���� ������ ��()
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Timestamp bregdate; // java.sql�� import


}
