package kr.ch11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ch11.entity.UserEntity;
import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, String> {

}
