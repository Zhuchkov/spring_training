package com.training.teater.service;

import java.util.Collection;

import com.training.teater.dao.EventDao;
import com.training.teater.domain.Event;

public class EventServiceImpl implements EventService {
	EventDao dao;
	public EventServiceImpl(EventDao dao){
		this.dao=dao;
	}

	@Override
	public Event save(Event object) {
		return dao.save(object);
	}

	@Override
	public void remove(Event object) {
		dao.remove(object);
	}

	@Override
	public Event getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Collection<Event> getAll() {
		return dao.getAll();
	}

	@Override
	public Event getByName(String name) {
		return dao.getByName(name);
	}

}
