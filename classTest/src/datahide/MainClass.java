package datahide;

public class MainClass {
	public static void main(String[] args) {
		Student student1 = new Student("hong",90);
		student1.getInfo();
		
		student1.setScore(100);
		student1.getInfo();
		
		student1.setScore(20);
		student1.getInfo();
	}
}
