package inheritance;

public class Box<T extends Shape> {
	String name;
	static T item = 25;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
	
}
