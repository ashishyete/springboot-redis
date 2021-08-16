package com.example.repo;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class UserRepo {

	private HashOperations hashOps;
	private RedisTemplate redisTemplate;
	public static final String REDIS_KEY = "USER";

	public UserRepo(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
		this.hashOps = redisTemplate.opsForHash();
	}

	public void saveUser(User user) {
		hashOps.put(REDIS_KEY, user.getId(), user);
	}

	public List<User> getUsers() {
		return hashOps.values(REDIS_KEY);
	}

	public User getUser(Integer id) {
		return (User) hashOps.get(REDIS_KEY, id);
	}
	
	public void deleteUser(Integer id) {
		hashOps.delete(REDIS_KEY, id);
	}
}
