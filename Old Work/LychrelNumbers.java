package hunterLocke;

import java.math.BigInteger;
import java.util.ArrayList;

public class LychrelNumbers {
	public static ArrayList<String> PalidromeCheck(long value){
		ArrayList<String> list = new ArrayList<>();

		int length = String.valueOf(value).length();
		int half = length/2;

		String test = String.valueOf(value);
		String first_half = test.substring(0, half);
		if (length % 2 != 0)
			half += 1;
		String second_half = test.substring(half, length);

		second_half = new StringBuffer(second_half).reverse().toString();
		list.add(first_half);
		list.add(second_half);
		return list;
	}

	public static BigInteger Sum(BigInteger value){
		String initial = String.valueOf(value);
		String reverse = new StringBuffer(initial).reverse().toString();

		BigInteger long_initial = BigInteger.valueOf(Long.parseLong(initial));
		BigInteger long_reverse = BigInteger.valueOf(Long.parseLong(reverse));
		BigInteger long_sum = long_initial.add(long_reverse);

		return long_sum;
	}
	public static void main(String main[]){
		BigInteger lychrel = BigInteger.valueOf(0);
		
		
		for (BigInteger value = BigInteger.valueOf(1); value != 10000; value ++){

			BigInteger summation = BigInteger.valueOf(Sum(value));	
			ArrayList<String> list = new ArrayList<>();
			list = PalidromeCheck(summation);
			long counter = 1;
			
			BigInteger test_long = new BigInteger ("5");
			BigInteger big_test = BigInteger.valueOf(20);
			BigInteger multiply_test = big_test.multiply(test_long);

			do {
				if (list.get(0).contains(list.get(1)))
					break;
				counter ++;
				list.clear();
				summation = Sum(summation);
				list = PalidromeCheck(summation);
				if (counter == 50)
					break;

			} while (!list.get(0).contains(list.get(1)));

			lychrel ++;
		}
		System.out.println(lychrel);
	}
}
