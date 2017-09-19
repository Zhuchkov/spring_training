package com.training.teater.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.Test;

import com.training.teater.domain.Auditorium;

/**
 * @author Yuriy_Tkach
 */
public class TestAuditorium {
	
	@Test
	@Ignore
	public void testCountVips() {
		Auditorium a = new Auditorium();
		a.setVipSeats(Stream.of(1L,2L,3L).collect(Collectors.toSet()));
		assertEquals(0, a.countVipSeats(Arrays.asList(10L, 20L, 30L)));
		assertEquals(1, a.countVipSeats(Arrays.asList(10L, 2L, 30L)));
		assertEquals(2, a.countVipSeats(Arrays.asList(10L, 2L, 3L, 4L, 5L, 6L)));
	}
	
	public void testGetAllSeats() {
	    Auditorium a = new Auditorium();
	    a.setNumberOfSeats(10);
	    assertEquals(10, a.getAllSeats().size());
	}

}