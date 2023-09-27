package ch07.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch06.dto.User6DTO;
import ch06.dto.User6DTO;

@Mapper
@Repository
public interface User6DAO {

	public void insertUser6(User6DTO dto);
	public User6DTO selectUser6(String uid);
	public List<User6DTO> selectUser6s();
	public void updateUser6(User6DTO dto);
	public void deleteUser6(String uid);
}
