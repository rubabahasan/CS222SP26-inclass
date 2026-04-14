package dataStructures;

public class LinkedList {
	
	
	public static void main(String[] args) {
		Node<Integer> head;
		
		Node<Integer> n1 = new Node<>(10);
		
		Node<Integer> n2 = new Node<>(20);
		n1.setNext(n2);
		
		head = n1;
	}
}
