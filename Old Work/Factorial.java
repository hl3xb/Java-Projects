package hunterLocke;

public class Factorial {
	public long factorial(long n){
		for (long i = 2; i <= n; i ++){
			n *= i;
		}
		return n;
	}
}
