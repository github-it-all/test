package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pojo.User;

public interface UserMapper {

	@Select("select * from user where id=#{id}")
	User selByPrimaryKey(Integer id);

	@Select("select * from user")
	List<User> selList();

	@Update("update user set name=#{name},age=#{age},password=#{password} where id=#{id}")
	int update(User user);

	@Delete("delete from user where id=#{id}")
	int deleteByPrimaryKey(Integer id);

	@Insert("insert into user values(default,#{name},#{password},#{age})")
	int insert(User user);
}
