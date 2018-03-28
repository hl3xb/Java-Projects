package hunterLocke;

import java.util.ArrayList;

public class Problem16 {
	public static void main(String[] args){
		int counter = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int x = 2; x != 31; x ++){
			for (int y = 2; y != 31; y ++){
				long b = (long) Math.pow(x, y);
				int d = String.valueOf(b).length();
				if (d == y){
					System.out.println(x + "; " + y + "; " + b);
					counter ++; 
				}
			}
		}
		System.out.println(" ");
		System.out.println(counter);
	}
}
