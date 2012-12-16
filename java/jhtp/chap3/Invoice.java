//Exercise 3.14
//This class is for generating an invoice for a hardware store. 
public class Invoice {
	private String partNum; // Part Number
	private String partDesc; // Part Description
	private int qty; // Quantity
	private double pricePerItem; // Price Per Item

	// Default Constructor
	public Invoice() {
		partNum="0";
		partDesc="Product 0";
		qty = 0;
		pricePerItem = 0.0;
	}

	// Constructor which expects values for all 4 member variables
	public Invoice(String num, String desc, int q, double ppi) {
		partNum = num;
		partDesc = desc;
		if (q > 0) {
			qty = q;
		} else {
			qty = 0;
		}
		if (ppi > 0.0) {
			pricePerItem = ppi;
		} else {
			pricePerItem = 0.0;
		}
	}

	// Setter for Part Number
	public void setPartNum(String num) {
		partNum = num;
	}

	// Setter for Part Description
	public void setPartDesc(String desc) {
		partDesc = desc;
	}

	// Setter for Quantity.
	// Quantity cannot be negative. If passed a negative value, then the setter makes it as 0
	public void setQty(int q) {
		if (q > 0) {
			qty = q;
		} else {
			qty = 0;
		}
	}

	// Setter for Price Per Item.
	// Price Per Item cannot be negative. If passed a negative value, then the setter makes it as 0
	public void setPricePerItem(double ppi) {
		if (ppi > 0.0) {
			pricePerItem = ppi;
		} else {
			pricePerItem = 0.0;
		}
	}

	// Getter for Part Number
	public String getPartNum() {
		return partNum;
	}

	// Getter for Part Description
	public String getPartDesc() {
		return partDesc;
	}

	// Getter for Quantity
	public int getQty() {
		return qty;
	}

	// Getter for Price Per Item
	public double getPricePerItem() {
		return pricePerItem;
	}

	// Calculates and returns the invoice amount as the product of Quantity and Price Per Item
	public double getInvoiceAmount() {
		return qty * pricePerItem;
	}
}

