package com.ssm.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.core.persistence.UserMapper;
import com.ssm.core.po.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public List<User> selectUserList(){
		return userMapper.selectUserList();
	}
}
