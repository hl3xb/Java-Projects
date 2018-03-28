package hunterLocke;

import java.math.BigInteger;
import java.util.ArrayList;

public class DigitFactorial {
	public static BigInteger factorial(int n){
		BigInteger a = BigInteger.ONE;
		for (int i = 2; i <= n; i ++){
			a = a.multiply(BigInteger.valueOf(i));
		}
		return a;
	}

	public static void main(String args[]){
		System.out.println("running");
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<BigInteger> stat = new ArrayList<>();

		for (int x = 3; x <= 1000; x ++){
			System.out.println(x);
			while (x != 0){
				list.add(x%10);
				x /= 10;
			}
			BigInteger sum = BigInteger.ZERO;
			for (int b: list)
				sum = sum.add(factorial(b));
			BigInteger test = BigInteger.valueOf(x);
			System.out.println(sum);
			if (test == sum)
				stat.add(sum);
		}
		BigInteger c = BigInteger.ONE;
		for (BigInteger z: stat){
			c.add(z);
		}
		System.out.println(c);
	}
}