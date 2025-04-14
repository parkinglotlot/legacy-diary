package com.legacydiary.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.legacydiary.controller.SessionFactoryTest;
import com.legacydiary.domain.DiaryVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DiaryMapperTest {

	@Autowired
	private DiaryMapper diaryMapper;
	
//	@Test
//	public void selectNowTest() {
//		
//		
//		log.info(diaryMapper.selectNow());
//		
//	}
	
	@Test
	public void selectDiaryDueTomorrow() {
		// 내일 마감인 글 조회
		List<DiaryVO> list = diaryMapper.selectDiaryDueTomorrow();
		log.info("list : {}", list);
		
		// key : writer, 
		// value: 내일 마감인 글들
		Map<String, List<DiaryVO>> memberDiaryMap = new HashMap<>();
		
		for(DiaryVO vo : list) {
			
			if(!memberDiaryMap.containsKey(vo.getWriter())) {
				memberDiaryMap.put(vo.getWriter(), new ArrayList<DiaryVO>());
			}
				
				memberDiaryMap.get(vo.getWriter()).add(vo);			
			
			
		}
		
		for(Map.Entry<String,  List<DiaryVO>> entry : memberDiaryMap.entrySet()) {
			
			String memberId = entry.getKey();
			log.info("writer : {}",memberId);
			log.info("list : {}",entry.getKey());
				}
		
		
	}
}
