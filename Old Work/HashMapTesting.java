package hunterLocke;

import java.util.*;

public class HashMapTesting {
	public static void main(String[] args){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Matt", 60);
		map.put("Hunter", 50);
		map.put("Morgan", 70);
		
		Set k = map.entrySet();
		Iterator i = k.iterator();
		
		while (i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue() + "");
		}
		
		int test = map.get("Matt");
		map.put("Matt", test + 50);
		System.out.println("Matt's new balance: " + map.get("Matt"));
		
		HashMap<Integer, String> pika = new HashMap<>();
		
		pika.put(1,"Charmeleon");
		pika.put(2,"Charlamander");
		pika.put(3,"Charizard");
		
		Scanner kb = new Scanner(System.in);
		int next = kb.nextInt();
		kb.close();
		
		System.out.print(next + " correlates with " + pika.get(next));
	}
}
