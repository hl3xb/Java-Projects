package hunterLocke;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PrimeFactorsOfN15Plus1 {
	public static ArrayList<Long> divide(long one){
		ArrayList<Long> array = new ArrayList<Long>();
		for (long z = 1; z < one; z++){
			if (one % z == 0){
				array.add(z);
			}
		}
		return array;
	}
	
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		String a = kb.nextLine();
		String b = kb.nextLine();
		
		long big = (long)Math.pow(a, 15) + 1;
		
		long one = Integer.parseInt(a);
		long two = Integer.parseInt(b);
		
		HashSet<Long> test = new HashSet<>(divide(one));
		ArrayList<Long> test2 = new ArrayList<>(test);
		
		int counter = 0;
		for (long x: test2){
			if (counter <= two)
				counter += x;
		}
		
	}
}
