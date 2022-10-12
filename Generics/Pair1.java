package Generics;

import java.util.Date;

public class Pair1 {
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getValue() {
		return value;
	}

	public void setValue(Date value) {
		this.value = value;
	}

	String key;
	Date value;

	public static void main(String[] args) {
		Pair1 obj=new Pair1();
		obj.setKey("today is");
		obj.setValue(new java.util.Date());
		
System.out.println(obj.getKey()+" "+obj.getValue());
	}

}
