package hunterLocke;

import java.util.Scanner;
import java.util.ArrayList;

public class EulersMethod {
	public static void main(String[] args){
		Scanner kb= new Scanner (System.in);
		
		System.out.println("Start: ");
		double start=kb.nextDouble();
		System.out.println("First Y-value: ");
		double y=kb.nextDouble();
		System.out.println("Step: ");
		double delta=kb.nextDouble();
		System.out.println("End: ");
		double end=kb.nextDouble();
		kb.close();

		ArrayList<Double> list = new ArrayList<>();

		System.out.println("[X, Y, New Y]");
		for (double x = start; x < end; x = x + delta){
			list.add(x);
			list.add(y);
			y = (x + y)*(delta) + y;        // (dy/dx)(delta x) + y
			list.add(y);
			System.out.println(list);
			list.clear();
		}
		System.out.println(end + " is approximately " + y);

	}
}
