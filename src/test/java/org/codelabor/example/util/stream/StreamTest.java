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

	private List<String> userGroup1 = new ArrayList<String>();
	private List<String> userGroup2 = new ArrayList<String>();
	
	private List<UserDto> userDtoList1 = new ArrayList<UserDto>();
	private List<UserDto> userDtoList2 = new ArrayList<UserDto>();

	@Before
	public void setUp() {
		userGroup1.add("user1");
		userGroup1.add("user2");
		userGroup1.add("user3");
		userGroup1.add("user4");
		userGroup1.add("user5");
		
		userGroup2.add("user1");
		userGroup2.add("user2");
		userGroup2.add("user3");
		userGroup2.add("user6");
		userGroup2.add("user7");
		
		userDtoList1.add(new UserDto("user1", "firstName1", "lastName1"));
		userDtoList1.add(new UserDto("user2", "firstName2", "lastName2"));
		userDtoList1.add(new UserDto("user3", "firstName3", "lastName3"));
		userDtoList1.add(new UserDto("user4", "firstName4", "lastName4"));
		userDtoList1.add(new UserDto("user5", "firstName5", "lastName5"));
		
		userDtoList2.add(new UserDto("user1", "firstName1", "lastName1"));
		userDtoList2.add(new UserDto("user2", "firstName2", "lastName2"));
		userDtoList2.add(new UserDto("user3", "firstName3", "lastName3"));
		userDtoList2.add(new UserDto("user6", "firstName6", "lastName6"));
		userDtoList2.add(new UserDto("user7", "firstName7", "lastName7"));
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
		userDtoList1.stream().forEach(userDto -> logger.info("username: {}", userDto.getUsername()));
		userDtoList1.stream().map(userDto -> userDto.getUsername())
				.forEach(username -> logger.info("username: {}", username));
		userDtoList1.stream().map(userDto -> userDto.getUsername())
		.forEach(System.out::println);
	}
	
	@Test
	public void testFlatMap() {
		List<List<String>> userGroups = new ArrayList<List<String>>();
		userGroups.add(userGroup1);
		userGroups.add(userGroup2);
		
		List<String> userList = userGroups.stream().flatMap(userGroup -> userGroup.stream()).collect(Collectors.toList());
		logger.info("userList: {}", userList);
		
		List<String> userList2 = userGroups.stream().flatMap(userGroup -> userGroup.stream()).distinct().collect(Collectors.toList());
		logger.info("userList2: {}", userList2);	
	}
	
	@Test
	public void testFlatMap2() {
		List<List<UserDto>> userGroups = new ArrayList<List<UserDto>>();
		userGroups.add(userDtoList1);
		userGroups.add(userDtoList2);
		
		List<UserDto> userList = userGroups.stream().flatMap(userGroup -> userGroup.stream()).collect(Collectors.toList());
		logger.info("userList: {}", userList);
		
		List<UserDto> userList2 = userGroups.stream().flatMap(userGroup -> userGroup.stream()).distinct().collect(Collectors.toList());
		logger.info("userList2: {}", userList2);	
	}
}
