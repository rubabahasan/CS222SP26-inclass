package basics;

public class BasicsClass2 {

	public static int nextNum(int num) {
		num = num + 1;
		return num;
	}
	
	public static void printNum(int num)
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var, i,  j = 10, p;
		
		// primitive data types: boolean, double, float, char, byte, long, short
		// String, Integer, Double
		
		// ARithmetic operations + - * / % 
		
		double res = 11/2.0;
		String s1 = Integer.toString(12);
		String s2 = Double.toString(res);
		
		i = 5;
		
		i *= 2; // i = i * 2; i += 5
		
		i ++; // i = i + 1
		
		--i;
		
		if (i < 20) {
			j = i;
			System.out.println("Smaller than 20");
//			System.out.println("something else");
		}
		else { 
			j = 1000;
			System.out.println("Not smaller " + i);
			System.out.println("Something");
		}
		
		j = (i < 20)? i : 1000;
		
		// Loops
		// initializing or the start value
		// condition
		// update variable
		
		//for(init;condition;update)
		i = 0;
		while(true)
		{
			if(i == 1)
			{
				i++;
				continue;
			}
			if(i == 0)
			{
				break;
			}
		}
		int q =2;
		switch(q) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Weekend");
		}
		System.out.println(nextNum(5));
		printNum(1000);
		
	}

}
