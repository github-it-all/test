package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User selByPrimaryKey(Integer id) {
		return userMapper.selByPrimaryKey(id);
	}

	@Override
	public List<User> selList() {
		return userMapper.selList();
	}

	@Override
	public int update(User user) {
		return userMapper.update(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
