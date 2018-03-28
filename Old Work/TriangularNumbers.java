package hunterLocke;

import java.util.ArrayList;

public class TriangularNumbers {
	static public void main(String args[]){
		long startTime = System.currentTimeMillis();
		System.out.println("running");
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		Factors run = new Factors();
		
		int counter = 0;
		for (int i = 1; i <= 10000000; i ++){
			counter += i;
			array.add(counter);}
		for (int x: array){
			if (run.factor(x)>500){
				System.out.println(x);
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
}