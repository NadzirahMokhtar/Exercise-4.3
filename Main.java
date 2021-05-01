
public class Main {
	
	public static void main(String[] args) {
		
		Apple a = new Apple("Apple", 5);
		System.out.println(a);
		System.out.println();
		    
		RedApple b = new RedApple("Red Apple", 6, "Bright Red", "Sweet", 2.0);
		System.out.println(b);
		System.out.println();
		    
		GreenApple c = new GreenApple("Green Apple", 5, "Green", "Sour", 2.1);
		System.out.println(c);
		System.out.println();
		    
		Watermelon d = new Watermelon("Watermelon", "Greeny Red", "Sweet", 3, 4.0);
		System.out.println(d);
		System.out.println();
		    
		Mangosteen e = new Mangosteen("Mangosteen", "Purple", "Sweet-Sour", 3, 0.8, 5);
		System.out.println(e);
		System.out.println();
		
        System.out.println();
		
		System.out.println("==================== Thank You ====================");
		
	}
}
