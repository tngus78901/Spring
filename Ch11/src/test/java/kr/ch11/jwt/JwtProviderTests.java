package kr.ch11.jwt;

import org.springframework.boot.test.context.SpringBootTest;

import kr.ch11.entity.UserEntity;
import kr.ch11.repository.UserRepository;

@SpringBootTest
public class JwtProviderTests {

	
	private JwtProvider jwtProvider;
	
	private UserRepository userRepository;
	
	public void generateTokenTest() {
		
		UserEntity testUser = UserEntity.builder()
													.uid("a101")
													.name("김유신")
													.hp("tngus78901@gmail.com")
													.age(23)
													.role("USER")
													.build();
		String token = jwtProvider.createToken(testUser, 1);
		
		Sys
	}
}
