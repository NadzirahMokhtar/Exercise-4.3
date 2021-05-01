
//Sub Class of Fruits
public class Watermelon extends Fruits {
	
	private String colour, taste;
	private int quantity;
	private double payment;
	
	public Watermelon(String name, String colour, String taste, int quantity, double payment) { //Constructor for sub class
		
		super (name); //Inherit data,method from super class
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.payment = payment;
		
	}
	public int getQuantity() {
		return quantity;
		
	}	
	public double totalPayment(int quantity) {
		return payment * quantity;
		
	}
	public String toString() { //Overriding method
		return "\nName\t\t: " + this.name + "\nColour\t\t: "+ this.colour + "\nTaste\t\t: " + this.taste + "\nQuantity\t: "+ this.quantity +"\nPayment\t\t: RM " + this.payment +"\nTotal Payment\t: RM " + totalPayment(quantity);
		
	}
}

//End Watermelon extend Fruit class
