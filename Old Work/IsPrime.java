package hunterLocke;

public class IsPrime {

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
		
}