package ch06.dao;

import java.util.List;

import ch06.dto.User2DTO;

public class User4DAO {

	public void insertUser2(User2DTO dto);
	public User2DTO selectUser2(String uid);
	public List<User2DTO> selectUser2s();
	public void updateUser2(User2DTO dto);
	public void deleteUser2(String uid);
}
