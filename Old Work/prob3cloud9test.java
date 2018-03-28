package hunterLocke;

import java.util.ArrayList;

public class prob3cloud9test{
    
	public static boolean isPrime(int i) {
	    if (i == 1)
	          return false;
	    if (i == 2)
	          return true;
	    if (i % 2 == 0)
	          return false;
	    for (int d = 3; d <= (int) Math.sqrt(i); d++)
	          if (i % d == 0)
	                return false;
	    return true;
	}

    public static ArrayList<Integer> factor(Integer num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= num/2; i ++){
            if(num % i == 0 && isPrime(i) == true){
                list.add(i);
                list.add(num/i);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int num = 13195; 
        ArrayList<Integer> list_2 = new ArrayList<>(factor(num));
        
        for(int i = 0; i <= list_2.size() - 1; i ++){
            if (isPrime(list_2.get(i)) == true){
                System.out.println(list_2.get(i));
            }
        }
    }
}