package hunterLocke;

import java.util.ArrayList;

public class Problem30 {
	public static Integer Fifth(int n){
		ArrayList<Integer> list = new ArrayList<>();
		while (n != 0){
			list.add(n%10);
			n /= 10;
		}
		int counter = 0;
		for (int x: list)
			counter += Math.pow(x, 5);
		return counter;
	}
	
	public static void main(String args[]){
		ArrayList<Integer> sum = new ArrayList<>();
		for (int y = 2; y < 1000000; y ++){
			if (y == Fifth(y))
				sum.add(y);
		}
		System.out.println(sum);
		int sum2 = 0;
		for (int a: sum){
			sum2 += a;
		}
		System.out.println(sum2);
	}
}
