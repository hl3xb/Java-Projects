package hunterLocke;

import java.util.ArrayList;

public class Factors {
	public int factor(int number){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int z = 1; z <= number; z++){
			if (number % z == 0){
				array.add(z);
			}
		}
		int sum = 0;
		for (int x: array){
			sum += 1;
		}
		return sum;
	}
}

