package com.training.teater.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.training.teater.domain.User;

public class UserDao {
	private long currentId = 0;
	private Map<Long, User> userStorage = new HashMap<>();

	public User save(User object) {
		return userStorage.put(currentId++,object);
		
	}

	public void remove(User object) {
		userStorage.values().removeIf(user ->user.equals(object));
		
	}

	public User getById(Long id) {
		return userStorage.get(id);
	}

	public Collection<User> getAll() {
		return userStorage.values();
	}

	public User getUserByEmail(String email) {
		return userStorage.values().stream()
				.filter(user -> user.getEmail().equals(email))
				.findAny()
				.orElseThrow(RuntimeException::new);
	}
	
	
	

}
