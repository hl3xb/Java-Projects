package hunterLocke;

import java.io.*;
import java.util.ArrayList;

public class Problem22{ 
	public static Integer letter(String s){
		String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int gift = 0;
		for (int i = 0; i < word.length(); i ++)
			if (s.equals(word.charAt(i)))
				gift = i;

		return gift;
	}
	public static void main(String[] args) {
		/*/		String fileName="C:\\Users\\hlocke4350\\Desktop\\names.txt";

		String hopeful = new String();

		try{
			FileReader inputFile = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;

			while ((line = bufferReader.readLine()) != null)   {
				hopeful = line;
			}

			bufferReader.close();

		}catch(Exception e){
			System.out.println("Error while reading file line by line: " + e.getMessage());  
		}
/*/		
		String hopeful = "MARY,PATRICIA,LINDA,BARBARA,ELIZABETH";
		hopeful.split(",");
		
		System.out.println(test);
		
		int pos = 0;
		int score = 0;
		int name = 0;
		int run = 1;
		ArrayList<String> list = new ArrayList<String>();

		/*/		for (String x: hopeful){
			System.out.println(x);
			for (int p = 0; p < x.length(); p++)
				pos = pos + x[p];
			test = x.toCharArray();
			System.out.println(test[i]);
/*/			
		//	for (int t = 0; t < word.length; t++)
		//		list.add(word[t]);
		//	System.out.println(list);

		for (String s: list)
			pos = pos + letter(s);

		score = run*pos;
		name = name + score;
		pos = 0;
		run ++;

		System.out.println(score);
		list.clear();
		System.out.println("");

		System.out.println("The total name score is " + name + ".");
		run = run - 1;
		System.out.println("The number of names in the list is " + run + ".");
	}
}



/*/				if (s.equals("A"))
pos ++;
else if (s.equals("B"))
pos += 2;
else if (s.equals("C"))
pos += 3;
else if (s.equals("D"))
pos += 4;
else if (s.equals("E"))
pos += 5;
else if (s.equals("F"))
pos += 6;
else if (s.equals("G"))
pos += 7;
else if (s.equals("H"))
pos += 8;
else if (s.equals("I"))
pos += 9;
else if (s.equals("J"))
pos += 10;
else if (s.equals("K"))
pos += 11;
else if (s.equals("L"))
pos += 12;
else if (s.equals("M"))
pos += 13;
else if (s.equals("N"))
pos += 14;
else if (s.equals("O"))
pos += 15;
else if (s.equals("P"))
pos += 16;
else if (s.equals("Q"))
pos += 17;
else if (s.equals("R"))
pos += 18;
else if (s.equals("S"))
pos += 19;
else if (s.equals("T"))
pos += 20;
else if (s.equals("U"))
pos += 21;
else if (s.equals("V"))
pos += 22;
else if (s.equals("W"))
pos += 23;
else if (s.equals("X"))
pos += 24;
else if (s.equals("Y"))
pos += 25;
else if (s.equals("Z"))
pos += 26;
/*/	