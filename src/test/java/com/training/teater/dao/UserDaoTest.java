package com.training.teater.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.teater.domain.User;

public class UserDaoTest {

//	@Test
//	public void testSave() {
//		UserDao
//	}

	@Test
	public void testRemove() {
		UserDao dao = new UserDao();
		User testUser = new User();
		dao.save(testUser);
		dao.remove(testUser);
		assertEquals(dao.getAll().size(), 0);
	}
	
	@Test
	public void getUserByEmail() {
		UserDao dao = new UserDao();
		User testUser = new User();
		String testEmail = "test@test.com";
		testUser.setEmail(testEmail);
		dao.save(testUser);
		User actual = dao.getUserByEmail(testEmail);
		assertEquals(testUser,actual );
	}
	@Test(expected=RuntimeException.class)
	public void getUserByEmailNotFound() {
		UserDao dao = new UserDao();
		User testUser = new User();
		String testEmail = "test@test.com";
		testUser.setEmail(testEmail);
		dao.save(testUser);
		User actual = dao.getUserByEmail("");
		assertEquals(actual, testUser);
	}

}
