package edu.westga.cs1302.lab1.test.bill;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestAddItem {

	@Test
	public void testWhenNullItem() {
		//Arrange
		Bill bill = new Bill();
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			bill.addItem(null);
		});
	}
	
	@Test
	public void testWhenAddingOneItem() {
		//Arrange
		Bill bill = new Bill();
		BillItem item = new BillItem("Jisoo", 40000.00);
		
		//Act
		bill.addItem(item);
		
		//Assert
		assertEquals(1, bill.getItems().size());
		assertTrue(bill.getItems().contains(item));
	}
	
	@Test
	public void testWhenAddingMultipleItem() {
		//Arrange
		Bill bill = new Bill();
		BillItem item1 = new BillItem("Minji", 50000.00);
		BillItem item2 = new BillItem("Hanni", 50000.00);
		BillItem item3 = new BillItem("Danielle", 50000.00);
		BillItem item4 = new BillItem("Haerin", 50000.00);
		BillItem item5 = new BillItem("Hyein", 50000.00);
		
		//Act
		bill.addItem(item1);
		bill.addItem(item2);
		bill.addItem(item3);
		bill.addItem(item4);
		bill.addItem(item5);
		
		//Assert
		assertEquals(5, bill.getItems().size());
		assertTrue(bill.getItems().contains(item1));
		assertTrue(bill.getItems().contains(item2));
		assertTrue(bill.getItems().contains(item3));
		assertTrue(bill.getItems().contains(item4));
		assertTrue(bill.getItems().contains(item5));
	}
}
