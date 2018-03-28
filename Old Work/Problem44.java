package hunterLocke;

import java.util.ArrayList;

public class Problem44 {
	public static int pentagon(int i){
		i = (i*(3*i-1))/2;
		return i;
	}

	public static void main(String[] args){
		ArrayList<Integer> pentagonlist = new ArrayList<Integer>();
		for (int list = 1; list < 10000; list ++){
			pentagonlist.add(pentagon(list));
		}
		for (int count1 = 1; count1 < 1000; count1 ++){
			for (int count2 = 1; count2 <1000; count2 ++){
				if (pentagonlist.contains(Math.abs(pentagon(count1)-pentagon(count2))) && pentagonlist.contains(pentagon(count1)+pentagon(count2))){
					System.out.println(count1);
					System.out.println(count2);
				}
			}
		}
	}
}