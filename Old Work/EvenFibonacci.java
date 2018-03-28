package hunterLocke;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenFibonacci {
	
	static public void main(String[] args){
		int x = 1;
		int y = 2;
		int z = 3;
		int sum = 2;
		
		ArrayList<Integer> Fibb = new ArrayList<Integer>();
		
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter: ");
		int max= kb.nextInt();
		
		int counter = 2;
		
		do{
			z = x + y;

			Fibb.add(z);
				
			x = y;
			y = z;
			counter ++;

			
		} while (z < max);

		for (int i : Fibb){
			if (i % 2 ==0){
				sum = sum + i;};
		}
		System.out.println(sum);
		
	}}
