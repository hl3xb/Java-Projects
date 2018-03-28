package hunterLocke;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareDigitChain {
	public static void main(String args[]){
		ArrayList<Integer> eight = new ArrayList<>();
		ArrayList<Integer> one = new ArrayList<>();

		int n = 0;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("running");
		for (int x = 2; x <= 100; x ++){
			while (x != 89 || x != 1){
				while (x != 0){
					list.add(x % 10);
					x /= 10;
				} x = 0;
				for (int y: list)
					x += Math.pow(y, 2);
				list.clear();
				if (x == 1) {
					one.add(x);
					break;
				}else if (x == 89){
					eight.add(x);
					break;
				}
			}
			System.out.println(eight);
		}


		/*/		for (int x = 1; x < 10; x ++){
			while (mod10(x) != 1 || mod10(x) != 89){
				x = mod10(x);
			}
			if (mod10(x) == 89)
				eight.add(x);
		}
		System.out.println(eight);
		System.out.println(eight.size());

/*/
	}
}
