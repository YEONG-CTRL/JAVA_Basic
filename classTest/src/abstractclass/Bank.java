package abstractclass;

public abstract class Bank {
	String name;
	String account;
	int totalAmount; // member
	
	public Bank() { //constructor
		System.out.println("Bank constructor");
	}
	
	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	public void deposit() { //method
		System.out.println("--deposit() start--");
	}
	
	public void withdraw() { //method
		System.out.println("--withdraw() start--");
	}
	
	public abstract void installmentSavings();
	// abstract method // option
	// inherited class implements it(override) 
	
	public abstract void cancellation();
	
	public void getInfo() {
		System.out.printf("name: %s\n", name);
		System.out.printf("account: %s\n", account);
		System.out.printf("totalAmount: %d\n", totalAmount);
	}
}

