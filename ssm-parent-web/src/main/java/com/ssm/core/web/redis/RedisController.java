package com.ssm.core.web.redis;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {
//	@Autowired
//	private RedisCacheManager redisCacheManager;
	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;
	
	@RequestMapping("/getKey")
	@ResponseBody
	public Object getRedisData(HttpServletRequest request,String key){
		Object name = redisTemplate.opsForValue().get(key);
		return name+":"+request.getSession().getId();
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/setKey")
	@ResponseBody
	public Object setKey(String key , String value){
		 redisTemplate.opsForValue().set( key,value);
		return "添加成功";
	}
}
