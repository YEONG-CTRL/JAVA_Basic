package Interface;

public class interfaceclass implements interfaceA, interfaceB{
	
	public interfaceclass() {
		System.out.println("interfaceclass constructor");
	}
	
	@Override
	public void funA() {
		System.out.println("--funA()--");
	}
	
	@Override
	public void funB() {
		System.out.println("--funB()--");		
	}
	
}
