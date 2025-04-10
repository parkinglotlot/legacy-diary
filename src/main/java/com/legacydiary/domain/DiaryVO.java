package com.legacydiary.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DiaryVO {

	private int dno;
	private String title;
	private LocalDate dueDate; //나중에 vo에서는 localdate타입으로 변환
	private String writer;
	private boolean finished;
}
