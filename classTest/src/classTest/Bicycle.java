package classTest;

public class Bicycle {
	public String color;
	public int price;
	
	public Bicycle() { // default constructor
		System.out.println("Bicycle constructor");
	}
	
	public Bicycle(String c, int p) { // constructor takes value
		System.out.println("Bicycle Constructor2");
		color = c;
		price = p;
	}
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color :" + color);
		System.out.println("price :" + price);
	}
}
