package hunterLocke;

import java.util.Collections;
import java.util.ArrayList;

public class Problem14 {
	static public void main(String args[]){

		ArrayList<Long> collatz = new ArrayList<Long>();
		ArrayList<Long> number = new ArrayList<Long>();
		ArrayList<Long> amount = new ArrayList<Long>();

		long counter = 1;

		for (long j = 1; j <= 1000000; j ++)
		{
			counter ++;
			amount.add(counter);
		}
		for (long x: amount){
			collatz.add(x);
			while (x != 1){
				if (x % 2 == 0){
					x /= 2;
					collatz.add(x);
				} else {
					x = (3*x)+1;
					collatz.add(x);
				}
			}
			long num = collatz.size();
			if (num == 525)
				System.out.println(collatz);
			number.add(num);
			collatz.clear();
		}
		System.out.println(Collections.max(number));
	}
}

