package basics;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Another print"); // print("Hello World")
		System.out.print("This is print ");
		System.out.print("This is print again ");
		System.out.printf("This is %d print ", 2);

		// Declare variables
		int number;
		double frac;
		char c;
		boolean truthValue = false;

		number = 23;
		frac = 2.5678;

		frac = 23;
		c = 'a';
		String text = "this is a text";

		number = number * 1000;
		number = 2;

		long longVar = (int) 2.3;
		System.out.println(longVar);

		int num1 = 100;
		int num2 = 500;

		double div = (float) num1 / num2;

		System.out.println("Value of div: " + div);

		System.out.println("Grocery problem");

		boolean haveEggs = false;

		int numGallonsMilk = 0;
		int numEggs = 0;

		numGallonsMilk = 1;

		if (haveEggs) {
			// whatever we do for have eggs
			numGallonsMilk += 12;
		} else {
			numGallonsMilk = numGallonsMilk;
		}

		System.out.println("We bought " + numGallonsMilk + " gallons of milk and " + numEggs + " eggs");

		// initialize
		int i = 10;
		do {
			System.out.println(i);
			i += 1;
		} while (i < 10);

		// for(initialization; condition; incrememnt)
		for (int j = 0; j < 10; j += 1) {
			System.out.println(j);
		}

		int[] arr;
		arr = new int[5];
		int[] arr2 = new int[10];
		int arr3[] = { 12, 23, 45, 6, 7 };
		arr[0] = 12;
		arr[1] = 10;

		arr[0] = 12000;

		for (int idx = 0; idx < arr3.length; idx++) {
			System.out.print(arr3[idx] + " ");
		}

	}

}
