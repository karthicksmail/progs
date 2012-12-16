//Test driver for Invoice Class. Is not based on any unit test framework. Confirmation of values need to be done manually.
public class InvoiceTest {
	// The main function
	public static void main(String[] args) {
		// There are 8 objects of Invoice created in this driver.
		// The first 4 use the parameterized constructor to initialize the variables.
		// The members qty and pricePerItem are set in negative and positive value combinations to test all possibilities
		// inv1: Qty and PricePerItem set to positive values
		Invoice inv1 = new Invoice("1", "Product 1", 1, 43.0);
		// inv2: Qty set to a negative value and PricePerItem set to a positive value
		Invoice inv2 = new Invoice("2", "Product 2", -2, 50.0);
		// inv3: Qty set to a positive value and PricePerItem set to a negative value
		Invoice inv3 = new Invoice("3", "Product 3", 3, -23.0);
		// inv4: Qty and PricePerItem set to negative values
		Invoice inv4 = new Invoice("4", "Product 4", -4, -58.0);

		System.out.printf("partNum\tpartDesc\tqty\tPrice Per Item\n");
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv1.getPartNum(), inv1.getPartDesc(), inv1.getQty(), inv1.getPricePerItem());
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv2.getPartNum(), inv2.getPartDesc(), inv2.getQty(), inv2.getPricePerItem());
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv3.getPartNum(), inv3.getPartDesc(), inv3.getQty(), inv3.getPricePerItem());
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv4.getPartNum(), inv4.getPartDesc(), inv4.getQty(), inv4.getPricePerItem());

		// The second 4 use the default constructor to initialize the variables and use the setters to set the actual values
		// The members qty and pricePerItem are set in negative and positive value combinations to test all possibilities
		// inv5: Qty and PricePerItem set to positive values
		Invoice inv5 = new Invoice();
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv5.getPartNum(), inv5.getPartDesc(), inv5.getQty(), inv5.getPricePerItem());
		inv5.setPartNum("5");
		inv5.setPartDesc("Product 5");
		inv5.setQty(5);
		inv5.setPricePerItem(49.0);
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv5.getPartNum(), inv5.getPartDesc(), inv5.getQty(), inv5.getPricePerItem());

		// inv6: Qty set to a negative value and PricePerItem set to a positive value
		Invoice inv6 = new Invoice();
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv6.getPartNum(), inv6.getPartDesc(), inv6.getQty(), inv6.getPricePerItem());
		inv6.setPartNum("6");
		inv6.setPartDesc("Product 6");
		inv6.setQty(-6);
		inv6.setPricePerItem(59.0);
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv6.getPartNum(), inv6.getPartDesc(), inv6.getQty(), inv6.getPricePerItem());

		// inv7: Qty set to a negative value and PricePerItem set to a positive value
		Invoice inv7 = new Invoice();
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv7.getPartNum(), inv7.getPartDesc(), inv7.getQty(), inv7.getPricePerItem());
		inv7.setPartNum("7");
		inv7.setPartDesc("Product 7");
		inv7.setQty(7);
		inv7.setPricePerItem(-68.4);
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv7.getPartNum(), inv7.getPartDesc(), inv7.getQty(), inv7.getPricePerItem());

		// inv8: Qty and PricePerItem set to negative values
		Invoice inv8 = new Invoice();
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv8.getPartNum(), inv8.getPartDesc(), inv8.getQty(), inv8.getPricePerItem());
		inv8.setPartNum("8");
		inv8.setPartDesc("Product 8");
		inv8.setQty(-8);
		inv8.setPricePerItem(-482.40);
		System.out.printf("%s\t%s\t%d\t%.2f\n", inv8.getPartNum(), inv8.getPartDesc(), inv8.getQty(), inv8.getPricePerItem());
	}
}
