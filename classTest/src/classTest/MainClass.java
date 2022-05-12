package classTest;

public class MainClass {
	public static void main(String[] args) { // JVM look for main method first, when running the program
		
		Grandeur myCar1 = new Grandeur(); // call Grandeur constructor to make an object 
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();		
		
		
		Bicycle myBicycle = new Bicycle("red",100); // calls constructor 2
		myBicycle.info();
		
		ChildClass child1 = new ChildClass();
		child1.setInfo("yeongseo","man",21);
		child1.getInfo();
//		child1.mySecrete(); -> private, not accessible from outside
	}
	
}
