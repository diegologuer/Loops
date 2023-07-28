//Part 3: For loops
//1-Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
//Hint You can use the following String functions:
//
//lenght() -> returns the total number of characters of a given String
//chartAt(i) -> returns the character at the given position(i) of a String

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		System.out.print("Enter your name: ");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		
		for(int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
	}

}
