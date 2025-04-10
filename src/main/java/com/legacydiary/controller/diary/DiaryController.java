package com.legacydiary.controller.diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/diary")
@Slf4j
public class DiaryController {

	@GetMapping("/register")
	public String registerForm() {
		
		return "/diary/register";
	}
	
}
