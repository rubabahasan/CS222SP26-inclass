package ioBasics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicIO {
	
	public static void getIntInput() {
		Scanner in;
		in = new Scanner(System.in);
		
		int a = in.nextInt();
		String b = in.next();
		
		System.out.println("The two numbers are "+ a + " and " + b);
	}
	
	public static void getIntInputIfPresent() {
		Scanner in;
		in = new Scanner(System.in);
		
		int a = 0, b = 0;
		
		if(in.hasNextInt())
		{
			a = in.nextInt();
		}
		
		if(in.hasNextInt())
		{
			b = in.nextInt();
		}
		
		System.out.println("The two numbers are "+ a + " and " + b);
	}
	
	// until the user inputs "Q"
	// hasNext(), next()
	public static void infIO() {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String s = in.next();
			System.out.println(s);
			
			if(s.equals("Q")) {
				break;
			}
		}
		System.out.println("All done");
	}
	
	public static void getIntInputWithTry() throws InputMismatchException{
		Scanner input = null;
		String inputString = "12 23 This is input";
		try {
			input = new Scanner(inputString);
			
			int a = input.nextInt();
			int b = input.nextInt();
//			throw new InputMismatchException();
			System.out.println("The two numbers are "+ a + " and " + b);
			
		}catch(InputMismatchException e ) {
			System.err.println("GOt an exception " + e);
			e.printStackTrace();
		}finally {
			if(input != null)
			{
				input.close();
			}
		}
		
	}
	
	/**
	 * This function reads lines from a file
	 * @param filename
	 * @param n
	 */
	public static void fileIOFunc(String filename, int n) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileReader(filename));
			int count = 0;
			while(count < n && fileIn.hasNextLine())
			{
				String line = fileIn.nextLine();
//				line.contains("string here")
				System.out.println(line);
				count ++;
			}
		}catch(FileNotFoundException fe)
		{
			System.err.println(fe);
		}finally {
			fileIn.close();
		}
	}
	
	public static void main(String[] args) {
//		getIntInputIfPresent();
//		infIO();
//		getIntInputWithTry();
		fileIOFunc("data/secretgarden.txt", 10);
//		fileIOFunc("data\\secretgarden.txt", 10);
		
		/*
		 * dfbjsfknbfljksgb
		 * fbsvdhfvbs
		 * fdbsdfjlvbs
		 */
	}

}
