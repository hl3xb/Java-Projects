package hunterLocke;

import java.util.ArrayList;

public class ProperDivisors {
	
	public ArrayList<Integer> divide(int number){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int z = 1; z < number; z++){
			if (number % z == 0){
				array.add(z);
			}
		}
		return array;
	}
}
