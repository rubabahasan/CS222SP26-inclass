package dataStructures;

import java.util.LinkedList;

public class LLQueue<T> implements Queue<T> {

	LinkedList<T> ll;
	
	LLQueue(){
		ll = new LinkedList<T>();
	}
	@Override
	public void enqueue(T item) {
		ll.addLast(item);
	}

	@Override
	public T dequeue() {
		return ll.removeFirst();
	}
	
	public String toString() {
		return ll.toString();
	}


}
