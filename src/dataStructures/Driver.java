package dataStructures;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLStack<Integer> s = new LLStack<Integer>();
		
		s.push(10);
		s.push(1);
		s.push(100);
		s.pop();
		
		System.out.println(s);
		
		LLQueue<Integer> q = new LLQueue<Integer>();
		
		q.enqueue(10);
		q.enqueue(1);
		q.enqueue(100);
		
		q.dequeue();
		
		System.out.println(q);
	}

}
