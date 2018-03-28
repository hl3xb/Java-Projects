package hunterLocke;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem96 {
	private static ArrayList<Integer> modify(String s){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i ++){
			String b = "" + s.charAt(i);
			int num = Integer.parseInt(b);
			list.add(num);
		}

		return list;
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Print the rows");
		String r1 = kb.next();
		String r2 = kb.next();
		String r3 = kb.next();
		String r4 = kb.next();
		String r5 = kb.next();
		String r6 = kb.next();
		String r7 = kb.next();
		String r8 = kb.next();
		String r9 = kb.next();
		kb.close();

		ArrayList<Integer> row1 = new ArrayList<>(modify(r1));
		ArrayList<Integer> row2 = new ArrayList<>(modify(r2));
		ArrayList<Integer> row3 = new ArrayList<>(modify(r3));
		ArrayList<Integer> row4 = new ArrayList<>(modify(r4));
		ArrayList<Integer> row5 = new ArrayList<>(modify(r5));
		ArrayList<Integer> row6 = new ArrayList<>(modify(r6));
		ArrayList<Integer> row7 = new ArrayList<>(modify(r7));
		ArrayList<Integer> row8 = new ArrayList<>(modify(r8));
		ArrayList<Integer> row9 = new ArrayList<>(modify(r9));

		System.out.println("Rows");
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row3);
		System.out.println(row4);
		System.out.println(row5);
		System.out.println(row6);
		System.out.println(row7);
		System.out.println(row8);
		System.out.println(row9);

		ArrayList<Integer> col1 = new ArrayList<>();
		ArrayList<Integer> col2 = new ArrayList<>();
		ArrayList<Integer> col3 = new ArrayList<>();
		ArrayList<Integer> col4 = new ArrayList<>();
		ArrayList<Integer> col5 = new ArrayList<>();
		ArrayList<Integer> col6 = new ArrayList<>();
		ArrayList<Integer> col7 = new ArrayList<>();
		ArrayList<Integer> col8 = new ArrayList<>();
		ArrayList<Integer> col9 = new ArrayList<>();

		col1.add(row1.get(0));
		col1.add(row2.get(0));
		col1.add(row3.get(0));
		col1.add(row4.get(0));
		col1.add(row5.get(0));
		col1.add(row6.get(0));
		col1.add(row7.get(0));
		col1.add(row8.get(0));
		col1.add(row9.get(0));

		col2.add(row1.get(1));
		col2.add(row2.get(1));
		col2.add(row3.get(1));
		col2.add(row4.get(1));
		col2.add(row5.get(1));
		col2.add(row6.get(1));
		col2.add(row7.get(1));
		col2.add(row8.get(1));
		col2.add(row9.get(1));

		col3.add(row1.get(2));
		col3.add(row2.get(2));
		col3.add(row3.get(2));
		col3.add(row4.get(2));
		col3.add(row5.get(2));
		col3.add(row6.get(2));
		col3.add(row7.get(2));
		col3.add(row8.get(2));
		col3.add(row9.get(2));

		col4.add(row1.get(3));
		col4.add(row2.get(3));
		col4.add(row3.get(3));
		col4.add(row4.get(3));
		col4.add(row5.get(3));
		col4.add(row6.get(3));
		col4.add(row7.get(3));
		col4.add(row8.get(3));
		col4.add(row9.get(3));

		col5.add(row1.get(4));
		col5.add(row2.get(4));
		col5.add(row3.get(4));
		col5.add(row4.get(4));
		col5.add(row5.get(4));
		col5.add(row6.get(4));
		col5.add(row7.get(4));
		col5.add(row8.get(4));
		col5.add(row9.get(4));

		col6.add(row1.get(5));
		col6.add(row2.get(5));
		col6.add(row3.get(5));
		col6.add(row4.get(5));
		col6.add(row5.get(5));
		col6.add(row6.get(5));
		col6.add(row7.get(5));
		col6.add(row8.get(5));
		col6.add(row9.get(5));

		col7.add(row1.get(6));
		col7.add(row2.get(6));
		col7.add(row3.get(6));
		col7.add(row4.get(6));
		col7.add(row5.get(6));
		col7.add(row6.get(6));
		col7.add(row7.get(6));
		col7.add(row8.get(6));
		col7.add(row9.get(6));

		col8.add(row1.get(7));
		col8.add(row2.get(7));
		col8.add(row3.get(7));
		col8.add(row4.get(7));
		col8.add(row5.get(7));
		col8.add(row6.get(7));
		col8.add(row7.get(7));
		col8.add(row8.get(7));
		col8.add(row9.get(7));

		col9.add(row1.get(8));
		col9.add(row2.get(8));
		col9.add(row3.get(8));
		col9.add(row4.get(8));
		col9.add(row5.get(8));
		col9.add(row6.get(8));
		col9.add(row7.get(8));
		col9.add(row8.get(8));
		col9.add(row9.get(8));

		System.out.println("Columns");
		System.out.println(col1);
		System.out.println(col2);
		System.out.println(col3);
		System.out.println(col4);
		System.out.println(col5);
		System.out.println(col6);
		System.out.println(col7);
		System.out.println(col8);
		System.out.println(col9);

		ArrayList<Integer> area1 = new ArrayList<>();
		ArrayList<Integer> area2 = new ArrayList<>();
		ArrayList<Integer> area3 = new ArrayList<>();
		ArrayList<Integer> area4 = new ArrayList<>();
		ArrayList<Integer> area5 = new ArrayList<>();
		ArrayList<Integer> area6 = new ArrayList<>();
		ArrayList<Integer> area7 = new ArrayList<>();
		ArrayList<Integer> area8 = new ArrayList<>();
		ArrayList<Integer> area9 = new ArrayList<>();

		area1.add(row1.get(0));
		area1.add(row1.get(1));
		area1.add(row1.get(2));
		area1.add(row2.get(0));
		area1.add(row2.get(1));
		area1.add(row2.get(2));
		area1.add(row3.get(0));
		area1.add(row3.get(1));
		area1.add(row3.get(2));

		area2.add(row1.get(3));
		area2.add(row1.get(4));
		area2.add(row1.get(5));
		area2.add(row2.get(3));
		area2.add(row2.get(4));
		area2.add(row2.get(5));
		area2.add(row3.get(3));
		area2.add(row3.get(4));
		area2.add(row3.get(5));

		area3.add(row1.get(6));
		area3.add(row1.get(7));
		area3.add(row1.get(8));
		area3.add(row2.get(6));
		area3.add(row2.get(7));
		area3.add(row2.get(8));
		area3.add(row3.get(6));
		area3.add(row3.get(7));
		area3.add(row3.get(8));

		area4.add(row4.get(0));
		area4.add(row4.get(1));
		area4.add(row4.get(2));
		area4.add(row5.get(0));
		area4.add(row5.get(1));
		area4.add(row5.get(2));
		area4.add(row6.get(0));
		area4.add(row6.get(1));
		area4.add(row6.get(2));

		area5.add(row4.get(3));
		area5.add(row4.get(4));
		area5.add(row4.get(5));
		area5.add(row5.get(3));
		area5.add(row5.get(4));
		area5.add(row5.get(5));
		area5.add(row6.get(3));
		area5.add(row6.get(4));
		area5.add(row6.get(5));

		area6.add(row4.get(6));
		area6.add(row4.get(7));
		area6.add(row4.get(8));
		area6.add(row5.get(6));
		area6.add(row5.get(7));
		area6.add(row5.get(8));
		area6.add(row6.get(6));
		area6.add(row6.get(7));
		area6.add(row6.get(8));

		area7.add(row7.get(0));
		area7.add(row7.get(1));
		area7.add(row7.get(2));
		area7.add(row8.get(0));
		area7.add(row8.get(1));
		area7.add(row8.get(2));
		area7.add(row9.get(0));
		area7.add(row9.get(1));
		area7.add(row9.get(2));

		area8.add(row7.get(3));
		area8.add(row7.get(4));
		area8.add(row7.get(5));
		area8.add(row8.get(3));
		area8.add(row8.get(4));
		area8.add(row8.get(5));
		area8.add(row9.get(3));
		area8.add(row9.get(4));
		area8.add(row9.get(5));

		area9.add(row7.get(6));
		area9.add(row7.get(7));
		area9.add(row7.get(8));
		area9.add(row8.get(6));
		area9.add(row8.get(7));
		area9.add(row8.get(8));
		area9.add(row9.get(6));
		area9.add(row9.get(7));
		area9.add(row9.get(8));

		System.out.println("Areas");
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
		System.out.println(area5);
		System.out.println(area6);
		System.out.println(area7);
		System.out.println(area8);
		System.out.println(area9);

		int score = 0;

		for (int val = 1; val < 10; val++){
			for (int pos = 0; pos < 10; val++){
				score = 0;
				if (pos == 0){
					if (row1.contains(val) || col1.contains(val) || area1.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col1.contains(val) && !area1.contains(val)){
						score = 1;
					}
				}
				else if (pos == 1){
					if (row1.contains(val) || col2.contains(val) || area1.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col2.contains(val) && !area1.contains(val)){
						score = 1;
					}
				}
				else if (pos == 2){
					if (row1.contains(val) || col3.contains(val) || area1.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col3.contains(val) && !area1.contains(val)){
						score = 1;
					}
				}
				else if (pos == 3){
					if (row1.contains(val) || col4.contains(val) || area2.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col4.contains(val) && !area2.contains(val)){
						score = 1;
					}
				}
				else if (pos == 4){
					if (row1.contains(val) || col5.contains(val) || area2.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col5.contains(val) && !area2.contains(val)){
						score = 1;
					}
				}
				else if (pos == 5){
					if (row1.contains(val) || col6.contains(val) || area2.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col6.contains(val) && !area2.contains(val)){
						score = 1;
					}
				}
				else if (pos == 6){
					if (row1.contains(val) || col7.contains(val) || area3.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col7.contains(val) && !area3.contains(val)){
						score = 1;
					}
				}
				else if (pos == 7){
					if (row1.contains(val) || col8.contains(val) || area3.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col8.contains(val) && !area3.contains(val)){
						score = 1;
					}
				}
				else if (pos == 8){
					if (row1.contains(val) || col9.contains(val) || area3.contains(val)){
						score = 0;
					}
					else if (!row1.contains(val) && !col9.contains(val) && !area3.contains(val)){
						score = 1;
					}
				}
				if (score == 1){
					System.out.println(row1.get(pos) + " has been changed to " + val);
					row1.set(pos, val);
				}

			}
		}
	}
}