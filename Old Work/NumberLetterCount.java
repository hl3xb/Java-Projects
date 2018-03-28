package hunterLocke;

import java.util.Scanner;

public class NumberLetterCount {
	static public void main(String args[]){
		NumberLetters run = new NumberLetters();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		int num = kb.nextInt();
		
		System.out.println(run.numberLetters(num));
	}
}
