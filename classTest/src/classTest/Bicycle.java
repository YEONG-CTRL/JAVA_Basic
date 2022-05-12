package classTest;

public class Bicycle {
	public String color; // global variable
	public int price;    // global variable
	
	public Bicycle() { // default constructor
		System.out.println("Bicycle constructor");
	}
	
	public Bicycle(String c, int p) { // constructor takes value c&p not global, temporary for store value
		System.out.println("Bicycle Constructor2");
		this.color = c; // this means current object.(myself)
		this.price = p;
	}
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color :" + color);
		System.out.println("price :" + price);
	}
}
