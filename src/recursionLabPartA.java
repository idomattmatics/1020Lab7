import java.util.Scanner;
/**
 * Purpose: Creating recursive methods
 * @author mkachar
 * Matthew Kachar
 * matthew.kachar@marquette.edu
 * Oct 14, 2014
 */

public class recursionLabPartA {

	public static void main (String [] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter an integer ");
		int n = keyboard.nextInt(); // take number input from user
		System.out.println(fibonacci(n)); // prints the fibonacci solution of input

	}

	public static long fibonacci(long n){
		if (n == 1){ // fibonacci 1 is 1
			return 1;
		}else if (n == 0){//fibonacci1 0 is 0
			return 0;
		}else{
			return fibonacci(n - 1) + fibonacci(n - 2);// sum of each element working backwards from n
		}
	}
}
