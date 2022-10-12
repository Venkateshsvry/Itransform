package Collections;

import java.util.*;



import Collections.Contact.Gender;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Long, Contact> tree = new TreeMap<Long, Contact>();
		tree.put(9177033449l, new Contact(9177033449l, "raghavendra", "raghavnedra@gmail.com", Gender.male));
		tree.put(7780796045l, new Contact(7780796045l, "venkatesh", "venkatesh154@gmail.com", Gender.male));
		tree.put(9490143528l, new Contact(9490143528l, "venkat", "venkate154@gmail.com", Gender.male));
		

		for (Map.Entry<Long, Contact> entry : tree.entrySet())
			//System.out.println(entry.getKey()); //use to get only keys
			//System.out.println(entry.getValue()); //use to get only values
			System.out.println(entry.getKey() + ", " + entry.getValue());
	}

}
