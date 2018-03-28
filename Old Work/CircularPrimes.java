package hunterLocke;

import java.util.ArrayList;
import java.util.Scanner;

public class CircularPrimes {

	public boolean isPrime(int i) {
		if (i == 1)
			return false;
		if (i == 2)
			return true;
		if (i % 2 == 0)
			return false;
		for (int d = 3; d <= (int) Math.sqrt(i); d++)
			if (i % d == 0)
				return false;
		return true;
	}

	public static String permutation(int n){
		ArrayList<Integer> list = new ArrayList<Integer>(mod10(n));
		String value = "";
		for (int i = 0; i <= list.size(); i ++){
			for (int j = i + 1; j <= list.size()- 1; j ++){
				for (int k = i + 2; k <= list.size()- 2; k ++){
					value = "" + list.get(i) + list.get(j) + list.get(k);
				}
			}
			return value;
		}
		return null;
	}
	
	public static ArrayList<Integer> mod10(int n){
		ArrayList<Integer> list = new ArrayList<>();
		while (n != 0){
			list.add(n%10);
			n /= 10;
		}
		return list;
	}
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter: ");
		int n = kb.nextInt();
		
		System.out.println(permutation(n));
	}
}
