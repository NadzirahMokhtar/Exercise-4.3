
//Sub Class of Fruits
public class Mangosteen extends Fruits {
	
	private String colour, taste;
	private int quantity;
	private double weight, payment;
	public Mangosteen(String name, String colour, String taste, int quantity, double weight, double payment) { //Constructor for sub class
		
		super (name); //Inherit data,method from super class
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.weight = weight;
		this.payment = payment;
		
	}
	public int getQuantity() {
		return quantity;
		
	}
	public double getWeight() {
		return weight;
		
	}
	public double totalPayment(int quantity, double weight) {
		return payment * quantity * weight;
		
	}
	public String toString() {
		return "\nName\t\t: " + this.name + "\nColour\t\t: "+ this.colour + "\nTaste\t\t: " + this.taste + "\nNumber of box\t: "+ this.quantity + "\nWeight\t\t: "+ this.weight + "kg" + "\nPayment (kg)\t: RM " + this.payment + "\nTotal Payment\t: RM" + totalPayment(quantity, weight);
		
	}
}

//End Mangosteen extend Fruit class