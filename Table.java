
	import java.util.Scanner;
	
//	Part 1: While loops
//	1-Open your IDE and create a new Java class named Table
//	2-Copy the following code into your Java class Table and verify it works
//  3-Implement a while loop that prints out the multiplication table of the given input number.
	
	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	        int i = 1;
	        
	        while (i<=10) {
	        	System.out.println(num + " x " + i + " = " + num*i);
	        	i++;
	        }
	        
	        console.close();
	    }
	       
	}