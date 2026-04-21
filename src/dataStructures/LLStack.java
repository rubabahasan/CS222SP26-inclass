package dataStructures;
import java.util.LinkedList;

public class LLStack<T> implements Stack<T> {

	LinkedList<T> ll;
	
	LLStack(){
		ll = new LinkedList<T>();
	}
	@Override
	public void push(T item) {
		ll.addFirst(item);
	}

	@Override
	public T pop() {
		return ll.removeFirst();
	}

	@Override
	public T peek() {
		return ll.getFirst();
	}
	
	public String toString() {
		return ll.toString();
	}

}
