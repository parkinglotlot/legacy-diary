package com.legacydiary.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.legacydiary.domain.DiaryVO;
import com.legacydiary.mapper.DiaryMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class EmailReminderScheduler {
	
	private final DiaryMapper diaryMapper;
	
	public void reminderSchdule() {
		List<DiaryVO> list = diaryMapper.selectDiaryDueTomorrow();
		
		log.info("list : {}",list);
		
	}

}
