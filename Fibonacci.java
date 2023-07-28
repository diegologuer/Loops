//		Part 2: Do While loops

//		1-Create a new Java class with a main method(so you can run your code) called Fibonacci
//
//		2-The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."
//
//		The beginning of the sequence is thus:
//
//		0 1 1 2 3 5 8 13 21 34 55 89 ...
//
//		3-Add the following import to be able to capture user input n
//
//		  import java.util.Scanner;
//		4-Implement a Do While loop that calculates Fibonacci(n)

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of iteraccions for the fibonacci sequence: ");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i = 0;
		int num1 = 0;
		int num2 = 1;
		int res = 0;
		
		do {
			
			if(i<=1) {
				System.out.println(i);
				i++;
				continue;
			}
			
			res = num1 + num2;
			num1 = num2;
			num2 = res;
			i++;
			System.out.println(res);
		}
		while(i<=n);
	}

}
