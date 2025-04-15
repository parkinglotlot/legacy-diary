package com.legacydiary.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SearchDTO {

	private String writer;	
	private String searchTypes;	
	private String searchWord;	
	private String finished;	
	private String from;
	private String to;
}
