package com.legacydiary.controller.diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.legacydiary.domain.DiaryDTO;
import com.legacydiary.domain.DiaryVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/diary")
@Slf4j
public class DiaryController {

	@GetMapping("/register")
	public String registerForm() {
		
		return "/diary/register";
	}
	
	@PostMapping("/register")
	public void register(DiaryDTO diaryDTO) {
		
		log.info("diaryDTO : {}", diaryDTO);
		
		// 서비스에 넘길 VO 객체 생성
		DiaryVO diaryVO = DiaryVO.builder()
				.title(diaryDTO.getTitle())
				.dueDate(diaryDTO.getDueDate())
				.writer(diaryDTO.getWriter())
				.finished(diaryDTO.isFinished())
				.build();
		
		
		
		
	}
	
}
