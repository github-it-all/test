package com.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pojo.User;
import com.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {
	
	@Resource
	private UserService userService;

	@Test
	public void testSelByPrimaryKey() {
		User user = userService.selByPrimaryKey(3);
		System.out.println(user);
	}

	@Test
	public void testSelList() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test
	public void testInsert() {
	}

}
