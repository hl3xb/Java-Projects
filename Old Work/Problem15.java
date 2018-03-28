package hunterLocke;

import java.math.BigInteger;

public class Problem15 {
	public static void main(String args[]){
		int n = 40;
		int r = 20;
		
		System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n-r))));
		
	}
	public static BigInteger factorial(int n){
		BigInteger a = BigInteger.ONE;
		for (int i = 2; i <= n; i ++){
			a = a.multiply(BigInteger.valueOf(i));
		}
		return a;
	}
}
