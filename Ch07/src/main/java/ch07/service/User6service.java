package ch07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch06.dao.User6DAO;
import ch06.dto.User6DTO;

@Service
public class User6service {

	@Autowired
	private User6DAO dao;
	
	public void insertUser6(User6DTO dto) {
		
	}
	
	public User6DTO selectUser6(String uid) {
		return dao.selectUser6(uid);
	}
	
	public List<User6DTO> selectUser6s() {
			return dao.selectUser6s();
	}
	
	public void updateUser6(User6DTO dto) {
		dao.updateUser6(dto);
	}
	
	public void deleteUser6(String uid) {
		dao.deleteUser6(uid);
	}

}
