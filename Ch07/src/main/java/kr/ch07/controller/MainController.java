package kr.ch07.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ch07.dto.User1DTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {
	
	@GetMapping(value = {"/", "/index"})
	public String index(Model model) {
		
		String str1 = "스프링부트";
		String str2 = "타임리프";
		
		// 생성자를 이용한 초기화
		User1DTO user1 = new User1DTO("A102", "김춘추", "010-1234-5678", 23);
		
		// Setter를 이용한 초기화
		User1DTO user2 = new User1DTO();
		user1.setUid("A101");
		user1.setName("김유신");
		user1.setHp("010-1234-5678");
		user1.setAge(25);
		
		// Builder를 이용한 초기화 
	    User1DTO user3 = User1DTO.builder()
	    					.uid("A103")
	    					.name("김유신")
	    					.hp("010-1234-5678")
	    					.age(25)
	    					.build();
	    User1DTO user4 = null;
	    
	    // List
	    List<User1DTO> users = new ArrayList<>();
	    users.add(new User1DTO("A101", "김유신", "010-1111-1001", 25));
	    users.add(new User1DTO("A102", "김춘추", "010-1254-1002", 25));
	    users.add(new User1DTO("A103", "장보고", "010-1235-1003", 25));
	    users.add(new User1DTO("A104", "강감찬", "010-8784-1004", 25));
	    users.add(new User1DTO("A105", "이순신", "010-9562-1005", 25));
		
		model.addAttribute("str1", str1);
		model.addAttribute("str2", str2);
		model.addAttribute("user1", user1);
		model.addAttribute("user2", user2);
		model.addAttribute("user3", user3);
		model.addAttribute("user4", user4);
		
		log.debug(user1.toString());
		log.debug(user2.toString());
		log.debug(user3.toString());
		
		
		return "/index";
	}
	
	@GetMapping("/include")
	public String include(String name, int age) {
		
		log.info("name : " + name);
		log.info("age : " + age);
		
		return "/include";
	}
	
	@GetMapping("/layout")
	public String layout() {
		return "/layout";
	}
}
