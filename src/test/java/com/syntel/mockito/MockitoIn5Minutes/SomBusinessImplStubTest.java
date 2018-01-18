package com.syntel.mockito.MockitoIn5Minutes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomBusinessImplStubTest {
	
	@Mock
	DataService dataService;
	@InjectMocks
	SomeBuisinessImpl b;


	@Test
	public void 	returnHighestNumber_3values() {
		when(dataService.returnData()).thenReturn(new int[] {2,3,5});
		assertEquals(5,b.returnHighestNumber());
	}
	@Test
	public void 	returnHighestNumber_1value() {
		when(dataService.returnData()).thenReturn(new int[] {2});
		assertEquals(2,b.returnHighestNumber());
	}
	@Test
	public void 	returnHighestNumber_0value() {
		when(dataService.returnData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,b.returnHighestNumber());
	}
	

}
