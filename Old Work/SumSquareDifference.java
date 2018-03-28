package hunterLocke;

import java.util.Scanner;
import java.util.ArrayList;

public class SumSquareDifference {
	static public void main(String args[]){

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		int base = kb.nextInt();

		ArrayList<Double> list= new ArrayList<Double>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 1; i <= base; i++){
			list.add(Math.pow(i, 2));}

		double sum = 0;
		for (double x : list){
			sum = sum + x;}

		for (int k = 1; k <= base; k ++){
			list2.add(k);
		}
		int sum2 = 0;
		for (int y : list2){
			sum2 = sum2 + y;
		}
		double power = sum2;
		power = Math.pow(power, 2);

		System.out.println(power-sum);


	}
}
