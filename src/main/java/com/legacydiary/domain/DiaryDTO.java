package com.legacydiary.domain;



import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DiaryDTO {

	private int dno;
	private String title;
	private String dueDateStr; //나중에 vo에서는 localdate타입으로 변환
	private String writer;
	private boolean finished;
	
	public LocalDate getDueDate() {
		return LocalDate.parse(dueDateStr);
	}
	
}
