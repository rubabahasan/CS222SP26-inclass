package ioBasics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

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
	
	
	/**
	 * Prints every line in filename where word is present along with the line number
	 * @param filename
	 * @param word
	 */
	public static void findWords(String filename, String word) {
		Scanner fileIn = null;

		try {
			fileIn = new Scanner(new FileReader(filename));

			int count = 0;
			while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				if (line.toLowerCase().contains(word.toLowerCase())) {
					System.out.print(count + 1 + ": ");
					System.out.println(line);
				}
				count++;
			}
			
		}catch(FileNotFoundException e) {
			System.err.println(filename + " file not found");
		}finally {
			if(fileIn != null) {
				fileIn.close();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		findWords("data/secretgarden.txt", "garden");
	}

}
