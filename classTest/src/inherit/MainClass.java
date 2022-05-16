package inherit;

public class MainClass {
	public static void main(String[] args) {
		ParentClass[] ParentArr = new ParentClass[2];
		
		FirstchildClass Fch = new FirstchildClass();
		ParentClass Sch = new SecondchildClass();
		
		ParentArr[0] = Fch;
		ParentArr[1] = Sch;
		
		for (int i=0; i<ParentArr.length; i++) {
			ParentArr[i].makeclass();
		}
		
		Fch.getopenyear();
		
		new AnonymousClass() { // object without name // cannot call again
			@Override
			public void method() {
				System.out.println("--AnonymousClass's override method start--");
			};
		}.method(); //call method before disappear
	}
}
