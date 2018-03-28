package hunterLocke;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem92 {
	public static void main(String args[]){
		ArrayList<Integer> eight = new ArrayList<>();

		int n = 0;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("running");
		for (int a = 2; a <= 10000000; a ++){
			int x = a;
			while (x != 89 || x != 1){
				while (x != 0){
					list.add(x % 10);
					x /= 10;
				} x = 0;
				for (int y: list)
					x += Math.pow(y, 2);
				list.clear();
				if (x == 1) {
					break;
				}else if (x == 89){
					eight.add(a);
					break;
				}
			}
		}
		int counter = 0;
		for (int z: eight){
			counter ++;
		}
		System.out.println(counter);
	}
}
