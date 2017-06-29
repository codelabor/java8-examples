package org.codelabor.example.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.codelabor.example.user.dto.UserDto;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamTest {

	private Logger logger = LoggerFactory.getLogger(StreamTest.class);

	private Integer[] intArray = { 1, 2, 3, 4, 5 };
	private List<UserDto> userDtoList = new ArrayList<UserDto>();

	@Before
	public void setUp() {
		userDtoList.add(new UserDto("user1", "firstName1", "lastName1"));
		userDtoList.add(new UserDto("user2", "firstName2", "lastName2"));
		userDtoList.add(new UserDto("user3", "firstName3", "lastName3"));
		userDtoList.add(new UserDto("user4", "firstName4", "lastName4"));
		userDtoList.add(new UserDto("user5", "firstName5", "lastName5"));
	}

	@Test
	public void testAsList() {

		List<Integer> intList1 = Arrays.asList(intArray);
		logger.info("intList1: {}", intList1);

	}

	@Test
	public void testCollect() {
		List<Integer> intList2 = Arrays.stream(intArray).collect(Collectors.toList());
		logger.info("intList2: {}", intList2);

		List<Integer> intList3 = Arrays.stream(intArray).filter(a -> a % 2 == 0).collect(Collectors.toList());
		logger.info("intList3: {}", intList3);
	}

	@Test
	public void testForEach() {
		userDtoList.stream().forEach(userDto -> logger.info("username: {}", userDto.getUsername()));
		userDtoList.stream().map(userDto -> userDto.getUsername())
				.forEach(username -> logger.info("username: {}", username));
		userDtoList.stream().map(userDto -> userDto.getUsername())
		.forEach(System.out::println);
	}

}
