package com.ssm.core.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ssm.core.po.User;

@Component
public interface UserMapper {
	List<User> selectUserList();
}
