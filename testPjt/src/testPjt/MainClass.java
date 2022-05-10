package testPjt;

public class MainClass {
	public static void main(String[] args) {
		
			// implicit type conversion
			// small -> big
			byte by = 10;
			int in = by;
			System.out.println("in ="+in);
			
			// explicit type conversion
			// big -> small
			int iVar = 100;
			byte bVar = (byte)iVar;
			System.out.println("bVar ="+bVar);
			
			iVar = 123456;
			bVar = (byte)iVar;
			System.out.println("bVar ="+bVar);
				
	}
}
