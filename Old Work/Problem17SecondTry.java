package hunterLocke;

import java.util.Scanner;

public class Problem17SecondTry {
	static public void main(String args[]){
		Problem17 run = new Problem17();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		int num = kb.nextInt();
		
		System.out.println(run.numberLetters(num));
	}
}
