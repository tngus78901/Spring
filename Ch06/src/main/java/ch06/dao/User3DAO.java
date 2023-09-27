package ch06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import ch06.dto.User2DTO;
import ch06.dto.User3DTO;

@Mapper
@Repository
public interface User3DAO {

	public void insertUser3(User3DTO dto);
	public User3DTO selectUser3(String uid);
	public List<User3DTO> selectUser3s();
	public void updateUser3(User2DTO dto);
	public void deleteUser3(String uid);
}
