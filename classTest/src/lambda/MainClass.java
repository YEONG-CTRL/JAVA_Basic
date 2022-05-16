package lambda;

public class MainClass {
	public static void main(String[] args) {
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> { System.out.println(s1 + " " + s2 + " " + s3);};
		// (parameter) -> { execution }
		li1.method("Hello", "java","word");	
		
		LambdaInterface2 li2 = (s1) -> { System.out.println(s1); }; 
		// omit data type. because only one parameter
		li2.method("hello");
		
		LambdaInterface2 li3 = s1 -> System.out.println(s1);
		// omit '()' and '{}' cause only one parameter and execution
		li3.method("Hello");
		
		LambdaInterface3 li4 = () -> System.out.println("no parameter");
		li4.method();
		
		LambdaInterface4 li5 = (x,y) -> {
			int result = x*y;
			return result; // return value exists
		};
		System.out.printf("li5.method(10,20) :%d\n", li5.method(10, 20));
		
		LambdaInterface4 li6 = (x,y) -> {
			int result = x-y;
			return result; // return value exists
		};
		System.out.printf("li6.method(10,20) :%d\n", li6.method(10, 20));
	}
}
