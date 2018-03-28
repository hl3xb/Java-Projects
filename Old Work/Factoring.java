package hunterLocke;

import java.util.Scanner;
import java.util.ArrayList;

public class Factoring {
	public static void main(String[] args){

		System.out.println("_x^2 + _x + _ = _");

		Scanner kb = new Scanner(System.in);
		System.out.println("First Coefficient: ");
		int first = kb.nextInt();
		System.out.println("Second Coefficient: ");
		int second = kb.nextInt();
		System.out.println("Constant: ");
		int third = kb.nextInt();
		System.out.println("Equals: ");
		int fourth = kb.nextInt();
		kb.close();
		System.out.println();

		System.out.println(first + "x^2 + " + second + "x + " + third + " = " + fourth);

		third = third - fourth;
		fourth = 0;
		System.out.println(first + "x^2 + " + second + "x + " + third + " = " + fourth);
		System.out.println();

		if (first == 1){
			for (int x = 1; x < third; x ++){
				int y = third / x;
				if (third % x == 0 && y + x == second){
					System.out.println("(x + " + y + ")(x + " + x + ") = 0");

				}
			}
		}
		else if (first != 1){ 
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			for (int a = 1; a < first; a ++){
				if (first % a == 0)
					
					list.add(a);
			}
			for (int x = 1; x < third; x ++){
				int y = third / x;
				if (third % x == 0)
					list2.add(x);
				}
			for (int b: list){
				for (int c: list2){
					int mew = first / b;
					int meowth = third / c;
					if ((mew * c) + (meowth * b) == second)
						System.out.println("(" + b + "x + " + c + ")(" + mew + "x + " + meowth + ") = 0");
				}
			}
		}
	}
}
