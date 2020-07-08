package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {
	
	@Test
	
	public void testCarRide() {
		
		
		CarRide.answer = "yes";
		
		String expectedValue = "Good!";
		String actualValue = CarRide.areWeThereYet();
		
		Assert.assertEquals(expectedValue, actualValue);
				
			
		
		
	}


}
