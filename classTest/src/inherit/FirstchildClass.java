package inherit;

public class FirstchildClass extends ParentClass{
	int openyear = 200;
	
	public FirstchildClass() {
		System.out.println("FirstchildClass constructor");
	}
	
	@Override
	public void makeclass() {
		System.out.println("--First makeclass()--");
	}
	
	public void getopenyear() {
		System.out.println("childclass's open year :" + this.openyear);
		System.out.println("parentclass's open year :" + super.openyear); // reach parent class's attribute 
	}
}
