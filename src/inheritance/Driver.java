package inheritance;



public class Driver {

	public static boolean isOlder(Person p1, Person p2) {
		return p1.age > p2.age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Ava", 10, "home", 5.0);
		
		System.out.println(p);
		
		Student s = new Student("Bugs bunny", 2, "rabbithole", 10.0, 4.0);
		
		System.out.println(s);
		
		s.setHeight(2);
		
		System.out.println(s);
		
		System.out.println(isOlder(p, s));
		
	}

}
