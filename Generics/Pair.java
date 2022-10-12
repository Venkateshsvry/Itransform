package Generics;

public class Pair {
	String key;
	String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Pair myObj = new Pair();
		myObj.setKey("1");
		myObj.setValue("Hello");
		System.out.println(myObj.getKey() + " " + myObj.getValue());

	}

}
