package com.ssm.core.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.core.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/selectUserList")
	@ResponseBody
	public Object selectUserList(){
		return userService.selectUserList();
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "你好啊，大兄弟，恭喜你访问成功了，开始写业务吧！";
	}
}
