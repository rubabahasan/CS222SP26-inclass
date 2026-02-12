package basics;

import java.util.ArrayList;
import java.util.List;

public class StringBasics {
	
	
	public static void stringMathod() {
		String s1 = "Gael";
		s1 = "Gaels";
		char[] c1 = {'G', 'a', 'e', 'l'};
		int[] num1 = {10, 1, 200};
		
		// String vs char array 
		System.out.println(s1 + " " + c1);
		System.out.println(c1);
		System.out.println(num1);
		
		System.out.println(c1[0]);
		System.out.println(s1.charAt(0));
		
		//substring function
		String s2 = "Bangladesh";
		System.out.println(s2.substring(3, 7));
		
		//string comparison
		String s3 = new String("Bangladesh");
		
		if(s2 == "Bangladesh")
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(s2 == s3)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(s3 == "Bangladesh")
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(s2.equals(s3))
		{
			System.out.println("s2 s3 : True");
		}
		else {
			System.out.println("s2 s3 : False");
		}
		
		s2 = "AA";
		s3 = "aa";
		System.out.println( s2.compareTo(s3));
		
		//convert from string to other data types and vice versa
		int a = 20;
		System.out.println((double)a);
		String val = Integer.toString(a);
		System.out.println(val);
		
		int b = Integer.parseInt("200");
		// float -> Float
		// double -> Double
		//boolean -> Boolean
		System.out.println(b);
		
	}
	
	/**
	 * javadoc style comment
	 */
	public static void forLoopMethod() {
		int[] arr = new int[10];
//		int[] arr = {1, 4, 9, 16};
		
		for(int i=0; i< arr.length; i ++)
		{
			arr[i] = i*i;
		}
		
		// print this array using for each loop
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	
	public static void listMethod() {
		
		//need to import both java.util.List and java.util.ArrayList
		List<Integer> alist ;
		alist = new ArrayList<>();
		

		System.out.println(alist.isEmpty());
		alist.add(10);
		alist.add(100);
		
		System.out.println(alist.isEmpty() + " " + alist.size());
		System.out.println(alist);
		
		System.out.println(alist.get(1));
		
		alist.add(1, 50);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringMathod();
		forLoopMethod();
		listMethod();
	}

}
