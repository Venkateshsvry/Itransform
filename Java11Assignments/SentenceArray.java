package Java11Assignments;

import java.util.*;

public class SentenceArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//A quick brown fox jumps over a lazy dog
		list.add("A");
		list.add("qucik");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("a");
		list.add("lazy");
		list.add("dog");
		String[] arr=list.stream().toArray(size->new String[size]);
		System.out.println(Arrays.toString(arr));
	}

}
