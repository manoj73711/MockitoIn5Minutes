package com.syntel.mockito.MockitoIn5Minutes;

public class SomeBuisinessImpl {

	DataService service;
	public SomeBuisinessImpl(DataService service) {
		super();
		this.service = service;
	}
	public int returnHighestNumber() {
		int[] a = service.returnData();
		int highest = Integer.MIN_VALUE;
		for (int value : a) {
			if (value > highest) {
				highest = value;
			}
		}

		return highest;
	}

}
