package com.syntel.mockito.MockitoIn5Minutes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void testListSizeMethod() {

		List list = mock(List.class);
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}

	public void testListGetMethod() {

		List list = mock(List.class);
		when(list.get(0)).thenReturn("stephen");
		assertEquals("stephen", list.get(0));
		assertEquals(null, list.get(1));
	}
	public void testListAnyGetMethod() {

		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("stephenbaby");
		assertEquals("stephenbaby", list.get(0));
		assertEquals("stephenbaby", list.get(1));
	}

}
