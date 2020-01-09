package com.service;

import java.util.List;

import com.pojo.User;

public interface UserService {

	User selByPrimaryKey(Integer id);

	List<User> selList();

	int update(User user);

	int deleteByPrimaryKey(Integer id);

	int insert(User user);
}
