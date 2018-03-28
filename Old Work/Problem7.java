package hunterLocke;

public class Problem7 {
	static public void main(String[] args){
		int counter = 1;
		int x = 1;
		IsPrime test1 = new IsPrime();
		do{
			x ++;
			if (test1.isPrime(x)==true){
				counter ++;
			}
		} while ( counter != 10002);

		System.out.println("The 10,001st prime is " + x + ".");
	}
}
