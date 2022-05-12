package classTest;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	
	public ChildClass() {
		System.out.println("--ChildClass Constructor");
		}
	
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo() Start--");
		
		name = n;
		gender = g;
		age = a;
	} 
		
	public void getInfo() {
		System.out.println("--getInfo() Start--");
		
		System.out.println("name :" + name);
		System.out.println("gender :" + gender);
		System.out.println("age :" + age);
		
		mySecrete(); // private reachable from inside
	}
	
	private void mySecrete() {
		System.out.println("--mySecrete() --");
	}
	
}
