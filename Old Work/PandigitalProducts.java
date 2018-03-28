package hunterLocke;

import java.util.ArrayList;
import java.util.Scanner;

public class PandigitalProducts {
	static public void main(String args[]){
		int test = 0;
		System.out.println("running");
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> run = new ArrayList<>();
		ArrayList<Integer> tester = new ArrayList<>();

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		int i = kb.nextInt();

		for (int j = 1; j < i/2; j ++){
			test = i / j;
			String s1 = "" + i + j + test;
			if (s1.indexOf(0) >= 0 && s1.indexOf(1) >= 0 && s1.indexOf(2) >= 0 && s1.indexOf(3) >= 0 && s1.indexOf(4) >= 0 && s1.indexOf(5) >= 0 && s1.indexOf(6) >= 0 && s1.indexOf(7) >= 0 && s1.indexOf(8) >= 0 && s1.indexOf(9) >= 0){
				list.add(i);
				run.add(j);
				tester.add(test);
				break;
			}
		}
	System.out.println(list);
	System.out.println(run);
	System.out.println(tester);
}
}
