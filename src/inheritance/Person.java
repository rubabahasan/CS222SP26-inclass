package inheritance;

public class Person {
	String name;
	protected int age;
	private String address;
	private double height;
	
	public Person() {
		name = null;
		age = 0;
		address = null;
		height = 0;
	}

	public Person(String name, int age, String address, double height) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public final void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", height=" + height + "]";
	}
	
	
	
	
	

}
