package hunterLocke;

import java.util.ArrayList;

public class Multiplesof3and5{

	static public void main(String[] args){
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int counter=0;

		for (int i=1; i<1000; i++) {
			if (i % 5 == 0 || i % 3 == 0)
			{
				list.add(i);
				counter=list.size();
			}

		}
		int sum = 0;
		for (int x : list){
			sum = sum + x;
		}

		System.out.println(list);
		System.out.println(counter);
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime- startTime);
	}

}
