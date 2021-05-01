
//Subclass of fruits
public class Apple extends Fruits {
	
	//Control who is going to access this data
	protected int quantity;
	public Apple(String name, int quantity) {
		
		super (name); //Inherit data, method from super class
		this.quantity = quantity;
		
	}
	public String toString() {
		return "\nName\t\t: " + this.name + "\nQuantity\t: "+ this.quantity;
		
	}
}
		 
//End for Apple extends fruit class