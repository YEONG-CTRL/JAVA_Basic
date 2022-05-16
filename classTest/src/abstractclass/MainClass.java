package abstractclass;

public class MainClass {
	public static void main(String[] args) {
		Bank myBank = new MyBank("park","123-4567",10000);
	
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		
		System.out.println();
		
		myBank.getInfo();
	}
}
