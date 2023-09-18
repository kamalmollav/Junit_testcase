package com.numetry.NumetryTask1.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.numetry.NumetryTask1.dto.User;

@SpringBootTest
class UserRepositoryTest {

	@Autowired
	private UserRepository repository;
	
	
	@Test
	void testIsUserExistById() {
		
		User user=new User(1, "Kamal", 27);
		repository.save(user);
		 Optional<User> findById = repository.findById(1);
		
		assertThat(findById).isPresent();
	}

}
