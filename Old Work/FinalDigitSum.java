package hunterLocke;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalDigitSum {
	public static Integer mod10(int a){
		ArrayList<Integer> list = new ArrayList<>();
		while (a != 0){
			list.add(a%10);
			a /= 10;
		}
		int counter = 0;
		for (int n: list)
			counter += n;
		return counter;
	}
	public static void main(String args[]){
		System.out.println("Enter: ");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		
		while (n > 10)
			n = mod10(n);
		System.out.println(n);
	}
}
