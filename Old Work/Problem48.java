package hunterLocke;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem48 {
	static public void main(String args[]){

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		int cap = kb.nextInt();

		ArrayList<Double> list = new ArrayList<Double>();

		for (int i = 1; i <= cap; i++){
			double a = Math.pow(i, i);
			list.add(a);
		}

		double sum = 0;
		for (double x : list){
			sum = sum + x;
		}
		System.out.println(sum);
	}
}
