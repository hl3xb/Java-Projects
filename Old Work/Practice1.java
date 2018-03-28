package hunterLocke;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner kb= new Scanner (System.in);
		System.out.println("Please input value for a: ");
		int a=kb.nextInt();
		System.out.println("Please input value for b: ");
		int b=kb.nextInt();
		if (a==0 && b==0)
			System.out.println("invalid");
		else if(a>1000 || b>1000)
			System.out.println("invalid");
		else 
			System.out.println("Sum: "+(a+b));

	}

}
