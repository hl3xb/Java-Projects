package hunterLocke;

public class PerfectNumberTest {
	
	public boolean perfect(long number){
		int sum = 0;
		for (long z = 1; z < number; z ++){
			if (number % z == 0){
				sum += z;
			}
		}
		if (sum > number)
			return true;
		else
			return false;
	}
}