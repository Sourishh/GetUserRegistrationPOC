package com.example.exam;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import reactor.core.publisher.Mono;

import java.util.Optional;
import static org.mockito.BDDMockito.given;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static reactor.core.publisher.Mono.when;


class UserRegistrationPocApplicationTests {

	@InjectMocks
	private UserController userController;

	@Mock
	private DAOUser daoUser;

	@Mock
	private UserService userService;

	@Mock
	private UserRepository userRepository;


	@Test
	public void testGetUserDetails() {

		DAOUser daoUser1 = new DAOUser(1L, "Virat", "Kohli", "8981522899", "s.b@hotmail.com", "Delhi");

		DAOUser user = userController.getUserDetails("s.b@hotmail.com", 1L);

		Optional<DAOUser> optionalDAOUser = Optional.of(daoUser1);
		given(userRepository.findById(anyLong())).willReturn(optionalDAOUser);

		assertAll(
				() -> assertThat(user.getUserId()).isEqualTo(daoUser1.getUserId()),
				() -> assertThat(user.getFirstName()).isEqualTo(daoUser1.getFirstName()),
				() -> assertThat(user.getLastName()).isEqualTo(daoUser1.getLastName()),
				() -> assertThat(user.getEmail()).isEqualTo(daoUser1.getEmail()),
				() -> assertThat(user.getAddress()).isEqualTo(daoUser1.getAddress()),
				() -> assertThat(user.getMobileNo()).isEqualTo(daoUser1.getMobileNo())
				);


	}
	

}
