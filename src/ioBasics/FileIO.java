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
			//loop while the file has more lines in it
			while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				// checking if the line contains the word
				if (line.toLowerCase().contains(word.toLowerCase())) {
					System.out.print(count + 1 + ": ");
					System.out.println(line);
				}
				//every line is counted for line number
				count++;
			}
			
		}catch(FileNotFoundException e) {
			System.err.println(filename + " file not found");
		}finally {
			if(fileIn != null) {
				// close file
				fileIn.close();
			}
		}
		
	}
	
	public static void findWordsToFile(String filename, String word, String outputFilename) {
		Scanner fileIn = null;
		PrintWriter fileOut = null;

		try {
			fileIn = new Scanner(new FileReader(filename));
			fileOut = new PrintWriter(outputFilename);

			int count = 0;
			//loop while the file has more lines in it
			while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				// checking if the line contains the word
				if (line.toLowerCase().contains(word.toLowerCase())) {
					// printing if the line contains the word
					fileOut.print(count + 1 + ": ");
					fileOut.println(line);
				}
				//every line is counted for line number
				count++;
			}
			
		}catch(FileNotFoundException e) {
			System.err.println(filename + " file not found");
		}finally {
			if(fileIn != null) {
				// close file
				fileIn.close();
			}
			if(fileOut != null)
			{
				fileOut.close();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		findWordsToFile("data/secretgarden.txt", "Basil", "output/writingoutput.txt");
	}

}
