package corejava;
import java.util.Scanner;

 class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    // Getters and Setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

class Testinvoice{
	private Invoice invoice;
	public Testinvoice() {
		 Scanner sc = new Scanner(System.in);

	  
	      System.out.print("Enter part number: ");
	      String partNumber = sc.nextLine();

	      System.out.print("Enter part description: ");
	      String partDescription = sc.nextLine();

	      System.out.print("Enter quantity: ");
	      int quantity = sc.nextInt();

	      System.out.print("Enter price per item: ");
	      double pricePerItem = sc.nextDouble();

			sc.close(); 
	       invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
	}
	 
      
      void display()
      {
    	  System.out.println("Part Number: " + invoice.getPartNumber());
          System.out.println("Description: " + invoice.getPartDescription());
          System.out.println("Quantity: " + invoice.getQuantity());
          System.out.println("Price per Item: ₹" + invoice.getPricePerItem());
          System.out.println("Total Invoice Amount: ₹" + invoice.getInvoiceAmount());
      }
	
}

public class Assignment {

	public static void main(String[] args) {
		
			Testinvoice t = new Testinvoice();
			t.display();

	}

}
