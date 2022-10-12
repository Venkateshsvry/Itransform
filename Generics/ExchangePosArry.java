package Generics;

import java.util.*;

public class ExchangePosArry {
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		list.add(102);
		list.add(200);
		list.add(323);
		list.add(498);
		exchange(i, j);
	}

	public static void exchange(int i, int j) {
		int temp = list.get(i);
		int temp1 = list.get(j);
		list.remove(i);
		list.add(i, temp1);
		list.remove(j);
		list.add(j, temp);
		System.out.println(list.size());
	}

}
