package com.training.teater.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.teater.domain.Event;

public class EventDaoTest {

	@Test
	public void testRemove() {
		EventDao dao = new EventDao();
		Event testEvent = new Event();
		dao.save(testEvent);
		dao.remove(testEvent);
		assertEquals(dao.getAll().size(), 0);
	}

	@Test
	public void testGetByName() {
		EventDao dao = new EventDao();
		Event testEvent = new Event();
		String testName = "test";
		testEvent.setName(testName);
		dao.save(testEvent);
		Event actual = dao.getByName(testName);
		assertEquals(testEvent, actual);
	}

}
