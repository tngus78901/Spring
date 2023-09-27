package kr.ch07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch07.service.User6service;
import kr.ch07.dto.User6DTO;



@Controller
public class User6Controller {
	
	@Autowired
	private User6service service;
	
	@GetMapping("/user6/register")
	public String register() {
		return "/user6/register";
	}
	
	@PostMapping("/user6/register")
	public String register(User6DTO dto) {
			service.insertUser6(dto);
			return "redirect:/user6/list";
	}
	
	@GetMapping("/user6/list")
	public String list(Model model) {
		
			List<User6DTO> users = service.selectUser6s();
			model.addAttribute("users", users);
			return "/user6/list";
		
	}
	
	@GetMapping("/user6/modify")
	public String modify(@RequestParam("uid") String uid, Model model) {
		
			User6DTO user = service.selectUser6(uid);
			model.addAttribute(user);
			
			return "/user6/modify";
	}
	
	@PostMapping("/user6/modify")
	public String modify(@ModelAttribute User6DTO dto) {
			service.updateUser6(dto);
			return "redirect:/user/list";
		
	}
	
	@GetMapping("/user6/delete")
	public String delete(String uid) {
			service.deleteUser6(uid);
			return "redirect:/user6/list";
		
	}
}

	
	