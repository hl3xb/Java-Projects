package hunterLocke;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList; 

public class LargestPrimeFactor {

	static public void main(String[] args){
	
		ArrayList<Integer> Factors = new ArrayList<Integer>();
		
		IsPrime test = new IsPrime();
		
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the number to factor: ");
		int prime= kb.nextInt();
		
		do
		{
			int i = 2;
			i ++;
			if (test.isPrime(i)==true && prime % i == 0){
				prime = prime / i;
				Factors.add(i);
				}
			} while (prime != 1);
		Factors.add(prime);
		Collections.sort(Factors);
		System.out.println(Factors);
}}