package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** Stores information for a bill.
 * 
 * @author Jisoo Yoon
 * @version CS1302
 * 
 * 
 * 
 */

public class Money {
	
	public static final double TIP_RATE = 0.2;
	public static final double TAX_RATE = 0.1;

	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * @param bill converts string
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText(Bill bill) {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : bill.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		String subTotalToString = String.valueOf(subTotal);
        String subTotalToString2 = String.format("%.2f", subTotalToString);
        double originalSubTotal = Double.parseDouble(subTotalToString2);
        
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + originalSubTotal + System.lineSeparator();
		
		double tax = originalSubTotal * TAX_RATE;
		String taxToString = String.valueOf(tax);
		String taxToString2 = String.format("%.2f", taxToString);
		double originalTax = Double.parseDouble(taxToString2);
		
		double tip = originalSubTotal * TIP_RATE;
		String tipToString = String.valueOf(tip);
		String tipToString2 = String.format("%.2f", tipToString);
		double originalTip = Double.parseDouble(tipToString2);
		
		text += "TAX - $" + tax + System.lineSeparator();
		text += "TIP - $" + tip + System.lineSeparator();
		text += "TOTAL - $" + (originalSubTotal + originalTip + originalTax);
		
		return text;		
	}
}


