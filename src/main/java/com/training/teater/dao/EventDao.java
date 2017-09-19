package com.training.teater.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.training.teater.domain.Event;
import com.training.teater.domain.User;

public class EventDao {
	private long currentId = 0;
	private Map<Long, Event> eventStorage = new HashMap<>();

	public void remove(Event object) {
		eventStorage.values().removeIf(event ->event.equals(object));
	}

	public Event save(Event object) {
		return eventStorage.put(currentId++, object);
	}

	public Event getById(Long id) {
		return eventStorage.get(id);
	}

	public Collection<Event> getAll() {
		return eventStorage.values();
	}

	public Event getByName(String name) {
		 return eventStorage.values().stream()
				.filter(user -> user.getName().equals(name))
				.findAny()
				.orElseThrow(RuntimeException::new);
	}

}
