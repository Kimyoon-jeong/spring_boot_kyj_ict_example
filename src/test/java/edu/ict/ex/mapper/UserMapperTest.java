package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.ict.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;	
	
	@Disabled
	@Test
	void testUserMapper() {
		assertNotNull(userMapper); /* 실제 값이 null이 아닌지 확인 */
	}
	
	@Disabled
	@Test
	void testGetUser() {
		UserVO user=userMapper.getUser("admin");
		assertNotNull(user);
		System.out.println(user);
		
	}
	

	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Disabled
	@Test
	void testInsertUser() {
		
		UserVO user=userMapper.getUser("admin");
		user.setUsername("admin2");
		user.setPassword(passwordEncoder.encode("admin2"));
		user.setEnabled("1");
		
		userMapper.insertUser(user);
		userMapper.insertAuthorities(user);
		
		assertNotNull(user);
		
		System.out.println(user);
		
	}
	
	@Disabled
	@Test
	void testInsertUser2() {
		
		UserVO user=new UserVO();
		user.setUsername("user2");
		user.setPassword(passwordEncoder.encode("user2"));
		user.setEnabled("1");
		
		userMapper.insertUser(user);
		userMapper.insertAuthorities(user);
		
		assertNotNull(user);
		
		System.out.println(user);
		
	}
	//@Disabled
		@Test
		void testInsertUser3() {
			
			UserVO user=new UserVO();
			user.setUsername("admin3");
			user.setPassword(passwordEncoder.encode("admin3"));
			user.setEnabled("1");
			
			userMapper.insertUser(user);
			userMapper.insertAuthorities(user);
			
			assertNotNull(user);
			
			System.out.println(user);
			
		}


//단방향(MD5,SHA등은) 암호화(encoding)은 가능해도 복호화(decoding)는 안되는것을 말하고( 현업에서 주로 사용) =HASH
//
//양방향(AES,RSA,DES등은) 암호화 및 복호화가 가능한 것 이다

	@Disabled
	@Test
	void testMatcher() {
		
		UserVO user = userMapper.getUser("admin2");
		boolean isMatch = passwordEncoder.matches("admin2",user.getPassword());
		
		assertEquals(isMatch, true);
	}
	

}
