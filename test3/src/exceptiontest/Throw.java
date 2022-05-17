package exceptiontest;

public class Throw {
public static void main(String[] args) {
	Throw Throw = new Throw();
	
	try {
		Throw.firstmethod();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void firstmethod() throws Exception {
	secondmethod();
}
public void secondmethod() throws Exception {
	thirdmethod();
}
public void thirdmethod() throws Exception { 
	System.out.println("10 / 0 =" + (10/0));
}
}
