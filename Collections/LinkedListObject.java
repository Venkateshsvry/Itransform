package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class LinkedListObject {
	public static void main(String[] args) {
		List<Date> l = new ArrayList<Date>();
		Date d1 = new Date(23, 12, 2000);
		Date d2 = new Date(23, 12, 2001);

		l.add(d1);
		l.add(d2);

		for (Date d : l) {
			System.out.print("your date of birth is " + d.date + "-" + d.month + "-" + d.year + " and ");
			System.out.println(d.leapYear());
		}
	}
}

class Date {

	int date, month, year;

	public Date(int date, int month, int year) {

		this.date = date;
		this.month = month;
		this.year = year;
	}

	int getDate() {
		return this.date;
	}

	int getMonth() {
		return this.month;
	}

	int getYear() {
		return this.year;
	}

	String leapYear() {

		String s = null;
		if ((this.year % 4 == 0) && (this.year % 100 != 0) || (this.year % 400 == 0)) {
			s = "it is a leap year";
		} else {
			s = "it is not a leap year";
		}
		return s;

	}
}
