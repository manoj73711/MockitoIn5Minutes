package com.syntel.mockito.MockitoIn5Minutes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomBusinessImplMockTest {

	@Test
	public void 	returnHighestNumber() {
		SomeBuisinessImpl b=new SomeBuisinessImpl(new DataStub());
		int result=b.returnHighestNumber();
		assertEquals(25,result);
	}
	
	class DataStub implements DataService{

		@Override
		public int[] returnData() {
			// TODO Auto-generated method stub
			return new int[] {25,2,3};
		}
		
		
	}

}
