package Interface;

public class MainClass {
	
	public static void main(String[] args) {
		
		interfaceA ia = new interfaceclass(); //ia is object made by interfaceclass(), but type is interfaceA
		interfaceB ib = new interfaceclass(); //ib type interfaceB
		
		ia.funA();
		ib.funB();
	}
	
}
