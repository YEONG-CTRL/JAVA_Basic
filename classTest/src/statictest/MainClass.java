package statictest;

public class MainClass {
	public static void main(String[] args) {
		EmployeeBank parkBank = new EmployeeBank("park");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("lee");
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		leeBank.getBankInfo();
	}
}
