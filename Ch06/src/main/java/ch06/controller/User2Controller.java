package ch06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch06.dto.User2DTO;

public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	@GetMapping("/user2/register")
	public String register() {
		return "/user2/register";
	}
	
	@PostMapping("user2/register")
	public String register(User2DTO dto) {
			service.insertUser1();
			return "redirect:/user2/list";
	}
	
	@GetMapping
	public String list(Model model) {
		
	}
	
	@GetMapping
	public String modify() {
		
	}
	
	@GetMapping
	public String modify() {
		
	}
	
	@GetMapping
	public String delete() {
		
	}
	
}
