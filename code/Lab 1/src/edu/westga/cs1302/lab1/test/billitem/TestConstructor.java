package edu.westga.cs1302.lab1.test.billitem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import edu.westga.cs1302.lab1.model.BillItem;

public class TestConstructor {

	@Test
	public void testNullName() {
		//Arrange
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem(null, 10000.00);
		});
	}
	
	@Test
	public void testNegativeAmount() {
		//Arrange

		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("Jisoo", -1.00);
		});
	}
	
	@Test
	public void testZeroAmount() {
		//Arrange

		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("Jisoo", 0.00);
		});
	}
	
	@Test
	public void testAllValidData() {
		//Arrange
		BillItem goods = new BillItem("Jisoo", 10000.00);
		
		//Act
		
		//Assert
		assertEquals("Jisoo", goods.getName());
		assertEquals(10000.00, goods.getAmount(), .01);
	}

}
