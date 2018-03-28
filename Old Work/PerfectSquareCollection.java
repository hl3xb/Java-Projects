package hunterLocke;

import java.util.ArrayList;

public class PerfectSquareCollection {
	static public void main(String args[]){
		int x = 3;
		int y = 2;
		int z = 1;
		isPerfectSquare test1 = new isPerfectSquare();
		
		ArrayList<Integer> kb = new ArrayList<Integer>();
		
		System.out.println("running");
		
		do{
			x = x + 3;
			y = y + 2;
			z ++;
		} while(test1.perfectSquare(x+y)==true && test1.perfectSquare(x-y)==true && test1.perfectSquare(x + z)==true && 
				test1.perfectSquare(x-z)==true && test1.perfectSquare(y+z)==true && test1.perfectSquare(y-z)==true && x > y && y > z);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}}
		/*/
		for (x = 2; x < 10000 && x > y; x ++){
			for (y = 1; y < x && y > x; y ++){
				if (test1.perfectSquare(x+y)==true && test1.perfectSquare(x-y)){
					System.out.println(x);
					System.out.println(y);
				}
			}
		}}}
			
		if (test1.perfectSquare(x)==true){
				System.out.println(x);}
		
		for (y = 1; y > z && y < x; y++){
			if (test1.perfectSquare(y)==true){
				System.out.println(y);}
				
		for (z = 0; z > 0 && z < y; z ++){
				if (test1.perfectSquare(z)==true){
					System.out.println(z);
					}
				}
			}
		}
	}}
/*/

//Find the smallest x + y + z with integers x > y > z > 0 such that x + y, x - y, x + z, x - z, y + z, y - z are all perfect squares
