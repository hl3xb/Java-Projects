package hunterLocke;

public class SumOfTwoAbundant {
	public static boolean runSum(int n){
		PerfectNumberTest abundant = new PerfectNumberTest();

		for (int i = 1; i < n; i ++)
			if (abundant.perfect(i) == true && abundant.perfect(n-i)==true)
				return true;
		
		return false;
		
	}
}

