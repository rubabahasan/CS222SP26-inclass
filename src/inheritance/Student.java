package inheritance;

public class Student extends Person{
	double gpa;

	
	
	
	public Student() {
		super();
	}
	
	public Student(double gpa) {
		super();
		this.gpa = gpa;
	}
	
	public Student(String name, int age, String address, double height, double gpa) {
//		super();
//		this.age = age;
//		this.name = name;
//		setAddress(address);
//		this.setHeight(height);
		super(name, age, address, height);
		this.name = name;
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
//	public void setHeight(double height) {
//		System.out.println("No cannot do this");
//	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + "]" + super.toString();
	}
	
	
	

}
