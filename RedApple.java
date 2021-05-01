
//Sub class for Apple
public class RedApple extends Apple {
	
	private String colour, taste;
	private double payment;
	public RedApple(String name, int quantity, String colour, String taste, double payment) {
		
		super (name, quantity); //Inherit data, method from super class
		this.colour = colour;
		this.taste = taste;
		this.payment = payment;
		
		}
		public double totalPayment() { //Overloading without parameter
			return payment * quantity;
			
		}	
		public String toString() {  //Overriding method
			return "\nName\t\t: " + this.name + "\nQuantity\t: "+ this.quantity + "\nColour\t\t: "+ this.colour + "\nTaste\t\t: " + this.taste + "\nPayment\t\t: RM " + this.payment + "\nTotal Payment\t: RM " + totalPayment();
			
		}
	}
	
	
//End RedApple extends Apple class

	