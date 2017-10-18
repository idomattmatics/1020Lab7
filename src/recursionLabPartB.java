import java.util.Scanner;
/**
 * Purpose: Creating recursive methods
 * @author mkachar
 * Matthew Kachar
 * matthew.kachar@marquette.edu
 * Oct 14, 2014
 */

public class recursionLabPartB {

	public static void main (String [] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a word");

		String word = keyboard.next();
		word.toLowerCase(); // take word input from user and change to lower case
		
		System.out.println("Enter a letter to find");

		String letter = keyboard.next();
		letter.toLowerCase(); //take the letter input and change to lower case

		char c = letter.charAt(0);// change letter input to primitive variable

		System.out.println("The word " + word + " contains " + countLetter(word, c) + " " + c + " (s)");
	}

	public static int countLetter(String s, char c){
		if (s.length() > 0){
			if (s.charAt(0) == c){ //the return will add 1 to the sum every time a match is made
				return 1 + countLetter(s.substring(1, s.length()), c); 
			}else{
				return countLetter(s.substring(1, s.length()), c);
			}
		}else
			return 0;
	}
}




