package hunterLocke;

import java.util.ArrayList;

public class Problem21 {

	public static ArrayList<Integer> divide(int number){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int z = 1; z < number; z++){
			if (number % z == 0)
				array.add(z);
		}
		return array;
	}

	public static Integer amicable(int g){
		ArrayList<Integer> array = new ArrayList<>(divide(g));
		int sum = 0;
		for (int a: array)
			sum += a;
		return sum;
	}

	static public void main(String args[]){
		ArrayList<Integer> all = new ArrayList<>();
		
		for (int h = 5; h < 10000; h++){

			if (amicable(amicable(h))== h && h != amicable(h))
				all.add(h);
		}
		int sum = 0;
		for (int b: all)
			sum += b;
		System.out.println(sum);
	}
}
