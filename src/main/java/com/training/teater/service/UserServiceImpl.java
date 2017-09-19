package com.training.teater.service;

import java.util.Collection;

import com.training.teater.dao.UserDao;
import com.training.teater.domain.User;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;
	
	public UserServiceImpl(UserDao dao) {
		this.dao=dao;
	}

	@Override
	public User save(User object) {
		return dao.save(object);
	}

	@Override
	public void remove(User object) {
		dao.remove(object);
	}

	@Override
	public User getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Collection<User> getAll() {
		return dao.getAll();
	}

	@Override
	public User getUserByEmail(String email) {
		return dao.getUserByEmail(email);
	}

}
