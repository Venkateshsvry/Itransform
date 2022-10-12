package StrinClassAssignments;

public class StringOperations {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings  which are stored in heap memory";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('a', '$'));
		System.out.println(str.contains("collection"));
		String str3="java string pool refers to collection of strings  which are stored in heap memory";
		boolean b=str.matches(str3);
		boolean b1=str.equals(str3);
		System.out.println(b);
		System.out.println(b1);

	}

}
