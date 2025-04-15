package com.legacydiary.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.legacydiary.domain.User;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
@Slf4j
public class UserMapperTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testInsertIser() {
		User user = User.builder()
				.username("park")
				.email("ujin2597.u@gmail.com")
				.state("ACTIVE")
				.build();
		log.info("user : {}",user);
		
		userMapper.insertUser(user);
		
		log.info("저장된 id : {}", user.getId());
	}
	
	@Test
	public void testSearchByUsername() {
		
		List<User> list = userMapper.searchUser("username", "jina");
		log.info("list :{}",list);
		
	}
	
	@Test
	public void testSearchByUserEmail() {
		
		List<User> list = userMapper.searchUser("email", "jina_1226@naver.com");
		log.info("list :{}",list);
		
	}
}
