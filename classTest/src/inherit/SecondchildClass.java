package inherit;

public class SecondchildClass extends ParentClass{
	
	public SecondchildClass() {
		System.out.println("SecondchildClass constructor");		
	}
	
	@Override
	public void makeclass() {
		System.out.println("--Second makeclass()--");
	}
	
}
