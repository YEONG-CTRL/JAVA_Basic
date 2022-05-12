package classTest; //package : name of folder. managing similar classes(.java) in here

public class Grandeur {
	// attribute
	public String color;
	public String gear;
	public int price;
	
	// constructor
	public Grandeur() {
		System.out.println("Grandeur Constructor");
	}
	
	// method
	public void run() {   // "void" means "no return"
		System.out.println("--run--");
	}
	
	public void stop() { 
		System.out.println("--stop--");
	}
	
	public void info() {  
		System.out.println("--info--");
		System.out.println("color :" + color);
		System.out.println("gear :" + gear);
		System.out.println("price :" + price);
	}	
}
